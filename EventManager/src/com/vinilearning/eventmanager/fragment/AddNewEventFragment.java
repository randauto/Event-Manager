package com.vinilearning.eventmanager.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.vinilearning.eventmanager.R;

public class AddNewEventFragment extends SherlockFragment implements
		OnClickListener {
	private Button btnMap;

	private Button btnAddImages;

	private Button btnTagFriends;

	private EditText etEventTitle;

	private EditText etEventTime;

	private EditText etEventLocation;

	private EditText etEventNotes;

	private TextView tvWithFriends;

	private GridView grvImages;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.add_new_event, container, false);
		initView(view);
		return view;
	}

	private void resetView() {

	}

	private boolean saveData() {
		return true;
	}

	private void checkData() {

	}

	private void initView(View view) {
		btnAddImages = (Button) view.findViewById(R.id.btnAddImages);
		btnTagFriends = (Button) view.findViewById(R.id.btnTagFriends);
		btnMap = (Button) view.findViewById(R.id.btnAddLocation);

		btnAddImages.setOnClickListener(this);
		btnTagFriends.setOnClickListener(this);
		btnMap.setOnClickListener(this);

		etEventTitle = (EditText) view.findViewById(R.id.etEventTitle);
		etEventTime = (EditText) view.findViewById(R.id.etEventTime);
		etEventLocation = (EditText) view.findViewById(R.id.etEventLocation);
		etEventNotes = (EditText) view.findViewById(R.id.etEventNotes);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnTagFriends:

			break;

		case R.id.btnAddImages:

			break;

		case R.id.btnAddLocation:

			break;

		default:
			break;
		}
	}
}
