package model;

import lombok.Data;

@Data
public class Goods {
    public int gid,gprice;
    public String gname,gdetails;
    private Integer types;
    private String gremain;
}
