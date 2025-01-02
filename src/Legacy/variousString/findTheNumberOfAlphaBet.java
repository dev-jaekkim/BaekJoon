package Legacy.variousString;

public class findTheNumberOfAlphaBet {
    public static void main(String[] args) {
        findTheNumberOfAlphaBet findTheNumberOfAlphaBet = new findTheNumberOfAlphaBet();

        findTheNumberOfAlphaBet.countAlphabet("baekjoon");
    }

    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
     * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
     * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
     * 예제 입력 1 : baekjoon
     * 예제 출력 1: 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
     */

    //1. 단어를 받는 메서드를 작성한다.
    //2. 받은 단어를 character 단위로 어떤 알파벳으로 구성되었는지 하나씩 확인 한다.
    //3. 순서가 중요하지 않으니, Set으로 담아도 되지 않을까? Set은 중복을 포함할 수 없다.
    //4. 그냥 알파벳의 순서는 정해져 있으니, 출력 배열을 정해 버리자. 모든 값은 0으로 초기화를 하고, int로 만들면 된다.
    //5. 그리고 알파벳마다 고유한 숫자가 있으니 해당하는 숫자의 cnt만 늘리자.
    // 알파벳은 총 52개 이다.
    private void countAlphabet(String word) {

        int[] allAlphabet = new int[26];

        int lengthOfWord = word.length();

        for (int i = 0; i < lengthOfWord; i++) {
            char oneCharacter = word.charAt(i); //97~122

            int alphabetNumber = oneCharacter;

            allAlphabet[alphabetNumber - 97]++;
        }

        printTheResult(allAlphabet);
    }

    private void printTheResult(int[] allAlphabet) {
        for (int i = 0; i < allAlphabet.length; i++) {
            System.out.print(allAlphabet[i]);
            System.out.print(" ");
        }
    }

}
