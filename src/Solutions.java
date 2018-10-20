import java.util.Arrays;

public class Solutions {

    /*
    TASK 1
     */

    public int wordsCount(String[] words, int len) {
        return (int) Arrays.asList(words)
                .stream()
                .filter(word -> word.length() == len)
                .count();

        //alternative, simple approach:
//        int counter = 0;
//        for(String word : words) {
//            if(word.length() == len)
//              counter++;
//        }
//        return counter;

    }

    /*
    TASK 2
     */

    public String[] wordsFront(String[] words, int n) {

        return Arrays.asList(words)
                .stream()
                .limit(n)
                .toArray(size -> new String[size]);

        //alternative, simple approach:
//        String[] front = new String[n];
//        for(int i = 0; i < n; i++) {
//            front[i] = words[i];
//        }
//        return front;

    }


    /*
        TASK 3
    */
    private boolean hasOneDuplicate(int a, int b, int c) {
        if (a == b || a == c || b == c)
            return true;
        else
            return false;
    }

    private boolean areAllTheSame(int a, int b, int c) {
        if (a == b && b == c)
            return true;
        else
            return false;
    }

    public int greenTicket(int a, int b, int c) {
        if (areAllTheSame(a, b, c)) {
            return 20;
        } else if (hasOneDuplicate(a, b, c)) {
            return 10;
        } else {
            return 0;
        }
    }

}