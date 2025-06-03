package Furnitur;

/*
 * Since this is European furniture, it is measured in cm and kg
 *
 * */

public class Table {
    // Attributes - variable
    private double height;
    private double width;
    private double weight;
    private double price;
    private double length;

    // Default Constructor - Special method
    // name of the method = the name of the class
    public Table(){
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 936;
    }
    public Table(double height, double width, double weight, double price, double length){
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.length = length;
    }
    // Getters/Accessors
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
    public double getLength(){
        return length;
    }


    public void setHeight(double height){
        if (weight <= 1000) {
            this.weight = height;
        }else{
            this.weight = weight;
        }
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setLength(double length){
        this.length = length;
    }
}



