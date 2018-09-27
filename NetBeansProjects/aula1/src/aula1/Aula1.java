/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] numbers = {2,4,3,7,1,9};
        int op;
        Scanner scan= new Scanner(System.in);
        System.out.print("hello world\n");
        System.out.print("1 - calcular perimetro retangulo\n");
        System.out.print("2 - volume paralelepipedo\n");
        System.out.print("3 - Fahrenheit To Celsius\n");
        System.out.print("4 - converter horas, minutos e segundos para segundos\n");
        System.out.print("5 - max de um array\n");
        System.out.print("6 - min de um array\n");
        System.out.print("7 - media de um array\n");
        System.out.print("---------------------------------\nescolha uma opcao:");
        op=scan.nextInt();
        System.out.print("---------------------------------\n");
        switch (op){
            case 1: System.out.print("insira a largura do retangulo:");
                    float lar=scan.nextFloat();
                    System.out.print("insira a comprimento do retangulo:");
                    float com=scan.nextFloat();
                    System.out.print(CalcularRet(lar,com));
                    break;
                    
            case 2: System.out.print("insira a largura do paralelepipedo:");
                    lar=scan.nextFloat();
                    System.out.print("insira a comprimento do paralelepipedo:");
                    com=scan.nextFloat();
                    System.out.print("insira a altura do paralelepipedo:");
                    float alt=scan.nextFloat();
                    System.out.print(vol_para(lar,com,alt));
                    break;
                    
            case 3: System.out.print("insira a temperatura em Fahrenheit:");
                    float F=scan.nextFloat();
                    System.out.print(FahrenheitToCelsius(F));
                    break;
                    
            case 4: System.out.print("insira as horas:");
                    int h=scan.nextInt();
                    System.out.print("insira os minutos:");
                    int m=scan.nextInt();
                    System.out.print("insira os segundos:");
                    int s=scan.nextInt();
                    System.out.print(time(h,m,s));
                    break;
                 
            case 5: System.out.print(max(numbers));
                    break;
                    
            case 6: System.out.print(min(numbers));
                    break;
                    
            case 7: System.out.print(media(numbers));
                    break;
            
            default: System.out.print("opcao invalida");
                     break;
        }
    } 
    private static float CalcularRet(float a,float b) {
        return (a+b)*2;
    }
    private static float vol_para(float a, float b, float c) {
        return a*b*c;
    }
    private static float FahrenheitToCelsius(float i) {
        return (i-32)*5/9;
    }

    private static int time(int h, int m, int s) {
        m=m+60*h;
        s=s+60*m;
        return s;
    }

    private static int max(int[] numbers) {
        int maior=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(maior<numbers[i]){
                maior=numbers[i];
            }
        }
        return maior;
    }

    private static int min(int[] numbers) {
        int menor=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(menor>numbers[i]){
                menor=numbers[i];
            }
        }
        return menor;
    }

    private static float media(int[] numbers) {
        float med=0;
        for(int i=0;i<numbers.length;i++){
            med+=numbers[i];
        }
        return med/numbers.length;
    }
    
}
