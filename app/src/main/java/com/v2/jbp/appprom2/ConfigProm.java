package com.v2.jbp.appprom2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;


public class ConfigProm extends ActionBarActivity implements AdapterView.OnItemSelectedListener{
    Spinner spnNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_prom);
        mapeo();
    }

    public void mapeo(){
        spnNum = (Spinner) findViewById(R.id.cboNum);
        spnNum.setOnItemSelectedListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_config_prom, menu);
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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String num = spnNum.getSelectedItem().toString();
        //int num = Integer.parseInt(spnNum.getSelectedItem().toString());
        Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
       /* if (num.equals("2")){
            GridLayout mRlayout = (GridLayout) findViewById(R.id.mGrid);
            LinearLayout.LayoutParams mRparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            Button myButton = new Button(getApplication());
            myButton.setLayoutParams(mRparams);
            mRlayout.addView(myButton);
        }
        else{
            Toast.makeText(this,"No es 2",Toast.LENGTH_SHORT).show();
        }*/

        /*GridLayout mRlayout = (GridLayout) findViewById(R.id.mGrid);
        LinearLayout.LayoutParams mRparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        Button myButton = new Button(getApplication());
        myButton.setLayoutParams(mRparams);
        for (int i = 0; i <= num; i++){
            mRlayout.addView(myButton);

        }*/

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
