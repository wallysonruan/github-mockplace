<script setup lang="ts">
</script>

<template>
    <header>
        <img class="header__image" src="../assets/images/header-img-github.svg" alt="">
        <div class="text">
            <h1>Extend GitHub</h1>
            <p>Find tools to improve your workflow</p>
        </div>
        <div class="buttons">
            <button>
                Explore free apps
            </button>
            <button>
                Contact Sales
            </button>
        </div>
    </header>
</template>

<style scoped>
header{
    height: 17rem;
    padding-top: 3.5rem;
    padding-left: 2rem;
    padding-bottom: 0.5rem;

    display: flex;
    flex-direction: column;
    
    justify-content: center;

    background-color: white;
}

.header__image{
    display: none;
    position: absolute;
    top: -5.5%;
    right: 3%;
    min-width: 91.19%;
    width: 91.19%;
    height: 91%;
    max-height: 95%;
}

h1 {
    font-size: 2rem;
    font-weight: 1rem;
}
.text > p {
    color: #656D76;
    font-size: 1.3rem;
}

button{
    height: 2.8rem;
    padding: 0.5rem 1rem;
    background-color: rgb(101, 109, 118, 0.06);
    border: 0.5px rgb(101, 109, 118, 0.5) solid;
    border-radius: 8px;
}

.buttons{
    width: 100%;
    display: flex;
    gap: 1rem;
}

@media (max-width: 1000px){
    header {
        height: 12rem;
        padding-top: 1.5rem;
    }

    .header__image{
        top: -9%;
        right: -7%;
        height: 47%;
    }
}
</style>