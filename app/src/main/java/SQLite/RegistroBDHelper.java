package SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USUARIO on 16/01/2015.
 */
public class RegistroBDHelper extends SQLiteOpenHelper{

    private static final String DATABASE="Registro.db";
    private static final int version=1;

    public static class TablaCurso{
        public static String TABLA_CURSO = "Curso";
        public static String COLUMNA_ID = "Id_Curso";
        public static String COLUMNA_NOMCURSO = "Nom_Curso";
        public static String COLUMNA_CNOTAS = "C_Notas";
    }

    public static class TablaDetalleNota{
        public static String TABLA_DETALLENOTA = "Detalle_Nota";
        public static String COLUMNA_ID = "Id_Curso";
        public static String COLUMNA_DESCRIPNOTA = "Descrip_Nota";
        public static String COLUMNA_NOTA = "Nota";
        public static String COLUMNA_PORCENTAJE = "Porcentaje";
    }

    private static final String CREATE_TABLACURSO = "create table "
            + TablaCurso.TABLA_CURSO + "(" + TablaCurso.COLUMNA_ID
            + " integer primary key autoincrement, " + TablaCurso.COLUMNA_NOMCURSO
            + " TEXT(255), " + TablaCurso.COLUMNA_CNOTAS + " integer, "
            + " CONSTRAINT fk_Cursos_Detalle_Nota_1 FOREIGN KEY (" + TablaCurso.COLUMNA_ID
            + ") REFERENCES " + TablaDetalleNota.TABLA_DETALLENOTA + " ("
            + TablaDetalleNota.COLUMNA_ID + "))";

    private static final String CREATE_TABLADETALLENOTA = "create table "
            + TablaDetalleNota.TABLA_DETALLENOTA + "(" + TablaDetalleNota.COLUMNA_ID
            + " integer, " + TablaDetalleNota.COLUMNA_DESCRIPNOTA
            + " TEXT(255), " + TablaDetalleNota.COLUMNA_NOTA + " integer, "
            + TablaDetalleNota.COLUMNA_PORCENTAJE + " integer)";


    public RegistroBDHelper(Context context) {
        super(context, DATABASE, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLACURSO);
        db.execSQL(CREATE_TABLADETALLENOTA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TablaCurso.TABLA_CURSO);
        db.execSQL("drop table if exists " + TablaDetalleNota.TABLA_DETALLENOTA);
        onCreate(db);
    }
}
