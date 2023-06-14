import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ImportData {
    public List<IqCountry> getRankingIQ() {
        List<IqCountry> rankingIQ = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/iq_ranking.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int place = Integer.parseInt(data[0].trim());
                String country = data[1].trim();
                int iq = Integer.parseInt(data[2].trim());
                rankingIQ.add(new IqCountry(place, country, iq));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rankingIQ;
    }
}
