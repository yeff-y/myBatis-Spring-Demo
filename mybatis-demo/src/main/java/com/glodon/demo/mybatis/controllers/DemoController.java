package com.glodon.demo.mybatis.controllers;

import com.glodon.demo.mybatis.dtos.SimsStudentDto;
import com.glodon.demo.mybatis.dtos.UserProps;
import com.glodon.demo.mybatis.mappers.SimsStudentMapper;
import com.glodon.demo.mybatis.mappers.UserMapper;
import com.glodon.demo.mybatis.models.SimsStudent;
import com.glodon.demo.mybatis.models.StudentWithClass;
import com.glodon.demo.mybatis.models.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class DemoController {
    @Autowired
    private SqlSessionFactory sessionFactory;

   /* @RequestMapping(method = RequestMethod.POST)
    public User createUser(UserProps props) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setName(props.getName());
            user.setSex(props.getSex());
            userMapper.insert(user);
            sqlSession.commit();
            return user;
        } finally {
            sqlSession.close();
        }
    }*/

  //  @RequestMapping(method = RequestMethod.POST)
    @PostMapping("/add/student")
    public SimsStudent createStudent(SimsStudentDto props) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            SimsStudentMapper simsStudentMapper = sqlSession.getMapper(SimsStudentMapper.class);
            SimsStudent simsStudent = new SimsStudent();
            simsStudent.setId(UUID.randomUUID().toString());
            simsStudent.setName(props.getName());
            simsStudent.setGender(props.getGender());
            simsStudentMapper.insert(simsStudent);
            sqlSession.commit();
            return simsStudent;
        } finally {
            sqlSession.close();
        }
    }

    @GetMapping("/get/{id}")
    public SimsStudent getStudent(@PathVariable("id") String id) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            SimsStudentMapper simsStudentMapper = sqlSession.getMapper(SimsStudentMapper.class);
            SimsStudent simsStudent = simsStudentMapper.selectByPrimaryKey(id);
            sqlSession.commit();
            return simsStudent;
        } finally {
            sqlSession.close();
        }
    }
    @GetMapping("/getName/{NAME}")
    public SimsStudent getStudentByName(@PathVariable("NAME") String name) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            SimsStudentMapper simsStudentMapper = sqlSession.getMapper(SimsStudentMapper.class);
            SimsStudent simsStudent = simsStudentMapper.getStudentByName(name);
            sqlSession.commit();
            return simsStudent;
        } finally {
            sqlSession.close();
        }
    }



    @GetMapping("/getStudents")
    public List<StudentWithClass> getStudentsWithClass(SimsStudentDto props) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            SimsStudentMapper simsStudentMapper = sqlSession.getMapper(SimsStudentMapper.class);
            return simsStudentMapper.selectByNameWithClass(props.getName());
        } finally {
            sqlSession.close();
        }
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<User> queryUsers(
            @RequestParam(required = false) String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String orderBy) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.selectByName(name, page, size, orderBy);
        } finally {
            sqlSession.close();
        }
    }





    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable long id) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteByPrimaryKey(id);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @RequestMapping(value = "/queryByIds", method = RequestMethod.GET)
    public List<User> queryUserByIds(@RequestParam List<Long> ids) {
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.selectByIds(ids);
        } finally {
            sqlSession.close();
        }
    }
}
