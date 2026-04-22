public class Manager extends User{



    public Manager(String name, String email, String password) {
        super(name, email, password); //Sempre Admin
    }

    public void generateFinancialReport(){
        System.out.println("Gerando relatório financeiro...");
    }

    public void viewSales(){
        System.out.println("Consultando vendas...");
    }

}
