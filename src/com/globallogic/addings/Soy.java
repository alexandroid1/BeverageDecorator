package com.globallogic.addings;

import com.globallogic.mybeverage.Beverage;
import com.globallogic.mydecorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return .15 + beverage.cost();
    }
}
