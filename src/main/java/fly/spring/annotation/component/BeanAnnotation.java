package fly.spring.annotation.component;

import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/7.
 */

@Component
public class BeanAnnotation {

    public void say(String world){
        System.out.println("BeanAnnotation say " + world);
    }
}
