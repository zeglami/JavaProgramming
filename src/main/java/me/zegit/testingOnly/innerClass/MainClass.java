package me.zegit.testingOnly.innerClass;

public class MainClass {
  public static void main(String[] args) {
    //
      Externe externe= new Externe(1);
      int ret=externe.getX();
    System.out.println("ret: "+ret);

      Externe.Interne interne;
    //  interne.afficher();
  }
}
