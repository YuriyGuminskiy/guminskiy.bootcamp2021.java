package guminskiy.bootcamp.tasks.task3;

public class Solution {
    public int solution(int number) {
        String numberToString = Integer.toString(number);
        String[] chars = numberToString.split("");
        String[] shuffledChars = new String[chars.length];

        for (int i = 0; i < chars.length / 2; i++) {
            shuffledChars[i * 2] = chars[i];
            shuffledChars[i * 2 + 1] = chars[chars.length - i - 1];
        }
        if (shuffledChars.length % 2 == 1) {
            shuffledChars[shuffledChars.length - 1] = chars[chars.length / 2];
        }
        return Integer.parseInt(String.join("", shuffledChars));
    }
}