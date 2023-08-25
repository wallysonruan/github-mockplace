<script setup lang="ts">

export type ProductItem =  {
    title: string;
    description: string;
    url: string;
    types: string[];
    categories: string[]
};

defineProps<{ 
    product: ProductItem,
}>()

</script>

<template>
    <div>
        <h3>
            <a :href="product.url">
                {{product.title}}
            </a>
        </h3>
        <p> {{product.description}} </p>
    </div>
</template>
