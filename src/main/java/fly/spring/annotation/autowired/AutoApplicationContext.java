package fly.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/7.
 */
@Component
public class AutoApplicationContext {
    @Autowired
    private ApplicationContext applicationContext;

    public void print(){
        System.out.println(applicationContext.hashCode());
    }
}
