package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        return first > second && first > third ? first : second > third ? second : third;
        //return Math.max(first, Math.max(second,third)); //Самый короткий вариант)
       /*
        if (first > second && first > third){
            return first;
        } else if (second > first && second > third){
            return second;
        }else return third; // Самый простой способ)
       */
    }
}
