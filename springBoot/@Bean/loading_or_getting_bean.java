SpringApplication.run(Springb00tExampleApplication.class, args);
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

// Loading / getting bean based on @bean method name
NonVeg nv= (NonVeg)ctx.getBean("getNonVeg");
System.out.print(nv.itemName);

//getting bean with custom name of @bean method
NonVeg nv1= (NonVeg)ctx.getBean("nvbean");
System.out.print(nv1.itemName);
