package com.example.botanichandbook;

public class Plant {

    private String name;
    private String plantDescription;
    private int plantResource;

    public Plant(String name, String plantDescription, int plantResource)
    {
        this.name = name;
        this.plantDescription = plantDescription;
        this.plantResource = plantResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public int getPlantResource() {
        return plantResource;
    }

    public void setPlantResource(int plantResource) {
        this.plantResource = plantResource;
    }
}
