<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Home</title>
  <link rel="stylesheet" href="/css/style.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"/>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
          crossorigin="anonymous"></script>
  <link rel="stylesheet" href="/Website/css/style.css" />
  <script src="/Website/js/script.js" defer></script>
  <style>
    body {
      background-image: url('https://static.vecteezy.com/system/resources/thumbnails/002/018/246/original/abstract-colorful-pastel-gradient-background-free-video.jpg');
      font-family: 'Arial', sans-serif;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #333;
      color: white;
      text-align: center;
      padding: 1em;
    }

    main {
      margin: 30px;
    }

    h1 {
      font-size: 3rem;
      color: #fff;
      margin-top: 50px;
    }

    h2 {
      font-size: 2rem;
      background-color: #3f3d3d;
      color: white;
      padding: 10px;
      margin-top: 20px;
    }

    p {
      margin-top: 10px;
      margin-left: 10px;
    }

    footer {
      background-color: #333;
      color: white;
      text-align: center;
      padding: 1em;
      position: fixed;
      bottom: 0;
      width: 100%;
      margin-top: 20px;
    }
  </style>
</head>
<body>

<header>
  <h1>Welcome! ${user.name}</h1>
</header>

<main>
  <h2>About Us</h2>
  <p>
    Welcome to Our Website! We are a dedicated team committed to providing exceptional services and creating
    meaningful experiences for our clients. Our mission is to exceed expectations and deliver innovative solutions
    tailored to your needs. With a focus on quality and customer satisfaction, we aim to be a reliable partner in
    your journey towards success.
  </p>

  <h2>Services</h2>
  <p>
    Our experienced team of designers will create a visually stunning and user-friendly website tailored to your
    business needs
  </p>

  <h2>Contact</h2>
  <p>
    For inquiries, please email us at: <a href="mailto:info@example.com">info@example.com</a>
  </p>
</main>

<footer>
  &copy; 2024 Our Website. All rights reserved.
</footer>

</body>
</html>
