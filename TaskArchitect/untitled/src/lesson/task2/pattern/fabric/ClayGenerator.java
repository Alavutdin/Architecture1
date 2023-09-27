package lesson.task2.pattern.fabric;

import lesson.task2.pattern.inteface.iGameItem;
import lesson.task2.pattern.product.ClayReward;

public class ClayGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new ClayReward();
    }
}
