import java.util.Scanner;

public class App {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        //Var é usado quando a tipagem esta sendo passada na inicialização
        //da variavel por outro elemento como o "var sc" esta sendo definido
        //pelo new Scanner que nesse caso entra como a tipagem da variavel
        System.out.println(WELCOME_MESSAGE);
        var name = sc.next();
        System.out.println("Olá informe o sua idade");
        var age = sc.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);
        sc.close();
    }
}
