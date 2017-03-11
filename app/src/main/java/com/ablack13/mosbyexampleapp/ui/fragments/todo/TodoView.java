package com.ablack13.mosbyexampleapp.ui.fragments.todo;

import com.ablack13.mosbyexampleapp.common.BaseView;

import java.util.List;

/**
 * Created by scijoker on 11.03.17.
 */

public interface TodoView extends BaseView {
    void onListDataLoaded(List<String> items);
}
