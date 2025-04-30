abstract  class Product {
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    abstract void showInfo();

}
interface ExpressDelivery{
    void expressInfo();

}
class ElectronicProduct extends Product implements ExpressDelivery{
    ElectronicProduct(String name, double price){
        super(name, price);
    }

    @Override
    void showInfo() {
        System.out.println("Electronic : " + name + " - $" + price);

    }

    @Override
    public void expressInfo() {
        System.out.println("Eligible for express delivery in 24h.");
    }
}
class ClothingProduct extends Product implements ExpressDelivery{
    ClothingProduct(String name, double price){
        super(name, price);

    }

    @Override
    void showInfo() {
        System.out.println("Clothing : " + name + " - $ " + price);
    }

    @Override
    public void expressInfo() {
        System.out.println("Eligible for express delivery in 12h");
    }
}
class FoodProduct extends Product {
    FoodProduct(String name, double price){
        super(name, price);
    }

    @Override
    void showInfo() {
        System.out.println("Food" + name + " - $ " + price);
    }
}
class Order{
    Product product;
    int quantity;

    Order(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    void showOrderDetails(){
        product.showInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + (product.price * quantity));
        if (product instanceof ExpressDelivery){
            ((ExpressDelivery) product).expressInfo();
        }
        System.out.println("--------------");
    }
}
public class OnlineStoreOrders {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(new ElectronicProduct("Asus Zenbook", 1600),1),
                new Order(new ClothingProduct("T-shirt Nike",50), 3),
                new Order(new FoodProduct("Pizza Quattro Stagioni",10),3)
        };
        for (Order order : orders){
            order.showOrderDetails();
        }
    }
}