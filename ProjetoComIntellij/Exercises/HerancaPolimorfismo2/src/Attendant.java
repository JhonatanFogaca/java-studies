public class Attendant extends User {

    private double cash;

    private final boolean isAdmin = false;

    public Attendant(String name, String email, String password) {
        super(name, email, password);
        this.cash = 0;
    }

    public void recievePayment(double amount){
        cash += amount;
    }

    public void closeCash(){
        System.out.println("Caixa fechado. Total: " + cash);
        cash = 0;
    }

    public double getCash(){
        return cash;
    }

    @Override
    public boolean getIsAdmin() {
        return isAdmin;
    }

}
