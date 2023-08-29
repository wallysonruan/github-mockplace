<script setup lang="ts">
import { ProductItem } from './Product.vue';
import Product from './Product.vue';

defineProps<{ 
    applications: ProductItem[];
    actions: ProductItem[];
}>()
</script>

<template>
    <div>
        <section>
            <h2>Apps</h2>
            <div class="products-container">
                <div class="apps-container">
                    <div class="product" v-for="application in applications" :key="application.title.slice(0,3)">
                        <Product :product="application"/>
                    </div>
                </div>
                <br>
                <a href="#">View all&nbsp;&nbsp;&nbsp;></a>
            </div>
        </section>
        <section>
            <h2>Apps</h2>
            <div class="products-container">
                <div class="apps-container">
                    <div class="product" v-for="action in actions" :key="action.title.slice(0,3)">
                        <Product :product="action"/>
                    </div>
                </div>
                <br>
                <a href="#">View all&nbsp;&nbsp;&nbsp;></a>
            </div>
        </section>
    </div>
</template>

<style scoped>
.apps-container{
    display: flex;
    flex-wrap: wrap;
}

section:first-child{
    margin-bottom: 2rem;
}

.product{
    width: 50%;
    box-sizing: border-box;
}

a{
    text-decoration: none;
}
a:hover{
    text-decoration: underline;
}

@media (max-width: 600px){
    .product{
        width: 100%;
    }
}
</style>