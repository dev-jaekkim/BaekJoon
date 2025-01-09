import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int whichLetterToFind = Integer.parseInt(bf.readLine());
//
//        int startNumber = 0;
//        int endNumber = whichLetterToFind;
//        if(whichLetterToFind - 1 < 1) {
//            startNumber = 0 ;
//        } else {
//            startNumber = whichLetterToFind - 1 ;
//        }
//        String whichLetter = word.substring(startNumber , endNumber);
//        System.out.println(whichLetter);

        bf.close();
        System.out.println(word.charAt(whichLetterToFind - 1));
    }
}
