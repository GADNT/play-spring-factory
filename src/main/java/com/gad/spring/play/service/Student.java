package com.gad.spring.play.service;

public class Student {

    private String name;
    private int collegeYear;

    public Student(String name, int collegeYear) {
        this.name = name;
        this.collegeYear = collegeYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollegeYear() {
        return collegeYear;
    }

    public void setCollegeYear(int collegeYear) {
        this.collegeYear = collegeYear;
    }

    public enum CollegeYearEnum {
        YEAR_FIRST(1, "I"),
        YEAR_SECOND(2, "II"),
        YEAR_Third(2, "III"),
        YEAR_FOUR(2, "IV");

        private int year;

        private String yearRoman;

        CollegeYearEnum(int year, String yearRoman) {
            this.year = year;
            this.yearRoman = yearRoman;
        }

        public int getYear() {
            return year;
        }

        public String getYearRoman() {
            return yearRoman;
        }
    }
}
