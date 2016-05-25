package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * Created by Admin on 25.05.2016.
 */
public class UserMealWithExceed {
    protected final LocalDateTime localDateTime;

    protected final String description;

    protected final int calories;

    protected final boolean exceed;

    public UserMealWithExceed(LocalDateTime localDateTime, String description, int calories, boolean exceed) {
        this.localDateTime = localDateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }
}
