package com.startfighter;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class StartFighterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		new Handler().postDelayed(new Thread() {
			@Override
			public void run() {
				Intent mainmenu = new Intent(StartFighterActivity.this,SFMainMenu.class);
				StartFighterActivity.this.startActivity(mainmenu);
				StartFighterActivity.this.finish();
				overridePendingTransition(R.layout.fadein, R.layout.fadeout);
			}
		}, SFEngine.GAME_THREAD_DELAY);
	}

}
