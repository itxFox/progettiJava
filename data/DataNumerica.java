public class DataNumerica extends DataFormattata{

    public DataNumerica(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }
    
    public String stringaFormattata(){
        return "\n"+giorno+" "+mese+" "+getAnno(anno);
    } 
}
