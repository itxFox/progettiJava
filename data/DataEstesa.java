public class DataEstesa extends DataFormattata{
    String mesi[] = {"gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre"};
    
    public DataEstesa(int giorno, int mese, int anno) {
        super(giorno, mese, anno);
    }

    public String stringaFormattata(){

        return "\n"+giorno+" "+mesi[mese-1]+" "+getAnno(anno);
    } 
    
}
