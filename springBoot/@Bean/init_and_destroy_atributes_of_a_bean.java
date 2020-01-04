@Bean(name="nvBean_south_india", initMethod="menuItems", destroyMethod="closingMessage")
public NonVeg getnvSouthIndianFoods() {

return new NonVeg();

}



// We must create the about two methods menuItems() and closingMessage() in the class getNonVeg

// This is an initMethod
public void menuItems() {

System.out.print("Menu Items: this methis will be exected before actual work of the bean");
}

// This is a destroy method
public void closingMessage() {

System.out.print("Thank you for coming our kitchen");

}

// This is the method where we can add our logic of the business within this bean
public void prepareFood() {

System.out.print("we done with your food preparation");
}


// using of this one will be as bellow


// Loading / getting bean based on @bean method name
NonVeg nv= (NonVeg)ctx.getBean("nvBean_south_india");
nv.prepareFood();


//output


Menu Items: this methis will be exected before actual work of the bean --- this output comes from menuItems() method which is an initMethod
we done with your food preparation --- this line comes from prepareFood() method
Thank you for coming our kitchen --- this output comes from closingMessage() method which is an destroyMethod
