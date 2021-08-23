package com.example.product;



class List_data {
    private String product_image;
    private String image_base_path;

    public List_data(String name, String imageurl) {
        this.product_image = name;
        this.image_base_path = imageurl;
    }

    public String getName() {
        return product_image;
    }

    public String getImageurl() {
        return image_base_path;
    }
}
