package com.lansosdk.editorDemo;

import com.lansoeditor.demo.R;

import android.app.Activity;
import android.os.Bundle;

public class VideoCompressActivity extends Activity{

	String videoPath=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.video_edit_demo_layout);
		 videoPath=getIntent().getStringExtra("videopath");
		
		 
		 
		 
	}
}
