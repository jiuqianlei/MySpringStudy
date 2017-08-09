package fly.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by chen on 2017/8/9.
 */
@Component
public class zoo {

    @Autowired
    private List<Animal> animalList;

    @Autowired
    private Map<String, Animal> animalMap;

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    public void listList(){
        if(animalList == null || animalList.size() == 0){
            System.out.print("animalList is empty");
        } else {
            for (Animal animal: animalList){
                animal.say();
            }
        }
    }

    public void listMap(){
        if(animalMap == null || animalMap.size() == 0){
            System.out.print("animalMap is empty");
        } else {
            for (Map.Entry<String,Animal> entry: animalMap.entrySet()){
                System.out.print(entry.getKey() + "      " );
                entry.getValue().say();
            }
        }
    }

    public void look(){
        animal.say();
    }

}
