package edu.ucsd.cs110.temperature;

import com.sun.prism.impl.FactoryResetException;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*9)/5) + 32;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}