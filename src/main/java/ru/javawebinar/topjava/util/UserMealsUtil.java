package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;

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
        for (UserMealWithExceed userMealWithExceed : list){
            System.out.println(userMealWithExceed);
        }
//        .toLocalDate();
//        .toLocalTime();
    }

    public static List<UserMealWithExceed> getFilteredMealsWithExceeded
            (List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {  // Works with Time without Date

        // TODO return filtered list with correctly exceeded field

        List<UserMealWithExceed> userMealWithExceedList = new ArrayList<>();

        Map<LocalDate, Integer> caloriesPerDayMap = new HashMap<>();

        for (UserMeal userMeal : mealList) {
            LocalDate dateFromDateTime = userMeal.getLocalDateTime().toLocalDate();
            if (caloriesPerDayMap.containsKey(dateFromDateTime)) {
                caloriesPerDayMap.put(dateFromDateTime, caloriesPerDayMap.get(dateFromDateTime) + userMeal.getCalories());
            } else {
                caloriesPerDayMap.put(dateFromDateTime, userMeal.getCalories());
            }
        }
        for (UserMeal userMeal : mealList) {
            LocalTime timeFromDateTime = userMeal.getLocalDateTime().toLocalTime();
            LocalDate dateFromDateTime = userMeal.getLocalDateTime().toLocalDate();
            if (timeFromDateTime.isAfter(startTime) && timeFromDateTime.isBefore(endTime)) {
                LocalDateTime localDateTime = userMeal.getLocalDateTime();
                String description = userMeal.getDescription();
                int calories = userMeal.getCalories();
                boolean exceed = caloriesPerDayMap.get(dateFromDateTime) > caloriesPerDay;
                UserMealWithExceed userMealWithExceed = new UserMealWithExceed(localDateTime, description, calories, exceed);
                userMealWithExceedList.add(userMealWithExceed);
            }
        }
        return userMealWithExceedList;
    }
}

/*
Реализовать UserMealsUtil.getFilteredMealsWithExceeded:
-  должны возвращаться только записи между startTime и endTime
-  поле UserMealWithExceed.exceed должно показывать,
                                     превышает ли сумма калорий за весь день параметра метода caloriesPerDay

Т.е UserMealWithExceed - это запись одной еды, но поле exceeded будет одинаково для всех записей за этот день.

- Проверте результат выполнения ДЗ (можно проверить логику в http://topjava.herokuapp.com , список еды)
- Оцените Time complexity вашего алгоритма, если он O(N*N)- попробуйте сделать O(N).
 */












