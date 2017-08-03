package fly.spring.normalinject;

/**
 * Created by chen on 2017/8/2.
 */
public class DemoService02 implements IService{
    IDao iDao;

    /**
     * 构造注入时的参数定义需要与
     * constructor-arg 中 name 的值完全匹配
     */
    public DemoService02(IDao dao){
        this.iDao = dao;
    }

    @Override
    public void save(String msg) {
        System.out.println("DemoService02 save "  + msg);
        iDao.save(msg);
    }
}
