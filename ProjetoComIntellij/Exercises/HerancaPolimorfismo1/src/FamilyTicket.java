public class FamilyTicket extends Ticket{

    private int amountOfPeople;
    double total;

    public FamilyTicket(double value, String movieName, boolean captioned, int amountOfPeople) {
        super(value, movieName, captioned);
        this.amountOfPeople = amountOfPeople;
        this.total = value * amountOfPeople;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public double getRealValue() {

        if (amountOfPeople > 3){
            total *= 0.95; //Aplica 5% de desconto
        }
        return total;
    }
}
