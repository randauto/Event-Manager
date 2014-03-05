package com.vinilearning.eventmanager.fragment;

import android.support.v4.app.FragmentManager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.vinilearning.eventmanager.MainActivity;
import com.vinilearning.eventmanager.R;
import com.vinilearning.eventmanager.common.AppConstants.AppFunction;

public class FragmentFactory extends SherlockFragmentActivity {
	private static FragmentFactory instance;

	public FragmentFactory getInstance() {

		if (instance == null) {
			instance = new FragmentFactory();
		}
		return instance;
	}

	private FragmentFactory() {
	}

	public void selectItem(AppFunction mItem) {

		switch (mItem) {
		case ABOUT_US:

			break;

		case OPTIMIZE:

			break;

		case MAIN:
			gotoMain();
			break;

		case INVITE_FRIENDS:

			break;

		case LOGIN_OUT:

			break;

		default:
			break;
		}
	}

	private void gotoMain() {
		// update the main content by replacing fragments
		MainFragment fragment = new MainFragment();

		FragmentManager fragmentManager = getSupportFragmentManager();
		fragmentManager.beginTransaction()
				.replace(R.id.content_frame, fragment).commit();

		// update selected item and title, then close the drawer
		MainActivity.mDrawerList.setItemChecked(0, true);
		MainActivity.mDrawerLayout.closeDrawer(MainActivity.mDrawerList);
	}
}
