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
ul{
    width: 100%;
    height: 100%;
}

nav{
    display: flex;
    flex-direction: column;
    align-items: center;
    border-bottom: 1px black solid;
}

ul{
    display: flex;
    flex-direction: row;
}

li{
    width: 7rem;

    list-style: none;
    text-align: center;
}
</style>
