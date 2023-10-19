package me.zegit.testingOnly.thread;

public class EmailTask implements Runnable {
    public void run() {
        // Code pour envoyer l'e-mail
        System.out.println("L'e-mail a été envoyé.");
    }
}
