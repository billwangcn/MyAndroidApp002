package com.example.root.myapplication002;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

/**
 * todo 设计计时器
 * todo 与服务器会话
 * todo 自动更新APP
 * todo 使用GPS取位置
 * todo 使用蓝牙？
 * todo 配置本地可用的AVD
 * todo 使用genymotion虚拟机
 * todo 使用各种不同的LAYOUT
 */
public class MainActivity extends AppCompatActivity {
    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void button1_onClick(View view) {
        Intent it = new Intent(MainActivity.this, Activity001.class);
        startActivity(it);
    }


    public void button2_onClick(View view) {
        Intent it = new Intent(MainActivity.this, Activity002.class);
        startActivity(it);
    }

}
