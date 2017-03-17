package com.siva.dep.service;

import com.siva.dep.dao.StudentDAO;
import com.siva.dep.domain.StudentFamilyDetailsVO;
import com.siva.dep.domain.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sivateja on 3/16/17.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;
    StudentVO studentVO = new StudentVO();
    StudentFamilyDetailsVO studentFamilyDetailsVO = new StudentFamilyDetailsVO();
    public StudentVO getStudentDetails(int id) {
        studentVO.setId(id);
        studentVO.setName(studentDAO.getStudentDetails(id));
        studentVO.setStudentFamilyDetailsVO(studentDAO.getStudentFamilyDetails(id));
        return studentVO;
    }
}
