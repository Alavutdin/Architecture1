package lesson.task2.pattern.product;

public class GoldReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("\u001B[0m" + "Gold!" + "\u001B[0m");
    }
}
