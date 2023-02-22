public class Warrior extends Hero {


    public Warrior(int health, int demage, String superpower) {
        super(health, demage, superpower);
    }


    @Override
    public void useSuperAbility() {
        System.out.println("Warrior used super power " + getSuperpower());
    }

    @Override
    public String info() {
        return super.info();
    }
}


