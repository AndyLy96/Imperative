package org.example;

/**
 * Hello world!
 *
 */
public class EclateString
{
    public static void main(String[] args )
    {
        String chaine = args[0];
        char[] ch = chaine.toCharArray();
        for ( int x=0; x <= chaine.length(); x++)
        {
            System.out.println(ch[x]);
        }
    }
}
