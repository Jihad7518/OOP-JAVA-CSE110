package Excercise;

import java.util.Calendar;

public class Person {
	private int personId;
	private String personName;
	private Calendar personDOfBirth;
	
	public int getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public Calendar getPersonDOfBirth() {
		return personDOfBirth;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setPersonDOfBirth(Calendar personDOfBirth) {
		this.personDOfBirth = personDOfBirth;
	}
	public Person() {
		
	}
	public Person(int personId, String personName, Calendar personDOfBirth) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personDOfBirth = personDOfBirth;
	}
	@Override
	public String toString() {
		return "Person's Name : " + personName + "\n"+ "Person's ID : " + 
				personId + "\n" + "Person's Date of Birth : " + 
				personDOfBirth.get(Calendar.DAY_OF_MONTH) + "-" +
				personDOfBirth.get(Calendar.MONTH) + "-" +
				personDOfBirth.get(Calendar.YEAR);
	}
	
	
	
	
	
	
	
	
}
