public class Main {
public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 50, 1,50);
        basket.add("Water", 50, 5,1000);
        basket.add("Cherry", 150,20,225);
        basket.add("Apple", 80, 2,157.50);
        basket.print("Корзина №1");
        double totalWeight = basket.getTotalWeight();
        int totalCost = Basket.getTotalCost();
        int totalQuantity = Basket.getTotalQuantity();
        int averageProductPrice = Basket.getAverageProductPrice();
        int averageBasketPrice = Basket.getAverageBasketPrice();
        System.out.println("Общий вес корзины: " + totalWeight);
        System.out.println("Средняя цена товара: " + averageProductPrice);
        System.out.println("Средняя цена корзины: " + averageBasketPrice);
        System.out.println();

        Basket basket1 = new Basket();
        basket1.add("Cheese", 100, 6,120);
        basket1.add("Apple", 80, 2,157.50);
        basket1.print("Корзина №2");
        double totalWeight1 = basket1.getTotalWeight();
        int totalCost1 = Basket.getTotalCost();
        int totalQuantity1 = Basket.getTotalQuantity();
        int averageProductPrice1 = Basket.getAverageProductPrice();
        int averageBasketPrice1 = Basket.getAverageBasketPrice();
        System.out.println("Общий вес корзины :" + totalWeight1);
        System.out.println("Средняя цена товара:" + averageProductPrice1);
        System.out.println("Средняя цена корзины: " + averageBasketPrice1);
        System.out.println();

        Basket basket2 = new Basket();
        basket2.add("Apple", 200, 2,157.50);
        basket2.print("Корзина №3");
        double totalWeight2 = basket1.getTotalWeight();
        int totalCost2 = Basket.getTotalCost();
        int totalQuantity2 = Basket.getTotalQuantity();
        int averageProductPrice2 = Basket.getAverageProductPrice();
        int averageBasketPrice2 = Basket.getAverageBasketPrice();
        System.out.println("Общий вес корзины :" + totalWeight2);
        System.out.println("Средняя цена товара:" + averageProductPrice2);
        System.out.println("Средняя цена корзины: " + averageBasketPrice2);
        System.out.println();

        System.out.println("======================================");
        System.out.println();

        System.out.println("Общая стоимость всех корзин :" + totalCost2);
        System.out.println("Общее количество всех товаров в карзинах: " + totalQuantity2);
  }
}





