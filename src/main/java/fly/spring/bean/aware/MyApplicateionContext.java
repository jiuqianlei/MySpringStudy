package fly.spring.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by chen on 2017/8/7.
 */
public class MyApplicateionContext implements ApplicationContextAware , BeanNameAware{
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean get context " + applicationContext.hashCode());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean get name " + name);
    }
}
