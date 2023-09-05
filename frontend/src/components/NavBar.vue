<script setup lang="ts">
import { Ref, ref } from 'vue';
import NavBarMenu from './NavBarMenu.vue';

const menuFlag: Ref<boolean> = ref<boolean>(true);

function showMenu(){
    menuFlag.value = menuFlag.value ? false : true;
}

</script>

<template>
    <div>
        <nav class="custom-navbar">
            <div class="left">
                <!--Hamburguer menu-->
                <button type="button" @click="showMenu">
                    <svg xmlns="http://www.w3.org/2000/svg" width="15" height="25" fill="currentColor" class="button__icon" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                    </svg>
                </button>

                <a href="#" class="brand__logo">
                    <img src="../assets/images/logo-github.png" alt="Github" width="32" height="32">
                </a>

                <span class="brand__name">
                    Mockplace
                </span>
            </div>

            <div class="right">
                <div class="search-bar__container">
                    <button type="button" class="search-bar__bar">
                        <i class="bi bi-search search-bar__search-icon"></i>
                        <span class="search-bar__text no-medium-view">
                            Type <kbd>/</kbd> to search
                        </span>
                    </button>

                    <span class="decorative-pipe search-bar__decorative-pipe no-medium-view"></span>

                    <button type="button" class="button__command no-medium-view">
                        <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-command-palette">
                            <path d="m6.354 8.04-4.773 4.773a.75.75 0 1 0 1.061 1.06L7.945 8.57a.75.75 0 0 0 0-1.06L2.642 2.206a.75.75 0 0 0-1.06 1.061L6.353 8.04ZM8.75 11.5a.75.75 0 0 0 0 1.5h5.5a.75.75 0 0 0 0-1.5h-5.5Z"></path>
                        </svg>
                    </button>
                </div>

                <span class="decorative-pipe navbar__decorative-pipe"></span>

                <!--Create new... icon-->
                <button type="button" class="button__create-new">
                    <!--Plus icon-->
                    <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-plus">
                        <path d="M7.75 2a.75.75 0 0 1 .75.75V7h4.25a.75.75 0 0 1 0 1.5H8.5v4.25a.75.75 0 0 1-1.5 0V8.5H2.75a.75.75 0 0 1 0-1.5H7V2.75A.75.75 0 0 1 7.75 2Z"></path>
                    </svg>
                    <!--Arrow down icon-->
                    <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-triangle-down">
                        <path d="m4.427 7.427 3.396 3.396a.25.25 0 0 0 .354 0l3.396-3.396A.25.25 0 0 0 11.396 7H4.604a.25.25 0 0 0-.177.427Z"></path>
                    </svg>
                </button>

                <!--Issues icon-->
                <button type="button">
                    <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-issue-opened Button-visual">
                        <path d="M8 9.5a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3Z"></path><path d="M8 0a8 8 0 1 1 0 16A8 8 0 0 1 8 0ZM1.5 8a6.5 6.5 0 1 0 13 0 6.5 6.5 0 0 0-13 0Z"></path>
                    </svg>
                </button>

                <!--Pull requests icon-->
                <button type="button">
                    <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-git-pull-request Button-visual">
                        <path d="M1.5 3.25a2.25 2.25 0 1 1 3 2.122v5.256a2.251 2.251 0 1 1-1.5 0V5.372A2.25 2.25 0 0 1 1.5 3.25Zm5.677-.177L9.573.677A.25.25 0 0 1 10 .854V2.5h1A2.5 2.5 0 0 1 13.5 5v5.628a2.251 2.251 0 1 1-1.5 0V5a1 1 0 0 0-1-1h-1v1.646a.25.25 0 0 1-.427.177L7.177 3.427a.25.25 0 0 1 0-.354ZM3.75 2.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm0 9.5a.75.75 0 1 0 0 1.5.75.75 0 0 0 0-1.5Zm8.25.75a.75.75 0 1 0 1.5 0 .75.75 0 0 0-1.5 0Z"></path>
                    </svg>
                </button>

                <!--Inbox icon-->
                <button type="button">
                    <svg fill="#656D76" aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-inbox color-fg-muted mr-0">
                        <path d="M2.8 2.06A1.75 1.75 0 0 1 4.41 1h7.18c.7 0 1.333.417 1.61 1.06l2.74 6.395c.04.093.06.194.06.295v4.5A1.75 1.75 0 0 1 14.25 15H1.75A1.75 1.75 0 0 1 0 13.25v-4.5c0-.101.02-.202.06-.295Zm1.61.44a.25.25 0 0 0-.23.152L1.887 8H4.75a.75.75 0 0 1 .6.3L6.625 10h2.75l1.275-1.7a.75.75 0 0 1 .6-.3h2.863L11.82 2.652a.25.25 0 0 0-.23-.152Zm10.09 7h-2.875l-1.275 1.7a.75.75 0 0 1-.6.3h-3.5a.75.75 0 0 1-.6-.3L4.375 9.5H1.5v3.75c0 .138.112.25.25.25h12.5a.25.25 0 0 0 .25-.25Z"></path>
                    </svg>
                </button>

                <button type="button" class="button__profile">
                    <img src="../assets/images/profile-avatar.png" alt="" size="32" width="32" height="32">
                </button>
            </div>
        </nav>
        <NavBarMenu v-if="menuFlag"/>
    </div>
</template>

<style scoped>
button{
    display: flex;
    justify-content: center;
    align-items: center;

    width: 2rem;
    height: 2rem;
    
    border: 1px rgb(101, 109, 118, 0.5) solid;
    border-radius: 7px;
}

.custom-navbar{
    width: 100%;
    height: 4rem;
    padding: 0 1rem;

    display: flex;
    
    border-bottom: 0.5px solid rgb(101, 109, 118, 0.5);
}

.left, .right{
    display: flex;
    align-items: center;
}

.left{
    width: 35%;
    gap: 1rem;
}

.right{
    width: 65%;
    justify-content: flex-end;
    gap: 0.5rem;
}

.brand__name{
    color: #1F2328;
    font-size: 0.9rem;
    font-weight: 600;
}

.search-bar__container{
    display: flex;
    align-items: center;
    padding: 0 2px;
    overflow: hidden;

    border: 1px rgb(101, 109, 118, 0.5) solid;
    border-radius: 7px;
}

.search-bar__bar{
    border-color: transparent;
    background-color: transparent;
    text-align: start;
    justify-content: start;
    width: 18.43rem;
}

.search-bar__search-icon{
    margin-right: 0.5rem;
    color: #656D76;
}

.search-bar__text{
    font-size: 0.9rem;
    color: #6E7781;
}

kbd {
    color: #6E7781;
    background-color: transparent;
    border: 1px rgb(101, 109, 118, 0.5) solid;
    border-radius: 3px;
    padding: 1px;
}

.decorative-pipe{
    margin: 0 0.5rem;
    
    border-right: 1px #6E7781 solid;
    opacity: 0.3;
}
.search-bar__decorative-pipe {
    height: 1rem;
}

.button__command{
    width: 1.5rem;
    height: 1.5rem;

    background-color: transparent;
    border: none;
    padding: 0%;
}

.button__command:hover {
    background-color: rgb(31, 35, 40, 0.2);
}

.navbar__decorative-pipe {
    height: 1.25rem;
}

.button__create-new{
    width: 3.5rem;
    padding: 0 0.5rem;

    display: flex;
    justify-content: space-around;
}

.button__profile{
    width: 2rem;
    height: 2rem;

    place-content: center;

    overflow: hidden;
    border-radius: 50%;
}

@media (max-width: 1000px){
    .search-bar__bar{
        width: min-content;
    }
    .search-bar__search-icon{
        margin: 0;
    }
    .no-medium-view {
        display: none;
    }
}
</style>