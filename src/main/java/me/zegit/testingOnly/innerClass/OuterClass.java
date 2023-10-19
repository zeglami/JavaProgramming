package me.zegit.testingOnly.innerClass;
public class OuterClass {

    private int outerVariable = 10;

    public void outerMethod() {
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }

    public class InnerClass {

        public void innerMethod() {
            System.out.println("Inner class method called.");
            System.out.println("Value of outerVariable is: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    System.out.println("---------------");

    }
}
