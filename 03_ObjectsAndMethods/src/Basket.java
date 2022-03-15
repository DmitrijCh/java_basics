public class Basket {
    private static int count = 0;
    private String items;
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static int totalCost = 0;
    private static int totalQuantity = 0;


    public Basket() {
        increaseTotalCost(0);
        increaseTotalQuantity(0);
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    public static void increaseTotalCost(int totalCost) {
        Basket.totalCost = Basket.totalCost + totalCost;
    }

    public static int getTotalQuantity() {
        return totalQuantity;
    }

    public static void increaseTotalQuantity(int totalQuantity) {
        Basket.totalQuantity = Basket.totalQuantity + totalQuantity;
    }

    public static int getAverageProductPrice() {
        return totalCost / totalQuantity ;
    }

    public static int getAverageBasketPrice() {
        return totalCost / count  ;
    }

    public void add(String name, int price) {
        add(name, price, 1,1);
    }

    public void add(String name, int price, double weight) {
        add("", 1,1, weight);
    }

    public void add(double weight, String name, int price, int count) {
        add("", 1, count, 1);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                price + " руб. - " + count + " шт. - " + weight + " гр ";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;
        totalCost = totalCost + price;
        totalQuantity = totalQuantity + count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
        totalCost = 0;
        totalQuantity = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
