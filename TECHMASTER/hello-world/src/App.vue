<template>
  <!-- <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
  </div> -->

  <div class="container">
    <h1 class="text-center">{{ brand }}</h1>
    <div class="d-flex justify-content-center mt-50 mb-50">
      <div class="row">
        <div
          class="col-md-4 mt-2"
          v-for="product in products"
          :key="product.id"
        >
          <div class="card">
            <div class="card-body">
              <div class="card-img-actions">
                <img
                  :src="product.image"
                  class="card-img img-fluid"
                  width="96px"
                  height="350px"
                  alt=""
                />
              </div>
            </div>
            <div class="card-body bg-light text-center">
              <div class="mb-2">
                <h6 class="font-weight-semibold mb-2">
                  {{ product.name }}
                </h6>
              </div>
              <h3 class="mb-0 font-weight-semibold">
                Price: ${{ product.price }}
              </h3>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      brand: "AppleStore",
      products: [
        {
          id: 1,
          image: require("@/assets/iphone-x.jpg"),
          name: "Iphone XSMax",
          price: 500,
        },
        {
          id: 2,
          image: require("@/assets/iphone-11.jpg"),
          name: "Iphone 11 Pro Max",
          price: 1000,
        },
        {
          id: 3,
          image: require("@/assets/iphone-12.jpg"),
          name: "Iphone 12 Pro Max",
          price: 1500,
        },
        {
          id: 4,
          image: require("@/assets/iphone-x.jpg"),
          name: "Iphone XSMax 256GB",
          price: 700,
        },
        {
          id: 5,
          image: require("@/assets/iphone-11.jpg"),
          name: "Iphone 11 Pro Max 256GB",
          price: 1200,
        },
        {
          id: 6,
          image: require("@/assets/iphone-12.jpg"),
          name: "Iphone 12 Pro Max 256GB",
          price: 1900,
        },
      ],
    };
  },
};
</script>
