<script setup lang="ts">

</script>

<template>
    <nav class="custom-navbar">
        <div class="left">
            <!--Hamburguer menu-->
            <button type="button">
                <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                    <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                </svg>
            </button>

            <a href="#" class="brand__logo">
                <img src="../assets/logo-github.png" alt="Github" width="32" height="32">
            </a>
            <span class="brand__name">
                Mockplace
            </span>
        </div>

        <div class="right">
            <div>
                <button type="button" class="search-bar__container">
                    <i class="bi bi-search"></i>
                    <span class="search-bar__text">
                        Type <kbd>/</kbd> to search
                    </span>
                </button>
                <button type="button">
                    
                </button>
            </div>

            <button type="button" class="button__profile"></button>
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
    border-bottom: 0.5px solid rgb(101, 109, 118, 0.5);
}

.left, .right{
    width: 50%;
    display: flex;
}

.left{
    gap: 1rem;
    align-items: center;
}

.right{
    justify-content: flex-end;
    gap: 0.5rem;
}

.search-bar__container{
    text-align: start;
    width: 20rem;
}

.search-bar__container > i{
    margin: 0 0.5rem;
}

.search-bar__text{
    font-size: 0.9rem;
}

kbd{
    color: black;
    background-color: transparent;
    border: 1px rgb(101, 109, 118, 0.5) solid;
    padding: 1px;
}

button{
    width: 2rem;
    height: 2rem;
    border: 1px rgb(101, 109, 118, 0.5) solid;
    border-radius: 7px;
}

.brand__name{
    color: #1F2328;
    font-size: 0.9rem;
    font-weight: 600;
}

.button__profile{
    border-radius: 50%;
    background-image: url("../assets/profile-avatar.png");
    background-repeat: no-repeat;
}

a {
    text-decoration: none;
}
a:hover {
    text-decoration: underline;
}
</style>