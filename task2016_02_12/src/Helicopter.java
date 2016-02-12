import java.util.ArrayList;

/**
 * Created by marat on 2/12/16.
 */
public class Helicopter extends AbstractMachine implements Gun, Trans3D {

    int maxWhizzbang;
    ArrayList<Whizzbang> whizzbangs;

    @Override
    public void start(){
        System.out.println("Взлетаем");
    }

    public Helicopter(int maxHp, String name, int maxFuel, int maxWhizzbang) {
        super(maxHp, name, maxFuel);
        this.maxWhizzbang = maxWhizzbang;
        whizzbangs = new ArrayList<>();
    }

    @Override
    public void shoot(WarObject warObject) {
        if (whizzbangs.size() > 0) {
            warObject.takeDamage(((AbstractWhizbang) whizzbangs.get(whizzbangs.size() - 1)).damage);
            whizzbangs.remove(whizzbangs.size() - 1);
        } else
            System.out.println("нет зарядов");
    }

    @Override
    public void reloading(int countWhizzbang, Whizzbang whizzbang) {
        for (int i = 0; i < countWhizzbang; i++)
            if (maxWhizzbang > whizzbangs.size())
                whizzbangs.add(whizzbang);
            else break;
    }

    @Override
    public void clean(Human human) {
        System.out.println(((Soldier) human).name + " почистил" + name);

    }


    @Override
    public void goToUp(int count) {
        subFuel(count);
    }

    @Override
    public void goToDown(int count) {
        subFuel(count);
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


