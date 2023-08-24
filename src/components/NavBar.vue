<script setup lang="ts">

const navBarOptions = [
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
            <li v-for="navOptions of navBarOptions" :class="navOptions.title">
                <a :href="navOptions.link">
                    {{ navOptions.title }}
                </a>
            </li>
        </ul>
    </nav>
</template>

<style scoped>

nav{
    border-bottom: 1px black solid;
}

ul{
    display: flex;
    padding: 0;
}

li{
    margin-right: 2.5rem;

    list-style: none;
    text-align: center;
}
</style>
