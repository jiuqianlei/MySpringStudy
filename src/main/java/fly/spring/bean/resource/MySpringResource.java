package fly.spring.bean.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by chen on 2017/8/7.
 */
public class MySpringResource implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public void dealResource() throws IOException {
        Resource resource = context.getResource("classpath:abc.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
