package jgh_testing;

import java.io.Serializable;

public class PersonInfo implements Serializable {
	/**
	    * 
	    */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getssn() {
		return ssn;
	}

	public void setssn(String ssn) {
		this.ssn = ssn;
	}

}
