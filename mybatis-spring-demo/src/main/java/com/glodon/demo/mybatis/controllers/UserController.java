package com.glodon.demo.mybatis.controllers;

import com.glodon.demo.mybatis.dtos.SimsClassDto;
import com.glodon.demo.mybatis.dtos.SimsStudentDto;
import com.glodon.demo.mybatis.dtos.UserProps;
import com.glodon.demo.mybatis.mappers.SimsClassMapper;
import com.glodon.demo.mybatis.mappers.SimsStudentMapper;
import com.glodon.demo.mybatis.mappers.UserMapper;
import com.glodon.demo.mybatis.models.SimsClass;
import com.glodon.demo.mybatis.models.SimsStudent;
import com.glodon.demo.mybatis.models.StudentWithClass;
import com.glodon.demo.mybatis.models.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SimsStudentMapper simsStudentMapper ;

    @Autowired
    private SimsClassMapper simsClassMapper ;

    @RequestMapping(method = RequestMethod.POST)
    @Transactional
    public User createUser(UserProps props) {
        User user = new User();
        user.setName(props.getName());
        user.setSex(props.getSex());
        userMapper.insert(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> queryUsers(
            @RequestParam(required = false) String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        RowBounds rowBounds = new RowBounds(page * size, size);
        return userMapper.selectByName(name, rowBounds);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @Transactional
    public void deleteUser(@PathVariable long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User queryUserByIds(@PathVariable long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/get/{id}")
    public SimsStudent getStudent(@PathVariable("id") String id) {
      return  simsStudentMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/getStudents")
    public List<StudentWithClass> getStudentsWithClass(SimsStudentDto props) {
        return simsStudentMapper.selectByNameWithClass(props.getName());

    }
    @PostMapping("/addclass")
    public int createClass(SimsClassDto props){
       // Random random = new Random();
        SimsClass simsClass = new SimsClass();
        simsClass.setName(props.getName());
      //  simsClass.setId(UUID.randomUUID().toString());
        return simsClassMapper.insert(simsClass);

    }
}
