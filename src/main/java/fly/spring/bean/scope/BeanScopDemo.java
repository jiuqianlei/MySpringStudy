package fly.spring.bean.scope;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by chen on 2017/8/3.
 */
public class BeanScopDemo {

    /**
     * 测试默认作用域
     */
    @Test
    public void testDefaultScope(){
        String springFilePath = "classpath:bean_scope.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        Car car1 = (Car)context.getBean("defaultCar01");
        car1.run();

        Car car2 = (Car)context.getBean("defaultCar01");
        car2.run();

        assertEquals(car1,car2);

        context.destroy();

    }

    /**
     * 测试默认作用域
     */
    @Test
    public void testSingleScope(){
        String springFilePath = "classpath:bean_scope.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        Car car1 = (Car)context.getBean("singleCar02");
        car1.run();

        Car car2 = (Car)context.getBean("singleCar02");
        car2.run();

        assertEquals(car1,car2);

        context.destroy();

    }

    /**
     * 测试默认作用域
     */
    @Test
    public void testPrototypeScope(){
        String springFilePath = "classpath:bean_scope.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        Car car1 = (Car)context.getBean("prototypeCar02");
        car1.run();

        Car car2 = (Car)context.getBean("prototypeCar02");
        car2.run();

        assertNotEquals(car1,car2);

        context.destroy();

    }
}
