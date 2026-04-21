import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static Account account = null;

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Criar Conta");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> checkBalance();
                case 2 -> checkOverdraft();
                case 3 -> makedeposit();
                case 4 -> makewhithdraw();
                case 5 -> makePayment();
                case 6 -> CheckOverdraftUsed();
                case 7 -> createAnAccount();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }
        }while (true);
    }

    private static void makePayment() {
        if (account == null){
            System.out.println("Crie uma conta primeiro!");
        }else{
            var amount = 0.00;
            System.out.println("Informe o Valor do Boleto: ");
            amount = scanner.nextDouble();
            account.payTicket(amount);
        }

    }

    private static void CheckOverdraftUsed() {
        if (account == null){
            System.out.println("Crie uma conta primeiro!");

        }else{
            account.overdraftInUse();
        }
    }

    private static void makewhithdraw() {
        if (account == null) {
            System.out.println("Crie uma conta primeiro!");
        } else {
            var amount = 0.00;
            System.out.println("Digite o valor de Saque desejado: ");
            amount = scanner.nextDouble();
            account.withdraw(amount);
        }
    }

    private static void makedeposit() {
        if (account == null){
            System.out.println("Crie uma conta primeiro!");
        }else{
            var deposit = 0.00;
            System.out.println("Digite o Valor do depósito: ");
            deposit = scanner.nextDouble();
            account.deposit(deposit);

        }

    }

    private static void checkOverdraft() {
        if (account == null){
            System.out.println("Crie uma conta primeiro!");
        }else{
            System.out.println("Limite cheque especial: " + account.getOverdraftlimit() + " R$");
        }
    }

    private static void checkBalance() {
        if (account == null){
            System.out.println("Crie uma conta primeiro!");

        }else{
            System.out.println("Saldo: " + account.getBalance() + " R$");
        }
    }

    private static void createAnAccount(){

        if (account != null){
            System.out.println("Você ja possui uma conta cadastrada!");
            return;
        }

        var username = "";
        var initialDeposit = 0.00;
        var overdraftlimit = 50.00;
        System.out.println("Para criar sua conta digite o nome de usuário a ser utilizado (Ex: Maria)");
        username = scanner.next();
        System.out.println("Digite o valor de depósito inical para a criação da conta");
        initialDeposit = scanner.nextDouble();

        if (initialDeposit > 500){
            overdraftlimit = initialDeposit * 0.5;
        }

        account = new Account(username,initialDeposit,overdraftlimit);
        System.out.println("Conta criada com Sucesso!");
    }

}


