package com.siva.dep.controller;

import com.siva.dep.domain.StudentVO;
import com.siva.dep.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sivateja on 3/15/17.
 */
@RestController
public class StudentController {
    @Autowired
    public StudentServiceImpl studentServiceImpl;
    @RequestMapping("/getStudent")
    public StudentVO getStudent(@RequestParam(value = "id") int id){
        StudentVO studentVO = studentServiceImpl.getStudentDetails(id);
        return studentVO;
    }

}
