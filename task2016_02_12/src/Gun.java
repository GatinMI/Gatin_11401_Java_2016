/**
 * Created by marat on 2/12/16.
 */
public interface Gun {
    public void shoot(WarObject warObject);
    public void reloading(int countWhizzbang, Whizzbang whizzbang);
    public void clean(Human human);
}
