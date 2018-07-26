package com.company;
import java.util.Scanner;

public class HoleInTen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String prodCode;

        System.out.println("Product Code? ");
        prodCode = keyboard.next();

        switch (prodCode) {
            case "BALL": System.out.println("Golf Balls (1 dozen) @ 38.00");
                break;
            case "DRV01": System.out.println("Big Bertha Driver @ $449.95");
                break;
            case "DRV02": System.out.println("Vaporizer Driver @ $375.00");
                break;
            case "DRV03": System.out.println("Fly-Z Driver @ $179.00");
                break;
            case "SET01": System.out.println("Project Manager Golf Club Set @ $179.00");
                break;
            case "SET02": System.out.println("Project Manager Golf Club Set @ $225.00");
                break;
            case "SET03": System.out.println("Executive Golf Club Set @ $299.95");
                break;
            case "SET04": System.out.println("CEO Golf Club Set @ $374.95");
                break;
            case "SET05": System.out.println("Chairman of the Board Club Set @ $495.00");
                break;
            default: System.out.println("Invalid Product");
        }
    }
}