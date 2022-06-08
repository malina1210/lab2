package com.alina;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    final int N = 20;
        int[] arr = new int[N];
        int[] counters = new int[]{0,0,0};
        Random rand = new Random();
        for(int i = 0; i<N; i++){
            arr[i] = rand.nextInt(60)-30;
            if(arr[i]<0){
                counters[0]++;
            } else if(arr[i]==0){
                counters[1]++;
            } else{
                counters[2]++;
            }
        }
        System.out.println("Кол-во отрицательных чисел: "+counters[0]);
        System.out.println("Кол-во нулей: "+counters[1]);
        System.out.println("Кол-во положительных чисел: "+counters[2]);
    }
}
