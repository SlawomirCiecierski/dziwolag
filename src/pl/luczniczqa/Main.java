package pl.luczniczqa;

import pl.luczniczqa.dziwolag.Dziwolag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========Program dziwoląg v.1.0=======");
        System.out.println("=                                    =");
        System.out.println("= Zapoznaj się z programem, spróbuj  =");
        System.out.println("= znaleźć jak najwięcej usterek.     =");
        System.out.println("= Liczę na Twoją intuicję testerską! =");
        System.out.println("=                                    =");
        System.out.println("======================================");


        System.out.println("Program oblicza za pomocą dwóch zmiennych z zakresu 0 - 20; ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz dane: ");
        String var1 = scan.nextLine();
        int varA=Integer.parseInt(var1);

        System.out.println("Wpisz dane: ");
        String var2 = scan.nextLine();
        int varB=Integer.parseInt(var2);

        Dziwolag dziwolag=new Dziwolag(varA,varB);
        System.out.println(dziwolag.Dziwolag(dziwolag.getPierwszaZmienna(), dziwolag.getDrugaZmienna()));
    }
}
