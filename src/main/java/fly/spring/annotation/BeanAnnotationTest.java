package fly.spring.annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2017/8/7.
 */
public class BeanAnnotationTest {


    /**
     * 测试 @Component
     */
    @Test
    public void testAtComponent(){
        String springFilePath = "classpath:zhujie_01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        BeanAnnotation bean = (BeanAnnotation) context.getBean("beanAnnotation");
        bean.say("fly");

        BeanAnnotationV2 bean2 = (BeanAnnotationV2) context.getBean("myBean");
        bean2.say("fly");
        context.destroy();

    }

    /**
     * 测试 @Scop
     */
    @Test
    public void testAtScope(){
        String springFilePath = "classpath:zhujie_01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        BeanScop bean = (BeanScop) context.getBean("scope1");
        bean.say("fly");

        BeanScop bean2 = (BeanScop) context.getBean("scope1");
        bean2.say("fly");


        BeanScop2 bean3 = (BeanScop2) context.getBean("scope2");
        bean3.say("flower");

        BeanScop2 bean4 = (BeanScop2) context.getBean("scope2");
        bean4.say("fly");

        context.destroy();

    }
}
