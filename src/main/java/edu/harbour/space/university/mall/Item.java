package edu.harbour.space.university.mall;

public class Item {
    double price;
    String name;
    int number;
    Item(String name, int number, double price){
        this.name=name;
        this.price=price;
        this.number=number;

    }
    void increaseNumber(int number){
        this.number+=number;
    }
    void decreaseNumber(int number){
        this.number-=number;
    }
    void setPrice(double price) {
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
