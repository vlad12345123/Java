package by.gsu.pms;

public class BusinessTrip {
    public final double RATE = 15;
    private String account;
    private double transportExpenses;
    private int days;

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public Double getTransportExpenses(){
        return transportExpenses;
    }

    public void setTransportExpenses(Double transportExpenses){
        this.transportExpenses = transportExpenses;
    }

    public int getDays(){
        return days;
    }

    public void setDays(int days){
        this.days = days;
    }

    public double GetTotal(){
        return RATE * days + transportExpenses;
    }

    public void Show(){
        System.out.printf("rate = %f\naccount = %s\ntransport = %f\ndays = %d\ntotal = %f",
                           RATE, account, transportExpenses, days,GetTotal());
    }

    public String ToString(){
        return RATE + ";" + account + ";" + transportExpenses + ";" + days + ";" + GetTotal();
    }

    public BusinessTrip(){

    }

}
