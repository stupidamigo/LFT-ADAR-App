package io.github.stupidamigo.lftadarcampaign;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AntiRagging {
//public class AntiRagging extends ActionBarActivity implements OnClickListener{
/*
	Button bstart, bstop;
	//Button bchk;
	MediaPlayer scream;
	Button sendBtn;
	TextView tvphn1,tvphn2,tvphn3;
	String phn1, phn2, phn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user);

		initialize();

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	private void initialize() {
		// TODO Auto-generated method stub
		scream = MediaPlayer.create(AntiRagging.this,
				R.raw.stupid_amigo_deranged_women_scream);
		scream.setLooping(true);
		bstart = (Button) findViewById(R.id.button1);
		bstop = (Button) findViewById(R.id.button2);

		sendBtn = (Button) findViewById(R.id.button4);
		
		
		tvphn1 = (TextView) findViewById(R.id.tvphn11);
		tvphn2 = (TextView) findViewById(R.id.tvphn22);
		tvphn3 = (TextView) findViewById(R.id.tvphn33);
		
		SharedPreferences getData = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		phn1 = getData.getString("num1", "Set Phone No.1");
		phn2 = getData.getString("num2", "Set Phone No.2");
		phn3 = getData.getString("num3", "Set Phone No.3");
		if(phn1.contentEquals("")){
			//default value from xml 
		}else{
			tvphn1.setText(phn1);
		}
		if(phn2.contentEquals("")){
			//default value from xml
		}else{
			tvphn2.setText(phn2);
		}
		if(phn3.contentEquals("")){
			//default value from xml
		}else{
			tvphn3.setText(phn3);
		}

		bstart.setOnClickListener(this);
		bstop.setOnClickListener(this);
		sendBtn.setOnClickListener(this);
	}

	protected void sendSMSMessage() {
		
		Log.i("Send SMS", "");

		String errorMsg = "SMS delivery failed on ";
		String message = "I'm in EMERGENCY. Please HELP me!! \nCALL ASAP";
		SmsManager smsManager = SmsManager.getDefault();
		try {
			//to avoid first time issue
			if(phn1.contentEquals("Set Phone No.1")){
				Toast.makeText(getApplicationContext(),
						errorMsg + "1st phone no.", Toast.LENGTH_SHORT).show();
			}else{

				smsManager.sendTextMessage(phn1, null, message, null, null);
				Toast.makeText(getApplicationContext(), "SMS sent on 1st phone no.",
						Toast.LENGTH_SHORT).show();
			}
		} catch (Exception e) {
			
			Toast.makeText(getApplicationContext(),
					errorMsg + "1st phone no.", Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
		try {
			if(phn2.contentEquals("Set Phone No.2")){
				Toast.makeText(getApplicationContext(),
						errorMsg + "2nd phone no.", Toast.LENGTH_SHORT).show();
			}else{

				smsManager.sendTextMessage(phn2, null, message, null, null);
				Toast.makeText(getApplicationContext(), "SMS sent on 2nd phone no.",
						Toast.LENGTH_SHORT).show();	
			}
		} catch (Exception e) {
			
			Toast.makeText(getApplicationContext(),
					errorMsg + "2nd phone no.", Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
		try {
			if(phn3.contentEquals("Set Phone No.3")){
				Toast.makeText(getApplicationContext(),
						errorMsg + "3rd phone no.", Toast.LENGTH_SHORT).show();
			}
			else{

				smsManager.sendTextMessage(phn3, null, message, null, null);
				Toast.makeText(getApplicationContext(), "SMS sent on 3rd phone no.",
						Toast.LENGTH_SHORT).show();	
			}
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(),
					errorMsg + "3rd phone no.", Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user, menu);
		return true;
				
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		
		case R.id.u_sos:
			Intent sos_p = new Intent("io.github.stupidamigo.lftadarcampaign.SOSPREF");
			startActivity(sos_p);
			break;
		
		case R.id.u_exit:
			finish();
			break;
		}
		return false;
	}

	
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_user, container,
					false);
			return rootView;
		}
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		scream.release();
		finish();
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.button1:
			scream.start();
			break;
		case R.id.button2:
			if (scream.isPlaying()) {
				scream.pause();
			}
			break;
		case R.id.button4:
			sendSMSMessage();
			break;
			
		}
	}


*/
}
