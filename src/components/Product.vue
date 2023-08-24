<script setup lang="ts">

export type ProductItem =  {
    title: string;
    text: string;
};


defineProps<{ 
    products: ProductItem[],
}>()

</script>

<template>
    <div class="product__container">
        <div class="container__item" v-for="product in products" :key="product.title.slice(0,3)">
            <h3> {{product.title}}</h3>
            <p> {{product.text}} </p>
            <a href="#">Learn More</a>
        </div>
    </div>
</template>

<style scoped>
.product__container{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
}

.container__item{
    width: 10rem;
    background-color: brown;
}
</style>
