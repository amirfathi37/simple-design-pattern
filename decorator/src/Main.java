public class Main {
    public static void main(String[] args) {
        // Ordering a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());

        // Adding milk to the coffee
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + milkCoffee.getCost());
        System.out.println("Description: " + milkCoffee.getDescription());

        // Adding caramel to the coffee
        Coffee caramelMilkCoffee = new CaramelDecorator(milkCoffee);
        System.out.println("Cost: $" + caramelMilkCoffee.getCost());
        System.out.println("Description: " + caramelMilkCoffee.getDescription());
    }
}
