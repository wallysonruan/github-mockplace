<script setup lang="ts">

const navBarOptions = [
    {
        title: "Home",
        link: "/"
    },
    {
        title: "Documentation",
        link: "/docs"
    },
    {
        title: "About",
        link: "/about"
    }
]

</script>

<template>
    <nav>
        <ul>
            <li v-for="navOptions of navBarOptions" :class="navOptions.title">
                <RouterLink :to="navOptions.link">
                    {{ navOptions.title }}
                </RouterLink>
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
