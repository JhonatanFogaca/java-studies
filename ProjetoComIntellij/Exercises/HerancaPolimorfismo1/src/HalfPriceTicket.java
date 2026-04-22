public class HalfPriceTicket extends Ticket{

    public HalfPriceTicket(double value, String movieName, boolean captioned) {
        super(value, movieName, captioned);
    }



    @Override
    public double getRealValue() {
        return value / 2;
    }
}
