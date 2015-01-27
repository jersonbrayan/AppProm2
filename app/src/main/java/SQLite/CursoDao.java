package SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Beans.Curso;
import SQLite.RegistroBDHelper.TablaCurso;
import SQLite.RegistroBDHelper.TablaDetalleNota;

/**
 * Created by USUARIO on 21/01/2015.
 */

public class CursoDao {
    private SQLiteDatabase conex;
    private RegistroBDHelper objHelper;
    private String[] columnasCurso = {TablaCurso.COLUMNA_ID,TablaCurso.COLUMNA_NOMCURSO};

    public CursoDao(Context context) {
        objHelper = new RegistroBDHelper(context);
    }

    public void AbreConexion(){
        conex = objHelper.getWritableDatabase();
    }

    public void CierraConexion(){
        conex.close();
    }

    public List<Curso> Listado(){
        List<Curso> listaCursos = new ArrayList<Curso>();

        Cursor cursor = conex.query(TablaCurso.TABLA_CURSO,columnasCurso,null,null,null,null,null);
        cursor.moveToFirst();

            while (!cursor.isAfterLast()){
                Curso nuevoCurso = cursorToCurso(cursor);
                listaCursos.add(nuevoCurso);
                cursor.moveToNext();
            }
        cursor.close();
        return  listaCursos;
    }

    private Curso cursorToCurso(Cursor cursor){
        Curso curso = new Curso();
        curso.setCodigo_curso(cursor.getInt(0));
        curso.setNom_curso(cursor.getString(1));
        return curso;
    }

    public void CrearCurso(String curso, int c_notas){
        ContentValues values = new ContentValues();
        values.put(TablaCurso.COLUMNA_NOMCURSO,curso);
        values.put(TablaCurso.COLUMNA_CNOTAS,c_notas);
        conex.insert(TablaCurso.TABLA_CURSO,null,values);
    }
    public void CrearCursoNota(int id_curso,String descrip_nota,int notas,int porcentaje){
        ContentValues values = new ContentValues();
        values.put(TablaDetalleNota.COLUMNA_ID,id_curso);
        values.put(TablaDetalleNota.COLUMNA_DESCRIPNOTA,descrip_nota);
        values.put(TablaDetalleNota.COLUMNA_NOTA,notas);
        values.put(TablaDetalleNota.COLUMNA_PORCENTAJE,porcentaje);
        conex.insert(TablaCurso.TABLA_CURSO,null,values);
    }
}
