package app.Controller;
import app.Model.Abstract.Shipping;
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
public class ShippingModify {
    public static List<Shipping> findAll() {
        List<Shipping> studentList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "123456");

            // query
            String sqlsql = "CREATE TABLE IF NOT EXISTS shipping ( id int primary key auto_increment,senderName varchar(50) not null, senderAddress varchar(50) not null, sendingTime varchar(50) not null"
                    + ",receiverName varchar(50) not null, receiverAddress varchar(50) not null, receivingTime varchar(50) not null"
                    + ",category varchar(50), km varchar(15),kg varchar(15), cost varchar(15))";
            String sql = "select * from student";
            statement = connection.createStatement();

            statement.executeUpdate(sqlsql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Shipping std = new Shipping(resultSet.getInt("id"), 
                        resultSet.getString("senderName"), resultSet.getString("senderAddress"), resultSet.getString("sendingTime"),
                        resultSet.getString("receiverName"), resultSet.getString("receiverAddress"), resultSet.getString("receivingTime"),
                        resultSet.getString("category"), resultSet.getInt("km"), resultSet.getInt("kg"),
                        resultSet.getInt("cost"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }

    public static void insert(Shipping std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "123456");

            // query
            String sql = "insert into shipping(senderName, senderAddress, sendingTime, receiverName, receiverAddress, receivingTime, category, km, kg, cost) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getSenderAddress());
            statement.setString(2, std.getSenderAddress());
            statement.setString(3, std.getSendingTime());
            statement.setString(4, std.getReceiverName());
            statement.setString(5, std.getReceiverAddress());
            statement.setString(6, std.getReceivingTime());
            statement.setString(7, std.getCategory());
            statement.setString(8, String.valueOf(std.getKm()));
            statement.setString(9,  String.valueOf(std.getKg()));
            statement.setString(10,  String.valueOf(std.getCost()));

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.
    }

    public static void update(Shipping std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "123456");

            // query
            String sql = "update student set senderName=?, senderAddress=?, sendingTime=?, receiverName=?, receiverAddress=?, receivingTime=?, category=?, km=?, kg=?, cost=? where id = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getSenderAddress());
            statement.setString(2, std.getSenderAddress());
            statement.setString(3, std.getSendingTime());
            statement.setString(4, std.getReceiverName());
            statement.setString(5, std.getReceiverAddress());
            statement.setString(6, std.getReceivingTime());
            statement.setString(7, std.getCategory());
            statement.setString(8, String.valueOf(std.getKm()));
            statement.setString(9,  String.valueOf(std.getKg()));
            statement.setString(10,  String.valueOf(std.getCost()));
            statement.setInt(11, std.getId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "123456");

            // query
            String sql = "delete from student where id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.
    }

    public static List<Shipping> findByInput(String input, String field) {
        List<Shipping> studentList = new ArrayList<>();

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
                Shipping std = new Shipping(resultSet.getInt("id"), resultSet.getString("fullname"),
                        resultSet.getString("gender"), resultSet.getString("position"), resultSet.getString("birthday"),
                        resultSet.getString("hospital"), resultSet.getString("phone_number"),
                        resultSet.getString("working"), resultSet.getString("surgery"), resultSet.getString("night"),
                        resultSet.getString("salary"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }

    public static List<Shipping> searchBySalary(int salary) {
        List<Shipping> studentList = new ArrayList<>();

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
                Shipping std = new Shipping(resultSet.getInt("id"), resultSet.getString("fullname"),
                        resultSet.getString("gender"), resultSet.getString("position"), resultSet.getString("birthday"),
                        resultSet.getString("hospital"), resultSet.getString("phone_number"),
                        resultSet.getString("working"), resultSet.getString("surgery"), resultSet.getString("night"),
                        resultSet.getString("salary"));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShippingModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // ket thuc.

        return studentList;
    }
}
