package com.example.animation;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/** 
 * 文件名称:   Activity5.java 
 * 功能描述:  
 * 版本信息:   Copyright (c)2013 
 * 公司信息:   瑜旭网络
 * 开发人员:   yuyejiang
 * 版本日志:   1.0 
 * 创建时间:   2013年11月22日 上午11:34:20 
 * 
 * 修改历史: 
 * 时间         开发者      版本号    修改内容 
 * ------------------------------------------------------------------ 
 * 2013年11月22日   yuyejiang      1.0         1.0 Version 
 */
public class Activity5 extends Activity {
	private List<String> dataList = new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity5);
		ListView listView = (ListView)findViewById(R.id.listview);
		for (int i = 0; i < 1; i++) {
			dataList.add("app "+ i );
		}
		listView.setAdapter(new MyAdapter(this, dataList));
	}
}
