package com.ablack13.mosbyexampleapp.db;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scijoker on 11.03.17.
 */

public class TodoRepository {
    public static List<String> getAllTodo() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("Item2::" + i);
        }
        return list;
    }
}
