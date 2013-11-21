package com.startfighter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class SFMainMenu extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_fighter);
		ImageButton start = (ImageButton)findViewById(R.id.btnStart);
		ImageButton exit = (ImageButton)findViewById(R.id.btnExit);
		
		start.getBackground().setAlpha(SFEngine.MENU_BUTTON_ALPHA);
		start.setHapticFeedbackEnabled(SFEngine.HAPTIC_BUTTON_FEEDBACK);
		
		exit.getBackground().setAlpha(SFEngine.MENU_BUTTON_ALPHA);
		exit.setHapticFeedbackEnabled(SFEngine.HAPTIC_BUTTON_FEEDBACK);
	}
	
}
