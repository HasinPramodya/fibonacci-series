package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static long [] fibonaacciChace ;
    public static void main(String[] args) {
       int number = 6; // Example: Calculate the 10th Fibonacci number
        fibonaacciChace = new long[number + 1]; // Initialize the cache array
        System.out.println(fibonacci(number));
    }

    public static long fibonacci(int n){
        if(n<=1){
            return n;  // if n is 0 or 1 return the value of n and terminate the method
        }
        if(fibonaacciChace[n] != 0){
            return fibonaacciChace[n]; // return the cached value if it exists
        }
        fibonaacciChace [n] = fibonacci(n-1) + fibonacci(n-2);
        return fibonaacciChace[n];// recursive call
    }
}