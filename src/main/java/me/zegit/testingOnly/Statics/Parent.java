package me.zegit.testingOnly.Statics;

class Parent {
    public  void staticMethod() {
        System.out.println("This is Parent's static method.");
    }
}

class Child extends Parent {
    public  void staticMethod() {
        System.out.println("This is Child's static method.");
    }
}

