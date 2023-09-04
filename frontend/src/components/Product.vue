<script setup lang="ts">
import { computed } from 'vue';


export type ProductItem =  {
    title: string;
    publisher_name: string;
    is_publisher_verified: boolean;
    description: string;
    is_recommended: boolean;
    total_downloads: number;
    total_stars: number;
    url: string;
    type: string;
    categories: string[];
};

const props = defineProps<{ 
    product: ProductItem,
}>()

function format_numbers(total: number): number | string{
    const total_bigint = total;
    const total_str = total_bigint.toString()
   
    if (total_bigint == 1000){
        return `1k`
    }
    
    if ( total_bigint > 1000 && (total_bigint % 1000) > 0){
        return `${total_str.charAt(0)}.${total_str.charAt(1)}k`
    }

    if ( total_bigint > 1000 && (total_bigint % 1000) <= 0){
        return `${total_str.charAt(0)}k`
    }
    return total_bigint
}

const total_stars = computed(() => {
    return format_numbers(props.product.total_stars)
})

</script>

<template>
    <div>
        <a :href="product.url" class="product">
            <div class="product__image">
                <img src="" alt="">
            </div>
            <div class="product__details border-0">
                <div>
                    <h3 class="product-title">
                        {{product.title}}
                    </h3>

                    <div v-if="product.type === 'APP'">
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
                        <p class="product-text">
                            {{product.description}}
                        </p>
                        <span v-if="product.is_recommended" class="is_recommended">
                            Recommended
                        </span>
                        <span v-else class="total-downloads">
                            <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-download color-fg-muted">
                                <path d="M2.75 14A1.75 1.75 0 0 1 1 12.25v-2.5a.75.75 0 0 1 1.5 0v2.5c0 .138.112.25.25.25h10.5a.25.25 0 0 0 .25-.25v-2.5a.75.75 0 0 1 1.5 0v2.5A1.75 1.75 0 0 1 13.25 14Z"></path><path d="M7.25 7.689V2a.75.75 0 0 1 1.5 0v5.689l1.97-1.969a.749.749 0 1 1 1.06 1.06l-3.25 3.25a.749.749 0 0 1-1.06 0L4.22 6.78a.749.749 0 1 1 1.06-1.06l1.97 1.969Z"></path>
                            </svg>
                            &nbsp;&nbsp;{{product.total_downloads}} installs
                        </span>
                    </div>

                    <div v-else>
                        <div class="publisher-container">
                            <p class="publisher-name">
                                <small>
                                    By {{ product.publisher_name }}
                                </small>
                            </p>
                            <p class="publisher-is-verified" v-if="product.is_publisher_verified">
                                <span id="boot-icon" class="bi bi-patch-check custom-patch-check"></span>
                                <small>
                                    Creator verified by Mockplace
                                </small>
                            </p>
                        </div>
                        <p class="product-text">
                            {{product.description}}
                        </p>
                        <span class="total-stars">
                            <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-star color-fg-muted">
                                <path d="M8 .25a.75.75 0 0 1 .673.418l1.882 3.815 4.21.612a.75.75 0 0 1 .416 1.279l-3.046 2.97.719 4.192a.751.751 0 0 1-1.088.791L8 12.347l-3.766 1.98a.75.75 0 0 1-1.088-.79l.72-4.194L.818 6.374a.75.75 0 0 1 .416-1.28l4.21-.611L7.327.668A.75.75 0 0 1 8 .25Zm0 2.445L6.615 5.5a.75.75 0 0 1-.564.41l-3.097.45 2.24 2.184a.75.75 0 0 1 .216.664l-.528 3.084 2.769-1.456a.75.75 0 0 1 .698 0l2.77 1.456-.53-3.084a.75.75 0 0 1 .216-.664l2.24-2.183-3.096-.45a.75.75 0 0 1-.564-.41L8 2.694Z"></path>
                            </svg>
                            &nbsp;{{ total_stars }} stars
                        </span>
                    </div>
                </div>
            </div>
        </a>
    </div>
</template>

<style scoped>
a{
    text-decoration: none;
}
p{
    margin: 0%;
}
.product {
    display: flex;
}

.product__image {
    margin-right: 1rem;
}
.product__image > img{
    border-radius: 50%;
    width: 56px;
    height: 56px;

    background-color: black;
}
.product__details{
    height: 100%;
    margin-bottom: 1rem;
}
.product-title{
    color: var(--default-blue);
    font-size: large;
    font-weight: 500;
    margin: 0;
}
.product-text{
    color: #656D76;
    font-size: 0.9rem;
    margin: 0;
}
.publisher-container{
    display: flex;
    color: #656D76;
    font-size: small;
    margin: 0%;
}
.custom-patch-check{
    color: var(--default-blue);
    margin-right: 0.1rem;
}

.publisher-name{
    margin-right: 1ch;
}

.is_recommended{
    border: 0.3px solid #656D76;
    border-radius: 10%/60%;
    padding: 3px 7px;
}

.total-downloads, .total-stars{
    display: flex;
    align-items: center;
}

.is_recommended, .total-downloads, .total-stars{
    font-weight: 600;
    font-size: 12px;
    color: #656D76;
}
</style>
