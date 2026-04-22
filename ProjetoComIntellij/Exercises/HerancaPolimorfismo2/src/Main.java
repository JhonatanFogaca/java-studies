public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("João","joao@gmail.com","123");
        Selesman salesman = new Selesman("Maria", "maria@gmail.com", "123");
        Attendant attendant = new Attendant("Carlos","carlos@gmail.com","123");

        manager.login();
        System.out.println(manager.getIsAdmin() ? "Usuario Administrador" : "Usuario Normal");
        manager.generateFinancialReport();

        salesman.login();
        System.out.println(salesman.getIsAdmin() ? "Usuario Administrador" : "Usuario Normal");
        salesman.makeSale();
        salesman.makeSale();
        salesman.viewSales();


        attendant.login();
        System.out.println(attendant.getIsAdmin() ? "Usuario Administrador" : "Usuario Normal");
        attendant.recievePayment(100);
        attendant.recievePayment(50);
        attendant.closeCash();
    }

}
