package com.cep.entity.self.protocol;

import java.sql.Timestamp;

public class SelfInfoRsp
{
    private String    breakFirst;
    private String    lunch;
    private Timestamp in;
    private Timestamp out;
    private double     temperature;

    public String getBreakFirst()
    {
        return breakFirst;
    }

    public void setBreakFirst(String breakFirst)
    {
        this.breakFirst = breakFirst;
    }

    public String getLunch()
    {
        return lunch;
    }

    public void setLunch(String lunch)
    {
        this.lunch = lunch;
    }

    public Timestamp getIn()
    {
        return in;
    }

    public void setIn(Timestamp in)
    {
        this.in = in;
    }

    public Timestamp getOut()
    {
        return out;
    }

    public void setOut(Timestamp out)
    {
        this.out = out;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }

}
