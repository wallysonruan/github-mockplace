<script setup lang="ts">

// Loop used only for dev purpouses. Once the application is ready all the items will be hardcoded in HTML.
const items: string[] = ['Terms', 'Privacy', 'Security', 'Status', 'Docs', 'Contact GitHub', 'Pricing', 'API', 'Training', 'Blog', 'About']
</script>

<template>
    <footer>
        <div class="brand-container">
            <a aria-label="Homepage" title="Github" href="#">
                <img src="../assets/logo-github-gray.png" aria-hidden="true" width="24" height="24">
            </a>
            <span>
                <small>
                    &copy; 2023 GitHub, Inc.
                </small>
            </span>
        </div>
        <nav>
            <ul>
                <li v-for="item in items" :key="item">
                    <a href="">
                        <small>
                            {{ item }}
                        </small>
                    </a>
                </li>
            </ul>
        </nav>
    </footer>
</template>

<style scoped>
footer{
    display: flex;
    height: 2rem;
    padding-bottom: 0.5rem;
}

.brand-container{
    margin-left: 1rem;
    margin-right: 4rem;

    display: flex;

    color: #656D76;
}

.brand-container > a > img {
    margin-right: 0.5rem;
}

nav{
    width: 70%;
}

ul{
    padding: 0;

    display: flex;
    justify-content: space-between;
    align-content: space-between;
}

li{
    list-style: none;
}

a{
    text-decoration: none;
}

a:hover{
    text-decoration: underline;
}
</style>
