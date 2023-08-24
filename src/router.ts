import { createRouter, createWebHistory} from 'vue-router'
import Home from "./views/Home.vue"
import Documentation from "./views/Documentation.vue"
import About from "./views/About.vue"


export const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: "/",
            component: Home
        },
        {
            path: "/docs",
            component: Documentation
        },
        {
            path: "/about",
            component: About
        }
    ]
})