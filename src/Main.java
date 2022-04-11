import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import que.theLastWomenStanding;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer numberOfPeople = Integer.valueOf(bufferedReader.readLine());

        theLastWomenStanding theLastWomenStanding = new theLastWomenStanding();

        Queue peopleInTheCircle = theLastWomenStanding.giveNumberToPeople(numberOfPeople);
        theLastWomenStanding.callOutPeople(peopleInTheCircle);

        bufferedReader.close();

    }



    public static void firstThrowNextEndOfLine(int lengthOfQue) {
        Queue cardDeck = new LinkedList();

        for (int i = 1; i <= lengthOfQue; i++)
            cardDeck.add(i);


        while (!cardDeck.isEmpty()) {
            //제일 위에 있는 카드는 버릔다.
            int thrownCard = (int)cardDeck.poll();

            System.out.print(thrownCard + " ");

            if(cardDeck.isEmpty()) {
                break;
            }

            //다음 카드는 제일 밑으로 넣는다.
            int endOfLineCard = (int)cardDeck.poll();
            cardDeck.add(endOfLineCard);
        }
    }
}
