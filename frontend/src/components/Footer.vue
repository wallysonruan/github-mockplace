<script setup lang="ts">

// Loop used only for dev purpouses. Once the application is ready all the items will be hardcoded in HTML.
const items: string[] = ['Terms', 'Privacy', 'Security', 'Status', 'Docs', 'Contact GitHub', 'Pricing', 'API', 'Training', 'Blog', 'About']
</script>

<template>
    <footer>
        <div class="brand-container">
            <a aria-label="Homepage" title="Github" href="#">
                <img class="brand-container__image" src="../assets/images/logo-github-gray.png" aria-hidden="true" width="24" height="24">
            </a>
            <span>
                &copy; 2023 Mockplace, Inc.
            </span>
        </div>

        <nav>
            <ul>
                <li v-for="item in items" :key="item">
                    <a href="">
                        {{ item }}
                    </a>
                </li>
            </ul>
        </nav>
    </footer>
</template>

<style scoped>
footer{
    display: flex;
    align-items: center;
    padding: 1rem;
    padding-bottom: 3rem;

    font-size: small;
}

.brand-container{
    width: max-content;
    margin-left: 13rem;
    margin-right: 1.5rem;

    display: flex;
    align-items: center;

    color: #656D76;
    word-wrap: unset;
}

.brand-container__image {
    margin-right: 0.5rem;
}

nav {
    width: 50%;
}

nav > ul {
    display: flex;
    justify-content: space-between;
}

li {
    list-style: none;
}

a, a:visited {
    color: var(--default-blue);
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
