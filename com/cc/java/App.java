package com.cc.java;

public class App {
    public static void main(String[] args) {
    
        Player player = new Player();

        
        // Variante 1
        // for (int i = 0; i < 12; i++) {
        //     output(player.play());  
        // }

        // Variante 2
        while (player.points < 13) {
            output(player.play()); 
        }


       
    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
