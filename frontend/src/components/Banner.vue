<template>
    <aside>
        <div class="brand-container">
            <img src="../assets/images/icon-github-marketplace.svg" aria-hidden="true">
            <h2>
                List your tool on GitHub Marketplace
            </h2>
        </div>

        <div class="class-name-temporary">
            <section>
                <a href="">
                    Read the documentation
                </a>
                <p>
                    <small>
                        Learn how you can build tools to extend and improve developers' workflows.
                    </small>
                </p>
            </section>
            <!---->
            <section>
                <a href="">
                    Submit your tool for review
                </a>
                <p>
                    <small>
                        Share your app or GitHub with milions of developers.
                    </small>
                </p>
            </section>
        </div>
    </aside>
</template>

<style scoped>
aside{
    display: flex;
    justify-content: space-between;
    margin: 7rem 0;

    background-color: white;
    padding: 1.5rem 2.5rem;
    border-radius: 5px;
    box-shadow: rgba(140, 149, 159, 0.3) 0px 12px 28px 0px; /* #8C959F, original color */
}

.brand-container{
    display: flex;
    align-items: center;
    width: 20rem;
}

.class-name-temporary{
    display: flex;
    width: 30rem;
}

section{
    padding: 1rem;
    width: 50%;
}

img{
    margin-right: 1.5rem;
}

h2{
    font-size: 1.5rem;
    font-weight: 400;
}

a, a:visited{
    text-decoration: none;
    color: var(--default-blue);

    font-weight: 500;
}

a:hover{
    text-decoration: underline;
}

p{
    font-size: small;
    color: #656D76;
}

@media (max-width: 600px){
    aside {
        padding: 2.5rem;
        flex-direction: column;
        align-items: center;
    }

    .brand-container{
        flex-direction: column;
        width: 100%;
        gap: 1rem;
    }

    .class-name-temporary{
        width: 100%;
        text-align: center;
    }

    section{
        padding: 0;
    }
}
</style>
