package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[]strings;
    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String,Integer>map = new HashMap<>();
        for (int i = 0; i < strings.length ; i++) {
            if(!map.containsKey(strings[i])){
                map.put(strings[i],1);
            }
            else{
                map.put(strings[i],map.get(strings[i])+1);
            }
        }
        return map;
    }
}
