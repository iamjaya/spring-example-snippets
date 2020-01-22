
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Student st= ctx.getBean(Student.class);
		System.out.print("Total Subjects Count:"+st.getSubject().size());
    
    
    // output
    Total Subjects Count:3
	
