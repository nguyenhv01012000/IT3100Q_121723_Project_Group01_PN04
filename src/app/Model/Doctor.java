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
public class Doctor extends Student{
    
    int salary;

    public Doctor() {
    }

    public Doctor(int id, String fullname, String gender, String position, String birthday, String hospital, String phoneNumber, String working, String surgery, String night, String salary) {
        super(id, fullname, gender, position, birthday, hospital, phoneNumber, working, surgery, night, salary);
    }

    public Doctor(String fullname, String gender, String position, String birthday, String hospital, String phoneNumber, String working, String surgery, String night, String salary) {
        super(fullname, gender, position, birthday, hospital, phoneNumber, working, surgery, night, salary);
    }
    
    public void setSalary(int working, int surgery) {
		this.salary = working*500000 + surgery*2000000;
	}
}
