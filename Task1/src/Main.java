import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine newWine = new Wine("Vita", "Kry", "BY", LocalDate.of(2001, 06, 04), "");
        System.out.println(newWine.getBrand() + " " + newWine.getName() + " " + newWine.getBottlingDate() + " " + newWine.getCountryOfOrigin());
        newWine.aging();
    }
}