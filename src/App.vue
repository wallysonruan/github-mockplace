<script setup lang="ts">
import NavBar from './components/NavBar.vue'
import TextSmall from './components/TextSmall.vue';
import { TextMosaic} from './components/TextSmall.vue';

const products: TextMosaic = [
    {
        title: "Hacking Abilities",
        text: "Get infinity gossip information!"
    },
    {
        title: "Love",
        text: "Be loved for eternity!"
    },
    {
        title: "Self-steem",
        text: "Be the most self-steemed person in the Universe."
    }
]

const benefits: TextMosaic = [
    {
        title: "Cheap",
        text: "Pay using dollar, the prices are in Real."
    },
    {
        title: "Anonimity",
        text: "No one cares about what you do on the web."
    }
]

</script>

<template>
    <NavBar />
    <TextSmall title="Products" :text-mosaic="products"/>
    <TextSmall title="Benefits" :text-mosaic="benefits"/>
</template>

<style scoped>
body{
    width: 100%;
    height: 100%;
}
</style>
