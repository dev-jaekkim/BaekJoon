package BaekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 백준 5597
 * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
 * <p>
 * 교수님이 내준 특별과제를 28명이 Ø제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 * 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
 * <p>
 * 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
 */
public class Homework {

    public void printWhoDidntDoThereHomework() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> fullClass = new TreeSet<Integer>();

        for (int i = 1; i <= 30; i++) {
            fullClass.add(i);
        }

        //입력 받은 값 삭제하기
        for (int i = 0; i < 28; i++) {
            int homeworkDone = Integer.parseInt(bf.readLine());
            fullClass.remove(homeworkDone);
        }

        bf.close();

        Iterator<Integer> it = fullClass.iterator();
        StringBuilder sb = new StringBuilder();

        while(it.hasNext()) {
            sb.append(it.next());
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);

    }
}
