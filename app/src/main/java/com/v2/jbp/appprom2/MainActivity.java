package com.v2.jbp.appprom2;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity {
    ImageButton ImgAgregar,ImgEditar,ImgEliminar,ImgConfig,tit_share;
    String Cursos[] ={"Teo","Mate","Android","C#"};
    ListView lv;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarTabs();
        Mapeo();

        ArrayAdapter<String> listado = new ArrayAdapter<String>(this,R.layout.b, Cursos);
        lv.setAdapter(listado);

        //PUBLICIDAD
        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView)this.findViewById(R.id.adView);
       // AdRequest adRequest = new AdRequest.Builder().build();    //PRODUCCION
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)       // Emulador
                .build();
        adView.loadAd(adRequest);
    }

    private void inicializarTabs() {
        TabHost tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();

        TabHost.TabSpec spec = tabhost.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Promedio");
        tabhost.addTab(spec);

        spec = tabhost.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Horario");
        tabhost.addTab(spec);

        spec = tabhost.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Graficos");
        tabhost.addTab(spec);
    }

    private void Mapeo(){
        ImgAgregar = (ImageButton) findViewById(R.id.btn_nuevo_curso);
        ImgEditar = (ImageButton) findViewById(R.id.btn_editar_curso);
        ImgEliminar = (ImageButton) findViewById(R.id.btn_eliminar_curso);
        ImgConfig = (ImageButton) findViewById(R.id.btn_blanco);
        //tit_share = (ImageButton) findViewById(R.id.btn_share);
        lv = (ListView) findViewById(R.id.listView);
    }



    public void btnNuevo(View v){
        Intent i = new Intent(this,ConfigProm.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.main,menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //return super.onCreateOptionsMenu(menu);
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
}
