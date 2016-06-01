package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Admin on 25.05.2016.
 */

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500), // 30 мая 2015 года 10-00
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),   // 30 мая 2015 года 13-00
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),    // 30 мая 2015 года 20-00
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),// 31 мая 2015 года 10-00
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),    // 31 мая 2015 года 13-00
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)     // 30 мая 2015 года 20-00
        );
        List<UserMealWithExceed> list = getFilteredMealsWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
        list.forEach(System.out::println);
    }

    public static List<UserMealWithExceed> getFilteredMealsWithExceeded
            (List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {

        List<UserMealWithExceed> userMealWithExceedList = new ArrayList<>();

        Map<LocalDate, Integer> caloriesPerDayMap =
                mealList.stream().
                collect(Collectors.groupingBy(um -> um.getLocalDateTime().toLocalDate(),
                        Collectors.summingInt(UserMeal::getCalories)));

        mealList.stream()
                .filter(um -> (um.getLocalDateTime().toLocalTime().isAfter(startTime)) &&
                        (um.getLocalDateTime().toLocalTime().isBefore(endTime)))
                .forEach(um -> userMealWithExceedList.add(
                        new UserMealWithExceed(
                                um.getLocalDateTime(),
                                um.getDescription(),
                                um.getCalories(),
                                caloriesPerDayMap.get(um.getLocalDateTime().toLocalDate()) > caloriesPerDay
                )));

        return userMealWithExceedList;
    }
}











