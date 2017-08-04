package fly.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by chen on 2017/8/3.
 */
public class LiftCycleDemo1 implements InitializingBean , DisposableBean{


    @Override
    public void afterPropertiesSet() throws Exception {
        printmsg("LiftCycleDemo1 afterPropertiesSet ");
    }

    public void startTest(){
        printmsg("LiftCycleDemo1 start ");
    }

    private void printmsg(String msg){
        System.out.println(msg);
    }

    @Override
    public void destroy() throws Exception {
        printmsg("LiftCycleDemo1 destroy ");
    }
}
