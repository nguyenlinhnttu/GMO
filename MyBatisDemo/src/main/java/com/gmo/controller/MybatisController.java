package com.gmo.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gmo.mapper.StudentMapper;
import com.gmo.model.Student;

@Controller
public class MybatisController {
    private static final String conf = "mybatis-config.xml";
    @RequestMapping("/mybatis")
    public ModelAndView helloWorld() throws IOException {
        Reader reader = Resources.getResourceAsReader(conf);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(reader);
        SqlSession session = sessionFactory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        
        List<Student> listStudent = mapper.getAllStudent();
//        for(int i = 0; i<listStudent.size(); i++){
//            System.out.println(listStudent.get(i));
//        }
        return new ModelAndView("mybatis", "message", listStudent);
    }
}
