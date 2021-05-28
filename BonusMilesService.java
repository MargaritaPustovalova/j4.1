public class BonusMilesService {
    public int calculate (int price) {
        int bonus = price / 20;
        System.out.println(bonus);
        return bonus;
    }
}
