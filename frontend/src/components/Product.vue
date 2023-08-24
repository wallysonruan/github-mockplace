<script setup lang="ts">

export type ProductItem =  {
    title: string;
    description: string;
    url: string;
    types: string[];
    categories: string[]
};

defineProps<{ 
    product: ProductItem,
}>()

</script>

<template>
    <div class="product">
        <h3 class="product__title"> {{product.title}}</h3>
        <p class="product__description"> {{product.description}} </p>
        <a :href="product.url">Learn More</a>
    </div>
</template>

<style scoped>
    .product{
        width: 100%;
        padding: 1rem;
    }
    
    .product__description{
        max-width: 35ch;
        max-height: 5ch;
        white-space: nowrap;
        overflow: hidden;
        text-overflow: ellipsis;
    }

    .product__title{
        max-width: 35ch;
        margin: 0;
    }
</style>
