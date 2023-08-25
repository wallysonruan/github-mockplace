package com.backend.backend.models;


public class Product {
    private String title;
    private String description;
    private String url;
    private String[] types;
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

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String[] getTypes() {
        return types;
    }

    public String[] getCategories() {
        return categories;
    }

    public static class builder {
        private String title;
        private String description;
        private String url;
        private String[] types;
        private String[] categories;

        public builder() {
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

        public builder setTypes(String[] types) {
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
