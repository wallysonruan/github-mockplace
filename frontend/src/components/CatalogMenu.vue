<script setup lang="ts">
type menuOptions = {
    name: string;
    url: string
}

const types: menuOptions[] = [
    {
        name: 'Apps',
        url: ''
    },
    {
        name: 'Actions',
        url: ''
    }
]

const categories: menuOptions[] = [
    {
        name: 'API management',
        url: ''
    },
    {
        name: 'Chat',
        url: ''
    },
    {
        name: 'Code quality',
        url: ''
    },
    {
        name: 'Code review',
        url: ''
    },
    {
        name: 'Continuous integration',
        url: ''
    },
    {
        name: 'Dependency management',
        url: ''
    },
    {
        name: 'Deployment',
        url: ''
    },
    {
        name: 'IDEs',
        url: ''
    },
    {
        name: 'Learning',
        url: ''
    },
    {
        name: 'Localization',
        url: ''
    },
    {
        name: 'Mobile',
        url: ''
    },
    {
        name: 'Monitoring',
        url: ''
    },
    {
        name: 'Project management',
        url: ''
    },
    {
        name: 'Publishing',
        url: ''
    },
    {
        name: 'Recently added',
        url: ''
    },
    {
        name: 'Security',
        url: ''
    },
    {
        name: 'Support',
        url: ''
    },
    {
        name: 'Testing',
        url: ''
    },
    {
        name: 'Utilities',
        url: ''
    }
]
</script>

<template>
    <nav>
        <div>
            <h2>Types</h2>
            <ul v-for="type in types" :key="type.name">
                <li>
                    <a :href="type.url">{{ type.name }}</a>
                </li>
            </ul>
        </div>
        <div>
            <h2>Categories</h2>
            <ul v-for="category in categories" :key="category.name">
                <li>
                    <a :href="category.url">{{ category.name }}</a>
                </li>
            </ul>
        </div>
    </nav>
</template>

<style scoped>

h2{
    font-size: large;
    margin-bottom: 1rem;
    color: #1F2328;
}
ul {
    padding: 0;
}
li{
    list-style: none;  
}
a{
    text-decoration: none;
    font-size: small;
    color: #656D76;
}
a:hover{
    color: #0969da;
}
</style>
