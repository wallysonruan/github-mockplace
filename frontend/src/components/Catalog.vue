<script setup lang="ts">
import axios from 'axios';
import { ProductItem } from './Product.vue';
import Product from './Product.vue';
import { Ref, onMounted, ref } from 'vue';

const props = defineProps<{ 
    products_url: string,
}>()

const products_to_display = ref<ProductItem[]>([])

async function getProducts(productsDisplay: Ref<ProductItem[]>): Promise<void> {
    try {
        const products = ( await axios.get(props.products_url) ).data;
        setProductsToDisplay(productsDisplay, products)
    }catch (error) {
        console.error(error);
  }
}

function setProductsToDisplay(productsDisplay: Ref<ProductItem[]>, products: ProductItem[]){
    products.forEach((product: ProductItem) => {
            productsDisplay.value.push(product)
        });
}

onMounted(() => {
    getProducts(products_to_display)
})

type menuOptions = {
    name: string;
    url: string
}

const types: menuOptions[] = [
    {
        name: 'Apps',
        url: ''
    },
    {
        name: 'Actions',
        url: ''
    }
]

const categories: menuOptions[] = [
    {
        name: 'API management',
        url: ''
    },
    {
        name: 'Chat',
        url: ''
    },
    {
        name: 'Code quality',
        url: ''
    }
]

</script>

<template>
        <div>
            <nav>
                <div>
                    <h2>Types</h2>
                    <ul v-for="type in types" :key="type.name">
                        <li>
                            <a :href="type.url">{{ type.name }}</a>
                        </li>
                    </ul>
                </div>
                <div>
                    <h2>Categories</h2>
                    <ul v-for="category in categories" :key="category.name">
                        <li>
                            <a :href="category.url">{{ category.name }}</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <div>
                <section>
                    <h2>Apps</h2>
                    <hr>
                    <div>
                        <div v-for="product in products_to_display" :key="product.title.slice(0,3)">
                            <Product :product="product"/>
                        </div>
                    </div>
                    <br>
                    <br>
                    <a href="#">View All&nbsp;&nbsp;&nbsp;></a>
                </section>
            </div>
        </div>
</template>
