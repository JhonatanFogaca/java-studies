public abstract class Ticket {

    protected double value;
    protected String movieName;
    protected boolean captioned;

    public Ticket(double value, String movieName, boolean captioned) {
        this.value = value;
        this.movieName = movieName;
        this.captioned = captioned;
    }

    public double getValue() {
        return value;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getIsCaptioned(){
        if (captioned){
            return "Sim";
        }
        return "Não";
    }

    public double getTotal(){
        return 0;
    }

    //Cada tipo de ingresso implementa sua regra
    public abstract double getRealValue();
}
