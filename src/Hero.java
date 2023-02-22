public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int demage, String superpower) {
        this.health =health;
        this.damage = demage;
        this.superpower =superpower;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
    public String info(){
        return "Health" + this.health + "Damade" +this.damage + " " +this.superpower;
    }
}
