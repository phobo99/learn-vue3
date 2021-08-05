import Vue from 'vue'
import App from './App.vue'
import VueScrollReveal from 'vue-scroll-reveal';

Vue.config.productionTip = false
Vue.use(VueScrollReveal, {
  class: 'v-scroll-reveal',
  scale: 1,
  distance: '10px',
  mobile: false
});

new Vue({
  render: h => h(App),
}).$mount('#app')
