package Beans;

/**
 * Created by USUARIO on 23/01/2015.
 */
public class Nota {
    int codigo_curso;
    String descrip_nota;
    double nota;
    double porcentaje;

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(int codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public String getDescrip_nota() {
        return descrip_nota;
    }

    public void setDescrip_nota(String descrip_nota) {
        this.descrip_nota = descrip_nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
