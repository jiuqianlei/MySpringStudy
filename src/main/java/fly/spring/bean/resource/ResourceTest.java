package fly.spring.bean.resource;

import fly.spring.bean.autowiting.AutoService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by chen on 2017/8/7.
 */
public class ResourceTest {


    @Test
    public void AutoTest01() throws IOException{
        String springFilePath = "classpath:resource01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        MySpringResource resource = (MySpringResource) context.getBean("resource");
        resource.dealResource();

        context.destroy();

    }
}
