package lesson.task1.architect.ModelElements;

import lesson.task1.architect.Service.Point3D;

import java.util.ArrayList;
import java.util.List;


public class Poligon {
    public List<Point3D> points=new ArrayList<>();

    /**
     * Конструктор
     * @param point
     */
    public Poligon(Point3D point){

        points.add(point);
    }


}
