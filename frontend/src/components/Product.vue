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
        <h3> {{product.title}}</h3>
        <p> {{product.description}} </p>
        <a :href="product.url">Learn More</a>
    </div>
</template>
