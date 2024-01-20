package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TouchdownsNFLQuarterbackStatistic implements NFLQuarterbackStatistic{
    @Override
    public Map<String, Integer> calculate(List<NFLQuarterback> quarterbacks) {
        Map<String, Integer> result = new HashMap<>();
        for (NFLQuarterback quarterback : quarterbacks){
            String key = calculateInterval(quarterback.TouchDowns());
            result.put(key, result.getOrDefault(key, 0) + 1);
        }
        return result;
    }

    private String calculateInterval(int touchDowns) {
        if (touchDowns >= 25) return "25 or more touchdowns";
        if (touchDowns >= 15) return "15-24 touchdowns";
        return "0-14 touchdowns";
    }
}
