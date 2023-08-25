<script setup lang="ts">

import NavBar from './components/NavBar.vue'

</script>

<template>
    <div class="section">
        <div class="container">
            <NavBar />
            <RouterView />
        </div>
    </div>
</template>

<style>
    body{
        margin: 0;
        padding: 0;
    }
</style>
