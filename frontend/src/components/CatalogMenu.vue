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
        <div class="list-section">
            <h2>Types</h2>
            <ul v-for="type in types" :key="type.name">
                <li>
                    <a :href="type.url">{{ type.name }}</a>
                </li>
            </ul>
        </div>
        
        <div class="list-section">
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
.list-section:not(:last-child){
    margin-bottom: 2.5rem;
}

h2{
    font-size: 1rem;
    font-weight: 400;
    margin-bottom: 1.5rem;
    color: #1F2328;
}

ul {
    padding: 0;
}

li{
    list-style: none;
    margin-bottom: 1.5rem;
}

a, a:visited{
    display: block; /* Enable the use of width */
    width: 100%;
    text-decoration: none;
    font-size: small;
    color: #656D76;
}

a:hover{
    color: var(--default-blue);
}
</style>
