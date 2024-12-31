package Booking;

import Users.User;
import Car.Car;

import java.time.LocalDateTime;
import java.util.UUID;

public class CarBooking {
    private UUID bookingId;
    private User user;
    private Car car;
    private LocalDateTime bookingTime;
    private boolean isCancelled;


    public CarBooking(UUID bookingId, User user, Car car, LocalDateTime bookingTime, boolean isCancelled) {
        this.bookingId = bookingId;
        this.user = user;
        this.car = car;
        this.bookingTime = bookingTime;
        this.isCancelled = isCancelled;
    }
}
