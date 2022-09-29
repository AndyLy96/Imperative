package org.example;

public class Moyenne {
    public static void main( String[] args ) {
        int min = 0;
        int max = 100;

        int taille = 50;
        int[] tabmoyenne = new int[taille];

        for (int i = 0; i <= taille - 1; i++) {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            tabmoyenne[i] = random;
        }

        int nombre = 0;
        for (int i = 0; i <= taille - 1; i++) {
            nombre += tabmoyenne[i];
        }

        int moyenne = 0;
        moyenne = nombre/taille;

        int grand = 0;

        int next = 0;
        for (int i = 0; i <= taille - 1; i++)
        {
            if(tabmoyenne[i] > next)
            {
                next = tabmoyenne[i];
            }
        }
        grand = next;

        int small = 0;

        int yes = 1000;
        for (int i = 0; i <= taille - 1; i++)
        {
            if(tabmoyenne[i] < yes)
            {
                yes = tabmoyenne[i];
            }
        }
        small = yes;


        System.out.println("Le plus grand nombre est : " + grand);
        System.out.println("le plus petit nombre est : " + small);
        System.out.println("La moyenne est : " + moyenne);

    }
}
