package com.example.master.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_CoordinatorLayout).setOnClickListener(this);
        findViewById(R.id.tv_next).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is presentjava.lang.String.
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_CoordinatorLayout:

                CoordinatorLayoutActivity.actionStart(this);

                break;

            case R.id.tv_next:


                for (int i = 0; i < 10; i++) {

//                    Logger.d("jjjjjjjjjj");

//                    Logger logger = Logger.getLogger("哈哈哈");
                    int positon =i;

                    Log.i(TAG,"调试位置"+i);

                    stepInto();
                }

                break;
            default:
                break;
        }
    }

    private void stepInto() {

        Log.e(TAG,"呵呵");
    }
}
