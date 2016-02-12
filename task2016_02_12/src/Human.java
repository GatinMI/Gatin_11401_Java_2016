/**
 * Created by marat on 2/12/16.
 */
public interface Human extends WarObject {
    public void upRank(int count);
    public void downRank(int count);
    public void armWith(Gun gun);
    public void shoot(WarObject warObject);
}
