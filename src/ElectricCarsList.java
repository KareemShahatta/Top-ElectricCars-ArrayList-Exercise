import java.util.ArrayList;

public class ElectricCarsList
{
    ArrayList<String> carModels  = new ArrayList<>();
    ArrayList<ElectricCar> carList    = new ArrayList<>();

    public static void main(String[] args) {

        ElectricCarsList cars = new ElectricCarsList();

        cars.populateCarModels();
        cars.printCarModels();

        cars.populateCars();
        cars.printCars();

    }


    void populateCarModels() {
        carModels.add("2021 Mini Electric Hardtop");
        carModels.add("2021 BMW i3");
        carModels.add("2022 Nissan Leaf");
        carModels.add("2021 Chevrolet Bolt EV");
        carModels.add("2022 Audi e-tron GT");
        carModels.add("2022 Polestar 2");
        carModels.add("2021 Porsche Taycan");
        carModels.add("2021 Tesla Model 3");
        carModels.add("2021 Tesla Model S");
    }
    void printCarModels()
    {
        System.out.println(carModels + "\n");
    }

    public void populateCars() {
        carList.add(new ElectricCar("2021 Mini Electric Hardtop", 29900, 110 , 8.9,1));
        carList.add(new ElectricCar("2021 BMW i3", 44450, 153, 7.2,2));
        carList.add(new ElectricCar("2022 Nissan Leaf", 27400, 226, 7.6,3));
        carList.add(new ElectricCar("2021 Chevrolet Bolt EV", 36500, 259, 8.1,4));
        carList.add(new ElectricCar("2022 Audi e-tron GT", 99900, 238, 8.5,5));
        carList.add(new ElectricCar("2022 Polestar 2", 45900, 265, 9.5,6));
        carList.add(new ElectricCar("2021 Porsche Taycan", 82700, 227, 8.7,7));
        carList.add(new ElectricCar("2021 Tesla Model 3", 44990, 353, 8.8,8));
        carList.add(new ElectricCar("2020 Tesla Model S", 94990, 412, 8.9,9));
    }
    void printCars() {
        System.out.println(carList.toString());
    }
}

class ElectricCar
{
    String modelName;
    double mfgPrice;
    int maxRange;
    double usNewsRating;
    int rank;

    public ElectricCar(String modelName, double mfgPrice, int maxRange, double usNewsRating, int rank) {
        this.modelName = modelName;
        this.mfgPrice = mfgPrice;
        this.maxRange = maxRange;
        this.usNewsRating = usNewsRating;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "modelName='" + modelName + '\'' +
                ", mfgPrice=" + mfgPrice +
                ", maxRange=" + maxRange +
                ", usNewsRating=" + usNewsRating +
                ", rank=" + rank +
                "\n";
    }

    public String getModelName()
    {
        return modelName;
    }
    public double getMfgPrice()
    {
        return mfgPrice;
    }
    public int getMaxRange()
    {
        return maxRange;
    }
    public double getUsNewsRating()
    {
        return usNewsRating;
    }
    public int getRank()
    {
        return rank;
    }
}
