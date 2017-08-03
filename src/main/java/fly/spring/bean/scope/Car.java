package fly.spring.bean.scope;

/**
 * Created by chen on 2017/8/3.
 */
public class Car {
    public void run(){
        System.out.println( this.hashCode() + " running");
    }
}
