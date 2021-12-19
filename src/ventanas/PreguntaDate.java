
package ventanas;


public class PreguntaDate {
    
    int cont;
    String pregunta,opVer,opFalseOne,opFalseTwo,opFalseThree,categoria,ronda;

    public PreguntaDate(int cont, String pregunta, String opVer, String opFalseOne, String opFalseTwo, String opFalseThree, String categoria, String ronda) {
        this.cont = cont;
        this.pregunta = pregunta;
        this.opVer = opVer;
        this.opFalseOne = opFalseOne;
        this.opFalseTwo = opFalseTwo;
        this.opFalseThree = opFalseThree;
        this.categoria = categoria;
        this.ronda = ronda;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpVer() {
        return opVer;
    }

    public void setOpVer(String opVer) {
        this.opVer = opVer;
    }

    public String getOpFalseOne() {
        return opFalseOne;
    }

    public void setOpFalseOne(String opFalseOne) {
        this.opFalseOne = opFalseOne;
    }

    public String getOpFalseTwo() {
        return opFalseTwo;
    }

    public void setOpFalseTwo(String opFalseTwo) {
        this.opFalseTwo = opFalseTwo;
    }

    public String getOpFalseThree() {
        return opFalseThree;
    }

    public void setOpFalseThree(String opFalseThree) {
        this.opFalseThree = opFalseThree;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }
    
    
}
