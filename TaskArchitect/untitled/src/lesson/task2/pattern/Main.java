package lesson.task2.pattern;

import lesson.task2.pattern.fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> fabrics = initFabrics();

        for (int i = 0; i < 200; i++) {
            // Выбрасываем вес шанса (0 <= вес < 1)
            int index = random.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }
    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            fabrics.add(new SilverGenerator());
            fabrics.add(new ClayGenerator());
            fabrics.add(new LeatherGenerator());
            fabrics.add(new PotionGenerator());
        }

        return fabrics;
    }
}
