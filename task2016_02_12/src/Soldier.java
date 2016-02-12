/**
 * Created by marat on 2/12/16.
 */
public class Soldier extends AbstractWarObject implements Human{
    Commander commander;
    int hp;
    int rank;
    String name;
    Gun gun;

    public Soldier(int maxHp, String name, int rank, Commander commander) {
        super(maxHp, name);
        this.commander = commander;
        this.rank = rank;
    }

    @Override
    public void upRank(int count) {
        rank += count;
    }

    @Override
    public void downRank(int count) {
        rank -= count;
    }

    @Override
    public void armWith(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void shoot(WarObject warObject) {
        gun.shoot(warObject);
    }


}
