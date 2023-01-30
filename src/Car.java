public class Car {

    private int id;
    private String name;
    private double prices;
    private int noOfSit;
//    private String

    public Car(int id,String name,double prices,int noOfSit ){
        this.id=id;
        this.name=name;
        this.prices=prices;
        this.noOfSit=noOfSit;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getNoOfSit() {
        return noOfSit;
    }

    public void setNoOfSit(int noOfSit) {
        this.noOfSit = noOfSit;
    }




}
