package fly.spring.normalinject;

/**
 * Created by chen on 2017/8/2.
 */
public class DemoDao implements IDao{
    @Override
    public void save(String msg) {
        System.out.println("DemoDao save "  + msg);
    }
}
