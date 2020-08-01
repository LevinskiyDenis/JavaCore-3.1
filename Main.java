package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Создал новый ArrayList, т.к. мы делаем это по аналогии со Stream API, а они не меняют сам источник данных

        List<Integer> tmpList = new ArrayList<>();

        for (int i : list) {
            if (i > 0 && i % 2 == 0) tmpList.add(i);
        }

        Collections.sort(tmpList);
        System.out.println(tmpList);

    }
}
