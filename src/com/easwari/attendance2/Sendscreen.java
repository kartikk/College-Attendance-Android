package com.easwari.attendance2;



import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class Sendscreen extends FragmentActivity  implements OnItemSelectedListener{
	String message,date = null,section = null,name = null,rollno=" ",custom=null,username="",per=null;
	int gotbread[];
	EditText et2,et3;
	static EditText et4;
	Button b1;
	ImageButton ib1;
	Spinner s1,s2,s3,s4;
	SharedPreferences app_preferences;
	String[] dept={"CSE","CIVIL","ECE","EEE" ,"EIE" ,"IT" ,"MECH" ,"MBA" ,"MCA" ,"ME"};
	String[] year1={"I","II","III","IV" }; 
	String[] section1={"A","B","C","D"}; 
	String[] period={"1","2","3","4","5","6","7","8","9"};

	@Override

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.secondscreen);
		final SharedPreferences app_preferences = 
				PreferenceManager.getDefaultSharedPreferences(this);
		username=app_preferences.getString("uname", "");
		et2 = (EditText) findViewById(R.id.editText2);
		et3 = (EditText) findViewById(R.id.editText3);
		et4 = (EditText) findViewById(R.id.editText4);
		b1=   (Button)   findViewById(R.id.button3);
		ib1=(ImageButton) findViewById(R.id.imageButton11);

		et3.setText(username);

		s1=(Spinner) findViewById(R.id.spinner1);
		s2=(Spinner) findViewById(R.id.spinner2);
		s3=(Spinner) findViewById(R.id.spinner3);
		s4=(Spinner) findViewById(R.id.spinner4);

		s1.setOnItemSelectedListener(this);
		s2.setOnItemSelectedListener(this);
		s3.setOnItemSelectedListener(this);
		s4.setOnItemSelectedListener(this);

		ArrayAdapter<String> a1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,year1);
		ArrayAdapter<String> a2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dept);
		ArrayAdapter<String> a3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,section1);
		ArrayAdapter<String> a4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,period);

		a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		a4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		s1.setAdapter(a1);
		s2.setAdapter(a2);
		s3.setAdapter(a3);
		s4.setAdapter(a4);

		Bundle gotbasket =getIntent().getExtras();	
		gotbread=gotbasket.getIntArray("key");
		for(int i=0;i<70;i++)
		{
			if(gotbread[i]==1)
				rollno=rollno+" "+(i+1);
		}

		ib1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showTruitonDatePickerDialog(v);
			}
		});

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				date = et4.getText().toString();

				name = et3.getText().toString();
				custom = et2.getText().toString();
				SharedPreferences.Editor editor = app_preferences.edit();
				editor.putString("uname", et3.getText().toString());
				editor.commit();

				message = "Respected sir/Madam,\n"
						+"absentees on "+ date + " period "+ per +"\n"
						+"for the class "+section+" are\n"
						+ rollno
						+ "\n"+custom+"\n"
						+"Regards,\n"
						+ name ;
				Intent j = new Intent(Sendscreen.this,Thirdscreen.class);
				Bundle basket=new Bundle();
				basket.putString("key1", message);
				j.putExtras(basket);

				startActivity(j);


			}
		});




	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		String dep,sec,yr;
		yr=s1.getSelectedItem().toString();
		dep=s2.getSelectedItem().toString();
		sec=s3.getSelectedItem().toString();
		per=s4.getSelectedItem().toString();
		section=yr+" "+dep+" "+sec;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	public void showTruitonDatePickerDialog(View v) {
		DialogFragment newFragment = new DatePickerFragment();
		newFragment.show(getSupportFragmentManager(), "datePicker");
	}

	public static class DatePickerFragment extends DialogFragment implements
	DatePickerDialog.OnDateSetListener {

		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			// Use the current date as the default date in the picker
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);

			// Create a new instance of DatePickerDialog and return it
			return new DatePickerDialog(getActivity(), this, year, month, day);
		}

		public void onDateSet(DatePicker view, int year, int month, int day) {
			// Do something with the date chosen by the user
			et4.setText(day + "/" + (month + 1) + "/" + year);
		}
	}



}

