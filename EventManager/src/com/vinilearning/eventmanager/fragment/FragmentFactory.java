package com.vinilearning.eventmanager.fragment;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.vinilearning.eventmanager.MainActivity;
import com.vinilearning.eventmanager.R;
import com.vinilearning.eventmanager.common.AppConstants.AppFunction;

public class FragmentFactory extends SherlockFragmentActivity {
	private static FragmentFactory instance;
	private Context context;

	public static FragmentFactory getInstance(Context context) {

		if (instance == null) {
			instance = new FragmentFactory(context);
		}
		return instance;
	}

	private FragmentFactory(Context context) {
		this.context = context;
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

		case ADD_NEW:
			gotoAddNew();
			break;
		default:
			break;
		}
	}

	private void gotoAddNew() {
		// update the main content by replacing fragments
		AddNewEventFragment fragment = new AddNewEventFragment();

		FragmentManager fragmentManager = getSupportFragmentManager();
		fragmentManager.beginTransaction()
				.replace(R.id.content_frame, fragment).commit();
		MainActivity.mDrawerLayout.closeDrawer(MainActivity.mDrawerList);
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
