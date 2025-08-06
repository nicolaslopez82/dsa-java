package functionalprogramming.challenger;

import java.util.List;

@FunctionalInterface
public interface IListCarsByPriceOrderByAscending {
    public List<Car> getCarsByPriceOrderByAscending (List<Car> carList);
}
