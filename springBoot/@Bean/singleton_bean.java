
**************************************
Creating Bean with singleton scope
**************************************
@Bean
@Scope("singleton")
public NonVeg getNonVeg()
{
return new NonVeg();
}


// or second way for creating singleton Bean
// by default bean is a singleton


@Bean
public NonVeg getNonVeg()
{
return new NonVeg();
}


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
chiken burger --- from the line ***1***
chiken burger --- there is a changes in the value of itemName for object nv1, you can see that in the above lines of code we donot change the value of itemName for nv1, but we changed for nv object
