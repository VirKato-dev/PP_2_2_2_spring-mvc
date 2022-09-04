package service;

import list.CarList;
import model.Car;

import java.util.List;

public class CarService {

    public static List<Car> getCars(int count) {
        return CarList.getCars().stream().limit(count).toList();
    }
}
