<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
import Banner from '../components/Banner.vue';
import AnotherBanner from '../components/AnotherBanner.vue';
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
        <AnotherBanner />
        <div class="home-container">
            <div class="catalog">
                <CatalogMenu class="catalog-menu" />
                <Catalog class="catalog-grid" :applications="applications_products" :actions="actions_products" />
            </div>
            <Banner />
        </div>
        <Footer />
    </div>
</template>

<style scoped>
    .home-background{
        background-color: rgb(31, 35, 56, 0.05); /* #1F2338, original color  */
    }

    .home-container{
        padding: 5rem 20.5rem 0 20.5rem;
    }
    
    .catalog{
        display: flex;
    }

    .catalog-grid{
        width: 80%;
    }

    .catalog-menu{
        width: 20%;
    }

    @media (max-width: 600px) {
        .catalog-menu{
            display: none;
        }

        .catalog-grid{
            width: 100%;
        }
    }
</style>