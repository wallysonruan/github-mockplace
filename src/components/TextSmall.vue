<script setup lang="ts">

export type TextMosaicItem =  {
    title: string;
    text: string;
};

export type TextMosaic = TextMosaicItem[];


defineProps<{ 
    textMosaic: TextMosaic,
    title: String
}>()

</script>

<template>
    <section>
        <h2>{{ title }}</h2>
        <hr>

        <div class="textmosaic__container">
            <div class="textmosaic__item" v-for="text in textMosaic" :key="text.title.slice(0,3)">
                <h3> {{text.title}}</h3>
                <p> {{text.text}} </p>
                <a href="#">Learn More</a>
            </div>
        </div>
    </section>
</template>

<style scoped>
.textmosaic__container{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
}

.textmosaic__item{
    width: 10rem;
    background-color: brown;
}
</style>
