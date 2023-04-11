package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    private String getModel() {
        return model;
    }

    private String getColor() {
        return color;
    }

    private int getYear() {
        return year;
    }

    private double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
