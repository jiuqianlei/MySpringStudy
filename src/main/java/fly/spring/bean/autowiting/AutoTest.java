package fly.spring.bean.autowiting;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2017/8/7.
 */
public class AutoTest {

    /**
     * 1. xml中：default-autowire="byName"
     * 2. AutoDao 在  AutoService中的变量名称 与 AutoDao 在 xml中定义的bean的id 的name值需要一致
     * 3 .AutoDao 在  AutoService中需要有标准的setter方法（最好自动生成）
     */
    @Test
    public void AutoTest01(){
        String springFilePath = "classpath:auto01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        AutoService service = (AutoService) context.getBean("service");
        service.say("beautiful");

        context.destroy();

    }

    /**
     * 1. xml中：default-autowire="byType"
     *
     * 2. AutoDao 在xml中 不需要id （可有可无）
     *
     * 3. AutoDao 在xml中 只有一个类型（可以无，为空； 多个异常）
     *
     * 4. 需要一个set方法，（最好自动生成，不过貌似不标准的set方法也可以）
     */
    @Test
    public void AutoTest02(){
        String springFilePath = "classpath:auto02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        AutoService2 service = (AutoService2) context.getBean("service");
        service.say("beautiful");

        context.destroy();

    }

    /**
     * 1. xml中：default-autowire="byType"
     *
     * 2. AutoDao 在xml中 不需要id （可有可无）
     *
     * 3. AutoDao 在xml中 只有一个类型（可以无，为空； 多个异常）
     *
     * 4. 需要一个带参（AutoDao）构造方法
     */
    @Test
    public void AutoTest03(){
        String springFilePath = "classpath:auto03.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        AutoService3 service = (AutoService3) context.getBean("service");
        service.say("beautiful");

        context.destroy();

    }

}
