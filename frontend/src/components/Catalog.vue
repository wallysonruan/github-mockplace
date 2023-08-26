<script setup lang="ts">
import axios from 'axios';
import { ProductItem } from './Product.vue';
import Product from './Product.vue';
import { Ref, onMounted, ref } from 'vue';

const props = defineProps<{ 
    products_url: string,
}>()

const products_to_display = ref<ProductItem[]>([])

async function getProducts(productsDisplay: Ref<ProductItem[]>): Promise<void> {
    try {
        const products = ( await axios.get(props.products_url) ).data;
        setProductsToDisplay(productsDisplay, products)
    }catch (error) {
        console.error(error);
  }
}

function setProductsToDisplay(productsDisplay: Ref<ProductItem[]>, products: ProductItem[]){
    products.forEach((product: ProductItem) => {
            productsDisplay.value.push(product)
        });
}

onMounted(() => {
    getProducts(products_to_display)
})
</script>

<template>
    <section>
        <h2>Apps</h2>
        <div class="products-container">
            <div class="apps-container">
                <div class="product" v-for="product in products_to_display" :key="product.title.slice(0,3)">
                        <Product :product="product"/>
                </div>
            </div>
            <br>
            <a href="#">View All&nbsp;&nbsp;&nbsp;></a>
        </div>
    </section>
</template>

<style scoped>
.apps-container{
    display: flex;
    flex-wrap: wrap;
}

.product{
    width: 50%;
    box-sizing: border-box;
}
</style>