import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private String brand;
    private String countryOfOrigin;
    private LocalDate bottlingDate;
    private String description;

    public static void main(String[] args) {

    }

    public Wine() {
    }

    public Wine(String name, String brand, String countryOfOrigin, LocalDate bottlingDate, String description) {
        this.name = name;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.bottlingDate = bottlingDate;
        this.description = description;
    }

    public void aging() {
        Period agingPeriod = Period.between(bottlingDate, LocalDate.now());
        System.out.println("Выдержка " + agingPeriod.getYears() + " года.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public LocalDate getBottlingDate() {
        return bottlingDate;
    }

    public void setBottlingDate(LocalDate bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
