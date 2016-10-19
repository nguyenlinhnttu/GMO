package com.gmo.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gmo.mapper.StudentMapper;
import com.gmo.model.Student;

public class Mybatis {
    private static final String conf = "mybatis-config.xml";

    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader(conf);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(reader);
        SqlSession session = sessionFactory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        
        List<Student> listStudent = mapper.getAllStudent();
        for(int i = 0; i<listStudent.size(); i++){
            System.out.println(listStudent.get(i));
        }
    }

}
