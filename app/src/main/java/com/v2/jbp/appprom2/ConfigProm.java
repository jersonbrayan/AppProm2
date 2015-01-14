package com.v2.jbp.appprom2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class ConfigProm extends ActionBarActivity implements AdapterView.OnItemSelectedListener{
    Spinner spnNum;

    TextView tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11;
    EditText et4,et3,et5,et6,et7,et8,et9,et10,et11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_prom);
        mapeo();
    }

    public void mapeo(){
        spnNum = (Spinner) findViewById(R.id.cboNum);
        spnNum.setOnItemSelectedListener(this);

        tv3 = (TextView) findViewById(R.id.textView3);
        et4 = (EditText) findViewById(R.id.editText4);

        tv4 = (TextView) findViewById(R.id.textView4);
        et3 = (EditText) findViewById(R.id.editText3);

        tv5 = (TextView) findViewById(R.id.textView5);
        et5 = (EditText) findViewById(R.id.editText5);

        tv6 = (TextView) findViewById(R.id.textView6);
        et6 = (EditText) findViewById(R.id.editText6);

        tv7 = (TextView) findViewById(R.id.textView7);
        et7 = (EditText) findViewById(R.id.editText7);

        tv8 = (TextView) findViewById(R.id.textView8);
        et8 = (EditText) findViewById(R.id.editText8);

        tv9 = (TextView) findViewById(R.id.textView9);
        et9 = (EditText) findViewById(R.id.editText9);

        tv10 = (TextView) findViewById(R.id.textView10);
        et10 = (EditText) findViewById(R.id.editText10);

        tv11 = (TextView) findViewById(R.id.textView11);
        et11 = (EditText) findViewById(R.id.editText11);
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

       int num = Integer.parseInt(spnNum.getSelectedItem().toString());
        String tv = "tv";
        String et = "et";

        switch (num){
            case 0:
                break;
            case 1:
                break;
            case 2:
                /*for (int i=3;i<=4;i++){
                    String m = "tv"+i+".setVisibility(View.VISIBLE)";
                    Toast.makeText(this,m,Toast.LENGTH_SHORT).show();

                    tv+i.
                }
                /*for (int i=3;i<=7;i++){
                    String m = "tv"+i+".setVisibility(View.VISIBLE)";
                    Toast.makeText(this,m,Toast.LENGTH_SHORT).show();

                    //tv3.setVisibility(View.VISIBLE);

                }*/

                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);

                et4.setHint("00");
                et4.setVisibility(View.VISIBLE);
                et4.requestFocus();

                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);

                et5.setVisibility(View.GONE);

                et6.setVisibility(View.GONE);

                et7.setVisibility(View.GONE);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);

                et4.setHint("00");
                et4.setVisibility(View.VISIBLE);
                et4.requestFocus();


                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);

                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);

                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);

                et7.setHint("00");
                et7.setVisibility(View.VISIBLE);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void btnGrabar(View v){
        String s = et4.getText().toString();
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
