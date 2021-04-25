/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Model.Abstract;

/**
 *
 * @author Admin
 */
public class Student {
    int id;
    String fullname, gender, position, birthday, hospital, phoneNumber, working, surgery, night, salary;
    
    public Student() {
    }

	public Student(int id, String fullname, String gender, String position, String birthday, String hospital,
			String phoneNumber, String working, String surgery, String night, String salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.position = position;
		this.birthday = birthday;
		this.hospital = hospital;
		this.phoneNumber = phoneNumber;
		this.working = working;
		this.surgery = surgery;
		this.night = night;
		this.salary = salary;
	}

	public Student(String fullname, String gender, String position, String birthday, String hospital,
			String phoneNumber, String working, String surgery, String night, String salary) {
		super();
		this.fullname = fullname;
		this.gender = gender;
		this.position = position;
		this.birthday = birthday;
		this.hospital = hospital;
		this.phoneNumber = phoneNumber;
		this.working = working;
		this.surgery = surgery;
		this.night = night;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	public String getSurgery() {
		return surgery;
	}

	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}

	public String getNight() {
		return night;
	}

	public void setNight(String night) {
		this.night = night;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}


