<template>
  <div id="app">
    <!-- Navbar -->
    <nav>
      <a href="" class="logo">{{ fullname }}</a>
      <div class="toggle" onclick="toggleMenu();"></div>

      <!-- Menu -->
      <ul class="menu">
        <li><a href="#home" onclick="toggleMenu();">Home</a></li>
        <li><a href="#about" onclick="toggleMenu();">About</a></li>
        <li><a href="#services" onclick="toggleMenu();">Services</a></li>
        <li><a href="#work" onclick="toggleMenu();">Work</a></li>
        <li><a href="#contact" onclick="toggleMenu();">Contact</a></li>
      </ul>
    </nav>
    <!-- Main Home Text And Image -->
    <section id="home">
      <div class="home-text">
        <h1>
          Hi, I'm <br />Luu <span>{{ name }}</span> <br />Web Developer
        </h1>
        <!-- Button -->
        <a href="#contact">Hire Me</a>
      </div>
      <!-- Home Image -->
      <div class="home-img">
        <img src="@/assets/profile.jpeg" alt="" />
      </div>

      <!-- Social -->
      <div class="social">
        <a href="https://www.facebook.com/phobotkcb/" target="_blank"
          ><i class="bx bxl-facebook"></i
        ></a>
        <a href="https://github.com/phobo99" target="_blank"
          ><i class="bx bxl-twitter"></i
        ></a>
        <a href="https://github.com/phobo99" target="_blank"
          ><i class="bx bxl-github"></i
        ></a>
      </div>
    </section>

    <!-- About -->
    <section id="about">
      <div class="heading">
        <h2>About</h2>
        <p>My Introduction</p>
      </div>
      <div class="about-content">
        <!-- About Image -->
        <div class="about-img">
          <img src="@/assets/about.jpg" alt="" />
        </div>
        <!-- About Text -->
        <div class="about-text">
          <h1>I'm {{ name }}</h1>
          <p>
            My name is {{ fullname }}. I’m 22 years old and I’m single. I live
            in Hanoi and i'll graduating from Hanoi University of Business and
            Technology (HUBT) 3 month later with the major in Software Engineer.
            I like reading books and playgame. I’m a careful and hard-working
            person. I’m eager to learn new things and willing to work in team. I
            easily adapt to new working environment and take initiative in work.
          </p>
          <a href="#">Download CV</a>
        </div>
      </div>
    </section>

    <!-- Services -->
    <section id="services">
      <div class="heading">
        <h2>Services</h2>
        <p>My Services Offer</p>
      </div>

      <div class="services-content">
        <!-- Boxes -->
        <div class="box" v-for="project in projects" :key="project.id">
          <img :src="project.image" alt="" />
          <h1>{{ project.name }}</h1>
          <p>
            {{ project.description }}
          </p>
        </div>
      </div>
    </section>

    <!-- Work -->
    <section id="work">
      <div class="heading work-heading">
        <h2>Work</h2>
        <p>Work With Me</p>
      </div>
      <div class="work-content">
        <div class="work-text">
          <h1>
            We Belive To Deliver Best <br />
            Quality Work
          </h1>
          <p>
            To describe myself, I would say I’m a hard-working person that has
            gained a lot of skills over the years. My teachers and my friends
            also say that I am a creative individual. You can find some of my
            works in my portfolio. I am now looking for an opportunity to devote
            my skills, enthusiasm, and creativity. After being in the field for
            a while, I am impressed by your company’s creative and innovative
            products. I hope I will have a chance to sharpen my design skills at
            the company.
          </p>
          <a href="#contact">Contact</a>
        </div>

        <div class="work-img">
          <img src="@/assets/work.jpg" alt="" />
        </div>
      </div>
    </section>

    <!-- Contact -->
    <section id="contact">
      <div class="heading color">
        <h2>Contact</h2>
        <p>Leave a message we will try to reply in 24 hours.</p>
      </div>
      <div class="contact-content">
        <div class="app">
          <h1>
            Connect With Me <br />
            By Our Apps
          </h1>
          <a href="#" target="_blank"><i class="bx bxl-play-store"></i></a>
          <a href="#" target="_blank"><i class="bx bxl-apple"></i></a>
        </div>
        <div class="contact-form">
          <form>
            <input type="text" placeholder="Name" />
            <input type="email" placeholder="Your E-mail" />
            <textarea
              name=""
              id=""
              cols="30"
              rows="10"
              placeholder="Your Message Here..."
            ></textarea>
            <input type="button" value="Send" class="contact-button" />
          </form>
        </div>
      </div>
    </section>

    <div class="copyright">
      <p>&#169; 2021 Luu Dang Pho All Right Reserves</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      fullname: "Luu Dang Pho",
      name: "Pho",
      projects: [
        {
          id: 1,
          image: require("@/assets/html.png"),
          name: "HTML5",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
        {
          id: 2,
          image: require("@/assets/css-3.png"),
          name: "CSS3",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
        {
          id: 3,
          image: require("@/assets/js.jpg"),
          name: "JAVASCRIPT",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
        {
          id: 4,
          image: require("@/assets/ux.png"),
          name: "UX/UI",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
        {
          id: 5,
          image: require("@/assets/wordpress.png"),
          name: "WORDPRESS",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
        {
          id: 6,
          image: require("@/assets/prototype.png"),
          name: "PROTOTYPE",
          description:
            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint ex perferendis iusto placeat fuga laborum.",
        },
      ],
    };
  },
};
</script>

<style>
/* Google Fonts */
@import url("https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800&display=swap");
* {
  margin: 0;
  padding: 0;
  list-style: none;
  text-decoration: none;
  font-family: "Poppins", sans-serif;
  box-sizing: border-box;
  scroll-behavior: smooth;
}
/* Colors */
:root {
  --main-color: #f5b041;
  --second-color: #212f3d;
}
section {
  padding: 100px;
}
/* Home CSS */
#home {
  position: relative;
  width: 100%;
  min-height: 100vh;
  display: flex;
  justify-content: space-around;
  align-items: center;
}
/* Navbar CSS */
nav {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  padding: 15px 100px;
  background: #fff;
  box-shadow: 0 1px 4px rgba(146, 161, 176, 0.15);
  display: flex;
  justify-content: space-between;
  align-items: center;
  z-index: 1000;
  transition: 0.5s;
}
/* Logo CSS */
.logo {
  text-transform: uppercase;
  font-size: 1.4rem;
  color: var(--second-color);
  font-weight: 700;
}
ul {
  display: flex;
}
ul li a {
  padding: 10px 22px;
  color: var(--second-color);
  border-radius: 2px;
  font-weight: 600;
  letter-spacing: 1px;
}
ul li a:hover {
  background: var(--main-color);
  color: #fff;
  border: none;
}
/* Home Text CSS */
.home-text {
  max-width: 500px;
}
.home-text h1 {
  color: var(--second-color);
  font-size: 3.5rem;
  font-weight: 700;
  margin-bottom: 2.5rem;
  line-height: 5.5rem;
}
.home-text span {
  color: var(--main-color);
}
.home-img {
  width: 500px;
  height: 500px;
}
.home-img img {
  width: 100%;
  height: 100%;
  object-fit: contain;
  object-position: center;
}
/* Hire Me Button */
.home-text a {
  padding: 12px 34px;
  background: var(--main-color);
  color: #fff;
  border-radius: 10px;
  font-weight: 600;
  letter-spacing: 1px;
}
.home-text a:hover {
  background: var(--second-color);
  box-shadow: 0 10px 34px rgba(0, 0, 0, 0.14);
}
/* Social */
.social {
  position: absolute;
  display: flex;
  bottom: 8%;
  left: 144px;
}
.social i {
  margin-right: 24px;
  font-size: 24px;
  color: var(--second-color);
}
.social i:hover {
  color: var(--main-color);
}

/* About */
.heading {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.heading h2 {
  color: var(--second-color);
  border-bottom: 3px solid var(--second-color);
  font-size: 1.8rem;
}
.heading p {
  color: var(--second-color);
  margin-top: 0.5rem;
}
.about-content {
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.about-img {
  width: 320px;
  height: 500px;
}
.about-img img {
  width: 100%;
  height: 100%;
  object-fit: contain;
  object-position: center;
}
.about-text {
  max-width: 500px;
  justify-content: center;
}
.about-text h1 {
  font-size: 1.5rem;
  color: var(--second-color);
}
.about-text p {
  color: var(--second-color);
  margin: 5px 0 24px;
  text-align: justify;
  line-height: 1.8rem;
}
.about-text a {
  padding: 12px 20px;
  background: var(--main-color);
  color: #fff;
  border-radius: 10px;
  font-weight: 600;
  letter-spacing: 1px;
}
.about-text a:hover {
  background: var(--second-color);
  box-shadow: 0 10px 34px rgba(0, 0, 0, 0.14);
}

/* Services */
.services-content {
  display: flex;
  justify-content: center;
  flex-direction: row;
  flex-wrap: wrap;
}
.services-content .box {
  padding: 40px 20px;
  background: var(--second-color);
  color: #fff;
  max-width: 320px;
  margin: 16px;
  text-align: center;
}
.box img {
  height: 45px;
}
.box h1 {
  font-size: 1.3rem;
}
.box p {
  margin-top: 0.5rem;
  font-size: 1rem;
  font-weight: 300;
}
.services-content .box:hover {
  transform: translateY(-10px);
  background: var(--main-color);
  transition: 0.5s;
}

/* Work */
.work-heading {
  margin-bottom: 2.5rem;
}
.work-content {
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.work-text {
  width: 500px;
}
.work-text h1 {
  font-size: 1.5rem;
  color: var(--second-color);
  line-height: 2.4rem;
  letter-spacing: 1px;
}
.work-text p {
  font-size: 1rem;
  color: var(--second-color);
  line-height: 2rem;
  text-align: justify;
  margin: 5px 0px 18px;
}
.work-text a {
  padding: 12px 24px;
  background: var(--main-color);
  color: #fff;
  border-radius: 10px;
  font-weight: 600;
  letter-spacing: 1px;
}
.work-text a:hover {
  background: var(--second-color);
  box-shadow: 0 10px 34px rgba(0, 0, 0, 0.14);
}
.work-img {
  width: 320px;
  height: 500px;
}
.work-img img {
  width: 100%;
  height: 100%;
  object-fit: contain;
  object-position: center;
}

/* Contatct */
.color h2 {
  color: #fff;
  border-bottom: 3px solid #fff;
  font-size: 1.8rem;
}
.color p {
  color: #fff;
}
#contact {
  background: var(--second-color);
}
.contact-content {
  display: flex;
  align-items: center;
  justify-content: space-around;
}
.contact-form {
  width: 360px;
  margin-top: 4rem;
}
.contact-form form input,
.contact-form form textarea {
  width: 100%;
  font-size: 13px;
  padding: 1rem;
  border-radius: 0.5rem;
  border: none;
  outline: none;
  margin-bottom: 12px;
}
.contact-form form input::placeholder,
.contact-form form textarea::placeholder {
  color: var(--second-color);
  letter-spacing: 1px;
}
.contact-form form textarea {
  height: 200px;
  resize: none;
}
.contact-button {
  max-width: 100px;
  font-weight: 600;
  background: var(--main-color);
  color: #fff;
  text-transform: uppercase;
  letter-spacing: 2px;
  cursor: pointer;
}

.app {
  max-width: 360px;
}
.app h1 {
  color: #fff;
  font-size: 1.6rem;
  margin: 5px 0 24px;
}
.app i {
  color: var(--main-color);
  font-size: 45px;
  margin-right: 10px;
}
.app i:hover {
  transform: translateY(-10px);
  transition: 0.5s;
}

.copyright {
  padding: 20px;
  background: var(--second-color);
  color: #fff;
  text-align: center;
}

/* Responsive */
@media (max-width: 991px) {
  nav {
    padding: 10px 50px;
    z-index: 1000;
  }
  .menu {
    position: fixed;
    top: 60px;
    right: 100%;
    display: block;
    padding: 100px 50px;
    text-align: center;
    width: 100%;
    height: 100vh;
    background: var(--second-color);
    transition: 0.5s ease;
    z-index: 999;
    border-top: 1px solid rgba(0, 0, 0, 0.2);
  }
  .menu.active {
    right: 0;
  }
  nav ul li a {
    font-size: 35px;
    line-height: 80px;
    color: #fff;
  }
  .toggle {
    width: 40px;
    height: 40px;
    background: url(assets/menu.png);
    background-position: center;
    background-repeat: no-repeat;
    background-size: 30px;
    cursor: pointer;
  }
  .toggle.active {
    background: url(assets/close.png);
    background-position: center;
    background-repeat: no-repeat;
    background-size: 25px;
    cursor: pointer;
  }
  section {
    padding: 80px;
  }
  .home-text h1 {
    font-size: 2.5rem;
    margin-bottom: 1.8rem;
    line-height: 4rem;
  }
  .home-img {
    width: 400px;
    height: 400px;
  }
  .social {
    left: 110px;
  }
  .heading h2 {
    font-size: 1.6rem;
  }
  .about-img {
    width: 250px;
    height: 400px;
  }
  .about-text,
  .work-text {
    max-width: 400px;
  }
  .about-text h1 {
    font-size: 1.3rem;
  }
  .about-text p {
    line-height: 1.5rem;
  }
  .work-text p {
    line-height: 1.5rem;
    margin: 5px 0px 24px;
  }
  .work-img {
    width: 250px;
    height: 300px;
  }
}
@media (max-width: 871px) {
  section {
    padding: 50px;
  }
}
@media (max-width: 800px) {
  section {
    padding: 35px;
  }
}
@media (max-width: 414px) {
  section {
    padding: 35px;
  }
  #home {
    flex-direction: column;
  }
  .home-text {
    max-width: 400px;
    margin-top: 2rem;
  }
  .home-img {
    width: 345px;
    height: 400px;
  }
  .home-text h1 {
    font-size: 2rem;
    margin-bottom: 1.8rem;
    line-height: 3rem;
  }
  .about-content,
  .work-content {
    flex-direction: column;
  }
  .about-text,
  .work-text {
    max-width: 280px;
  }
  .work-text h1 {
    font-size: 1.2rem;
    line-height: 2rem;
  }
  .work-img {
    width: 200px;
    height: 280px;
    margin-top: 4rem;
  }
  .contact-content {
    flex-direction: column;
  }
  .app {
    margin-top: 4rem;
  }
  .contact-form {
    width: 300px;
  }
}
</style>
