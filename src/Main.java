public class Main {
    public static void main(String[] args) {
Megic medic = new Megic(200,5,"Medic ");
Megic megic = new Megic(240, 22, "Medgic sp");
Warrior warrior = new Warrior(280, 20, "Warrior sp");

Hero[]heroes = {medic,megic,warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].useSuperAbility();
            System.out.println(heroes[i].info());

        }
    }
}