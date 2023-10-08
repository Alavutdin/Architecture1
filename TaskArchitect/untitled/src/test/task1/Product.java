package test.task1;

public abstract class Product {
    private String coffee;
    private int temp;

    public Product(String coffee, int temp) {
        this.coffee = coffee;
        this.temp = temp;
    }


    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
