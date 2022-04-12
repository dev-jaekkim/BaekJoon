package que;

import java.util.LinkedList;
import java.util.Queue;

public class theLastWomenStanding {

    /**
     *백준이는 BOJ 알고리즘 캠프 참가자 중 한 명에게 기념품을 주려고 한다.
     * 하지만, 많은 참가자 중에서 어떤 사람을 뽑아서 기념품을 줘야하는지
     * 고민이 되기 시작했다. 따라서, 백준이는 게임을 통해서 기념품을
     * 받을 사람을 정하기로 결정했다.
     * 게임이 시작하기 전에 모든 참가자 N명은 원을 이루어서 앉아있다.
     * 다음, 1부터 N까지 번호가 적혀있는 티셔츠를 시계방향으로 입는다.
     * 이 티셔츠는 게임에 사용되지 않으며, 게임을 쉽게 하기 위해서 입는 티셔츠이다.
     * 게임은 단계로 이루어져 있으며, 첫 단계는 1단계이다.
     * 각 단계가 시작될 때, 백준이는 어떤 참가자의 앞에 서있다.
     * 그 다음, "하나"를 외친다.
     * 그 다음, 시계 방향으로 다음 사람에게 이동하며 "둘"을 외친다.
     * 이 과정은 t단계인 경우에 t3을 외칠 때 까지 진행한다.
     * 예를 들어, 1단계에서는 1까지 외치며, 2단계에서는 8까지, 3단계에서는 27까지 외친다.
     * 각 단계가 끝난 경우에, 백준이가 앞에 서 있는 사람은 게임에서 제외된다.
     * (t단계인 경우에 t3을 외칠 때 앞에 있던 사람) 사람이 제거된 후에는
     * 백준이는 시계 방향으로 다음 사람에게 이동한다.
     * 1단계에서 백준이는 티셔츠 1번을 입고 있는 사람의 앞에 있다.
     * 게임은 원에 한 명이 남을 때 까지 진행되며,
     * 마지막 남은 사람이 기념품을 가져가게 된다.
     * 참가자의 수 N이 주어졌을 때, 어떤 티셔츠를 입고 있는 사람이 기념품을 받는지
     * 구하는 프로그램을 작성하시오.
     *
     * 예제 입력 : 3
     * 예제 출력: 2
     *
     *  1 2 3 --1
     *  1
     *  2 3  --8
     *  3
     *  2
     *
     *  예제 입력: 6
     *  예제 출력: 6
     *
     *  1 2 3 4 5 6 --1
     *  2 3 4 5 6 --8 개수만큼 나누고 나머지 번째의 숫자가 빠져야함. index값 사용
     *  2 3 5 6 -- 27
     *  2 3 6 -- 64
     *  3 6 -- 125
     *  6
     *
     */

    public static void main(String[] args) {
        theLastWomenStanding theLastWomenStanding = new theLastWomenStanding();

        Queue peopleInTheCircle = theLastWomenStanding.giveNumberToPeople(5000);
        theLastWomenStanding.callOutPeople(peopleInTheCircle);
    }

    /**
     * 1. 사람의 수 만큼 Que에 값을 집어 넣는다.
     * 2. Que에서 첫 번째는 1의 3제곱만큼의 값의 번호를 가진 사람을 뺀다.
     * 3.
     *
     */
    public Queue giveNumberToPeople(int peopleCount) {
        Queue peopleInTheCircle = new LinkedList();

        for (int i = 1; i <= peopleCount; i++) {
            peopleInTheCircle.add(i);
        }

        return peopleInTheCircle;

    }

    public void callOutPeople(Queue peopleInTheCircle) {

        int numberCount = 1;

        while (!peopleInTheCircle.isEmpty()) {

            int callNumber = (int)Math.pow(numberCount, 3);

            if (callNumber == 1) {

                int firstRemovedPerson = (int)peopleInTheCircle.poll();
                System.out.println("firstRemovedPerson:  " + firstRemovedPerson);

            } else {

                int leftPeople = peopleInTheCircle.size();

                if (leftPeople > 1) {

                    int removeThisPerson = callNumber % leftPeople ; //5 %8
                    System.out.println("leftPeople: " + leftPeople + " callNumber: " + callNumber);
                    System.out.println("removeThisPerson : "+ removeThisPerson);

                    if (removeThisPerson == 0 ) {
                        int removedPersonWhenModeIsZero = (int)peopleInTheCircle.poll();
                        System.out.println("removedPersonWhenModeIsZero:  " + removedPersonWhenModeIsZero);

                    }

                    if (removeThisPerson > 0) {

                        for (int i = 0; i < removeThisPerson - 1; i++) {
                            //제거
                            int endOfLinePerson = (int)peopleInTheCircle.poll();
                            peopleInTheCircle.add(endOfLinePerson);
                            System.out.println("endOfLinePerson:  " + endOfLinePerson);
                        }

                        int removedPersonWhenModIsMoreThanZero = (int)peopleInTheCircle.poll();
                        System.out.println("removedPersonWhenModIsMoreThanZero:  " + removedPersonWhenModIsMoreThanZero);

                    }

                } else {
                    System.out.println(peopleInTheCircle.poll());

                }

            }

            numberCount++;
        }

    }

}
