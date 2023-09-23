package lesson.task1.architect.InMemoryModel;
// Интерфейс смены модели

public interface IModelChanger {
    public void notifyChange(IModelChanger sender);
}
