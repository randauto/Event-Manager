package com.vinilearning.eventmanager.start;

import com.vinilearning.eventmanager.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_layout);

		Handler h = new Handler();

		h.postDelayed(new Runnable() {

			@Override
			public void run() {
				loadData();
			}
		}, 2500);
	}

	private void loadData() {
		
	}
}
