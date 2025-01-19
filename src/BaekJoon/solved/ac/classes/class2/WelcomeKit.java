package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 30802
 * 2024년 2월 3일 개최 예정인 온사이트 그랜드 아레나에서는 참가자들에게 티셔츠 한 장과 펜 한 자루가 포함된 웰컴 키트를 나눠줄 예정입니다.
 * 키트를 제작하는 업체는 다음과 같은 조건으로만 주문이 가능합니다.
 *
 * 티셔츠는 S, M, L, XL, XXL, 그리고 XXXL의 6가지 사이즈가 있습니다. 티셔츠는 같은 사이즈의 $T$장 묶음으로만 주문할 수 있습니다.
 * 펜은 한 종류로, $P$자루씩 묶음으로 주문하거나 한 자루씩 주문할 수 있습니다.
 * 총 $N$명의 참가자 중 S, M, L, XL, XXL, XXXL 사이즈의 티셔츠를 신청한 사람은 각각 $S, M, L, XL, XXL, XXXL$명입니다.
 * 티셔츠는 남아도 되지만 부족해서는 안 되고 신청한 사이즈대로 나눠주어야 합니다. 펜은 남거나 부족해서는 안 되고 정확히 참가자 수만큼 준비되어야 합니다.
 *
 * 티셔츠를 $T$장씩 최소 몇 묶음 주문해야 하는지, 그리고 펜을 $P$자루씩 최대 몇 묶음 주문할 수 있고, 그 때 펜을 한 자루씩 몇 개 주문하는지 구하세요.
 */
public class WelcomeKit {

    public void howManyDoINeedToOrder() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int attendants = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        String sizeOfTshirtInput = bf.readLine();
        StringTokenizer st = new StringTokenizer(sizeOfTshirtInput, " ");
        int shirtResultCount = 0;


        String tshirtBundlePenBundle = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(tshirtBundlePenBundle, "");
        bf.close();
        int penResult = 0;
        int unitPenResult = 0;

        int tshirtBundle = Integer.parseInt(st2.nextToken());
        int penBundle = Integer.parseInt(st2.nextToken());
        for(int i = 0 ; i < 6; i++) {
            int sizeCount = Integer.parseInt(st.nextToken());
            shirtResultCount += sizeCount/tshirtBundle;
            if(sizeCount%tshirtBundle != 0) {
                shirtResultCount += 1;
            }

        }
        sb.append(shirtResultCount);
        sb.append(System.lineSeparator());
        penResult = attendants / penBundle;
        unitPenResult = attendants % penBundle;
        sb.append(penResult);
        sb.append(" ");
        sb.append(unitPenResult);

        System.out.println(sb);
    }
}
