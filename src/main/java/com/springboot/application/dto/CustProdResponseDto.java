package com.springboot.application.dto;

public class CustProdResponseDto {
    private String proName;
    private String name;

    public CustProdResponseDto(String proName, String name) {
        this.proName = proName;
        this.name = name;
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
