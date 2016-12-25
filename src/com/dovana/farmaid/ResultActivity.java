package com.dovana.farmaid;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ResultActivity extends Activity {
	
	TextView crop_recom,sar_amm_title,urea_amm,urea_app,tsp_amm,tsp_app,mop_amm,gipsum_amm,gipsum_app;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3983C0")));
		bar.setTitle(Html.fromHtml("<b>ফলাফল</b>"));
		crop_recom=(TextView) findViewById(R.id.crop_recomend);
		sar_amm_title=(TextView) findViewById(R.id.sar_amm_title);
		urea_amm=(TextView) findViewById(R.id.urea_amm);
		urea_app=(TextView) findViewById(R.id.urea_app);
		tsp_amm=(TextView) findViewById(R.id.tsp_amm);
		tsp_app=(TextView) findViewById(R.id.tsp_app);
		mop_amm=(TextView) findViewById(R.id.mop_amm);
		gipsum_amm=(TextView) findViewById(R.id.gipsum_amm);
		gipsum_app=(TextView) findViewById(R.id.gipsum_app);
		
		
		String crop_name=getIntent().getExtras().getString("crop_name");
		String soil_name=getIntent().getExtras().getString("soil_name");
		String land_name=getIntent().getExtras().getString("land_name");
		String land_ammount=getIntent().getExtras().getString("land_ammount");
		int ammount_land=Integer.parseInt(land_ammount);
		
		if(crop_name.equals("বোরো ধান")){
			if(soil_name.equals("পলি মাটি")){
				int urea=ammount_land*1726;
				int tsp=ammount_land*101;
				int mop=ammount_land*134;
				int gipsum=ammount_land*484;
				
				int urea_g=urea%1000;
				int urea_k=urea/1000;
				
				int tsp_g=tsp%1000;
				int tsp_k=tsp/1000;
				
				int mop_g=mop%1000;
				int mop_k=mop/1000;
				
				int gipsum_g=gipsum%1000;
				int gipsum_k=gipsum/1000;
				
				
				sar_amm_title.setText("সারের  পরিমাণ"+"("+ammount_land+" শতাংশের জন্য"+")"); 
				crop_recom.setText(getString(R.string.crops_recomend1));
				crop_recom.setTextColor(Color.parseColor("#008000"));
				
				urea_amm.setText(urea_k+" "+getString(R.string.kg)+" "+urea_g+" "+getString(R.string.gm));
				tsp_amm.setText(tsp_k+" "+getString(R.string.kg)+" "+tsp_g+" "+getString(R.string.gm));
				mop_amm.setText(mop_k+" "+getString(R.string.kg)+" "+mop_g+" "+getString(R.string.gm));
				gipsum_amm.setText(gipsum_k+" "+getString(R.string.kg)+" "+gipsum_g+" "+getString(R.string.gm));
				
				urea_app.setText(getString(R.string.rice_urea));
				
			}
			
		}
		if(crop_name.equals("রোপা আমন ধান")){
			if(soil_name.equals("পলি মাটি")){
				int urea=ammount_land*466;
				int tsp=ammount_land*30;
				int mop=ammount_land*138;
				int gipsum=ammount_land*184;
				
				int urea_g=urea%1000;
				int urea_k=urea/1000;
				
				int tsp_g=tsp%100;
				int tsp_k=tsp/100;
				
				int mop_g=mop%1000;
				int mop_k=mop/1000;
				
				int gipsum_g=gipsum%1000;
				int gipsum_k=gipsum/1000;
				
				
				sar_amm_title.setText("সারের  পরিমাণ"+"("+ammount_land+" শতাংশের জন্য"+")"); 
				crop_recom.setText("এই ফসল মাঝারি নিচু জমি তে চাষ করার সুপারিশ করা হয়েছে।");
				crop_recom.setTextColor(Color.parseColor("#008000"));
				if(land_name.equals("মাঝারি নিচু")){
					crop_recom.setTextColor(Color.parseColor("#008000"));
				}
				else{
					crop_recom.setTextColor(Color.parseColor("#FF0000"));
				}
				
				urea_amm.setText(urea_k+" "+getString(R.string.kg)+" "+urea_g+" "+getString(R.string.gm));
				tsp_amm.setText(tsp_k+" "+getString(R.string.kg)+" "+tsp_g+" "+getString(R.string.gm));
				mop_amm.setText(mop_k+" "+getString(R.string.kg)+" "+mop_g+" "+getString(R.string.gm));
				gipsum_amm.setText(gipsum_k+" "+getString(R.string.kg)+" "+gipsum_g+" "+getString(R.string.gm));
				
				urea_app.setText(getString(R.string.rice_urea));
				
			}
			
		}
		
		if(crop_name.equals("পাট")){
			if(soil_name.equals("পলি মাটি")){
				int urea=ammount_land*1081;
				int tsp=ammount_land*223;
				int mop=ammount_land*332;
				int gipsum=ammount_land*248;
				
				int urea_g=urea%1000;
				int urea_k=urea/1000;
				
				int tsp_g=tsp%1000;
				int tsp_k=tsp/1000;
				
				int mop_g=mop%1000;
				int mop_k=mop/1000;
				
				int gipsum_g=gipsum%1000;
				int gipsum_k=gipsum/1000;
				
				crop_recom.setText(getString(R.string.crops_recomend2));
				
				if(land_name.equals("উঁচু জমি") || land_name.equals("মাঝারি উঁচু")){
					crop_recom.setTextColor(Color.parseColor("#008000"));
				}
				else{
					crop_recom.setTextColor(Color.parseColor("#FF0000"));
				}
				
				sar_amm_title.setText("সারের  পরিমাণ"+"("+ammount_land+" শতাংশের জন্য"+")"); 
				urea_amm.setText(urea_k+" "+getString(R.string.kg)+" "+urea_g+" "+getString(R.string.gm));
				tsp_amm.setText(tsp_k+" "+getString(R.string.kg)+" "+tsp_g+" "+getString(R.string.gm));
				mop_amm.setText(mop_k+" "+getString(R.string.kg)+" "+mop_g+" "+getString(R.string.gm));
				gipsum_amm.setText(gipsum_k+" "+getString(R.string.kg)+" "+gipsum_g+" "+getString(R.string.gm));
				
				urea_app.setText(getString(R.string.jute_urea));
				
			}
		}
		
		if(crop_name.equals("আউশ ধান")){
			if(soil_name.equals("পলি মাটি")){
				int urea=ammount_land*312;
				int tsp=ammount_land*162;
				int mop=ammount_land*32;
				
				
				int urea_g=urea%1000;
				int urea_k=urea/1000;
				
				int tsp_g=tsp%1000;
				int tsp_k=tsp/1000;
				
				int mop_g=mop%1000;
				int mop_k=mop/1000;
				
				
				
				crop_recom.setText("এই ফসল মাঝারি নিচু জমি তে চাষ করার সুপারিশ করা হয়েছে।");
				
				if(land_name.equals("উঁচু জমি") || land_name.equals("মাঝারি উঁচু")|| land_name.equals("নিচু জমি")){
					crop_recom.setTextColor(Color.parseColor("#FF0000"));
				}
				else{
					
					crop_recom.setTextColor(Color.parseColor("#008000"));
				}
				
				sar_amm_title.setText("সারের  পরিমাণ"+"("+ammount_land+" শতাংশের জন্য"+")"); 
				urea_amm.setText(urea_k+" "+getString(R.string.kg)+" "+urea_g+" "+getString(R.string.gm));
				tsp_amm.setText(tsp_k+" "+getString(R.string.kg)+" "+tsp_g+" "+getString(R.string.gm));
				mop_amm.setText(mop_k+" "+getString(R.string.kg)+" "+mop_g+" "+getString(R.string.gm));
				gipsum_amm.setText(getString(R.string.g_amm));
				
				urea_app.setText(getString(R.string.rice_urea));
				gipsum_app.setText(" ");
				
			}
		}
		
		if(crop_name.equals("গম")){
			if(soil_name.equals("পলি মাটি")){
				int urea=ammount_land*1243;
				int tsp=ammount_land*516;
				int mop=ammount_land*368;
				int gipsum=ammount_land*180;
				
				int urea_g=urea%1000;
				int urea_k=urea/1000;
				
				int tsp_g=tsp%1000;
				int tsp_k=tsp/1000;
				
				int mop_g=mop%1000;
				int mop_k=mop/1000;
				
				int gipsum_g=gipsum%1000;
				int gipsum_k=gipsum/1000;
				
				crop_recom.setText(getString(R.string.crops_recomend2));
				
				if(land_name.equals("উঁচু জমি") || land_name.equals("মাঝারি উঁচু")){
					crop_recom.setTextColor(Color.parseColor("#008000"));
				}
				else{
					crop_recom.setTextColor(Color.parseColor("#FF0000"));
				}
				
				sar_amm_title.setText("সারের  পরিমাণ"+"("+ammount_land+" শতাংশের জন্য"+")"); 
				urea_amm.setText(urea_k+" "+getString(R.string.kg)+" "+urea_g+" "+getString(R.string.gm));
				tsp_amm.setText(tsp_k+" "+getString(R.string.kg)+" "+tsp_g+" "+getString(R.string.gm));
				mop_amm.setText(mop_k+" "+getString(R.string.kg)+" "+mop_g+" "+getString(R.string.gm));
				gipsum_amm.setText(gipsum_k+" "+getString(R.string.kg)+" "+gipsum_g+" "+getString(R.string.gm));
				
				urea_app.setText(getString(R.string.gom_urea));
				
			}
		}
		
		
	}


}
