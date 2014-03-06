package com.vinilearning.eventmanager.activity;

import com.vinilearning.eventmanager.R;

import android.app.Activity;
import android.os.Bundle;

public class ImageViewerActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageview_layout);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
