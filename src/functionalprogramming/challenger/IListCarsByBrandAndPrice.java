package functionalprogramming.challenger;

import java.util.List;

@FunctionalInterface
public interface IListCarsByBrandAndPrice {
    int getCarsByPriceOrderByAscending (List<Car> cars);
}
