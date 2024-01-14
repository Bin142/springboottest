package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
	public String getHome() {
		return "Home";
	}
	@GetMapping("/test")
	public String getTest() {
		return "Test";
	}
	@GetMapping("/person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("binh");
		p.setAge(21);
		return p;
	}
}
class Person{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
