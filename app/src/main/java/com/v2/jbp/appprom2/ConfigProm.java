package com.v2.jbp.appprom2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import SQLite.CursoDao;


public class ConfigProm extends ActionBarActivity implements AdapterView.OnItemSelectedListener{
    Spinner spnNum;
    EditText etCurso,et1,et2,et3,et4,et5,et6,et7,et8,et9,
             et10,et11,et12,et13,et14,et15,et16,et17,et18,
             et19,et20,et21;
    TextView tv3,tv4,tv5,tv6,tv7,tv8,tv9;

    private CursoDao dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config_prom);

        dataSource = new CursoDao(this);
        dataSource.AbreConexion();

        Mapeo();
    }

    public void Mapeo(){
        spnNum = (Spinner) findViewById(R.id.cboNum);
        spnNum.setOnItemSelectedListener(this);

        etCurso = (EditText) findViewById(R.id.tCurso);

        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        tv3 = (TextView) findViewById(R.id.textView3);


        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        et6 = (EditText) findViewById(R.id.editText6);
        tv4 = (TextView) findViewById(R.id.textView4);


        et7 = (EditText) findViewById(R.id.editText7);
        et8 = (EditText) findViewById(R.id.editText8);
        et9 = (EditText) findViewById(R.id.editText9);
        tv5 = (TextView) findViewById(R.id.textView5);


        et10 = (EditText) findViewById(R.id.editText10);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        tv6 = (TextView) findViewById(R.id.textView6);


        et13 = (EditText) findViewById(R.id.editText13);
        et14 = (EditText) findViewById(R.id.editText14);
        et15 = (EditText) findViewById(R.id.editText15);
        tv7 = (TextView) findViewById(R.id.textView7);


        et16 = (EditText) findViewById(R.id.editText16);
        et17 = (EditText) findViewById(R.id.editText17);
        et18 = (EditText) findViewById(R.id.editText18);
        tv8 = (TextView) findViewById(R.id.textView8);


        et19 = (EditText) findViewById(R.id.editText19);
        et20 = (EditText) findViewById(R.id.editText20);
        et21 = (EditText) findViewById(R.id.editText21);
        tv9 = (TextView) findViewById(R.id.textView9);
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
        switch (num){
            case 0:

                et1.setText("");
                et1.setVisibility(View.GONE);
                et2.setText("");
                et2.setVisibility(View.GONE);
                et3.setText("");
                et3.setVisibility(View.GONE);
                tv3.setVisibility(View.GONE);
                et4.setText("");
                et4.setVisibility(View.GONE);
                et5.setText("");
                et5.setVisibility(View.GONE);
                et6.setText("");
                et6.setVisibility(View.GONE);
                tv4.setVisibility(View.GONE);
                et7.setText("");
                et7.setVisibility(View.GONE);
                et8.setText("");
                et8.setVisibility(View.GONE);
                et9.setText("");
                et9.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                et10.setText("");
                et10.setVisibility(View.GONE);
                et11.setText("");
                et11.setVisibility(View.GONE);
                et12.setText("");
                et12.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                et13.setText("");
                et13.setVisibility(View.GONE);
                et14.setText("");
                et14.setVisibility(View.GONE);
                et15.setText("");
                et15.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et2.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 1:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);


                et4.setText("");
                et4.setVisibility(View.GONE);
                et5.setText("");
                et5.setVisibility(View.GONE);
                et6.setText("");
                et6.setVisibility(View.GONE);
                tv4.setVisibility(View.GONE);
                et7.setText("");
                et7.setVisibility(View.GONE);
                et8.setText("");
                et8.setVisibility(View.GONE);
                et9.setText("");
                et9.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                et10.setText("");
                et10.setVisibility(View.GONE);
                et11.setText("");
                et11.setVisibility(View.GONE);
                et12.setText("");
                et12.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                et13.setText("");
                et13.setVisibility(View.GONE);
                et14.setText("");
                et14.setVisibility(View.GONE);
                et15.setText("");
                et15.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 2:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);

                et7.setText("");
                et7.setVisibility(View.GONE);
                et8.setText("");
                et8.setVisibility(View.GONE);
                et9.setText("");
                et9.setVisibility(View.GONE);
                tv5.setVisibility(View.GONE);
                et10.setText("");
                et10.setVisibility(View.GONE);
                et11.setText("");
                et11.setVisibility(View.GONE);
                et12.setText("");
                et12.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                et13.setText("");
                et13.setVisibility(View.GONE);
                et14.setText("");
                et14.setVisibility(View.GONE);
                et15.setText("");
                et15.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 3:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                et7.setHint("Ejm:Examen 3");
                et7.setVisibility(View.VISIBLE);
                et8.setHint("00");
                et8.setVisibility(View.VISIBLE);
                et9.setHint("00");
                et9.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);

                et10.setText("");
                et10.setVisibility(View.GONE);
                et11.setText("");
                et11.setVisibility(View.GONE);
                et12.setText("");
                et12.setVisibility(View.GONE);
                tv6.setVisibility(View.GONE);
                et13.setText("");
                et13.setVisibility(View.GONE);
                et14.setText("");
                et14.setVisibility(View.GONE);
                et15.setText("");
                et15.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 4:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                et7.setHint("Ejm:Examen 3");
                et7.setVisibility(View.VISIBLE);
                et8.setHint("00");
                et8.setVisibility(View.VISIBLE);
                et9.setHint("00");
                et9.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                et10.setHint("Ejm:Examen 4");
                et10.setVisibility(View.VISIBLE);
                et11.setHint("00");
                et11.setVisibility(View.VISIBLE);
                et12.setHint("00");
                et12.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);

                et13.setText("");
                et13.setVisibility(View.GONE);
                et14.setText("");
                et14.setVisibility(View.GONE);
                et15.setText("");
                et15.setVisibility(View.GONE);
                tv7.setVisibility(View.GONE);
                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 5:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                et7.setHint("Ejm:Examen 3");
                et7.setVisibility(View.VISIBLE);
                et8.setHint("00");
                et8.setVisibility(View.VISIBLE);
                et9.setHint("00");
                et9.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                et10.setHint("Ejm:Examen 4");
                et10.setVisibility(View.VISIBLE);
                et11.setHint("00");
                et11.setVisibility(View.VISIBLE);
                et12.setHint("00");
                et12.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                et13.setHint("Ejm:Examen 5");
                et13.setVisibility(View.VISIBLE);
                et14.setHint("00");
                et14.setVisibility(View.VISIBLE);
                et15.setHint("00");
                et15.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);

                et16.setText("");
                et16.setVisibility(View.GONE);
                et17.setText("");
                et17.setVisibility(View.GONE);
                et18.setText("");
                et18.setVisibility(View.GONE);
                tv8.setVisibility(View.GONE);
                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 6:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                et7.setHint("Ejm:Examen 3");
                et7.setVisibility(View.VISIBLE);
                et8.setHint("00");
                et8.setVisibility(View.VISIBLE);
                et9.setHint("00");
                et9.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                et10.setHint("Ejm:Examen 4");
                et10.setVisibility(View.VISIBLE);
                et11.setHint("00");
                et11.setVisibility(View.VISIBLE);
                et12.setHint("00");
                et12.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                et13.setHint("Ejm:Examen 5");
                et13.setVisibility(View.VISIBLE);
                et14.setHint("00");
                et14.setVisibility(View.VISIBLE);
                et15.setHint("00");
                et15.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);
                et16.setHint("Ejm:Examen 6");
                et16.setVisibility(View.VISIBLE);
                et17.setHint("00");
                et17.setVisibility(View.VISIBLE);
                et18.setHint("00");
                et18.setVisibility(View.VISIBLE);
                tv8.setVisibility(View.VISIBLE);

                et19.setText("");
                et19.setVisibility(View.GONE);
                et20.setText("");
                et20.setVisibility(View.GONE);
                et21.setText("");
                et21.setVisibility(View.GONE);
                tv9.setVisibility(View.GONE);
                break;
            case 7:
                et1.setHint("Ejm:Examen 1");
                et1.setVisibility(View.VISIBLE);
                et1.requestFocus();
                et2.setHint("00");
                et2.setVisibility(View.VISIBLE);
                et3.setHint("00");
                et3.setVisibility(View.VISIBLE);
                tv3.setVisibility(View.VISIBLE);
                et4.setHint("Ejm:Examen 2");
                et4.setVisibility(View.VISIBLE);
                et5.setHint("00");
                et5.setVisibility(View.VISIBLE);
                et6.setHint("00");
                et6.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                et7.setHint("Ejm:Examen 3");
                et7.setVisibility(View.VISIBLE);
                et8.setHint("00");
                et8.setVisibility(View.VISIBLE);
                et9.setHint("00");
                et9.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.VISIBLE);
                et10.setHint("Ejm:Examen 4");
                et10.setVisibility(View.VISIBLE);
                et11.setHint("00");
                et11.setVisibility(View.VISIBLE);
                et12.setHint("00");
                et12.setVisibility(View.VISIBLE);
                tv6.setVisibility(View.VISIBLE);
                et13.setHint("Ejm:Examen 5");
                et13.setVisibility(View.VISIBLE);
                et14.setHint("00");
                et14.setVisibility(View.VISIBLE);
                et15.setHint("00");
                et15.setVisibility(View.VISIBLE);
                tv7.setVisibility(View.VISIBLE);
                et16.setHint("Ejm:Examen 6");
                et16.setVisibility(View.VISIBLE);
                et17.setHint("00");
                et17.setVisibility(View.VISIBLE);
                et18.setHint("00");
                et18.setVisibility(View.VISIBLE);
                tv8.setVisibility(View.VISIBLE);
                et19.setHint("Ejm:Examen 7");
                et19.setVisibility(View.VISIBLE);
                et20.setHint("00");
                et20.setVisibility(View.VISIBLE);
                et21.setHint("00");
                et21.setVisibility(View.VISIBLE);
                tv9.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void btnGrabar(View v){
        String curso = etCurso.getText().toString();

        if (curso.length()==0)
        {
            etCurso.setError("Ingrese el curso");
            etCurso.setBackgroundColor(Color.TRANSPARENT);
        } else{
            dataSource.CrearCurso(curso);
            setResult(RESULT_OK);
            finish();
        }
    }

    @Override
    protected void onPause() {
        dataSource.CierraConexion();
        super.onPause();
    }

    @Override
    protected void onResume() {
        dataSource.AbreConexion();
        super.onResume();
    }
}
