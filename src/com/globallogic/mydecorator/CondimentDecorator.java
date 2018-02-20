package com.globallogic.mydecorator;

import com.globallogic.mybeverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
