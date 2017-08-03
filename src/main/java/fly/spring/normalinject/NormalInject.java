package fly.spring.normalinject;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2017/8/2.
 *
 *  Spring 普通注入
 */
public class NormalInject {


    /**
     * 测试基本注入
     */
    @Test
    public void testNormalInjectOne(){
        String springFilePath = "classpath:normal_inject.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        IDao dao = (IDao)context.getBean("demoDao");

        dao.save("cat");

        context.destroy();

    }

    /**
     * 测试设值注入
     */
    @Test
    public void testSetParamInject(){
        String springFilePath = "classpath:normal_inject2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        IService service = (IService)context.getBean("server2");

        service.save("cat");

        context.destroy();

    }

    /**
     * 测试构造注入
     */
    @Test
    public void testSetConstructorInject(){
        String springFilePath = "classpath:normal_inject3.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        IService service = (IService)context.getBean("server2");

        service.save("cat");

        context.destroy();

    }


}
