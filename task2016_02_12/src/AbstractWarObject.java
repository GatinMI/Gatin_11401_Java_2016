/**
 * Created by marat on 2/12/16.
 */
public abstract class AbstractWarObject implements WarObject {
    int maxHp;
    int hp;
    String name;

    public AbstractWarObject(int maxHp, String name){
        this.maxHp = maxHp;
        hp = maxHp;
        this.name = name;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0)
            destroy();
        else
            System.out.println(name + " получил урон " + damage + ", текущее здоровье " + hp);
    }

    @Override
    public void repair(int plusHp) {
        hp = Math.min(hp + plusHp, maxHp);
        System.out.println("Здоровье " + name + " " + hp);
    }

    @Override
    public void destroy() {
        System.out.println(name + " уничтожен");
    }
}
