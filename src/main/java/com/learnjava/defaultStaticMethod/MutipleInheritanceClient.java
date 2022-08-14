package com.learnjava.defaultStaticMethod;

public class MutipleInheritanceClient implements Interface1, Interface2, Interface3 {

    public void methodA() {
        System.out.println("Inside method A"+MutipleInheritanceClient.class);
    }

    // 1 --> class the implement the interface
    // 2--> the sub interface that extends the interface

    public static void main(String[] args) {

        MutipleInheritanceClient mutipleInheritanceClient = new MutipleInheritanceClient();
        mutipleInheritanceClient.methodA(); // resolve to the child implementation

        mutipleInheritanceClient.methodB();
        mutipleInheritanceClient.methodC();
    }
}
