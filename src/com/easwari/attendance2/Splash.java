package com.easwari.attendance2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{
	MediaPlayer oursong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		oursong=MediaPlayer.create(Splash.this, R.raw.splashsound);
		oursong.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent intent1 = new Intent(Splash.this,MainActivity.class);
					startActivity(intent1);
				}

			}
		};
		timer.start();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		oursong.release();
		finish();
	}

}

