package com.siva.dep.service;

import java.io.IOException;

import com.siva.dep.domain.StudentVO;

/**
 * Created by sivateja on 3/16/17.
 */
public interface StudentService {
    public StudentVO getStudentDetails(int id) throws IOException;
}
