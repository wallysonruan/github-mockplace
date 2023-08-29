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
                &copy; 2023 GitHub, Inc.
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
    justify-content: center;
    padding: 1rem;

    font-size: small;
}

.brand-container{
    margin-right: 4rem;

    display: flex;

    color: #656D76;
}

.brand-container > a > img {
    margin-right: 0.5rem;
}

ul{
    padding: 0;

    display: flex;
    justify-content: space-between;
    align-content: space-between;
    gap: 0.5rem;
}


li{
    list-style: none;
}
li:not(:last-child){
    margin-right: 1rem;
}

a{
    text-decoration: none;
}

a:hover{
    text-decoration: underline;
}

@media (max-width: 600px){
    footer{
        flex-direction: column;
        flex-flow: column-reverse;
        align-items: center;

        height: max-content;
    }
}
</style>
