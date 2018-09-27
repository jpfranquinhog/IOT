/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Turma A
 */
public class NumericalUtilities {
    /**
     * this function returns the power of an exponent and a base
     * @param num1 double
     * @param num2 double 
     * @return returns the result of the operation
     */
    public static double powerOf(double num1,double num2){
        double result=num1;
        for(int i=0;i<num2-1;i++){
            result*=num1;
        }
        return result;
    }
    public static int sumOfNaturalNumbersUpTo(int num){
        int soma=0;
        for(int i=0;i<=num;i++){
            soma+=i;
        }
        return soma;
    }
    public static int sumOfNaturalNumbersBetween(int num1,int num2){
        int soma=0;
        for(int i=num1;i<=num2;i++){
            soma+=i;
        }
        return soma;
    }
    public static int sumOfEvenNumbersBetween(int num1,int num2){
        int soma=0;
        for(int i=num1;i<=num2;i++){
            soma+=i%2==0?i:0;
        }
        return soma;
    }
    public static int numberOfDivisorsOf(int num){
        int soma=0;
        for(int i=1;i<=num;i++){
            soma+=num%i==0?1:0;
        }
        return soma;
    }
    public static boolean isPrime(int num){
        return numberOfDivisorsOf(num)==2?true:false;
    }
}
