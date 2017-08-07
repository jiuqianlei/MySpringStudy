package fly.spring.annotation.component;

import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/7.
 */

@Component("myBean")
public class BeanAnnotationV2 {

    public void say(String world){
        System.out.println("BeanAnnotationV2 say " + world);
    }
}
