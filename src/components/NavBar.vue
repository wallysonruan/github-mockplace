<script setup lang="ts">

const navNames = [
    {
        title: "Products",
        link: "#"
    },
    {
        title: "Documentation",
        link: "#"
    },
    {
        title: "About",
        link: "#"
    }
]

</script>

<template>
    <nav>
        <ul>
            <li> <!---Blank space--></li>
            <li v-for="navName of navNames" :class="navName.title">
                <a :href="navName.link">
                    {{ navName.title }}
                </a>
            </li>
        </ul>
    </nav>
    <div class="outdoor">
        <a :href="navNames[0].link">
            {{ navNames[0].title }}&nbsp;&nbsp;/
        </a>
        <p class="outdoor__title">
            Service Catalog
        </p>
        <p class="outdoor__text">
            All products are awesome.
        </p>
    </div>
</template>

<style scoped>
nav{
    width: 100%;
}

ul{
    display: flex;
    flex-direction: row;

    background-color: red;
}

li{
    width: 7rem;

    list-style: none;
    text-align: center;
    
    background-color: blueviolet;
}

.outdoor{
    background-color: brown;
}

.outdoor__title{
    font-size: 3rem;
    font-weight: 600;

    margin-bottom: 1.5rem;
}

.outdoor__text{
    font-weight: 400;
}
</style>
