package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<NFLQuarterback> quarterbacks = CsvFileNFLQuarterbackLoader
                .with(new File("nfl_quarterbacks.csv"))
                .load();
        for (NFLQuarterback quarterback : quarterbacks){
            System.out.println(quarterback.Player() + " " + quarterback.TouchDowns());
        }
        NFLQuarterbackStatistic statistic = new TouchdownsNFLQuarterbackStatistic();
        Map<String, Integer> map = statistic.calculate(quarterbacks);

        for (String key : map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }

    }
}
