<script setup lang="ts">
import axios from 'axios';
import { ProductItem } from './Product.vue';
import Product from './Product.vue';
import { Ref, onMounted, ref } from 'vue';

async function getAndProcessProducts(productsDisplay: Ref<ProductItem[]>): Promise<void> {
    try {
        const response = await axios.get("http://localhost:8080/products");

        response.data.forEach((product: ProductItem) => {
            productsDisplay.value.push(product)
        });
    }catch (error) {
        console.error(error);
  }

}

const products = ref<ProductItem[]>([])

onMounted(() => {
    getAndProcessProducts(products)
})

type menuOptions = {
    name: string;
    url: string
}

const types: menuOptions[] = [
    {
        name: 'Apps',
        url: ''
    },
    {
        name: 'Actions',
        url: ''
    }
]

const categories: menuOptions[] = [
    {
        name: 'API management',
        url: ''
    },
    {
        name: 'Chat',
        url: ''
    },
    {
        name: 'Code quality',
        url: ''
    }
]

</script>

<template>
        <div class="container">
            <nav class="catalog__menu">
                <div>
                    <h2>Types</h2>
                    <ul v-for="type in types" :key="type.name">
                        <li class="menu__item">
                            <a :href="type.url">{{ type.name }}</a>
                        </li>
                    </ul>
                </div>
                <div>
                    <h2>Categories</h2>
                    <ul v-for="category in categories" :key="category.name">
                        <li class="menu__item">
                            <a :href="category.url">{{ category.name }}</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="catalog">
                <section>
                    <h2>Products</h2>
                    <hr>
                    <div class="catalog__grid">
                        <div class="catalog__item" v-for="product in products" :key="product.title.slice(0,3)">
                            <Product :product="product"/>
                        </div>
                    </div>
                    <br>
                    <br>
                    <a href="#">View All&nbsp;&nbsp;&nbsp;></a>
                </section>
            </div>
        </div>
</template>

<style scoped>
    .container{
        display: flex;
        flex-direction: row;
        align-content: center;

        margin: auto;
        width: max-content;
    }

    .catalog__menu{
        min-width: 20vh;
        padding-left: 1rem;

        background-color:burlywood;
    }

    .catalog__menu ul{
        padding: 0;
    }

    .catalog__menu ul li{
        list-style: none;
    }

    .catalog{
        flex-grow: 2;
        min-width: 70vh;
        background-color:cadetblue;
    }

    .catalog__grid{
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
    }

    .catalog__item{
        width: 50%;

        display: flex;
        flex-direction: row;
        justify-content: space-around;
    }
</style>
