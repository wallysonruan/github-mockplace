<script setup lang="ts">

</script>

<template>
    <nav class="custom-navbar">
        <div>
            <!--Hamburguer menu-->
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>

            <a href="#" class="custom-navbar__brand-logo">
                <img src="../assets/logo-github.png" alt="Github" width="32" height="32">
            </a>
            <span class="custom-navbar__brand-name">
                Marketplace
            </span>
        </div>

        <div>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
            <button type="button" class="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>
        </div>
    </nav>
</template>

<style scoped>
.custom-navbar{
    width: 100%;
    height: 4rem;
    padding: 0 1rem;

    display: flex;
    justify-content: space-between;
    align-items: center;
}

.button{
    width: 2rem;
    height: 2rem;
    border: 1px gray solid;
    border-radius: 7px;
}

.button__icon{
    width: 1rem;
}

a {
    text-decoration: none;
}
a:hover {
    text-decoration: underline;
}

.custom-navbar__brand-name{
    color: #1F2328;
    font-size: 0.9rem;
    font-weight: 600;
}
</style>