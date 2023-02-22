public class Medic extends Hero{

    public Medic(int health, int demage, String superpower) {
        super(health, demage, superpower);
    }


    @Override
    public void useSuperAbility() {
        System.out.println("Medic used heal " + getSuperpower());
    }

    @Override
    public String info() {
        return super.info();
    }
}

