package com.interviewques;

public class Test {

    static {
        System.out.println("static block is invoked");
    }//First

    public static void main(String args[]) {
        Test1 test = new Test1();//will print zero
        System.out.println(test.i);//trying to print --> 4 bytes -->Integer ASCCII
        byte a = 10;
        byte b = 15;
//        for (int i = 0; 0; i++) {//this will fail
//            System.out.println("Hello Javatpoint");
//        }
        Test te = new Test(a, b);
        System.out.println(te.test_a + " " + te.test_b);
    }

    int test_a, test_b;

    public Test() {
//        this = null;//Compile Error due to the this keyword
        System.out.println("Test class constructor called");
    }

    Test(int a, int b) {
        test_a = a;
        test_b = b;
    }

//    Test(int a, int b) {
//        System.out.println("first loop a = " + a + " b = " + b);
//    }

    Test(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }
}

class Test1 {
    int i;//not assigning
}

