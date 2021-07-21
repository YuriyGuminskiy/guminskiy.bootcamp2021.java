package guminskiy.bootcamp.tasks.task2;

import java.util.Arrays;

public class Solution {
    public int solution(String s) {
        int count = 0;
        String[] sentences = s.split("[.!?]+");

        for (int i = 0; i < sentences.length; i++) {
            for (int j = 1; j < sentences.length; j++) {
                if ((sentences[i].trim().split("\\s+").length) < (sentences[j].trim().split("\\s+").length)) {
                    count = sentences[j].trim().split("\\s+").length;
                    System.out.println(Arrays.toString(sentences[j].trim().split(" ")));
                }
            }
        }
        return count;
    }
}
