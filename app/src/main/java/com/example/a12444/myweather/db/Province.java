package com.example.a12444.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 12444 on 2018/2/7.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
