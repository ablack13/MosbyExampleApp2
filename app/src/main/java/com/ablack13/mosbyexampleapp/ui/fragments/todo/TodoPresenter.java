package com.ablack13.mosbyexampleapp.ui.fragments.todo;

import com.ablack13.mosbyexampleapp.common.BasePresenter;

/**
 * Created by scijoker on 11.03.17.
 */

public abstract class TodoPresenter extends BasePresenter<TodoView> {
    abstract void loadList();
}
