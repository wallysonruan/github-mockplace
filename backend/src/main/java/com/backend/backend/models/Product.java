package com.backend.backend.models;

public class Product {
    private String title;
    private String publisher_name;
    private Boolean is_publisher_verified;
    private String description;
    private Boolean is_recommended;
    private int total_downloads;
    private String url;
    private String types;
    private String[] categories;

    private Product(builder builder){
        this.title = builder.title;
        this.description = builder.description;
        this.url = builder.url;
        this.types = builder.types;
        this.categories = builder.categories;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public Boolean getIs_publisher_verified() {
        return is_publisher_verified;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIs_recommended() {
        return is_recommended;
    }

    public int getTotal_downloads() {
        return total_downloads;
    }

    public String getUrl() {
        return url;
    }

    public String getTypes() {
        return types;
    }

    public String[] getCategories() {
        return categories;
    }

    public static class builder {

        private String title;
        private String publisher_name;
        private Boolean is_publisher_verified;
        private String description;
        private Boolean is_recommended;
        private int total_downloads;
        private String url;
        private String types;
        private String[] categories;

        public builder() {
        }

        public builder setPublisher_name(String publisher_name) {
            this.publisher_name = publisher_name;
            return this;
        }

        public builder setIs_publisher_verified(Boolean is_publisher_verified) {
            this.is_publisher_verified = is_publisher_verified;
            return this;
        }

        public builder setIs_recommended(Boolean is_recommended) {
            this.is_recommended = is_recommended;
            return this;
        }

        public builder setTotal_downloads(int total_downloads) {
            this.total_downloads = total_downloads;
            return this;
        }

        public builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public builder setTypes(String types) {
            this.types = types;
            return this;
        }

        public builder setCategories(String[] categories) {
            this.categories = categories;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
