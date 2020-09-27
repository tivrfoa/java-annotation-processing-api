package lsc.tests;

public class Person {
 
    private int age;
 
    private String name;
    
    private String country;
 
	public int getAge() { return age; }
	
	@BuilderProperty
	public void setAge(int age) { this.age = age; }
	
	public String getName() { return name; }
	
	@BuilderProperty
	public void setName(String name) { this.name = name; }
	
	public String getCountry() { return country; }
	
	@BuilderProperty
	public void setCountry(String country) { this.country = country; }
}
