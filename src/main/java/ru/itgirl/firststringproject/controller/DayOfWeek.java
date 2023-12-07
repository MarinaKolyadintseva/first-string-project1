package ru.itgirl.firststringproject.controller;

public class DayOfWeek {

    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public static DayOfWeek SUNDAY = new DayOfWeek("Воскресенье");
    public static DayOfWeek MONDAY = new DayOfWeek("Понедельник");
    public static DayOfWeek TUESDAY = new DayOfWeek("Вторник");
    public static DayOfWeek WEDNESDAY = new DayOfWeek("Среда");
    public static DayOfWeek THURSDAY = new DayOfWeek("Четверг");
    public static DayOfWeek FRIDAY = new DayOfWeek("Пятница");
    public static DayOfWeek SATURDAY = new DayOfWeek("Суббота");

    @Override
    public String toString() {
        return "Сегодня{" +
                "='" + title + '\'' +
                '}';
    }
}

