package ters;

import java.util.Scanner;

public class tersyaz���� {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir�eyler girin:");
        String metin=input.nextLine();
 
        String cevrilen = cevir(metin);
        System.out.println("�evrilen Yaz�: " + cevrilen);
    }
 
    public static String cevir(String metin)
    {
        if (metin.isEmpty())
            return metin;
 
        return cevir(metin.substring(1)) + metin.charAt(0);

	}

}
