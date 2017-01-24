package com.quanlt.boilerplate.ui.base;

/**
 * Created by quanlt on 24/01/2017.
 */

public class BasePresenter<V extends MvpView> implements Presenter<V> {
    private V view;

    @Override
    public void attachView(V v) {
        this.view = v;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    public V getMvpView() {
        return view;
    }
}
