package com.ablack13.mosbyexampleapp.common;

import com.hannesdorfmann.mosby.mvp.MvpFragment;

/**
 * Created by scijoker on 11.03.17.
 */

public abstract class BaseFragment<V extends BaseView, P extends BasePresenter<V>> extends MvpFragment<V, P> {
}
