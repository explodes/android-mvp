package io.explod.mvpex.ui.activity.main;

import android.support.annotation.NonNull;

import io.explod.mvpex.util.presenter.PresenterView;

/**
 * PresenterView for MainActivity
 */
/* default */ interface MainView extends PresenterView {

	@NonNull
	CharSequence getUsername();

	@NonNull
	CharSequence getPassword();

	void closeKeyboard();

	void showLoggingInProgressBar();

	void hideLoggingInProgressBar();

	void showBadLoginSnackbar();

	void showNetworkErrorSnackbar();

	void launchRallyListActivity();
}
