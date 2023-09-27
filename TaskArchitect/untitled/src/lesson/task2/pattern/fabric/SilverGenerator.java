package lesson.task2.pattern.fabric;

import lesson.task2.pattern.inteface.iGameItem;
import lesson.task2.pattern.product.GemReward;
import lesson.task2.pattern.product.SilverReward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
