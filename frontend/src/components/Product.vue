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
                <p class="custom-card-text">
                    {{product.description}}
                </p>
                <span v-if="product.is_recommended" class="is_recommended">
                    Recommended
                </span>
                <span class="total_downloads">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-star" viewBox="0 0 16 16">
                        <path d="M2.866 14.85c-.078.444.36.791.746.593l4.39-2.256 4.389 2.256c.386.198.824-.149.746-.592l-.83-4.73 3.522-3.356c.33-.314.16-.888-.282-.95l-4.898-.696L8.465.792a.513.513 0 0 0-.927 0L5.354 5.12l-4.898.696c-.441.062-.612.636-.283.95l3.523 3.356-.83 4.73zm4.905-2.767-3.686 1.894.694-3.957a.565.565 0 0 0-.163-.505L1.71 6.745l4.052-.576a.525.525 0 0 0 .393-.288L8 2.223l1.847 3.658a.525.525 0 0 0 .393.288l4.052.575-2.906 2.77a.565.565 0 0 0-.163.506l.694 3.957-3.686-1.894a.503.503 0 0 0-.461 0z"/>
                    </svg>
                    &nbsp;{{product.total_downloads}} stars
                </span>
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
    margin-bottom: 1rem;
}
.custom-card-title{
    color: #0969da;
    font-size: large;
    font-weight: 500;
    margin: 0;
}
.custom-card-text{
    color: #656D76;
    font-size: 0.9rem;
    margin: 0;
}
.publisher-container{
    display: flex;
    color: #656D76;
    font-size: small;
}
.custom-patch-check{
    color: #0969da;
    margin-right: 0.1rem;
}

.publisher-name{
    margin-right: 1ch;
}

.is_recommended{
    border: 0.3px solid #656D76;
    border-radius: 10%/60%;
}

.is_recommended, .total_downloads{
    font-weight: 600;
    font-size: 12px;
    color: #656D76;
    padding: 3px 7px;
}

.total_downloads{
    display: flex;
    align-items: center;
}
</style>
