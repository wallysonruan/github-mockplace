<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
import Banner from '../components/Banner.vue';
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

        <div class="home-container">
            <header>
                <div class="header__text-container">
                    <h1 class="header__title">Extend GitHub</h1>
                    <p class="header__subtitle">Find tools to improve your workflow</p>
                </div>
                <div class="header__buttons-container">
                    <button class="header__button">
                        Explore free apps
                    </button>
                    <button class="header__button">
                        Contact Sales
                    </button>
                </div>
            </header>


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

    header{
        position: relative;
        z-index: 1;

        height: 17rem;
        padding-bottom: 2.5rem;
        
        display: flex;
        flex-direction: column;
        justify-content: flex-end;
    }
    
    header::before{
        position: absolute;
        z-index: -1;
        width: 100vw;
        height: 100%;
        content: ' ';

        top: 0%;
        left: -50%;

        padding-top: 3.5rem;
        background-color: white;
    }

    .header__image{
        display: none;
        position: absolute;
        top: -5.5%;
        right: 3%;
        min-width: 91.19%;
        width: 91.19%;
        height: 91%;
        max-height: 95%;
    }

    .header__title {
        font-size: 2rem;
        font-weight: 1rem;
    }
    .header__subtitle {
        color: #656D76;
        font-size: 1.3rem;
    }

    .header__buttons-container{
        width: 100%;
        display: flex;
        gap: 1rem;
    }

    .header__button {
        height: 2.8rem;
        padding: 0.5rem 1rem;
        background-color: rgb(101, 109, 118, 0.06);
        border: 0.5px rgb(101, 109, 118, 0.5) solid;
        border-radius: 8px;
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
        header {
        height: 12rem;
        padding-top: 1.5rem;
        }

        .header__image{
            top: -9%;
            right: -7%;
            height: 47%;
        }
        .catalog-menu{
            display: none;
        }

        .catalog-grid{
            width: 100%;
        }
    }
</style>