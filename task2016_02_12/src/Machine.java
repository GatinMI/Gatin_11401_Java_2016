/**
 * Created by marat on 2/12/16.
 */
public interface Machine extends WarObject{
    public void getFuel(int count);
    public void start();
    public void stop();
    public void subFuel(int count);
}
