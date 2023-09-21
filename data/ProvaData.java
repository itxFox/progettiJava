public class ProvaData {
    public static void main(String[] args) {
        Date date= new Date();
        date.addData(new DataNumerica(10, 3, 5));
        date.addData(new DataEstesa(10, 3, 5));
        date.addData(new DataNumerica(11, 9, 1));
        date.addData(new DataEstesa(11, 9, 1));
        date.printDate();
    }
    
}