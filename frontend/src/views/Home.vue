<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
import Banner from '../components/Banner.vue';
import Header from '../components/Header.vue';
import NavBar from '../components/NavBar.vue';
import Footer from '../components/Footer.vue';


import { ref, Ref, onMounted } from 'vue';
import { ProductItem } from '../components/Product.vue';
import axios from 'axios';

const applications_list_url = "http://localhost:8080/products?type=APP"
const actions_list_url = "http://localhost:8080/products?type=ACTION"
const applications_products = ref<ProductItem[]>([])
const actions_products = ref<ProductItem[]>([])

async function getProducts(list_of_products: Ref<ProductItem[]>, products_url: string): Promise<void> {
    try {
        const products: ProductItem[] = ( await axios.get(products_url) ).data;
        setListOfProducts(list_of_products, products)
    }catch (error) {
        console.error(error);
  }
}

function setListOfProducts(productsDisplay: Ref<ProductItem[]>, products: ProductItem[]){
    products.forEach((product: ProductItem) => {
            productsDisplay.value.push(product)
    });
}

onMounted(() => {
    getProducts(applications_products, applications_list_url)
    getProducts(actions_products, actions_list_url)
})
</script>

<template>
    <div class="home-background">
        <NavBar />
        <Header />

        <div class="home-container">
            <div class="catalog">
                <CatalogMenu class="catalog-menu" />
                <Catalog class="catalog-grid" :applications="applications_products" :actions="actions_products" />
            </div>
            <Banner class="banner"/>
        </div>

        <Footer />
    </div>
</template>

<style scoped>
    .home-background{
        background-color: rgb(31, 35, 56, 0.05); /* #1F2338, original color  */
        width: 100%;
    }

    .home-container{
        width: 50%;
        margin: auto;
    }
    
    .catalog{
        display: flex;
        justify-content: space-evenly;
    }

    .catalog-menu{
        width: 20%;
    }

    .catalog-grid{
        width: 80%;
    }

    @media (max-width: 1000px) {
        .catalog-menu{
            display: none;
        }

        .catalog-grid{
            width: 100%;
        }
    }
</style>