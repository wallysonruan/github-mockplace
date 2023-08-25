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
    <a :href="product.url">
    <div class="card border-0">
        <div class="card-body">
            <h3 class="card-title">
                    {{product.title}}
                </h3>
                <p class="card-text"> {{product.description}} </p>
            </div>
        </div>
    </a>
</template>

<style scoped>
a{
    text-decoration: none;
}
.card{
    border-radius: 0%;
    min-height: 6rem;
}
.card-title{
    font-size: large;
    font-weight: 500;
    color: #0969da;
}
.card-text{
    color: #656D76;
}
</style>
