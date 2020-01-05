*****************************************
AppConfig.java
****************************************

@Configuration
@ComponentScan("com.kitchen")  // This is the package in my example, you have to change/point to your package
public class AppConfig {
// Here body of AppConfig which includes any other
}


********************************************
Customer.java   // This is a @Component class
********************************************

package com.kitchen.go;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Customer {

Customer(){
		System.out.println("Customer Check in into our Kitchen");
	}
// This is the @Bean created in this Component class
// remember inner-bean referecen is not possible in this type of Bean creation in @Component class
@Bean
public FoodItem getFoddItem() {
	return new FoodItem();
 }

}



********************************************
FoodItem.java
********************************************

package com.kitchen.go;

public class FoodItem {

FoodItem(){
System.out.println("Choose Food Item");
}

public String getFoodItemBYId() {
return "Chicken Biryani";
}

}


********************************************
Using or Testing
********************************************

public static void main(String[] args) {
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
  FoodItem fi= (FoodItem)ctx.getBean("getFoddItem");
  System.out.println(fi.getFoodItemBYId());
  }

********************************************
Output
********************************************
Customer Check in into our Kitchen
Choose Food Item
Chicken Biryani
