package ters;

import java.util.Scanner;

public class tersyazýýýý {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birþeyler girin:");
        String metin=input.nextLine();
 
        String cevrilen = cevir(metin);
        System.out.println("Çevrilen Yazý: " + cevrilen);
    }
 
    public static String cevir(String metin)
    {
        if (metin.isEmpty())
            return metin;
 
        return cevir(metin.substring(1)) + metin.charAt(0);

	}

}
