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
    <div class="custom-card border-0">
        <div>
            <h3 class="custom-card-title">
                    {{product.title}}
                </h3>
                <p class="custom-card-text"> {{product.description}} </p>
            </div>
        </div>
    </a>
</template>

<style scoped>
a{
    text-decoration: none;
}
.custom-card{
    border-radius: 0%;
    height: 100%;

}
.custom-card-title{
    font-size: large;
    font-weight: 500;
    color: #0969da;
}
.custom-card-text{
    color: #656D76;
    font-size: medium;
}
</style>
