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

const filter_by: string = "Best Match"
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
                    <button type="button" class="header__button">
                        Explore free apps
                    </button>
                    <button type="button" class="header__button">
                        Contact Sales
                    </button>
                </div>
            </header>


            <div class="catalog">
                <CatalogMenu class="catalog-menu" />
                <div class="catalog-grid">

                    <div class="catalog__search-bar">
                        <div>
                            <i class="bi bi-search search-bar__search-icon"></i>
                            <input type="search" name="" id="" class="search-bar__bar">
                        </div>
                        <button type="button" class="search-bar__button">
                            <span class="search-bar__button--label">Sort:</span> <span class="search-bar__button--filter">{{ filter_by }}</span>
                            <!--Arrow down icon-->
                            <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-triangle-down">
                                <path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path>
                            </svg>
                        </button>
                    </div>

                    <Catalog :applications="applications_products" :actions="actions_products" />
                </div>
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

    .header__text-container{
        margin-bottom: 1.5rem;
    }

    .header__title {
        font-size: 2rem;
        font-weight: 500;
    }
    .header__subtitle {
        color: #656D76;
        font-size: 1.3rem;
        font-weight: 400;
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

        font-weight: 400;
    }
    
    .catalog{
        display: flex;
        justify-content: space-evenly;

        padding-top: 3rem;
    }

    .catalog-menu{
        width: 20%;
    }

    .catalog__search-bar{
        width: 100%;
        padding: 1rem 0.5rem;
        padding-top: 0%;

        display: flex;
        justify-content: space-evenly;
    }

    .search-bar__bar{
        width: 70%;
    }

    .search-bar__button {
        padding: 0.5rem 1rem;
        background-color: rgb(101, 109, 118, 0.06);
        border: 0.5px rgb(101, 109, 118, 0.5) solid;
        border-radius: 8px;
    }

    .search-bar__button--label {
        font-size: small;
        color: #656D76;
    }

    .search-bar__button--filter {
        font-size: 0.9rem;
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