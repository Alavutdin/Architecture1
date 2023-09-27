package lesson.task2.pattern.fabric;

import lesson.task2.pattern.inteface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();
    public void openReward(){
        createItem().open();
    }

}
