import java.util.ArrayList;

/**
 * Created by marat on 2/12/16.
 */
public class Tank extends AbstractMachine implements Gun, Trans2D {
    ArrayList<ArtilleryShell> artilleryShells;

    public Tank(int maxHp, String name, int maxFuel) {
        super(maxHp, name, maxFuel);
        artilleryShells = new ArrayList<>();
    }

    @Override
    public void shoot(WarObject warObject) {
        if (artilleryShells.size() > 0) {
            warObject.takeDamage(artilleryShells.get(artilleryShells.size() - 1).damage);
            artilleryShells.remove(artilleryShells.size() - 1);
        }
        else
            System.out.println("нет зарядов");
    }

    @Override
    public void reloading(int countWhizzbang, Whizzbang whizzbang) {
        for (int i = 0; i < countWhizzbang; i++)
            artilleryShells.add((ArtilleryShell) whizzbang);
    }

    @Override
    public void clean(Human human) {
        System.out.println(((Soldier)human).name + " почистил оружие");
    }


    @Override
    public void goToRight(int count) {
        subFuel(count);
    }

    @Override
    public void goToLeft(int count) {
        subFuel(count);
    }

    @Override
    public void goToForward(int count) {
        subFuel(count);
    }

    @Override
    public void goToBack(int count) {
        subFuel(count);
    }

}
