<script setup lang="ts">

export type ProductItem =  {
    title: string;
    publisher_name: string;
    is_publisher_verified: boolean;
    description: string;
    is_recommended: boolean;
    total_downloads: bigint;
    url: string;
    type: string;
    categories: string[];
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
            <div class="publisher-container">
                <p class="publisher-name">
                    <span id="boot-icon" class="bi bi-patch-check custom-patch-check"></span>
                    <small>
                        By {{ product.publisher_name }}
                    </small>
                </p>
                <p class="publisher-is-verified" v-if="product.is_publisher_verified">
                    <span id="boot-icon" class="bi bi-patch-check custom-patch-check"></span>
                    <small>
                        Publisher domain and email verified
                    </small>
                </p>
            </div>
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
    height: 100%;
}
.custom-card-title{
    color: #0969da;
    font-size: large;
    font-weight: 500;
    margin: 0;
}
.custom-card-text{
    color: #656D76;
    font-size: medium;
}
.publisher-container{
    display: flex;
    color: #656D76;
}
.custom-patch-check{
    color: #0969da;
    margin-right: 0.5rem;
}
</style>
