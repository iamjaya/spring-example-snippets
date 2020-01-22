
		
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Student st= ctx.getBean(Student.class);
		System.out.print("Total Faculty Count:"+st.getFaculty().size());
	
  
  //output 
  
  Total Faculty Count:2
