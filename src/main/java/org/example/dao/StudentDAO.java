package org.example.dao;

import org.example.dto.StudentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements StudentInterface{
    @Override
    public String addstudent(StudentDTO s) throws Exception {
        Connection co=DbConnect.getConnection();
        //PreparedStatements executes querries (only once)
        PreparedStatement ps= co.prepareStatement("Insert into student values(?,?,?,?)");
        ps.setString(1,s.getStudentid());
        ps.setString(2,s.getFname());
        ps.setString(3,s.getLname());
        ps.setString(4,s.getDob());
        ps.executeUpdate();
        return "Record Added Successfully";
    }


    @Override
    public List<StudentDTO> getallstudent() throws Exception {
        Connection co=DbConnect.getConnection();
        PreparedStatement ps=co.prepareStatement("select * from student ");
        ResultSet rs=ps.executeQuery(); //return cursor(points to memory)
        List<StudentDTO> l1=new ArrayList<>();
        while (rs.next())
        {
            l1.add(new StudentDTO(rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)));
        }
        return l1; //edit this as null
    }

    @Override
    public String deletestudent(StudentDTO s) throws Exception {
        Connection co=DbConnect.getConnection();
        PreparedStatement ps=co.prepareStatement("delete from student where studentid=? ");
        ps.setString(1,s.getStudentid());
        ps.executeUpdate();
        return "Record deleted";
    }
}
