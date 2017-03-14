package com.cep.utils;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/3/3.
 */
public class BasicUtilsTest {


    @Test
    public void createDateDirTree() throws Exception {

    }

    @Test
    public void createDateDirTree1() throws Exception {

    }

    @Test
    public void getNewUserPassword() throws Exception {

    }

    @Test
    public void getShortRandomNumber() throws Exception {

    }

    @Test
    public void getLicRandomPartString() throws Exception {

    }

    @Test
    public void getCurrentAccurateDateTimeString() throws Exception {

    }

    @Test
    public void getCurrentAccurateDateTimeStringForPrint() throws Exception {

    }

    @Test
    public void getCurrentDateTimeString() throws Exception {

    }

    @Test
    public void getCurrentDateTimeString_Sql() throws Exception {

        System.out.println(BasicUtils.getCurrentDateTimeString_Sql());

    }
    @Test
    public void convas(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fromData =" Feb 1, 2017 11:58:35 AM";
        System.out.println(df.format(new Date("Feb 1, 2017 11:58:35 AM")));
    }

    @Test
    public void getCurrentDateString() throws Exception {

    }

    @Test
    public void getCurrentDateFormatString() throws Exception {
        System.out.println(BasicUtils.getCurrentDateFormatString());

    }

    @Test
    public void getCurrentSimpleDateTimeString() throws Exception {

    }

    @Test
    public void getCurrentTime() throws Exception {

    }

    @Test
    public void getTimeString() throws Exception {

    }

    @Test
    public void getSqlStringFromStringList() throws Exception {

    }

    @Test
    public void getSqlStringFromIntegerList() throws Exception {

    }

    @Test
    public void getDiffTime() throws Exception {

    }

    @Test
    public void createUploadDir() throws Exception {

    }

    @Test
    public void getNewFormId() throws Exception {

    }

    @Test
    public void getNewFormId_Long() throws Exception {

    }

    @Test
    public void getNewUserId() throws Exception {

    }

    @Test
    public void resetPageSelectInfo() throws Exception {

    }

    @Test
    public void length() throws Exception {

    }

    @Test
    public void parseSwVersionInfo() throws Exception {

    }

    @Test
    public void isMobileNo() throws Exception {

    }

}