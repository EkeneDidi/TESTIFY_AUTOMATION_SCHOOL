package CodingChallenge;

public class Challenge3 {
    public static void main(String[] args) {
        int[] arrayy = {6, 9, 4, 2, 11, 7, 5};

        Pair prodct = findMaxProductPair(arrayy);

        if (prodct != null) {
            System.out.println("Two numbers with maximum product: " + prodct.initialnum + " and " + prodct.nextnum);
            System.out.println("Maximum product is: " + (long) prodct.initialnum * prodct.nextnum);
        } else {
            System.out.println("Array is incomplete.");
        }
    }

    private static class Pair {
        int initialnum;
        int nextnum;

        Pair(int first, int second) {
            this.initialnum = first;
            this.nextnum = second;
        }
    }

    private static Pair findMaxProductPair(int[] arrayy) {
        if (arrayy == null || arrayy.length < 2) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int nextMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int nextMin = Integer.MAX_VALUE;

        for (int number : arrayy) {
            if (number > max) {
                nextMax = max;
                max = number;
            } else if (number > nextMax) {
                nextMax = number;
            }

            if (number < min) {
                nextMin = min;
                min = number;
            } else if (number < nextMin) {
                nextMin = number;
            }
        }

        return (long) max * nextMax > (long) min * nextMin ? new Pair(max, nextMax) : new Pair(min, nextMin);
    }

}
