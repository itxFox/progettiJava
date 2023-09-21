public abstract class DataFormattata {
    protected int giorno;
    protected int mese;
    protected int anno;

    public DataFormattata(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public abstract String stringaFormattata();

    public int getAnno(int anno){
        String annoToSrtring= Integer.toString(anno);
        if(annoToSrtring.length()==4) return anno;
        else return anno+2000;
    }

}