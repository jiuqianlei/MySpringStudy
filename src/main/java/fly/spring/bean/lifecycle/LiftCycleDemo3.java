package fly.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by chen on 2017/8/3.
 */
public class LiftCycleDemo3 implements InitializingBean , DisposableBean{


    @Override
    public void afterPropertiesSet() throws Exception {
        printmsg("LiftCycleDemo3 afterPropertiesSet ");
    }

    public void defaultInit(){
        printmsg("LiftCycleDemo3 defaultInit ");
    }

    public void defaultDestroy(){
        printmsg("LiftCycleDemo3 defaultDestroy ");
    }

    public void init(){
        printmsg("LiftCycleDemo3 init ");
    }

    public void startTest(){
        printmsg("LiftCycleDemo3 start ");
    }

    private void printmsg(String msg){
        System.out.println(msg);
    }

    public void cleanup(){
        printmsg("LiftCycleDemo3 cleanup ");
    }
    @Override
    public void destroy() throws Exception {
        printmsg("LiftCycleDemo3 destroy ");
    }
}
