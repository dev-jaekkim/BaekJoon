package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1978
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */
public class PrimeNumbers {
    public void findThePrime() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputNumCount = Integer.parseInt(bf.readLine());
        int resultCount = 0;

        String numList = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(numList, " ");

        for (int i = 0; i < inputNumCount; i++) {
            int areYouPrime = Integer.parseInt(st.nextToken());
            boolean primeCheck = true;
            System.out.println("areYouPrime = " + areYouPrime);
            for (int j = 2; j < areYouPrime; j++) {
                System.out.println("j = " + j + " areYouPrime = " + areYouPrime);
                if (areYouPrime % j == 0) {
                    System.out.println("primeCheck False value = " + areYouPrime + " j = " + j);
                    primeCheck = false;
                    break;
                }
            }

            if (primeCheck && areYouPrime != 1) {
                resultCount += 1;
            }
        }

        System.out.println(resultCount);
    }

    public void useSquare() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumCount = Integer.parseInt(bf.readLine());
        String numberLine = bf.readLine();
        bf.close();
        int primeNumResult = 0;

        StringTokenizer st = new StringTokenizer(numberLine, " ");


        for (int i = 0; i < totalNumCount; i++) {
            int areYouPrime = Integer.parseInt(st.nextToken());
            boolean primeCheck = false;

            for(int j = 2 ; j < Math.sqrt(areYouPrime); i++) {
                if(areYouPrime%j ==0) {
                    primeCheck = true;
                    break;
                }
            }

            if(!primeCheck) {
               primeNumResult += 1;
            }
        }

        System.out.println(primeNumResult);
    }
}
