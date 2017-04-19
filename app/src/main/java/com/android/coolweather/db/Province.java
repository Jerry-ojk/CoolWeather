package com.android.coolweather.db;

import org.litepal.crud.DataSupport;
import java.lang.String;

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private  int provinceCore;
    public int getId(){
        return id;
    }
    public void setId( int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int  getProvinceCore(){
        return provinceCore;
    }
    public void setProvinceCore(int provinceCore){
        this.provinceCore=provinceCore;
    }

}
