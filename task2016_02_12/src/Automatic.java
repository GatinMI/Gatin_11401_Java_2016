import java.util.ArrayList;

/**
 * Created by marat on 2/12/16.
 */
public class Automatic implements Gun{
    int maxWhizzbang;
    ArrayList<Patron> patrons;
    int resource;

    public Automatic(int maxWhizzbang, int resource) {
        this.maxWhizzbang = maxWhizzbang;
        this.resource = resource;
    }

    @Override
    public void shoot(WarObject warObject) {
        if (patrons.size() > 0) {
            warObject.takeDamage(patrons.get(patrons.size() - 1).damage);
            patrons.remove(patrons.size() - 1);
        }
        else
            System.out.println("нет зарядов");
    }

    @Override
    public void reloading(int countWhizzbang, Whizzbang whizzbang) {
        for (int i = 0; i < countWhizzbang; i++)
            if (maxWhizzbang > patrons.size())
                patrons.add((Patron) whizzbang);
        else break;
    }

    @Override
    public void clean(Human human) {
        System.out.println(((Soldier)human).name + " почистил оружие");
    }
}
