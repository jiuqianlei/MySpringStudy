package fly.spring.bean.lifecycle;

import fly.spring.bean.scope.Car;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by chen on 2017/8/3.
 */
public class LifeCycleTest {

    /**
     * 通过接口实现的初始化，销毁方法
     */
    @Test
    public void testLifeCycle01(){
        String springFilePath = "classpath:bean_lifecycle01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();
        System.out.println("context.start ");

        LiftCycleDemo1 demo1 = (LiftCycleDemo1)context.getBean("lifeCycle01");
        demo1.startTest();


        System.out.println("context to destory ");
        context.destroy();

    }

    /**
     * 通过xml 配置 实现的初始化，销毁方法
     */
    @Test
    public void testLifeCycle02(){
        String springFilePath = "classpath:bean_lifecycle01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        LiftCycleDemo2 demo2 = (LiftCycleDemo2)context.getBean("lifeCycle02");
        demo2.startTest();

        context.destroy();

    }

    /**
     * xml, 接口配置 优先级
     */
    @Test
    public void testLifeCycle03(){
        String springFilePath = "classpath:bean_lifecycle03.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();
        System.out.println("context.start ");
        LiftCycleDemo3 demo3 = (LiftCycleDemo3)context.getBean("lifeCycle03");
        demo3.startTest();
        System.out.println("context.while destroy ");
        context.destroy();

    }

    /**
     * 全局xml ； 优先级
     */
    @Test
    public void testLifeCycle04(){
        String springFilePath = "classpath:bean_lifecycle04.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();
        System.out.println("context.start ");

        LiftCycleDemo3 demo3 = (LiftCycleDemo3)context.getBean("lifeCycle03");
        demo3.startTest();

        System.out.println("context.while destroy ");
        context.destroy();

    }
}
