package com.ride.testingform.Helper;

/**
 * Created by Admin on 2/2/2017.
 */

public class StringWithTag {
    public String string;
    public Integer id;
    public Integer tag;

    public StringWithTag(String string, Integer id, Integer tag) {
        this.string = string;
        this.id = id;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return string;
    }
}
