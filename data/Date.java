import java.util.ArrayList;

public class Date {
    ArrayList<DataFormattata> date;

    public Date() {
        date=new ArrayList<>();
    }


    public void addData(DataFormattata d){
        date.add(d);
    }

    public void printDate(){
        for(DataFormattata d: date) System.out.println(d.stringaFormattata());
    }
}
