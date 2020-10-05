package web.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl {

    public List<Car> createCars(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ferari", 12, 1991));
        carList.add(new Car("Lada", 9, 1844));
        carList.add(new Car("Kia", 9, 2001));
        carList.add(new Car("RolsRoys", 30, 2009));
        carList.add(new Car("Oka", 2, 1990));
        return carList;
    }



    public List<Car> getCars(List<Car> carList, int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(carList.get(i));
        }
        return list;
    }
}
