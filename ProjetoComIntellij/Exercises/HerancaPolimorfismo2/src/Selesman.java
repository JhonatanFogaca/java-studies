public class Selesman extends User{

    private int salesCount;

    private final boolean isAdmin = false;

    public Selesman(String name, String email, String password) {
        super(name, email, password);
        this.salesCount = 0;
    }

    public void makeSale(){
        salesCount++;
    }

    public void viewSales(){
        System.out.println("Total de Vendas: " + salesCount);
    }

    public int getSalesCount(){
        return salesCount;
    }

    @Override
    public boolean getIsAdmin() {
        return isAdmin;
    }
}
