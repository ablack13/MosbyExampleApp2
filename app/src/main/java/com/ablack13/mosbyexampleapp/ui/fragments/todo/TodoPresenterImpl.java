package com.ablack13.mosbyexampleapp.ui.fragments.todo;

import android.os.Handler;
import android.os.Looper;

import com.ablack13.mosbyexampleapp.db.TodoRepository;

import java.util.List;

/**
 * Created by scijoker on 11.03.17.
 */

public class TodoPresenterImpl extends TodoPresenter {
    @Override
    void loadList() {
        final Handler handler = new Handler(Looper.getMainLooper());
        new Thread(new Runnable() {
            @Override
            public void run() {
                final List<String> list = TodoRepository.getAllTodo();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (isViewAttached()) {
                            getView().onListDataLoaded(list);
                        }
                    }
                });
            }
        }).start();
    }
}
