package com.edu;

public class Main {

    public static void main(String[] args) {
        Libraries.Missouri.StLouis myInnerObj = new Libraries.Missouri.StLouis();
        myInnerObj.hello();
        System.out.println(myInnerObj.getClass().getName());
    }
}
