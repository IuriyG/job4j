package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int i = word.length - 1;
        boolean result = true;
        for (int j = post.length - 1; j >= 0; j--, i--) {
            if (post[j] != word[i])     // проверить. что массив word имеет последние элементы одинаковые с post
                result = false;
        }
        return result;
    }
}
