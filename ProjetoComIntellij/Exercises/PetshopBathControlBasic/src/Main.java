import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static WashMachine washMachine = new WashMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar agua da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> washMachine.takeAShower();
                case 2 -> putWater();
                case 3 -> putShampoo();
                case 4 -> checkAmountWaterInMachine();
                case 5 -> checkAmountShampooInMachine();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInWashMachine();
                case 8 -> washMachine.removePet();
                case 9 -> washMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida");
            }
        }while (true);


    }

    private static void putWater(){
        System.out.println("Tentando colocar água na máquina");
        washMachine.addWater();
    }

    private static void putShampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        washMachine.addShampoo();
    }

    private static void checkAmountShampooInMachine() {
        var amount = washMachine.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo");
    }
    private static void checkAmountWaterInMachine() {
        var amount = washMachine.getWater();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = washMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInWashMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        washMachine.setPet(pet);


    }

}