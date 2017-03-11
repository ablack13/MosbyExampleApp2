package com.ablack13.mosbyexampleapp.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.ablack13.mosbyexampleapp.R;
import com.ablack13.mosbyexampleapp.ui.fragments.todo.TodoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadTodoFragment();
    }

    private void loadTodoFragment() {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("todo_fragment");
        if (fragment == null || !fragment.isAdded()) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, TodoFragment.newInstance(), "todo_fragment")
                    .commitNowAllowingStateLoss();
        }
    }
}
