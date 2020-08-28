package com.glodon.demo.mybatis.models;

import java.util.List;

public class ClassWithStudent extends SimsClass{
   List<SimsStudent> simsStudents ;

    public ClassWithStudent(List<SimsStudent> simsStudents) {
        this.simsStudents = simsStudents;
    }

    public List<SimsStudent> getSimsStudents() {
        return simsStudents;
    }

    public void setSimsStudents(List<SimsStudent> simsStudents) {
        this.simsStudents = simsStudents;
    }
}
