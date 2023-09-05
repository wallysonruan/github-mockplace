<script setup lang="ts">

type option = {
    title: string,
    url: string
}

const options: option[] = [
    {
        title: "Home",
        url: "dashboard"
    },
    {
        title: "Issues",
        url: "Issues"
    },
    {
        title: "Pull requests",
        url: "pulls"
    },
    {
        title: "Discussions",
        url: "discussions"
    },
    ]

const repositories: string[] = [
    'wallysonruanTW/real-state-prices',
    'tecnologia-acessivel/programa-inclua',
    'wallysonruanTW/timesheetCalculator',
    'wallysonruanTW/gilded-rose-kata',
    'wallysonruanTW/Tennis-Refactoring'
]

const teams: string[] = [
    'tecnologia-acessivel/ta-atuacaointerna'
]

const footerOptions: string[] = [
    'Explore',
    'Mockplace',
    'Give new navigation feedback'
]

const footerMoreOptions: string[] = [
    'About',
    'Blog',
    'Terms',
    'Privacy',
    'Security',
    'Status'
]
</script>

<template>
    <aside class="menu-container">
        <div class="top">
            <div>
                <div class="brand__logo">

                </div>
                <div class="button__close">
                    <button type="button">
                        
                    </button>
                </div>
            </div>
            <nav>
                <ul>
                    <li v-for="option in options" :key="option.title">
                        <a :href="option.url">
                            {{ option.title }}
                        </a>
                    </li>
                </ul>
            </nav>
            <hr>
            <section>
                <div class="section-header">
                    <span>Repositories</span>
                    <i class="bi bi-search search-bar__search-icon"></i>
                </div>
                <nav>
                    <ul>
                        <li v-for="repository in repositories" :key="repository">
                            <a :href="repository">
                                {{ repository }}
                            </a>
                        </li>
                    </ul>
                </nav>
                <button type="button">Show more</button>
            </section>
            <hr>
            <section>
                <div class="section-header">
                    <span>Teams</span>
                    <i class="bi bi-search search-bar__search-icon"></i>
                </div>
                <nav>
                    <ul>
                        <li v-for="team in teams" :key="team">
                            <a :href="team">
                                {{ team }}
                            </a>
                        </li>
                    </ul>
                </nav>
            </section>
            <hr>
        </div>
        <!---->
        <footer>
            <div>
                <li v-for="option in footerOptions" :key="option">
                    <a :href="option">
                        {{ option }}
                    </a>
                </li>
            </div>
            <div>
                <span>
                    @ 2023 Mockplace, Inc.
                </span>
                <ul>
                    <li v-for="option in footerMoreOptions" :key="option">
                        <a :href="option">
                            {{ option }}
                        </a>
                    </li>
                </ul>
            </div>
        </footer>
    </aside>
</template>

<style scoped>

a, a:visited{
    text-decoration: none;
    color: black;
}

li{
    list-style: none;
}

.menu-container{
    position: absolute;
    z-index: 2;

    display: flex;
    flex-direction: column;
    justify-content: space-between;

    height: 100vh;
    padding: 1rem;

    background-color: white;
    border-top-right-radius: 20px;
    border-bottom-right-radius: 20px;

    top: 0%;
    left: 0%;
}

.top{

}

section{
    margin-bottom: 1rem;
}

.section-header{
    display: flex;
    justify-content: space-between;
}
</style>