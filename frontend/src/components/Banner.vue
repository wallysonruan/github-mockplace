<template>
    <aside>
        <div class="brand-container">
            <img src="../assets/icon-github-marketplace.svg" aria-hidden="true">
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
    margin-top: 7rem;
    margin-bottom: 7rem;

    background-color: white;
    padding: 1.5rem 2.5rem;
    border-radius: 5px;
    box-shadow: rgba(140, 149, 159, 0.3) 0px 12px 28px 0px; /* #8C959F, original color */
}

.brand-container{
    display: flex;
    align-items: center;
    width: 50%;
}

.class-name-temporary{
    display: flex;
    width: 80%;
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
}

a{
    text-decoration: none;
    color: #0969da;
}

a:hover{
    text-decoration: underline;
}

p{
    font-size: small;
    color: #656D76;
}
</style>
