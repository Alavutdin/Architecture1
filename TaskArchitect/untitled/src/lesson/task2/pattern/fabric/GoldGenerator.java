package lesson.task2.pattern.fabric;

import lesson.task2.pattern.inteface.iGameItem;
import lesson.task2.pattern.product.GemReward;
import lesson.task2.pattern.product.GoldReward;

public class GoldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
