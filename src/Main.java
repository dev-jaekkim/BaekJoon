import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer calledOutNumber = Integer.valueOf(bufferedReader.readLine());
        Queue peopleInTheCircle = giveNumberToPeople(calledOutNumber);
        callOutPeople(peopleInTheCircle);

        bufferedReader.close();

    }

    public static Queue giveNumberToPeople(int peopleCount) {
        Queue peopleInTheCircle = new LinkedList();

        for (int i = 1; i <= peopleCount; i++) {
            peopleInTheCircle.add(i);
        }

        return peopleInTheCircle;

    }

    public static void callOutPeople(Queue peopleInTheCircle) {

        int numberCount = 1;

        while (!peopleInTheCircle.isEmpty()) {

            int callNumber = numberCount * numberCount * numberCount;

            if (callNumber == 1) {

                peopleInTheCircle.poll();
            } else {

                int leftPeople = peopleInTheCircle.size();

                if (leftPeople > 1) {

                    long removeThisPerson = callNumber % leftPeople;

                    if(removeThisPerson == 0 ) {
                        removeThisPerson = leftPeople;
                    }

                    if (removeThisPerson > 0) {

                        for (long i = 0; i < removeThisPerson ; i++) {
                            int endOfLinePerson = (int)peopleInTheCircle.poll();
                            peopleInTheCircle.add(endOfLinePerson);

                        }

                    }

                    peopleInTheCircle.poll();

                } else {
                    System.out.println(peopleInTheCircle.poll());

                }

            }

            numberCount++;
        }

    }

}
