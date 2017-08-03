package fly.spring.normalinject;

/**
 * Created by chen on 2017/8/2.
 */
public class DemoService implements IService {

    IDao mDao;

    /**
     * 设值注入时的set方法需要用生成的标准set方法
     * 自己手写可能会因为spring找不到而报错
     *
     * 设值中的name取值 与 参数取值需要完全匹配
     */
    public void setmDao(IDao mDao) {
        this.mDao = mDao;
    }

    @Override
    public void save(String msg) {
        System.out.println("DemoService save " + msg);
        mDao.save(msg);
    }
}
