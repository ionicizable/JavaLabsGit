package by.shapiro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите количество чисел: ");
        Scanner sr = new Scanner(System.in);
        int count = sr.nextInt();
        System.out.println("Введите значения:");
        for (int i = 0; i < count; i++) {
            list.add(sr.nextInt());
        }
        System.out.println(list.toString());

        List<Integer> templist = new ArrayList<>();

        while (list.size()!=1){
            for (int i = 0; i < list.size()-1; i++) {
                list.set(i,list.get(i)+list.get(i+1));
                list.remove(i+1);
            }
            System.out.println(list.toString());
        }

    }
}
