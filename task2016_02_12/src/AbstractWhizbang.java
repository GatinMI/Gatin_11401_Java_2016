/**
 * Created by marat on 2/12/16.
 */
public abstract class AbstractWhizbang implements Whizzbang{

    int damage;
    int timeDetonation;
    @Override
    public void bang() {
        System.out.println(this.getClass().getName() + " banged");
    }

    public AbstractWhizbang(int damage, int timeDetonation) {
        this.damage = damage;
        this.timeDetonation = timeDetonation;
    }

    @Override
    public void giveDamage(WarObject object) {
        System.out.println(this.getClass().getName() + " gave damage to " + object.getClass().getName());
    }

    @Override
    public void detonation() {
        try {
            Thread.sleep(timeDetonation);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
