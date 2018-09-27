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
public class Aula2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double powerOf = NumericalUtilities.powerOf(2, 3);
        System.out.print("power of: "+powerOf+"\n");
        
        int sumOfNaturalNumbersUpTo = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
        System.out.print("sumOfNaturalNumbersUpTo: "+sumOfNaturalNumbersUpTo+"\n");
        
        int sumOfNaturalNumbersBetween = NumericalUtilities.sumOfNaturalNumbersBetween(2, 7);
        System.out.print("sumOfNaturalNumbersBetween: "+sumOfNaturalNumbersBetween+"\n");
        
        int sumOfEvenNumbersBetween = NumericalUtilities.sumOfEvenNumbersBetween(2, 7);
        System.out.print("sumOfEvenNumbersBetween: "+sumOfEvenNumbersBetween+"\n");
        
        int numberOfDivisorsOf = NumericalUtilities.numberOfDivisorsOf(5);
        System.out.print("numberOfDivisorsOf: "+numberOfDivisorsOf+"\n");
        
        boolean isPrime = NumericalUtilities.isPrime(5);
        System.out.print("isPrime: "+isPrime+"\n");
        
        int[] array={1,7,3,4};
        String toString = ArrayUtilities.toString(array);
        System.out.print("toString: "+toString+"\n");
        
        int maximumOf = ArrayUtilities.maximumOf(array);
        System.out.print("maximumOf: "+maximumOf+"\n");
        
        int minimumOf = ArrayUtilities.minimumOf(array);
        System.out.print("minimumOf: "+minimumOf+"\n");
        
        int[] copyOf = ArrayUtilities.copyOf(array);
        System.out.print("copyOf: "+ArrayUtilities.toString(copyOf)+"\n");
        
        boolean contains = ArrayUtilities.contains(7,array);
        System.out.print("contains: "+contains+"\n");
        
        boolean containsDuplicates = ArrayUtilities.containsDuplicates(7,array);
        System.out.print("containsDuplicates: "+containsDuplicates+"\n");
        
        int indexOf = ArrayUtilities.indexOf(7,array);
        System.out.print("indexOf: "+indexOf+"\n");
        
        int[] add = ArrayUtilities.add(7,array);
        System.out.print("add: "+ArrayUtilities.toString(add)+"\n");
        
        int[] remove = ArrayUtilities.remove(1,array);
        System.out.print("remove: "+ArrayUtilities.toString(remove)+"\n");
        
    }
}
