package fly.spring.bean.lifecycle;

/**
 * Created by chen on 2017/8/3.
 */
public class LiftCycleDemo2 {


    public void init(){
        printmsg("LiftCycleDemo2 init ");
    }

    public void startTest(){
        printmsg("LiftCycleDemo2 start ");
    }

    private void printmsg(String msg){
        System.out.println(msg);
    }

    public void cleanup(){
        printmsg("LiftCycleDemo2 cleanup ");
    }
}
