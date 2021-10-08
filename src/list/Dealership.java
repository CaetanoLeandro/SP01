package list;

public class Dealership {


    private Integer numberId;
    private String brandModel;
    private Double vehiclesValue;


    public Dealership() {
        
    }

    public Dealership(Integer numberId, String brandModel, Double value) {
        this.brandModel = brandModel;
        this.numberId = numberId;
        this.vehiclesValue = value;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Double getValue() {
        return vehiclesValue;
    }

    public void setValue(Double value) {
        this.vehiclesValue = value;
    }

    public void discountValue(double percentage) {
        vehiclesValue -= vehiclesValue * percentage / 100.0;
    }


    public String toString() {
        return numberId + ", " + brandModel + ", " + String.format("%.2f", vehiclesValue);
    }
}
