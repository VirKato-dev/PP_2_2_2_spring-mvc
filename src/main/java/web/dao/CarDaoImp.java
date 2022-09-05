package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getListCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", 2000, 2.5));
        list.add(new Car("BMW", 1980, 1.3));
        list.add(new Car("Porche", 1996, 3.0));
        list.add(new Car("Nissan", 2010, 1.1));
        list.add(new Car("Lada", 2015, 1.5));
        return list;
    }
}
