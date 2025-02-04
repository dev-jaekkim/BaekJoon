import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstSentence = bf.readLine();
        String secondSentence = bf.readLine();
        String thirdSentence = bf.readLine();
        bf.close();
        int outPutNumber = 0;

        if(isItStringOrNumber(firstSentence, outPutNumber, 3)){
            if(isItStringOrNumber(secondSentence, outPutNumber, 2)) {
                isItStringOrNumber(thirdSentence, outPutNumber, 1);
            }
        }

    }

    public static boolean isItStringOrNumber(String sentence, int outPutNumber, int addNumber) {
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

    public static boolean isItString(String sentence) {
        return "Fizz".equals(sentence) || "Buzz".equals(sentence) || "FizzBuzz".equals(sentence);
    }
}
