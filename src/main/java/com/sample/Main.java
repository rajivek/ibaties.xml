package com.sample;

import com.sample.Mapper.GradeMapper;
import com.sample.conf.MyBatisSessionFactory;
import com.sample.domain.Grade;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        SqlSession session = MyBatisSessionFactory.getSqlSessionFactory().openSession();

        GradeMapper gradeMapper = session.getMapper(GradeMapper.class);

        // using XML queries ------------------------------
        Grade grade = gradeMapper.selectUsingXML("six");

        System.out.println(grade);

        System.out.println("Test done");
    }
}
