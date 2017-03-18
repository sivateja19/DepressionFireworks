package com.siva.dep.service;

import com.siva.dep.domain.StudentVO;

import java.io.IOException;

/**
 * Created by sivateja on 3/16/17.
 */
public interface StudentService {
    public StudentVO getStudentDetails(int id) throws IOException;
}
