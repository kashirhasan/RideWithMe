package com.ride.testingform.Model;

/**
 * Created by Admin on 1/30/2017.
 */

public class DishSpecification extends BaseModel {
    public String Image;
    public Menu Menus;

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Menu getMenus() {
        return Menus;
    }

    public void setMenus(Menu menus) {
        Menus = menus;
    }
}
