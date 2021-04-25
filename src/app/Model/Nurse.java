/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Model;
import app.Model.Abstract.Student;

/**
 *
 * @author Admin
 */
public class Nurse extends Student{

    public Nurse() {
    }

    public Nurse(int id, String fullname, String gender, String position, String birthday, String hospital, String phoneNumber, String working, String surgery, String night, String salary) {
        super(id, fullname, gender, position, birthday, hospital, phoneNumber, working, surgery, night, salary);
    }

    public Nurse(String fullname, String gender, String position, String birthday, String hospital, String phoneNumber, String working, String surgery, String night, String salary) {
        super(fullname, gender, position, birthday, hospital, phoneNumber, working, surgery, night, salary);
    }
    
    public void setSalary(String salary) {
		this.salary = salary;
	}
}
