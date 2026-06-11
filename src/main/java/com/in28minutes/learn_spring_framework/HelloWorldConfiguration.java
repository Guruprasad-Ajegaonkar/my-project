package com.in28minutes.learn_spring_framework;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
record Person(String name,int age,Address address) { };
record Address(String firstLine,String city) { };

@Lazy
@Configuration
public class HelloWorldConfiguration {
		@Bean
		public String name() {
			return "Guru";
			
		}
	
		@Bean
		public int age() {
			return 15;
		}
		
		@Bean
		public Person person() {
			var person=new Person("Ravi",20,new Address("pune","mumbai"));
			return person;
		}
		
		@Bean
		public Address address() {
			var address=new Address("pune","Mumbai");
			return address;
		}
		
		@Bean
		public Person person2MethodCall() {
			var person2=new Person(name(),age(),address());
			return person2;
		}
		
	
		
		
		@Bean (name="address2")
		public Address address1() {
			var address=new Address("gujrat","ahemdabad");
			return address;
		}
		@Bean
		public Person person3Parameters(String name,int age,Address address2) {
			//var person2=
				return	new Person(name,age,address2);
			//return person2;
		}
		
		
}
