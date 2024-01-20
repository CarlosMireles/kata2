package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface NFLQuarterbackStatistic {
    Map<String, Integer> calculate(List<NFLQuarterback> quarterbacks);
}
