import java.util.ArrayList;

/**
 * Created by marat on 2/12/16.
 */
public class NuclearFacility extends AbstractMachine implements Gun {
    ArrayList<NuclearBomb> bombs;
    public NuclearFacility(int maxHp, String name, int maxFuel) {
        super(maxHp, name, maxFuel);
        bombs = new ArrayList<>();
    }

    @Override
    public void shoot(WarObject warObject) {
        if (bombs.size() > 0) {
            warObject.takeDamage((bombs.get(bombs.size() - 1)).damage);
            bombs.remove(bombs.size() - 1);
        } else
            System.out.println("нет зарядов");
    }

    @Override
    public void reloading(int countWhizzbang, Whizzbang whizzbang) {
        for (int i = 0; i < countWhizzbang; i++)
            bombs.add((NuclearBomb) whizzbang);
    }

    @Override
    public void clean(Human human) {

    }

}
