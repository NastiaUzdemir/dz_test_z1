public class BonusMilesService {
    public int calculate(int price) {
        int bonusMiles = 0;
        if (price < 0) {
            System.out.println("Внимание! Цена билета не может быть отрицательной!");
        } else if (price % 20 != 0) {
            System.out.println("Внимание! Дробные мили не начисляются.");
        } else {
            bonusMiles = price / 20;
        }
        return bonusMiles;
    }
}
