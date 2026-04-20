public class WashMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private int needClean = 1;
    private Pet pet;



    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        if (this.needClean == 0){
            System.out.println("A máquina está suja, limpe-a primeiro antes de dar um novo banho");
            return;
        }
        if (pet.isClean()){
            System.out.println("O pet ja está limpo, não há necessidade de banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.needClean -=1;
        if (needClean == 0){
            clean = false;
        }
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater(){
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina está suja, para colocar outro pet e necessário limpá-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet(){
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");
        this.pet = null;
    }

    public void wash(){

        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        this.needClean = 1;
        System.out.println("A máquina foi limpa");
    }
}
