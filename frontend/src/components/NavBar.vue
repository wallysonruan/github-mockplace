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
            <li v-for="navOptions of navBarOptions" :key="navOptions.title">
                <RouterLink :to="navOptions.link">
                    {{ navOptions.title }}
                </RouterLink>
            </li>
        </ul>
    </nav>
</template>

