/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class Tables {
    
    public static void main(String[] args){
        try{
            Connection con = ConnectionProvider.getConnection();
            Statement statement = con.createStatement();
            statement.executeUpdate("create table appUser(userId int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),password varchar(200))");
            statement.executeUpdate("insert into appUser(userRole,name,dob,mobileNumber,email,password) values('Admin','Saman','1998-02-02','0111111111','saman@gmail.com','1234')");
            statement.executeUpdate("insert into appUser(userRole,name,dob,mobileNumber,email,password) values('Pharmacist','Mala','1997-08-13','0111111111','mala@gmail.com','1234')");
            statement.executeUpdate("Create table medicine(pkId int AUTO_INCREMENT primary key, uniqueId varchar(100),name varchar(200),companyName varchar(200), price int, quantity int, expdate Date)");
            statement.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200), billDate varchar(100),totalPaid bigint,generatedBy varchar(200))");
            
            JOptionPane.showMessageDialog(null, "Table created successfully!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
