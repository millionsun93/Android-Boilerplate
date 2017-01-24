package com.quanlt.boilerplate.ui.base;

/**
 * Created by quanlt on 19/01/2017.
 */

public interface BaseMvpView extends MvpView{
    void showLoading();

    void hideLoading();

    void showError(String message);

    void showEmpty();
}
