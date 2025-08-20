package org.example.dao;
//dao is not responsible for displaying the objects or data, just for returning
import org.example.dto.StudentDTO;
import java.util.List;

public interface StudentInterface {
    public String addstudent(StudentDTO s) throws Exception;
    public List<StudentDTO> getallstudent() throws Exception;
    public String deletestudent(StudentDTO s) throws Exception;

}
