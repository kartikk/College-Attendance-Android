package com.easwari.attendance2;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SmsManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Thirdscreen extends Activity {
	EditText et1,et22;
	int strl,count=0,strl1,nosms=1,j;
	ImageButton ib1,ib2,ib3;
	String mess,mess1,phonenumber,cNumber,name;
	static final int PICK_CONTACT=1;
	TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three);
		Bundle gotbasket =getIntent().getExtras();
		mess=gotbasket.getString("key1");
		et1=(EditText) findViewById(R.id.editText6);
		ib1=(ImageButton) findViewById(R.id.imageButton1);
		ib2=(ImageButton) findViewById(R.id.imageButton2);
		ib3=(ImageButton) findViewById(R.id.imageButton3);
		et22=(EditText) findViewById(R.id.editText22);
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		et1.setText(mess);
		strl1=et1.getText().length();
		j=strl1;
		while(j>160)
		{
			nosms++;
			j-=160;
		}
		tv1.setText(strl1+"/"+(nosms*160));
		tv2.setText("("+nosms+")");
		et22.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				if((count!=0) && !(et22.getText().toString().equals(name)))
				{
					count=0;
					et22.setText("");
					ib2.setImageResource(R.drawable.contact);
				}

			}
		});
		et1.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub

			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				strl1=et1.getText().length();
				j=strl1;
				nosms=1;
				while(j>160)
				{
					nosms++;
					j-=160;
				}
				tv1.setText(strl1+"/"+(nosms*160));
				tv2.setText("("+nosms+")");
			}
		});
		ib2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
				startActivityForResult(intent, PICK_CONTACT);




			}
		});
		ib3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count=0;
				et22.setText("");
				ib2.setImageResource(R.drawable.contact);
			}
		});

		ib1.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if(count==0)
				{
					phonenumber=et22.getText().toString();
					ib2.setImageResource(R.drawable.contact);
				}
				else if((count!=0) && (!(et22.getText().toString().contentEquals(name))))
				{
					phonenumber="";		
				}
				strl=phonenumber.length();
				if(strl<10)
				{
					Toast.makeText(getApplicationContext(), "invalid number", Toast.LENGTH_LONG).show();
					et22.setText("");
					count=0;
					ib2.setImageResource(R.drawable.contact);
				}
				else
				{


					mess1=et1.getText().toString();
					SmsManager Mysms = SmsManager.getDefault();
					Toast.makeText(getApplicationContext(), "Sending the attendance...", Toast.LENGTH_LONG).show();
					Mysms.sendTextMessage(phonenumber, null, mess1, null, null);
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(3000);
							}catch(InterruptedException e){
								e.printStackTrace();
							}
							finally{
								finish();
							}

						}
					};
					timer.start();
				}
			}
		});		



	}

	@Override
	public void onActivityResult(int reqCode, int resultCode, Intent data) {
		super.onActivityResult(reqCode, resultCode, data);

		switch (reqCode) {
		case (PICK_CONTACT) :
			if (resultCode == Activity.RESULT_OK) {

				Uri contactData = data.getData();
				Cursor c =  getContentResolver().query(contactData, null, null, null, null);
				if (c.moveToFirst()) {


					String id =c.getString(c.getColumnIndexOrThrow(ContactsContract.Contacts._ID));

					String hasPhone =c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));

					if (hasPhone.equalsIgnoreCase("1")) {
						Cursor phones = getContentResolver().query( 
								ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, 
								ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+ id, 
								null, null);
						phones.moveToFirst();
						phonenumber = phones.getString(phones.getColumnIndex("data1"));
					}
					name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));

					count++;
					et22.setText(name);
					ib2.setImageResource(R.drawable.contactset);
				}
			}
		break;
		}
	}

}

