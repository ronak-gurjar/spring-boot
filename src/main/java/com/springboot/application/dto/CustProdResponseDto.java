package com.springboot.application.dto;

public class CustProdResponseDto {
    private String proName;
    private String name;
    private String city;

    public CustProdResponseDto(String name, String proName, String city) {
        this.proName = proName;
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
