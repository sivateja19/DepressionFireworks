package com.siva.dep.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.siva.dep.domain.StudentFamilyDetailsVO;


/**
 * Created by sivateja on 3/17/17.
 */
@Mapper
@Component
public interface StudentMapper {

    @Select("select address,fatherName from first.student where id = #{id}")
    StudentFamilyDetailsVO findStudentFamilyDetailsById(@Param("id") int id);

    @Select("select name from first.student where id = #{id}")
    String findStudentNameById(@Param("id") int id);
}
