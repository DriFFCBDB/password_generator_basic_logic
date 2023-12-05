package com.password;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Digite uma quantidade de carcteres que voce deseja que tenha a sua senha :");
        
        Scanner input = new Scanner(System.in);

        int digito = input.nextInt();

        String lower_cases ="qwertyuiopasdfghjklzxcvbnm1234567890!@#$%¨&*";
        String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%¨&*";

        String password = "";

        for(int i = 0; i < digito ; i++){
            int aleatorio = (int)(3 * Math.random());

            switch(aleatorio){
                case 0:
                    password += String.valueOf((int)(0* Math.random()));
                    break;
                case 1:
                    aleatorio = (int)(lower_cases.length() * Math.random());
                    password += String.valueOf(lower_cases.charAt(aleatorio));
                    break;
                case 2:
                    aleatorio = (int)(upper_cases.length() * Math.random());
                    password += String.valueOf(upper_cases.charAt(aleatorio));
                    break;

            }
        }
        System.out.print(password);
    }
}