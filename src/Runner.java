import by.gsu.pms.BusinnesTrip;

public class Runner {

    public static void main(String [] args){

        BusinnesTrip[] businnesTrip = new BusinnesTrip[7];
        businnesTrip[0] = new BusinnesTrip("Vlad zezjulin", 100, 2);
        businnesTrip[1] = new BusinnesTrip("Artemy Bonokhov", 200, 1);
        businnesTrip[2] = null;
        businnesTrip[3] = new BusinnesTrip("Kirill Bataev", 50, 4);
        businnesTrip[4] = new BusinnesTrip("Sanya Sushevich", 500, 5);
        businnesTrip[5] = new BusinnesTrip("Artemy Taxi", 200, 3);
        businnesTrip[6] = new BusinnesTrip();

        for (BusinnesTrip btrip: businnesTrip) {
            if(btrip != null)
                btrip.Show();
        }

        businnesTrip[6].setTransportExpenses(50.0);

        System.out.println("Duration: " + businnesTrip[1].getDays() + "\n");


        for (BusinnesTrip btrip : businnesTrip){
            if(btrip != null) {
                System.out.println(btrip.ToString());
            }
        }

        double sum = 0;
        double max = 0;
        for (BusinnesTrip btrip : businnesTrip){
            if(btrip != null) {
                sum += btrip.GetTotal();
                if(btrip.GetTotal() > max){
                    max = btrip.GetTotal();
                }
            }
        }

        System.out.println("Sum:" + sum);
        System.out.println("Max: " + max);
    }
}
