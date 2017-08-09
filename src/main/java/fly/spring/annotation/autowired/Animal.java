package fly.spring.annotation.autowired;

/**
 * Created by chen on 2017/8/9.
 */
public interface Animal {
    default void say() {
        System.out.println("I am " + this.getClass().getSimpleName());
    }

    default void print(String msg) {
        System.out.println(msg);
    }
}
