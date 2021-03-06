package app.Controller;
import app.Model.Abstract.Student;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * CRUD (insert, update, delete, findAll, find, searchBySalary)
 * 
 * @author Diep.Tran
 */
public class StudentModify {
    public static List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sqlsql = "CREATE TABLE IF NOT EXISTS student ( id int primary key auto_increment,fullname varchar(50) not null, gender varchar(15), position varchar(15),birthday varchar(150), hospital varchar(150),phone_number varchar(150),working varchar(150),surgery varchar(150),night varchar(150),salary varchar(150))";
            String sql = "select * from student";
            statement = connection.createStatement();

            statement.executeUpdate(sqlsql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Student std = new Student(resultSet.getInt("id"), resultSet.getString("fullname"),
                        resultSet.getString("gender"), resultSet.getString("position"), resultSet.getString("birthday"),
                        resultSet.getString("hospital"), resultSet.getString("phone_number"),
                        resultSet.getString("working"), resultSet.getString("surgery"), resultSet.getString("night"),
                        resultSet.getString("salary"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }

    public static void insert(Student std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sql = "insert into student(fullname, gender, position, birthday, hospital, phone_number, working, surgery, night, salary) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getFullname());
            statement.setString(2, std.getGender());
            statement.setString(3, std.getPosition());
            statement.setString(4, std.getBirthday());
            statement.setString(5, std.getHospital());
            statement.setString(6, std.getPhoneNumber());
            statement.setString(7, std.getWorking());
            statement.setString(8, std.getSurgery());
            statement.setString(9, std.getNight());
            statement.setString(10, std.getSalary());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.
    }

    public static void update(Student std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sql = "update student set fullname=?,gender=?,position=?,birthday=?,hospital=?,phone_number=?,working=?,surgery=?,night=?,salary=? where id = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getFullname());
            statement.setString(2, std.getGender());
            statement.setString(3, std.getPosition());
            statement.setString(4, std.getBirthday());
            statement.setString(5, std.getHospital());
            statement.setString(6, std.getPhoneNumber());
            statement.setString(7, std.getWorking());
            statement.setString(8, std.getSurgery());
            statement.setString(9, std.getNight());
            statement.setString(10, std.getSalary());
            statement.setInt(11, std.getId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.
    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sql = "delete from student where id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.
    }

    public static List<Student> findByInput(String input, String field) {
        List<Student> studentList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sql="";
            if(field.equals("Full Name")) sql = "select * from student where fullname like ?";
            if(field.equals("Gender")) sql = "select * from student where gender like ?";
            if(field.equals("Position")) sql = "select * from student where position like ?";
            if(field.equals("Birthday")) sql = "select * from student where birthday like ?";
            if(field.equals("Hospital")) sql = "select * from student where hospital like ?";
            if(field.equals("Phone Number")) sql = "select * from student where phone_number like ?";
            if(field.equals("Salary")) sql = "select * from student where salary like ?";

            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + input + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student std = new Student(resultSet.getInt("id"), resultSet.getString("fullname"),
                        resultSet.getString("gender"), resultSet.getString("position"), resultSet.getString("birthday"),
                        resultSet.getString("hospital"), resultSet.getString("phone_number"),
                        resultSet.getString("working"), resultSet.getString("surgery"), resultSet.getString("night"),
                        resultSet.getString("salary"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }

    public static List<Student> searchBySalary(int salary) {
        List<Student> studentList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "nguyen");

            // query
            String sql = "select * from student where salary > ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, salary);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student std = new Student(resultSet.getInt("id"), resultSet.getString("fullname"),
                        resultSet.getString("gender"), resultSet.getString("position"), resultSet.getString("birthday"),
                        resultSet.getString("hospital"), resultSet.getString("phone_number"),
                        resultSet.getString("working"), resultSet.getString("surgery"), resultSet.getString("night"),
                        resultSet.getString("salary"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }
}
