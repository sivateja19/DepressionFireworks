package com.siva.dep.dao;

import com.siva.dep.domain.StudentFamilyDetailsVO;
import com.siva.dep.domain.StudentVO;
import org.springframework.stereotype.Repository;

/**
 * Created by sivateja on 3/16/17.
 */

@Repository("studentDAO")
public class StudentDAO {

    public String getStudentDetails(int id) {
        String  name;
        if(id == 10){
            name = "SIVA";
            return name;
        }
        else if (id == 11){
            name = "TEJA";
            return name;
        }
        else {
            name ="SIVATEJA";
            return name;
        }
    }

    public StudentFamilyDetailsVO getStudentFamilyDetails(int id) {
        String address;
        String fatherName;
        StudentFamilyDetailsVO studentFamilyDetailsVO = new StudentFamilyDetailsVO();
        if(id == 10){
            address = "SIVA";
            fatherName = "INDIA";
        }
        else if (id == 11){
            address = "TEJA";
            fatherName = "USA";
        }
        else {
            address = "SIVATEJA";
            fatherName = "UK";
        }
        studentFamilyDetailsVO.setAddress(address);
        studentFamilyDetailsVO.setFatherName(fatherName);
        return studentFamilyDetailsVO;
    }
}
