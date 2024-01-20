package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFileNFLQuarterbackLoader implements NFLQuarterbackLoader{
    private final File file;

    public static NFLQuarterbackLoader with (File file){
        return new CsvFileNFLQuarterbackLoader(file);
    }
    private CsvFileNFLQuarterbackLoader(File file) {
        this.file = file;
    }

    @Override
    public List<NFLQuarterback> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return load(reader);
        } catch (FileNotFoundException e) {
            return Collections.EMPTY_LIST;
        } catch (IOException e) {
            return Collections.EMPTY_LIST;
        }
    }

    private List<NFLQuarterback> load(BufferedReader reader) throws IOException {
        List<NFLQuarterback> quarterbacks = new ArrayList<>();
        reader.readLine();
        while (true){
            String line = reader.readLine();
            if (line == null) return quarterbacks;
            quarterbacks.add(toNFLQuarterback(line));
        }
    }

    private NFLQuarterback toNFLQuarterback(String line) {
        return toNFLQuarterback(line.split(","));
    }

    private NFLQuarterback toNFLQuarterback(String[] fields) {
        return new NFLQuarterback(fields[0], fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), Integer.parseInt(fields[4])
                , Float.parseFloat(fields[5]), Integer.parseInt(fields[6]), Float.parseFloat(fields[7]), Integer.parseInt(fields[8])
                , Float.parseFloat(fields[9]), Integer.parseInt(fields[10]), Float.parseFloat(fields[11]), Float.parseFloat(fields[12]));
    }
}
