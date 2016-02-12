/**
 * Created by marat on 2/12/16.
 */
public abstract class AbstractMachine extends AbstractWarObject implements Machine{
    int fuel;
    int maxFuel;
    boolean started;

    public AbstractMachine(int maxHp, String name, int maxFuel) {
        super(maxHp, name);
        this.maxFuel = maxFuel;
        fuel = maxFuel;
    }

    @Override
    public void getFuel(int count) {
        fuel = Math.min(maxFuel, fuel + count);
        System.out.println("топливо " + name + " " + fuel);
    }

    @Override
    public void start() {
        System.out.printf(name + " завелось");
        started = true;
    }

    @Override
    public void stop() {
        started = false;
        System.out.println(name + " заглушено");
    }

    @Override
    public void subFuel(int count){
        fuel -= count;
    }
}
