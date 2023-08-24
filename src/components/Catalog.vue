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
    }

    .catalog__menu{
        flex-grow: 1;
    }

    .catalog{
        flex-grow: 4;
        background-color: yellow;
    }

    .catalog__grid{
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
    }

    .catalog__item{
        flex-grow: 1;

        display: flex;
        flex-direction: row;
        justify-content: space-around;
    }
</style>
