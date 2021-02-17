import by.gsu.pms.BusinessTrip;

public class Runner {
    public static void main(){
        BusinessTrip[] businessTrip = new BusinessTrip[7];

        for (BusinessTrip busTrip: businessTrip) {
            busTrip.GetTotal();
        }
    }
}
