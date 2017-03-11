package com.ablack13.mosbyexampleapp.ui.fragments.todo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ablack13.mosbyexampleapp.R;
import com.ablack13.mosbyexampleapp.common.BaseFragment;

import java.util.List;

/**
 * Created by scijoker on 11.03.17.
 */

public class TodoFragment extends BaseFragment<TodoView, TodoPresenter>
        implements TodoView {
    private ListView listView;
    private ArrayAdapter<String> adapter;

    public TodoFragment() {
    }

    @Override
    public TodoPresenter createPresenter() {
        return new TodoPresenterImpl();
    }

    public static TodoFragment newInstance() {
        return new TodoFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_todo, container, false);
        initUi(view);
        return view;
    }

    private void initUi(View rootView) {
        listView = (ListView) rootView.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter().loadList();
    }

    @Override
    public void onListDataLoaded(List<String> items) {
        adapter.addAll(items);
        adapter.notifyDataSetChanged();
    }
}
