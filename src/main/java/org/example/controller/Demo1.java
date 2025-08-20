package org.example.controller;

import org.example.dao.DbConnect;
import org.example.dao.StudentDAO;
import org.example.dao.StudentInterface;
import org.example.dto.StudentDTO;

import java.sql.Connection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        try
        {
            //Connection co= DbConnect.getConnection();
            //System.out.println("Connection successful ");
            StudentInterface ob=new StudentDAO();
//            String message = ob.addstudent(new StudentDTO("3001","Bhushan","Kumar","2021-10-12"));
//            System.out.println(message);

           // getallstudents
            List<StudentDTO> l1=ob.getallstudent();
            l1.forEach(System.out::println);

            //deletestudent
            String m=ob.addstudent(new StudentDTO("3001","","",""));
            System.out.println(m);
        }
        catch(Exception e)
        {
            System.out.println("Error="+e.getMessage());
        }
    }
}
