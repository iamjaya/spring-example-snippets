
**************************************
Creating Bean with prototye scope
**************************************
@Bean
@Scope("prototye")
public NonVeg getNonVeg()
{
return new NonVeg();
}

^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Different beans have differnet instance copy of an object if the bean is prototye scope
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



****************************
//NonVeg.java
****************************

public class NonVeg {

NonVeg(){

System.out.println("NV Bean initiated");
}
public String itemName="Chicken Samosa";

}

*******************************
// using or testing
*******************************

AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

// Loading / getting bean based on @bean method name
NonVeg nv= (NonVeg)ctx.getBean("getNonVeg");
nv.itemName="chiken burger"; // here we are changing the value of itemName from Chicken Samosa to Chicken Burger

NonVeg nv1= (NonVeg)ctx.getBean("getNonVeg");

System.out.println(nv.itemName); ***1***
System.out.println(nv1.itemName); // here we are printing value of itemName for second object nv1 of NonVeg class


********************************
// output
********************************
NV Bean initiated
NV Bean initiated
chiken burger --- from the line ***1***
Chicken Samosa --- this is value of itemName for object nv1
