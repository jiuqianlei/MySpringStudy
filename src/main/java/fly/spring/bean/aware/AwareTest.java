package fly.spring.bean.aware;

import fly.spring.bean.lifecycle.LiftCycleDemo3;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2017/8/7.
 */
public class AwareTest {


    @Test
    public void testLifeCycle04(){
        String springFilePath = "classpath:aware01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();
        System.out.println("My context id is " + context.hashCode());

        MyApplicateionContext demo = (MyApplicateionContext) context.getBean("demo");



        System.out.println("context.while destroy ");
        context.destroy();

    }
}
