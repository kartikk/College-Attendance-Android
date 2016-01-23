package com.easwari.attendance2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {
	CheckBox cbox1,cbox2,cbox3,cbox4,cbox5,cbox6,cbox7,cbox8,cbox9,cbox10,cbox11,cbox12,cbox13,cbox14,cbox15,cbox16,cbox17,cbox18,cbox19,cbox20,cbox21,cbox22,cbox23,cbox24,cbox25,cbox26,cbox27,cbox28,cbox29,cbox30,cbox31,cbox32,cbox33,cbox34,cbox35,cbox36,cbox37,cbox38,cbox39,cbox40,cbox41,cbox42,cbox43,cbox44,cbox45,cbox46,cbox47,cbox48,cbox49,cbox50,cbox51,cbox52,cbox53,cbox54,cbox55,cbox56,cbox57,cbox58,cbox59,cbox60,cbox61,cbox62,cbox63,cbox64,cbox65,cbox66,cbox67,cbox68,cbox69,cbox70;
	Button b1,b2;  
	String data=" ";
	int a[]= new int[70];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cbox1 = (CheckBox) findViewById(R.id.checkBox1);
		cbox2 = (CheckBox) findViewById(R.id.checkBox2);
		cbox3 = (CheckBox) findViewById(R.id.checkBox3);
		cbox4 = (CheckBox) findViewById(R.id.checkBox4);
		cbox5 = (CheckBox) findViewById(R.id.checkBox5);
		cbox6 = (CheckBox) findViewById(R.id.checkBox6);
		cbox7 = (CheckBox) findViewById(R.id.checkBox7);
		cbox8 = (CheckBox) findViewById(R.id.checkBox8);
		cbox9 = (CheckBox) findViewById(R.id.checkBox9);
		cbox10 = (CheckBox) findViewById(R.id.checkBox10);
		cbox11 = (CheckBox) findViewById(R.id.checkBox11);
		cbox12 = (CheckBox) findViewById(R.id.checkBox12);
		cbox13 = (CheckBox) findViewById(R.id.checkBox13);
		cbox14 = (CheckBox) findViewById(R.id.checkBox14);
		cbox15 = (CheckBox) findViewById(R.id.checkBox15);
		cbox16 = (CheckBox) findViewById(R.id.checkBox16);
		cbox17 = (CheckBox) findViewById(R.id.checkBox17);
		cbox18 = (CheckBox) findViewById(R.id.checkBox18);
		cbox19 = (CheckBox) findViewById(R.id.checkBox19);
		cbox20 = (CheckBox) findViewById(R.id.checkBox20);
		cbox21 = (CheckBox) findViewById(R.id.checkBox21);
		cbox22 = (CheckBox) findViewById(R.id.checkBox22);
		cbox23 = (CheckBox) findViewById(R.id.checkBox23);
		cbox24 = (CheckBox) findViewById(R.id.checkBox24);
		cbox25 = (CheckBox) findViewById(R.id.checkBox25);
		cbox26 = (CheckBox) findViewById(R.id.checkBox26);
		cbox27 = (CheckBox) findViewById(R.id.checkBox27);
		cbox28 = (CheckBox) findViewById(R.id.checkBox28);
		cbox29 = (CheckBox) findViewById(R.id.checkBox29);
		cbox30 = (CheckBox) findViewById(R.id.checkBox30);
		cbox31 = (CheckBox) findViewById(R.id.checkBox31);
		cbox32 = (CheckBox) findViewById(R.id.checkBox32);
		cbox33 = (CheckBox) findViewById(R.id.checkBox33);
		cbox34 = (CheckBox) findViewById(R.id.checkBox34);
		cbox35 = (CheckBox) findViewById(R.id.checkBox35);
		cbox36 = (CheckBox) findViewById(R.id.checkBox36);
		cbox37 = (CheckBox) findViewById(R.id.checkBox37);
		cbox38 = (CheckBox) findViewById(R.id.checkBox38);
		cbox39 = (CheckBox) findViewById(R.id.checkBox39);
		cbox40 = (CheckBox) findViewById(R.id.checkBox40);
		cbox41 = (CheckBox) findViewById(R.id.checkBox41);
		cbox42 = (CheckBox) findViewById(R.id.checkBox42);
		cbox43 = (CheckBox) findViewById(R.id.checkBox43);
		cbox44 = (CheckBox) findViewById(R.id.checkBox44);
		cbox45 = (CheckBox) findViewById(R.id.checkBox45);
		cbox46 = (CheckBox) findViewById(R.id.checkBox46);
		cbox47 = (CheckBox) findViewById(R.id.checkBox47);
		cbox48 = (CheckBox) findViewById(R.id.checkBox48);
		cbox49 = (CheckBox) findViewById(R.id.checkBox49);
		cbox50 = (CheckBox) findViewById(R.id.checkBox50);
		cbox51 = (CheckBox) findViewById(R.id.checkBox51);
		cbox52 = (CheckBox) findViewById(R.id.checkBox52);
		cbox53 = (CheckBox) findViewById(R.id.checkBox53);
		cbox54 = (CheckBox) findViewById(R.id.checkBox54);
		cbox55 = (CheckBox) findViewById(R.id.checkBox55);
		cbox56 = (CheckBox) findViewById(R.id.checkBox56);
		cbox57 = (CheckBox) findViewById(R.id.checkBox57);
		cbox58 = (CheckBox) findViewById(R.id.checkBox58);
		cbox59 = (CheckBox) findViewById(R.id.checkBox59);
		cbox60 = (CheckBox) findViewById(R.id.checkBox60);
		cbox61 = (CheckBox) findViewById(R.id.checkBox61);
		cbox62 = (CheckBox) findViewById(R.id.checkBox62);
		cbox63 = (CheckBox) findViewById(R.id.checkBox63);
		cbox64 = (CheckBox) findViewById(R.id.checkBox64);
		cbox65 = (CheckBox) findViewById(R.id.checkBox65);
		cbox66 = (CheckBox) findViewById(R.id.checkBox66);
		cbox67 = (CheckBox) findViewById(R.id.checkBox67);
		cbox68 = (CheckBox) findViewById(R.id.checkBox68);
		cbox69 = (CheckBox) findViewById(R.id.checkBox69);
		cbox70 = (CheckBox) findViewById(R.id.checkBox70);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		cbox1.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox1.isChecked())
				{
					a[0]=1;
				}
				else
				{
					a[0]=0;
				}	
			}
		});
		cbox2.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox2.isChecked())
				{
					a[1]=1;
				}
				else
				{
					a[1]=0;
				}	
			}
		});
		cbox3.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox3.isChecked())
				{
					a[2]=1;
				}
				else
				{
					a[2]=0;
				}	
			}
		});
		cbox4.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox4.isChecked())
				{
					a[3]=1;
				}
				else
				{
					a[3]=0;
				}	
			}
		});
		cbox5.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox5.isChecked())
				{
					a[4]=1;
				}
				else
				{
					a[4]=0;
				}	
			}
		});
		cbox6.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox6.isChecked())
				{
					a[5]=1;
				}
				else
				{
					a[5]=0;
				}	
			}
		});
		cbox7.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox7.isChecked())
				{
					a[6]=1;
				}
				else
				{
					a[6]=0;
				}	
			}
		});
		cbox8.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox8.isChecked())
				{
					a[7]=1;
				}
				else
				{
					a[7]=0;
				}	
			}
		});
		cbox9.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox9.isChecked())
				{
					a[8]=1;
				}
				else
				{
					a[8]=0;
				}	
			}
		});
		cbox10.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox10.isChecked())
				{
					a[9]=1;
				}
				else
				{
					a[9]=0;
				}	
			}
		});
		cbox11.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox11.isChecked())
				{
					a[10]=1;
				}
				else
				{
					a[10]=0;
				}	
			}
		});
		cbox12.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox12.isChecked())
				{
					a[11]=1;
				}
				else
				{
					a[11]=0;
				}	
			}
		});
		cbox13.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox13.isChecked())
				{
					a[12]=1;
				}
				else
				{
					a[12]=0;
				}	
			}
		});
		cbox14.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox14.isChecked())
				{
					a[13]=1;
				}
				else
				{
					a[13]=0;
				}	
			}
		});
		cbox15.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox15.isChecked())
				{
					a[14]=1;
				}
				else
				{
					a[14]=0;
				}	
			}
		});
		cbox16.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox16.isChecked())
				{
					a[15]=1;
				}
				else
				{
					a[15]=0;
				}	
			}
		});
		cbox17.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox17.isChecked())
				{
					a[16]=1;
				}
				else
				{
					a[16]=0;
				}	
			}
		});
		cbox18.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox18.isChecked())
				{
					a[17]=1;
				}
				else
				{
					a[17]=0;
				}	
			}
		});
		cbox19.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox19.isChecked())
				{
					a[18]=1;
				}
				else
				{
					a[18]=0;
				}	
			}
		});
		cbox20.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox20.isChecked())
				{
					a[19]=1;
				}
				else
				{
					a[19]=0;
				}	
			}
		});
		cbox21.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox21.isChecked())
				{
					a[20]=1;
				}
				else
				{
					a[20]=0;
				}	
			}
		});
		cbox22.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox22.isChecked())
				{
					a[21]=1;
				}
				else
				{
					a[21]=0;
				}	
			}
		});
		cbox23.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox23.isChecked())
				{
					a[22]=1;
				}
				else
				{
					a[22]=0;
				}	
			}
		});
		cbox24.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox24.isChecked())
				{
					a[23]=1;
				}
				else
				{
					a[23]=0;
				}	
			}
		});
		cbox25.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox25.isChecked())
				{
					a[24]=1;
				}
				else
				{
					a[24]=0;
				}	
			}
		});
		cbox26.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox26.isChecked())
				{
					a[25]=1;
				}
				else
				{
					a[25]=0;
				}	
			}
		});
		cbox27.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox27.isChecked())
				{
					a[26]=1;
				}
				else
				{
					a[26]=0;
				}	
			}
		});
		cbox28.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox28.isChecked())
				{
					a[27]=1;
				}
				else
				{
					a[27]=0;
				}	
			}
		});
		cbox29.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox29.isChecked())
				{
					a[28]=1;
				}
				else
				{
					a[28]=0;
				}	
			}
		});
		cbox30.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox30.isChecked())
				{
					a[29]=1;
				}
				else
				{
					a[29]=0;
				}	
			}
		});
		cbox31.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox31.isChecked())
				{
					a[30]=1;
				}
				else
				{
					a[30]=0;
				}	
			}
		});
		cbox32.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox32.isChecked())
				{
					a[31]=1;
				}
				else
				{
					a[31]=0;
				}	
			}
		});
		cbox33.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox33.isChecked())
				{
					a[32]=1;
				}
				else
				{
					a[32]=0;
				}	
			}
		});
		cbox34.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox34.isChecked())
				{
					a[33]=1;
				}
				else
				{
					a[33]=0;
				}	
			}
		});
		cbox35.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox35.isChecked())
				{
					a[34]=1;
				}
				else
				{
					a[34]=0;
				}	
			}
		});
		cbox36.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox36.isChecked())
				{
					a[35]=1;
				}
				else
				{
					a[35]=0;
				}	
			}
		});
		cbox37.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox37.isChecked())
				{
					a[36]=1;
				}
				else
				{
					a[36]=0;
				}	
			}
		});
		cbox38.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox38.isChecked())
				{
					a[37]=1;
				}
				else
				{
					a[37]=0;
				}	
			}
		});
		cbox39.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox39.isChecked())
				{
					a[38]=1;
				}
				else
				{
					a[38]=0;
				}	
			}
		});
		cbox40.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox40.isChecked())
				{
					a[39]=1;
				}
				else
				{
					a[39]=0;
				}	
			}
		});
		cbox41.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox41.isChecked())
				{
					a[40]=1;
				}
				else
				{
					a[40]=0;
				}	
			}
		});
		cbox42.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox42.isChecked())
				{
					a[41]=1;
				}
				else
				{
					a[41]=0;
				}	
			}
		});
		cbox43.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox43.isChecked())
				{
					a[42]=1;
				}
				else
				{
					a[42]=0;
				}	
			}
		});
		cbox44.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox44.isChecked())
				{
					a[43]=1;
				}
				else
				{
					a[43]=0;
				}	
			}
		});
		cbox45.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox45.isChecked())
				{
					a[44]=1;
				}
				else
				{
					a[44]=0;
				}	
			}
		});
		cbox46.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox46.isChecked())
				{
					a[45]=1;
				}
				else
				{
					a[45]=0;
				}	
			}
		});
		cbox47.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox47.isChecked())
				{
					a[46]=1;
				}
				else
				{
					a[46]=0;
				}	
			}
		});
		cbox48.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox48.isChecked())
				{
					a[47]=1;
				}
				else
				{
					a[47]=0;
				}	
			}
		});
		cbox49.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox49.isChecked())
				{
					a[48]=1;
				}
				else
				{
					a[48]=0;
				}	
			}
		});
		cbox50.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox50.isChecked())
				{
					a[49]=1;
				}
				else
				{
					a[49]=0;
				}	
			}
		});
		cbox51.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox51.isChecked())
				{
					a[50]=1;
				}
				else
				{
					a[50]=0;
				}	
			}
		});
		cbox52.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox52.isChecked())
				{
					a[51]=1;
				}
				else
				{
					a[51]=0;
				}	
			}
		});
		cbox53.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox53.isChecked())
				{
					a[52]=1;
				}
				else
				{
					a[52]=0;
				}	
			}
		});
		cbox54.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox54.isChecked())
				{
					a[53]=1;
				}
				else
				{
					a[53]=0;
				}	
			}
		});
		cbox55.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox55.isChecked())
				{
					a[54]=1;
				}
				else
				{
					a[54]=0;
				}	
			}
		});
		cbox56.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox56.isChecked())
				{
					a[55]=1;
				}
				else
				{
					a[55]=0;
				}	
			}
		});
		cbox57.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox57.isChecked())
				{
					a[56]=1;
				}
				else
				{
					a[56]=0;
				}	
			}
		});
		cbox58.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox58.isChecked())
				{
					a[57]=1;
				}
				else
				{
					a[57]=0;
				}	
			}
		});
		cbox59.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox59.isChecked())
				{
					a[58]=1;
				}
				else
				{
					a[58]=0;
				}	
			}
		});
		cbox60.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox60.isChecked())
				{
					a[59]=1;
				}
				else
				{
					a[59]=0;
				}	
			}
		});
		cbox61.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox61.isChecked())
				{
					a[60]=1;
				}
				else
				{
					a[60]=0;
				}	
			}
		});
		cbox62.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox62.isChecked())
				{
					a[61]=1;
				}
				else
				{
					a[61]=0;
				}	
			}
		});
		cbox63.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox63.isChecked())
				{
					a[62]=1;
				}
				else
				{
					a[62]=0;
				}	
			}
		});
		cbox64.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox64.isChecked())
				{
					a[63]=1;
				}
				else
				{
					a[63]=0;
				}	
			}
		});
		cbox65.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox65.isChecked())
				{
					a[64]=1;
				}
				else
				{
					a[64]=0;
				}	
			}
		});
		cbox66.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox66.isChecked())
				{
					a[65]=1;
				}
				else
				{
					a[65]=0;
				}	
			}
		});
		cbox67.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox67.isChecked())
				{
					a[66]=1;
				}
				else
				{
					a[66]=0;
				}	
			}
		});
		cbox68.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox68.isChecked())
				{
					a[67]=1;
				}
				else
				{
					a[67]=0;
				}	
			}
		});
		cbox69.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox69.isChecked())
				{
					a[68]=1;
				}
				else
				{
					a[68]=0;
				}	
			}
		});
		cbox70.setOnCheckedChangeListener(new OnCheckedChangeListener() {		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub

				if(cbox70.isChecked())
				{
					a[69]=1;
				}
				else
				{
					a[69]=0;
				}	
			}
		});
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cbox1.setChecked(false);
				cbox2.setChecked(false);
				cbox3.setChecked(false);
				cbox4.setChecked(false);
				cbox5.setChecked(false);
				cbox6.setChecked(false);
				cbox7.setChecked(false);
				cbox8.setChecked(false);
				cbox9.setChecked(false);
				cbox10.setChecked(false);
				cbox11.setChecked(false);
				cbox12.setChecked(false);
				cbox13.setChecked(false);
				cbox14.setChecked(false);
				cbox15.setChecked(false);
				cbox16.setChecked(false);
				cbox17.setChecked(false);
				cbox18.setChecked(false);
				cbox19.setChecked(false);
				cbox20.setChecked(false);
				cbox21.setChecked(false);
				cbox22.setChecked(false);
				cbox23.setChecked(false);
				cbox24.setChecked(false);
				cbox25.setChecked(false);
				cbox26.setChecked(false);
				cbox27.setChecked(false);
				cbox28.setChecked(false);
				cbox29.setChecked(false);
				cbox30.setChecked(false);
				cbox31.setChecked(false);
				cbox32.setChecked(false);
				cbox33.setChecked(false);
				cbox34.setChecked(false);
				cbox35.setChecked(false);
				cbox36.setChecked(false);
				cbox37.setChecked(false);
				cbox38.setChecked(false);
				cbox39.setChecked(false);
				cbox40.setChecked(false);
				cbox41.setChecked(false);
				cbox42.setChecked(false);
				cbox43.setChecked(false);
				cbox44.setChecked(false);
				cbox45.setChecked(false);
				cbox46.setChecked(false);
				cbox47.setChecked(false);
				cbox48.setChecked(false);
				cbox49.setChecked(false);
				cbox50.setChecked(false);
				cbox51.setChecked(false);
				cbox52.setChecked(false);
				cbox53.setChecked(false);
				cbox54.setChecked(false);
				cbox55.setChecked(false);
				cbox56.setChecked(false);
				cbox57.setChecked(false);
				cbox58.setChecked(false);
				cbox59.setChecked(false);
				cbox60.setChecked(false);
				cbox61.setChecked(false);
				cbox62.setChecked(false);
				cbox63.setChecked(false);
				cbox64.setChecked(false);
				cbox65.setChecked(false);
				cbox66.setChecked(false);
				cbox67.setChecked(false);
				cbox68.setChecked(false);
				cbox69.setChecked(false);
				cbox70.setChecked(false);
				for(int i=0;i<70;i++)
				{
					a[i]=0;
				}

			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				for(int i=0;i<70;i++)
				{
					data = data +" "+a[i];

				}
				Intent intentmine = new Intent(MainActivity.this,Sendscreen.class); 	
				Bundle basket=new Bundle();
				basket.putIntArray("key", a);	
				intentmine.putExtras(basket);
				startActivity(intentmine);


			}
		});
	}

}
