public class OrderApp {
    public static void main(String[] args) {

        Order normal = new NormalOrder(101, "Aadim", 1000);
        Order premium = new PremiumOrder(102, "Palpasa", 2000);

        System.out.println("---- NORMAL ORDER ----");
        System.out.println(normal);
        System.out.println("Final Amount: " + normal.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                normal.calculateFinalAmount(500));

        System.out.println("\n---- PREMIUM ORDER ----");
        System.out.println(premium);
        System.out.println("Final Amount: " + premium.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                premium.calculateFinalAmount(500));
    }
}
