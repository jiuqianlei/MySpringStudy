package fly.spring.annotation.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/7.
 */

@Component("scope1")
@Scope("prototype")
public class BeanScop {

    public void say(String world){
        System.out.println("BeanAnnotation say " + world + " I'm " + this.hashCode());
    }
}
