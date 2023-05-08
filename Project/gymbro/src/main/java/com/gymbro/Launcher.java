package com.gymbro;

/**
 * The type Launcher.
 */
public class Launcher{

    private static Thread mainThread = null;

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        mainThread = new Thread(() -> Main.main(args), "mainThread");
        mainThread.start();
    }
}
