public class Main {
    public static void main(String[] args) {

        Ticket half = new HalfPriceTicket(20, "Demon Slayer", true);
        Ticket family = new FamilyTicket(20, "Titanic", false, 5);

        System.out.println("============================");
        System.out.println("Meia entrada:\n" + "Nome do Filme: " + half.getMovieName() + "\nLegendado: " +
                        half.getIsCaptioned() + "\nValor Inteiro: " + half.getValue() +
                        "\nValor Total: " + half.getRealValue());
        System.out.println("============================");
        System.out.println("Ingresso Familia:\n" + "Nome do Filme: " + family.getMovieName() + "\nLegendado: " +
                family.getIsCaptioned() + "\nValor Inteiro: " + family.getTotal() +
                "\nValor Total: " + family.getRealValue());
        System.out.println("============================");



    }
}
