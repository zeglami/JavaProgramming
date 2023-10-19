package me.zegit.testingOnly.Statics;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod(); // Output: This is Parent's static method.

        String s1 = "Bonjour";
        String s2 = s1;
        s1 = s1 + " tout le monde";

        System.out.println(s1); // Output: Bonjour tout le monde
        System.out.println(s2); // Output: Bonjour
        String m="hello";
        String s=m.substring(2,3);
    System.out.println("m= "+m);
    System.out.println("s= "+s);

        int n1 = 1;
        int n2 = n1;
        n1 = n1 + 2;

        System.out.println(n1);
        System.out.println(n2);

    }
}
