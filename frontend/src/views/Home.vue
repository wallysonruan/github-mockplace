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
    }

    .catalog-grid{
        flex-grow: 2;
    }
    .catalog-menu{
        flex-grow: 1;
    }
</style>
