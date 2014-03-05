package com.vinilearning.eventmanager.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.vinilearning.eventmanager.MainActivity;
import com.vinilearning.eventmanager.R;

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
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		finish();
	}
}
