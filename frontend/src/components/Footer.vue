<script setup lang="ts">

// Loop used only for dev purpouses. Once the application is ready all the items will be hardcoded in HTML.
const items: string[] = ['Terms', 'Privacy', 'Security', 'Status', 'Docs', 'Contact GitHub', 'Pricing', 'API', 'Training', 'Blog', 'About']
</script>

<template>
    <footer>
        <div class="brand-container">
            <a aria-label="Homepage" title="Github" href="#">
                <img src="../assets/images/logo-github-gray.png" aria-hidden="true" width="24" height="24">
            </a>
            <span>
                &copy; 2023 Mockplace, Inc.
            </span>
        </div>
        <nav>
            <a href="" v-for="item in items" :key="item">
                {{ item }}
            </a>
        </nav>
    </footer>
</template>

<style scoped>
footer{
    display: flex;
    padding: 1rem;
    margin-left: 20%;

    font-size: small;
}

.brand-container{
    margin-right: 4rem;

    display: flex;
    align-items: center;

    color: #656D76;
}

.brand-container > a > img {
    margin-right: 0.5rem;
}

nav {
    height: 100%;
}

li:not(:last-child){
    margin-right: 1rem;
}

a:not(:last-child) {
    margin-right: 2rem;
}

a {
    text-decoration: none;
}

a:hover{
    text-decoration: underline;
}

@media (max-width: 1000px){
    footer{
        flex-direction: column;
        flex-flow: column-reverse;
        align-items: center;

        height: max-content;
        padding-bottom: 3.5rem;
    }

    .brand-container{
        margin-right: 0;
    }
}
</style>
