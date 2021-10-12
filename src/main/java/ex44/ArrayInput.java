package ex44;


import java.util.List;

class ArrayInput {
    List<Product> products;
    @Override
    public String toString() {
        return "ArrayInput [Product=" + products + "]";
    }
}
class Product {
    String name;
    float price;
    int quantity;
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price+ "\nQuantity: " +quantity+ "";
    }
}

