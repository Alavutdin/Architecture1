package lesson.task2.pattern.fabric;

import lesson.task2.pattern.inteface.iGameItem;
import lesson.task2.pattern.product.PotionReward;

public class PotionGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new PotionReward();
    }
}
