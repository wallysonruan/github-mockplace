<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
import Banner from '../components/Banner.vue';
</script>

<template>
    <div class="home-container">
        <div class="catalog">
            <CatalogMenu class="catalog-menu" />
            <Catalog class="catalog-grid" products_url="http://localhost:8080/products" />
        </div>
        <Banner />
    </div>
</template>

<style scoped>
    .home-container{
        padding: 0 12%;

        background-color: rgb(31, 35, 56, 0.05); /* #1F2338, original color  */
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
</style>
