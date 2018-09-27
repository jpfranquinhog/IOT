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
public class ArrayUtilities {
    public static String toString(int[] array){
        String str="";
        for(int i=0;i<array.length;i++){
            str+=(i+1)<array.length?array[i]+",":array[i]+"";
        }
        return str;
    }
    public static int maximumOf(int[] array){
        int result=array[0];
        for(int i=1;i<array.length;i++){
            result=array[i]>result?array[i]:result;
        }
        return result;
    }
    
    public static int minimumOf(int[] array){
        int result=array[0];
        for(int i=1;i<array.length;i++){
            result=array[i]<result?array[i]:result;
        }
        return result;
    }
    
    public static int[] copyOf(int[] array){
        int[] result=new int[array.length];
        for(int i=0;i<array.length;i++){
            result[i]=array[i];
        }
        return result;
    }
    
    public static boolean contains(int num,int[] array){
        int count=0;
        boolean result=false;
        for(int i=0;i<array.length;i++){
            count+=array[i]==num?1:0;
        }
        return result=count>0?true:false;
    }
    
    public static boolean containsDuplicates(int num,int[] array){
        int count=0;
        boolean result=false;
        for(int i=0;i<array.length;i++){
            count+=array[i]==num?1:0;
        }
        return result=count>1?true:false;
    }
    public static int indexOf(int num,int[] array){
        int position=0;
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                position=i;
                count++;
            }
        }
        if(count==0){
            position=-1;
        }
        return position;
    }
    public static int[] add(int num,int[] array){
        int[] result= new int[array.length+1];
        result[result.length-1]=num;
        for(int i=0;i<result.length-1;i++){
            result[i]=array[i];
        }
        return result;
    }
    
    public static int[] remove(int num,int[] array){
        int[] result= new int[array.length-1];
        int j=0;
        for(int i=0;i<result.length;i++){
            if(num==j){
                j++;
            }
            result[i]=array[j];
            j++;
        }
        return result;
    }
}
