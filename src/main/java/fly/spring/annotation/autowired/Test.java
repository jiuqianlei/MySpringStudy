package fly.spring.annotation.autowired;

import fly.spring.annotation.component.BeanAnnotation;
import fly.spring.annotation.component.BeanAnnotationV2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2017/8/7.
 */
public class Test {

    /**
     * 测试自动注解 Autowired 用法
     * <p>
     * demoServer中通过注解自动匹配装载demoDao的3中方式
     */
    @org.junit.Test
    public void testAtAutowired() {
        String springFilePath = "classpath:zhujie_02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        IService service = (IService) context.getBean("demoService");
        service.save("@Autowired");

        context.destroy();

    }


    /**
     * 测试自动装载解析依赖性的接口
     */
    @org.junit.Test
    public void test02() {
        String springFilePath = "classpath:zhujie_02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        System.out.println(context.hashCode());
        AutoApplicationContext service = (AutoApplicationContext) context.getBean("autoApplicationContext");
        service.print();

        context.destroy();

    }

    /**
     * 测试自动装配集合
     *
     *  list,list 排序，map
     *  @Qualifier 选择
     */
    @org.junit.Test
    public void test03() {
        String springFilePath = "classpath:zhujie_02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springFilePath);
        context.start();

        zoo mZoo = (zoo) context.getBean("zoo");
        mZoo.listList();

        mZoo.listMap();

        mZoo.look();

        context.destroy();
    }
}