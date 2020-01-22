
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		Student st= ctx.getBean(Student.class);
		System.out.print(st.getCollege());
	
