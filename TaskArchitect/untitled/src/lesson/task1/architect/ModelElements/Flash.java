package lesson.task1.architect.ModelElements;

import lesson.task1.architect.Service.Angle3D;
import lesson.task1.architect.Service.Point3D;
/**
 * Class источников света
 * */
public class Flash {
    public Point3D location;
    public Angle3D angle;
    public java.awt.Color color;
    public float Power;

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
