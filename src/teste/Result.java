package teste;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void main(String[] args) {



        for(int n = 0 ; n <15; n++){

            if (n%3 == 0 && n%5 == 0){
                System.out.println("FizzBuzz");

            }else if(n%3 == 0 && n%5 != 0){
                System.out.println("Fizz");

            }else if (n%3 != 0 && n%5 == 0){
                System.out.println("Buzz");

            }else {
                System.out.println(n);
                System.out.println("FizzBuzz");
            }
        }

    }

}

