package guminskiy.bootcamp.tasks.task1;

public class Solution {
    public int solution(int[] arrayOfCoins) {
        int countOfHeads = 0;

        for (int i = 0; i < arrayOfCoins.length; i++) {
            if (arrayOfCoins[i] == 0) {
                countOfHeads++;
            }
        }

        if (countOfHeads >= arrayOfCoins.length / 2) {
            return calculateCountOfCoins(arrayOfCoins, 1);
        } else {
            return calculateCountOfCoins(arrayOfCoins, 0);
        }
    }

    public static int calculateCountOfCoins(int[] arrayOfCoins, int side) {
        int countOfCoins = 0;

        for (int i = 0; i < arrayOfCoins.length; i++) {
            if (arrayOfCoins[i] == side) {
                arrayOfCoins[i] = 1 - side;
                countOfCoins++;
            }
        }
        return countOfCoins;
    }
}
