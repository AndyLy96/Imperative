package org.example;

public class HollowPyramide {
    public static void main(String[] args)
    {
        String tailleString = args[0];
        int taille = Integer.parseInt(tailleString);

        //ligne 1
        for (int i = 1; i <= taille -1; i++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        int debut = taille-2;
        int milieu = 1;
        for (int ligne = 2; ligne <= taille -1; ligne++)
        {
            //un certain nombre d'espace
            for (int i=1;i<=debut;i++)
            {
                System.out.print(" ");
            }
            debut = debut-1;

            //un etoile
            System.out.print("*");

            //un certain nombre d'espace
            for (int i=1;i<=milieu;i++)
            {
                System.out.print(" ");
            }
            milieu = milieu + 2;

            //une etoile
            System.out.print("*");
            //un saut de ligne
            System.out.println(" ");

        }
        for (int i = 1;i < taille*2; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}
