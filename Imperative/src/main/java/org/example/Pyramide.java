package org.example;

public class Pyramide {
    public static void main( String[] args )
    {
        pyramide(5);
    }

    public static void afficher(String caractere, int nombre)
    {
        for(int i = 1; i <= nombre; i++)
        {
            System.out.print(caractere);
        }
    }

    public static void pyramide(int taille)
    {
        int espaces = taille -1;
        int etoiles = 1;
        for (int x = 1; x <= taille; x++)
        {
            afficher(" ", espaces);
            espaces = espaces -1;
            afficher("*",etoiles);
            etoiles = etoiles+2;
            System.out.println();
        }
    }
}
