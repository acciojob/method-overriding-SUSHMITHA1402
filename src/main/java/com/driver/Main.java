package com.driver;


public class Main {
    public static void main(String[] args) {
        A object = new B();
        object.meth();
        B obj = new B();
        obj.meth();

    }
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
  
}
