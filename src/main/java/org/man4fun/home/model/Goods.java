package org.man4fun.home.model;

import lombok.*;

@Data
public class Goods {
    private String name;
    private int sales;

    public Goods() {}

    public Goods(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

}
