package fly.spring.annotation.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/7.
 */

@Component("scope2")
@Scope("singleton")
public class BeanScop2 {

    public void say(String world){
        System.out.println("BeanAnnotation say " + world + " I'm " + this.hashCode());
    }
}
