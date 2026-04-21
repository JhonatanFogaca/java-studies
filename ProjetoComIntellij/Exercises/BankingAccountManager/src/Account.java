public class Account {

    private final String username;
    private double balance;

    private final double overdraftlimit;
    private double overdraftlimitinuse;


    public Account(String username, double initialDeposit, double overdraftlimit) {
        this.username = username;
        this.balance = initialDeposit;
        this.overdraftlimit = overdraftlimit;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void payTicket(double amount){

        if (balance > 0){
            double paylimit = balance + overdraftlimit;

            if (amount > paylimit){
                System.out.println("O valor do boleto é maior que o valor disponivel, o valor atual disponivel é de " + paylimit + " R$");
                return;
            }else{
                balance -= amount;

                System.out.println("Pagamento realizado com sucesso!");
            }
        }else{
            overdraftlimitinuse = Math.abs(balance);
            double paylimit = overdraftlimit - overdraftlimitinuse;
            if (amount > paylimit) {
                System.out.println("O valor do Boleto é maior que o valor disponivel, o valor atual disponivel é de " + paylimit + " R$");
                return;
            }else{
                balance -= amount;

                System.out.println("Pagamento realizado com sucesso!");
            }
        }

    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Valor inválido");
            return;
        }
        //Se não estiver usando limite do cheque especial
        if (balance >= 0){
            balance += amount;
        }else {
            double debt = Math.abs(balance);

            double tax = debt * 0.2;

            if (amount >= debt){
                //Cobre toda a dívida
                amount -= debt;
                balance = amount; //Sobra vira saldo positivo
                if (balance >= tax){
                    balance -= tax;
                }
            }else{
                balance += amount;
            }
        }
        System.out.println("Depósito realizado com sucesso!");
    }

    public void withdraw(double amount){
        double withdrawlimit = balance + overdraftlimit;

        if (amount > withdrawlimit){
            System.out.println("O valor desejado para saque é maior que o valor disponivel, o valor atual disponivel é de " + withdrawlimit + " R$");
            return;
        }else{
            balance -= amount;

            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void overdraftInUse(){

        if (balance < 0){
            overdraftlimitinuse = Math.abs(balance);
            System.out.println("Voce está usando " + overdraftlimitinuse + " do seu limite de cheque especial");

        }else {
            System.out.println("Voce não está usando limite do seu cheque especial");
        }

    }
}


