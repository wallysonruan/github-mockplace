<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
</script>

<template>
    <div class="home-container">
        <CatalogMenu class="catalog-menu" />
        <Catalog class="catalog-grid" products_url="http://localhost:8080/products" />
    </div>
</template>

<style scoped>
    .home-container{
        display: flex;
        width: 80%;
        margin: auto;
    }

    .catalog-grid{
        width: 80%;
    }

    .catalog-menu{
        width: 20%;
    }
</style>
