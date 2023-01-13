package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        A object = new B();
        object.meth();
        B obj = new B();
        obj.meth();

    }
  
}
