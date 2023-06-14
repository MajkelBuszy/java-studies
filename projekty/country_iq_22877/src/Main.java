import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ImportData importData = new ImportData();
        List<IqCountry> rankingIQ = importData.getRankingIQ();

        rankingIQ.forEach(System.out::println);

        List<IqCountry> filteredIqCountries = rankingIQ.stream()
                .filter(iqCountry -> iqCountry.getIq() >= 80 && iqCountry.getIq() <= 90)
                .collect(Collectors.toList());

        System.out.println("\nFiltrowane kraje (IQ od 80 do 90):");
        filteredIqCountries.forEach(System.out::println);
    }
}