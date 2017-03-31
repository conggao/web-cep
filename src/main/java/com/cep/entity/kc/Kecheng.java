package com.cep.entity.kc;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by pc on 2017/3/24.
 */
public class Kecheng {
    public List<KC> getKecheng() {
        return kecheng;
    }

    public void setKecheng(List<KC> kecheng) {
        this.kecheng = kecheng;
    }

    List<KC> kecheng;
    public static class KC{
        Timestamp startTime;
        Timestamp endTime;
        String name;
        int day;

        public Timestamp getStartTime() {
            return startTime;
        }

        public void setStartTime(Timestamp startTime) {
            this.startTime = startTime;
        }

        public Timestamp getEndTime() {
            return endTime;
        }

        public void setEndTime(Timestamp endTime) {
            this.endTime = endTime;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }
}
