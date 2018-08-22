package com.siva.dep.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siva.dep.domain.StudentFamilyDetailsVO;
import com.siva.dep.mapper.StudentMapper;

/**
 * Created by sivateja on 3/16/17.
 */

@Component
public class StudentDAO {
    @Autowired
    StudentMapper studentMapper;
    StudentFamilyDetailsVO studentFamilyDetailsVO = new StudentFamilyDetailsVO();
    public String getStudentDetails(int id) {
        String  name = studentMapper.findStudentNameById(id);
        return name;
    }

    public StudentFamilyDetailsVO getStudentFamilyDetails(int id) {
        studentFamilyDetailsVO = studentMapper.findStudentFamilyDetailsById(id);
        return studentFamilyDetailsVO;
    }
}
