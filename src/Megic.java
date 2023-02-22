public class Megic extends Hero{

    public Megic(int health, int demage, String superpower) {
        super(health, demage, superpower);
    }


    @Override
    public void useSuperAbility() {
        System.out.println("Medic used wair bol " + getSuperpower());
    }

    @Override
    public String info() {
        return super.info();
    }
}


