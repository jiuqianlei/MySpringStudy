package fly.spring.bean.autowiting;

/**
 * Created by chen on 2017/8/7.
 */
public class AutoService2 {
    private AutoDao autoDAO;

    public void setaaaaaaaaaaaa(AutoDao autoDAO) {
        this.autoDAO = autoDAO;
    }

    public void say(String word) {
        this.autoDAO.say(word);
    }
}
