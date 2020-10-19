package com.glodon.demo.mybatis.models;



public class StudentWithClass extends SimsStudent {

    private SimsClass simsClass ;
    public SimsClass getSimsClass() {
        return simsClass;
    }

    public void setSimsClass(SimsClass simsClass) {
        this.simsClass = simsClass;
    }


}
