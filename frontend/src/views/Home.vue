<script setup lang="ts">
import Catalog from '../components/Catalog.vue';
import CatalogMenu from '../components/CatalogMenu.vue';
</script>

<template>
    <div class="home-container">
        <CatalogMenu />
        <Catalog products_url="http://localhost:8080/products" />
    </div>
</template>

<style scoped>
    .home-container{
        place-content: center;

        display: flex;
    }
</style>
