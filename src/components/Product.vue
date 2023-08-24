<script setup lang="ts">

export type ProductItem =  {
    title: string;
    text: string;
};

defineProps<{ 
    product: ProductItem,
}>()

</script>

<template>
    <div class="product">
        <h3 class="product__title"> {{product.title}}</h3>
        <p> {{product.text}} </p>
        <a href="#">Learn More</a>
    </div>
</template>

<style scoped>
    .product{
        width: 100%;
        padding: 1rem;
        background-color: brown;
    }

    .product__title{
        margin: 0;
    }
</style>
