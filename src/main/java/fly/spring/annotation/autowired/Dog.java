package fly.spring.annotation.autowired;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/8/9.
 */
@Component
@Order(1)
public class Dog implements Animal{
}
