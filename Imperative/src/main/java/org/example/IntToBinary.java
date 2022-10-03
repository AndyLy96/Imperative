package org.example;

public class IntToBinary {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        String result = Integer.toBinaryString(input);
        String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0");  // 32-bit Integer
        System.out.println(resultWithPadding);
    }
}
