package fly.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/8/2.
 */
@Service
public class DemoService implements IService {


    // @Autowired
    IDao mDao;

    // @Autowired
    public void setmDao(IDao mDao) {
        this.mDao = mDao;
    }

    @Autowired
    public DemoService (IDao mDao){
        this.mDao = mDao;
    }

    @Override
    public void save(String msg) {
        System.out.println("DemoService save " + msg);
        mDao.save(msg);
    }
}
