package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 28702
 * FizzBuzz 문제는 $i = 1, 2, \cdots$ 에 대해 다음 규칙에 따라 문자열을 한 줄에 하나씩 출력하는 문제입니다.
 *
 *  $i$가 $3$의 배수이면서 $5$의 배수이면 “FizzBuzz”를 출력합니다.
 *  $i$가 $3$의 배수이지만 $5$의 배수가 아니면 “Fizz”를 출력합니다.
 *  $i$가 $3$의 배수가 아니지만 $5$의 배수이면 “Buzz”를 출력합니다.
 *  $i$가 $3$의 배수도 아니고 $5$의 배수도 아닌 경우 $i$를 그대로 출력합니다.
 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 주어집니다. 이때, 이 세 문자열 다음에 올 문자열은 무엇일까요?
 *
 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 한 줄에 하나씩 주어집니다. 각 문자열의 길이는 $8$ 이하입니다.
 * 입력이 항상 FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열에 대응됨이 보장됩니다.
 *
 * FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열이 한 줄에 하나씩 주어집니다.
 * 각 문자열의 길이는 $8$ 이하입니다. 입력이 항상 FizzBuzz 문제에서 연속으로 출력된 세 개의 문자열에 대응됨이 보장됩니다.
 */
public class FizzBuzz {

    public void printTheString() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstSentence = bf.readLine();
        String secondSentence = bf.readLine();
        String thirdSentence = bf.readLine();
        bf.close();
        int outPutNumber = 0;

        // 가장 먼저 해야 할것. 숫자를 찾아야함. 해당 숫자를 기준으로 움직여야 하기 때문
        // 길이 체크 4글자
        // 길이가 4로 나눴을때 나머지가 0인 경우, 높은 확률로 문자임.
        // 아닌 경우도 존재함. 하지만 문자일 확률이 높음.

        if(isItStringOrNumber(firstSentence, outPutNumber, 3)){
            if(isItStringOrNumber(secondSentence, outPutNumber, 2)) {
                isItStringOrNumber(thirdSentence, outPutNumber, 1);
            }
        }
    }

    public boolean isItStringOrNumber(String sentence, int outPutNumber ,int addNumber) {
        if (isItString(sentence)) {
            return true;
        } else {
            outPutNumber = Integer.parseInt(sentence) + addNumber;
            if (outPutNumber % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (outPutNumber % 5 == 0) {
                System.out.println("Buzz");
            } else if (outPutNumber % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(outPutNumber);
            }
            return false;
        }
    }

    public boolean isItString(String sentence) {
        return "Fizz".equals(sentence) || "Buzz".equals(sentence) || "FizzBuzz".equals(sentence);
    }
}
