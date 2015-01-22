package Beans;

/**
 * Created by USUARIO on 19/01/2015.
 */
public class Curso {
    int codigo_curso;
    String nom_curso;
    int c_notas;
    public int getCodigo_curso() {
        return codigo_curso;
    }
    public void setCodigo_curso(int codigo_curso) {
        this.codigo_curso = codigo_curso;
    }
    public String getNom_curso() {
        return nom_curso;
    }
    public void setNom_curso(String nom_curso) {
        this.nom_curso = nom_curso;
    }
    public int getC_notas() {
        return c_notas;
    }
    public void setC_notas(int c_notas) {
        this.c_notas = c_notas;
    }
    public String toString(){
        return nom_curso;
    }
}
