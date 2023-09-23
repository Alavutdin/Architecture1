package lesson.task1.architect.InMemoryModel;

import lesson.task1.architect.ModelElements.*;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public ModelStore(IModelChangedObserver[] changedObservers) throws Exception {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        scenes.add(new Scene(0, models, flashes,cameras));
        flashes.add(new Flash());
        cameras.add(new Camera());
    }

    public List <PoligonalModel> models;
    public List <Scene> scenes;
    public List <Flash> flashes;
    public List <Camera> cameras;

    private IModelChangedObserver[]changedObservers;

    /**
     * Возвращает scene по ID
     *
     * @parameters ID
     * returns
     * */
    public Scene getScene(int id){
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id==id){
                return scenes.get(i);
            }
        }
        return null;
    }

    // Регистрирует изменения модели
    @Override
    public void notifyChange(IModelChanger sender) {
        //
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }
}
