package com.dav.javacore.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("vn","VN"));

        //ResourceBundle resourcebundle = ResourceBundle.getBundle("demoResource_en_US");
        ResourceBundle resourcebundle = ResourceBundle.getBundle("demoResource_vn_VN");

        //print out value of username
        System.out.println( resourcebundle.getString("username"));
    }
}
