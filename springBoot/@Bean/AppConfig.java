package com.kitchen.go;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

// this the basic way of creating bean method where method name will
// be acceted as bean name whereever you want to get Bean
@Bean
public NonVeg getNonVeg(){
return new NonVeg();
}

// here we can give bean name which is different than method name
@Bean("nvbean")
public NonVeg getNonVegBean() {

return new NonVeg();

}

// here we can set more than one custome name to the bean method
@Bean(name= {"indianNVBean","bharathNVbean"})
public NonVeg getNonVegIndianBean() {
return new NonVeg();
}

}
