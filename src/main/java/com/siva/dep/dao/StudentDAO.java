package com.siva.dep.dao;

import com.siva.dep.domain.StudentFamilyDetailsVO;
import com.siva.dep.domain.StudentVO;
import com.siva.dep.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

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

    public StudentFamilyDetailsVO getStudentFamilyDetails(int id){
        studentFamilyDetailsVO = studentMapper.findStudentFamilyDetailsById(id);
        return studentFamilyDetailsVO;
    }
}
