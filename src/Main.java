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

            int callNumber = (int)Math.pow(numberCount, 3);

            if (callNumber == 1) {

                peopleInTheCircle.poll();
            } else {

                int leftPeople = peopleInTheCircle.size();

                if (leftPeople > 1) {

                    int removeThisPerson = callNumber % leftPeople; //5 %8

                    if (removeThisPerson == 0) {
                        peopleInTheCircle.poll();
                    }

                    if (removeThisPerson > 0) {

                        for (int i = 0; i < removeThisPerson - 1; i++) {
                            //제거
                            int endOfLinePerson = (int)peopleInTheCircle.poll();
                            peopleInTheCircle.add(endOfLinePerson);

                        }

                        peopleInTheCircle.poll();

                    }

                } else {
                    System.out.println(peopleInTheCircle.poll());

                }

            }

            numberCount++;
        }

    }

}
