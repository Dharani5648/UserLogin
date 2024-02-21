<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  <style>
    body {
      background-color: #ffcc00;
      color: #fff;
      background-image: url('https://static.vecteezy.com/system/resources/thumbnails/002/018/246/original/abstract-colorful-pastel-gradient-background-free-video.jpg');
    }

    .card {
      border-radius: 1rem;
      /*background-color: #fff;*/
      border: none;
      /* Card background color */
    }

    .form-outline {
      position: relative;
      margin-bottom: 1.5rem;
    }

    .form-outline input {
      width: 100%;
      padding: 1rem;
      border: none;
      border-bottom: 2px solid #ffcc00; /* Bottom border color */
      border-radius: 0;
      background-color: transparent; /* Transparent background */
      color: black; /* Input text color */
      transition: border-color 0.3s;
    }

    .form-outline input:focus {
      outline: none;
      border-color: #ffcc00; /* Focus border color */
    }

    .form-label {
      position: absolute;
      top: 0.5rem;
      left: 1rem;
      color: #999; /* Label color */
      transition: transform 0.3s, color 0.3s;
    }

    .form-outline input:placeholder-shown + .form-label {
      opacity: 0;
      transform: translateY(1rem);
    }

    .btn-primary {
      background-color: #ffcc00; /* Button background color */
      border: none;
    }

    .btn-primary:hover {
      background-color: #e6b800; /* Hover state background color */
    }

    .btn-primary:active {
      background-color: #b38f00; /* Active state background color */
    }
  </style>
</head>
<body>
<form class="vh-100"   action="login" method="POST">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card shadow-2-strong">
          <div class="card-body p-5 text-center">

            <h3 class="fs-2 mb-5"> Login </h3>

            <div class="form-outline mb-4">
              <input type="email" id="typeEmailX-2" class="form-control form-control-lg" name="email" required/>
              <label class="form-label" for="typeEmailX-2" style="margin-bottom: 20px;">Email</label>
            </div>

            <div class="form-outline mb-4">
              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" name="password" required/>
              <label class="form-label" for="typePasswordX-2" style="margin-bottom: 10px;">Password</label>
            </div>

            <p>Not a User? <a href="register.jsp" class="text-warning">Sign Up</a></p>

            <%
              if(request.getAttribute("error")!=null){
               out.print("<p class='text-danger'>Invalid credentials!</p>");
              }
            %>

            <input class="btn btn-primary btn-lg btn-block" type="submit"  value="Login"/>
          </div>
        </div>
      </div>
    </div>
  </div>
</form>
</body>
</html>
