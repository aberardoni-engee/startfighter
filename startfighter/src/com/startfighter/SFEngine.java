package com.startfighter;

import android.view.View;

public class SFEngine {
	public static final int GAME_THREAD_DELAY = 4000;
	public static final int MENU_BUTTON_ALPHA = 0;
	public static final boolean HAPTIC_BUTTON_FEEDBACK = true;
	
	public boolean onExit(View v) {
		try	{
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
