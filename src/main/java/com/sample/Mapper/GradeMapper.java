package com.sample.Mapper;

import com.sample.domain.Grade;
import com.sample.domain.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface GradeMapper {

    Grade selectUsingXML(String name);
}
