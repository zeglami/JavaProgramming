package me.zegit.testingOnly.innerClass;

public class Externe {


    private int x;

    public Externe(int x) {
        this.x = x;
    }

    public class Interne{
        public Interne() {
        }

        public void afficher(){
      System.out.println("La valeur de x est: "+ x);
        }
    }


    public void setX(int x ){
        this.x=x;
    }
    Interne t=new Interne();

    public int getX() {
        return x;
    }
}
