package fly.spring.annotation.autowired;

import org.springframework.stereotype.Repository;

/**
 * Created by chen on 2017/8/2.
 */
@Repository
public class DemoDao implements IDao {
    @Override
    public void save(String msg) {
        System.out.println("DemoDao save "  + msg);
    }
}
