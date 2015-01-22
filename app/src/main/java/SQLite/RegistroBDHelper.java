package SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USUARIO on 16/01/2015.
 */
public class RegistroBDHelper extends SQLiteOpenHelper{

    private static final String DATABASE="Registro2.db";
    private static final int version=1;

    public static class TablaCurso{
        public static String TABLA_CURSO = "Curso";
        public static String COLUMNA_ID = "Id_Curso";
        public static String COLUMNA_NOMCURSO = "Nom_Curso";
        public static String COLUMNA_CNOTAS = "C_Notas";
    }

    public static class TablaDetalleNota{
        public static String TABLA_DETALLENOTA = "Detalle_Nota";
        public static String COLUMNA_NOTA = "Nota";
        public static String COLUMNA_PORCENTAJE = "Porcentaje";
    }

    private static final String CREATE_TABLACURSO = "create table "
            + TablaCurso.TABLA_CURSO + "(" + TablaCurso.COLUMNA_ID
            + " integer primary key autoincrement, " + TablaCurso.COLUMNA_NOMCURSO
            + " TEXT(255), " + TablaCurso.COLUMNA_CNOTAS + " integer, "
            + " CONSTRAINT fk_Cursos_Detalle_Nota_1 FOREIGN KEY (" + TablaCurso.COLUMNA_ID
            + ") REFERENCES " + TablaDetalleNota.TABLA_DETALLENOTA + " ("
            + TablaCurso.COLUMNA_ID + "))";

    private static final String CREATE_TABLADETALLENOTA = "create table "
            + TablaDetalleNota.TABLA_DETALLENOTA + "(" + TablaCurso.COLUMNA_ID
            + " integer, " + TablaDetalleNota.COLUMNA_NOTA + " REAL, "
            + TablaDetalleNota.COLUMNA_PORCENTAJE + " REAL)";


    public static String T_Curso="Curso";
    static String Insert1_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Frances',2)";
    static String Insert2_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('C#',2)";
    static String Insert3_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Mate',2)";
    static String Insert4_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Android',2)";
    static String Insert5_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Teologia II',2)";
    static String Insert6_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Comunicacion Integral',2)";
    static String Insert7_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Recreo',2)";
    static String Insert8_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Computacion',2)";
    static String Insert9_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Contabilidad',2)";
    static String Insert10_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Ingles',2)";
    static String Insert11_T_Curso="INSERT INTO "+T_Curso+" (Nom_Curso,C_Notas) values('Fisica',2)";

    /*-------------------------------------------------------*/

    public static String T_Detalle_Nota="Detalle_Nota";
    static String Insert1_T_Detalle_Nota="INSERT INTO "+T_Detalle_Nota+" (Nota) values(1)";
    public RegistroBDHelper(Context context) {
        super(context, DATABASE, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLACURSO);

        db.execSQL(Insert1_T_Curso);
        db.execSQL(Insert2_T_Curso);
        db.execSQL(Insert3_T_Curso);
        db.execSQL(Insert4_T_Curso);
        db.execSQL(Insert5_T_Curso);
        db.execSQL(Insert6_T_Curso);
        db.execSQL(Insert7_T_Curso);
        db.execSQL(Insert8_T_Curso);
        db.execSQL(Insert9_T_Curso);
        db.execSQL(Insert10_T_Curso);
        db.execSQL(Insert11_T_Curso);


        db.execSQL(CREATE_TABLADETALLENOTA);
        db.execSQL(Insert1_T_Detalle_Nota);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
