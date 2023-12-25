public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        System.out.println("------------");
        System.out.println(service.calculate(10_000));

        System.out.println("------------");
        System.out.println(service.calculate(20));

        System.out.println("------------");
        System.out.println(service.calculate(10));

        System.out.println("------------");
        System.out.println(service.calculate(-10));

        System.out.println("------------");
        System.out.println(service.calculate(-100));

    }
}