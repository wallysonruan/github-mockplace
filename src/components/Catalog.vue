<script setup lang="ts">
import { ProductItem } from './Product.vue';
import Product from './Product.vue';


const products: ProductItem[] = [
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

const benefits: ProductItem[] = [
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
        <div class="container">
            <div class="catalog__menu">
                <div>
                    <h2>Types</h2>
                    <ul>
                        <li>
                            <a href="#">Apps</a>
                            <a href="#">Actions</a>
                        </li>
                    </ul>
                </div>
                <div>
                    <h2>Categories</h2>
                    <ul>
                        <li>
                            <a href="#">AWS EKS</a>
                            <a href="#">S3</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="catalog__products-container">
                <section>
                    <h2>Products</h2>
                    <hr>
                    <Product :products="products"/>
                </section>
                <section>
                    <h2>Benefits</h2>
                    <hr>
                    <Product :products="benefits"/>
                </section>
            </div>
        </div>
</template>

<style scoped>
    .container{
        display: flex;
        flex-direction: row;
    }

    .container div{
        background-color: blue;
    }

    .catalog__menu{
        flex-grow: 1;
    }

    .catalog__products-container{
        flex-grow: 4;
        background-color: yellow;
    }
</style>
