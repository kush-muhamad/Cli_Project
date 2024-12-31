package Car;

import java.math.BigDecimal;

public class CarDao {
    private static final Car[] CARS = {
            new Car("23030", new BigDecimal("88"), Brand.HYBRID, true)
};

    public Car[] getCars() {
        return CARS;
    }
}
