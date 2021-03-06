package id.co.next_innovation.store.ui.sign.up;

import id.co.next_innovation.store.ui.base.MvpPresenter;

/**
 * Copyright 2017 Winnerawan T
 * Unauthorized copying of this file, via any medium is strictly
 * prohibited Proprietary and confidential
 * Written by Winnerawan T <winnerawan@gmail.com>, September 2017
 */
public interface SignUpMvpPresenter<V extends SignUpView> extends MvpPresenter<V> {

    void register(String username, String email, String password);
}
