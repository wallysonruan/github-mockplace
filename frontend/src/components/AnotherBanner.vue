<script setup lang="ts">
</script>

<template>
    <header>
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
    padding-left: 20.5rem;

    display: flex;
    flex-direction: column;
    
    justify-content: center;

    background-color: white;
}

h1 {
    font-size: 2rem;
    font-weight: 1rem;
}
.text > p {
    color: #656D76;
    font-size: 1.3rem;
}

.buttons{
    width: 100%;
    display: flex;
    gap: 1rem;
}

button{
    padding: 0.5rem 1rem;
    background-color: rgb(101, 109, 118, 0.06);
    border: 0.5px rgb(101, 109, 118, 0.5) solid;
    border-radius: 8px;
}
</style>