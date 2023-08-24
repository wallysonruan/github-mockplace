<script setup lang="ts">
import { ProductItem } from './Product.vue';
import Product from './Product.vue';


const products: ProductItem[] = [
    {
        title: "Hacking Abilities",
        description: "Get infinity gossip information! Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
        url: "#"
    },
    {
        title: "Love",
        description: "Be loved for eternity!",
        url: "#"
    },
    {
        title: "Self-steem",
        description: "Be the most self-steemed person in the Universe.",
        url: "#"
    }
]

const benefits: ProductItem[] = [
    {
        title: "Cheap",
        description: "Pay using dollar, the prices are in Real.",
        url: "#"
    },
    {
        title: "Anonimity",
        description: "No one cares about what you do on the web.",
        url: "#"
    }
]

</script>

<template>
        <div class="container">
            <nav class="catalog__menu">
                <div>
                    <h2>Types</h2>
                    <ul>
                        <li class="menu__item">
                            <a href="#">Apps</a>
                        </li>
                        <li class="menu__item">
                            <a href="#">Actions</a>
                        </li>
                    </ul>
                </div>
                <div>
                    <h2>Categories</h2>
                    <ul>
                        <li class="menu__item">
                            <a href="#">AWS EKS</a>
                            <a href="#">S3</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <div class="catalog">
                <section>
                    <h2>Products</h2>
                    <hr>
                    <div class="catalog__grid">
                        <div class="catalog__item" v-for="product in products" :key="product.title.slice(0,3)">
                            <Product :product="product"/>
                        </div>
                    </div>
                    <br>
                    <br>
                    <a href="#">View All&nbsp;&nbsp;&nbsp;></a>
                </section>
                <section>
                    <h2>Benefits</h2>
                    <hr>
                    <div class="catalog__grid">
                        <div class="catalog__item" v-for="benefit in benefits" :key="benefit.title.slice(0,3)">
                            <Product :product="benefit"/>
                        </div>
                    </div>
                    <br>
                    <br>
                    <a href="#">View All&nbsp;&nbsp;&nbsp;></a>
                </section>
            </div>
        </div>
</template>

<style scoped>
    .container{
        display: flex;
        flex-direction: row;

        margin: auto;
        width: max-content;
    }

    .catalog__menu{
        min-width: 20ch;
        padding-left: 1rem;
    }

    .catalog__menu ul{
        padding: 0;
    }

    .catalog__menu ul li{
        list-style: none;
    }

    .catalog{
        flex-grow: 2;
    }

    .catalog__grid{
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
    }

    .catalog__item{
        width: 50%;

        display: flex;
        flex-direction: row;
        justify-content: space-around;
    }
</style>
