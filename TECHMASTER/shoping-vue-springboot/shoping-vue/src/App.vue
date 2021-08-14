<template>
  <div class="container">
    <!-- Tbar -->
    <div class="row justify-content-between">
      <h1>{{ brand }}</h1>
      <a href="#" class="btn btn-info btn-lg">
        <span class="fa fa-shopping-cart"></span> {{ count }}
      </a>
    </div>
    <div class="row mt-5">
      <div class="col-lg-12 card-margin">
        <div class="card search-form">
          <div class="card-body p-0">
            <form id="search-form">
              <div class="row">
                <div class="col-12">
                  <div class="row no-gutters">
                    <div class="col-lg-3 col-md-3 col-sm-12 p-0 ">
                      <select
                        class="form-control"
                        id="select-sort"
                        @change="sort"
                      >
                        <option hidden>Sort by...</option>
                        <option value="default">Feature</option>
                        <option value="price-asc">Price: High to Low</option>
                        <option value="price-desc">Price: Low to High</option>
                        <option value="name-asc">A - Z</option>
                        <option value="name-desc">Z - A</option>
                      </select>
                    </div>
                    <div class="col-lg-7 col-md-6 col-sm-12 p-0">
                      <form action="" method="get">
                        <input
                          type="search"
                          placeholder="Search..."
                          class="form-control"
                          id="search"
                          name="search"
                          v-model="keyword"
                        />
                      </form>
                    </div>
                    <div
                      @click="search"
                      class="col-lg-1 col-md-4 col-sm-12 p-0"
                      id="search-btn"
                    >
                      <input type="button" value="Search" @click="search" />
                    </div>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <!-- End tbar -->
    <!-- Content -->
    <div class="d-flex justify-content-center mt-20 mb-50">
      <div class="row">
        <div
          class="col-md-4 mt-3 mb-2"
          v-for="product in products"
          :key="product.id"
        >
          <div class="loading" v-if="isLoading">
            <div class="card">
              <div class="card-body">
                <div class="card-img-actions">
                  <img
                    src="@/assets/loading.png"
                    class="card-img img-fluid"
                    width="300px"
                    height="200px"
                    alt=""
                  />
                </div>
              </div>
              <div class="card-body bg-light text-center">
                <div class="mb-2">
                  <h6 class="font-weight-semibold mb-2"></h6>
                  <p style="color:gray">Quantity: </p>
                </div>
                <h3 class="mb-0 font-weight-semibold">
                  Price:
                </h3>
                <button type="button" class="btn bg-cart">
                  Add to cart
                </button>
              </div>
            </div>
          </div>
          <div class="card" v-else>

            <div class="card-body">
              <div class="card-img-actions" style="display:block">
                <img
                  :src="require(`@/assets/${product.image}`)"
                  class="card-img img-fluid"
                  width="300"
                  height="200"
                  alt=""
                />
              </div>
            </div>
            <div class="card-body bg-light text-center">
              <div class="mb-2">
                <h6 class="font-weight-semibold mb-2">
                  {{ product.name }}
                </h6>
                <p style="color:gray">Quantity: {{ product.quantity }}</p>
              </div>
              <h3 class="mb-0 font-weight-semibold">
                Price: ${{ product.price }}
              </h3>
              <button type="button" class="btn bg-cart" @click="count += 1">
                Add to cart
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- End -->
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      brand: "AppleStore",
      count: 0,
      products: [{}, {}, {}, {}, {}, {}],
      isLoading: true,
      keyword: "",
    };
  },
  methods: {
    sort() {
      let sort = document.getElementById("select-sort").value;

      switch (sort) {
        case "price-asc":
          this.products.sort((a, b) => b.price - a.price);
          break;
        case "price-desc":
          this.products.sort((a, b) => a.price - b.price);
          break;
        case "name-asc":
          this.products.sort((a, b) => a.name.localeCompare(b.name));
          break;
        case "name-desc":
          this.products.sort((a, b) => b.name.localeCompare(a.name));
          break;
        default:
          this.products.sort((a, b) => a.id - b.id);
      }
    },
    async search() {
      this.isLoading = true;
      let sort = document.getElementById("select-sort").value;
      const res = await fetch(
        "http://localhost:9000/api/products?keyword=" +
          this.keyword +
          "&sort=" +
          sort
      );
      const products = await res.json();

      this.isLoading = false;
      this.products = products;
      // this.products = this.products.sort();
    },
  },

  async created() {
    const res = await fetch("http://localhost:9000/api/products");
    const products = await res.json();
    this.products = products;

    this.isLoading = false;
  },
};
</script>
<style lang="css">
body {
  background: linear-gradient(to right, #c04848, #480048);
  min-height: 100vh;
}
h1 {
  color: #fff;
}
.bg-cart {
  margin-top: 30px;
  background-color: orange;
  color: #fff;
}

.bg-cart:hover {
  color: #fff;
  opacity: 0.8;
}

.bg-buy {
  background-color: green;
  color: #fff;
  padding-right: 29px;
}

.bg-buy:hover {
  opacity: 0.8;
  color: #fff;
}
.mt-50 {
  margin-top: 100px;
}
input[type="button"] {
  background-color: #4caf50;
  border: none;
  color: white;
  padding: 8px 62px;
  cursor: pointer;
  border-radius: 5px;
  margin-left: 8px;
}

@media only screen and (max-width: 1200px) and (min-width: 600px) {
  input[type="button"] {
    background-color: #4caf50;
    border: none;
    color: white;
    padding: 8px 50px;
    cursor: pointer;
    border-radius: 5px;
    margin-left: 8px;
  }
}
</style>
