package lesson.task1.architect.ModelElements;

import lesson.task1.architect.Service.Angle3D;
import lesson.task1.architect.Service.Point3D;

/**
 * Класс камер
 */
public class Camera {
    public Point3D location;
    public Angle3D angle;

    /**
     *Поворот камеры на угол
     * "param angleAction
     */
    public void Rotate(Angle3D angleAction){
    }
    /**
     *Перемещение камеры к точке
     * "param pointAction
     */
    public void Move(Point3D pointAction){
    }
}
