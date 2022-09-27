package model;

import lombok.Data;

@Data
public class Userorder {
    public int id,number,price;
    public String goodsname,time;
    private Integer uid;
}
