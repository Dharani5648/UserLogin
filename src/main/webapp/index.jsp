<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  <style>
    body {

      color: #fff;
      background-image: url('D.jpg');
      background-size: cover;
      background-position: center;


    }

    .card {
      border-radius: 1rem;
      background-color: transparent;
      border: none;
      /* Card background color */
    }
    h3 {
      font-family: 'Roboto', sans-serif;
      font-weight: bold;
    }

    .form-outline {

      position: relative;
      margin-bottom: 1.5rem;

    }

    .form-outline input {
      width: 350px;
      height: 5px;
      /*padding: 0.5rem;*/
      /*padding-top:1rem;*/
      /*margin-bottom: 5\ px;*/
      border: none;
     /* Bottom border color */
      background-color: transparent; /* Transparent background */
      color: black; /* Input text color */
      transition: border-color 0.3s;
    }

    .form-outline input:focus {
      outline: none;
      border-color: #ffcc00; /* Focus border color */
    }

    .form-label {
      /*position: absolute;*/
      top: 0rem;
      left:1rem;
      color: black;
      font-weight:bold;
      transition: transform 0.3s, color 0.3s;
    }

    .form-outline input:placeholder-shown + .form-label {
      opacity: 0;
      transform: translateY(1rem);
    }

    .btn-primary {
      background-color: #ffcc00; /* Button background color */
      border: none;
      color: black;
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

            <h3 class="fs-1 mb-5 "> Login </h3>

            <div class="form-outline mb-4">
              <input type="email" id="typeEmailX-2" class="form-control form-control-lg"  name="email" required/>
              <label class="form-label" for="typeEmailX-2" style="color: white;">Email</label>
            </div>

            <div class="form-outline mb-4">
              <input type="password" id="typePasswordX-2" class="form-control form-control-lg" name="password" required/>
              <label class="form-label" for="typePasswordX-2" style="color:white;">Password</label>
            </div>

            <p style="color: white;">Not a User?  <a href="register.jsp" class="text-warning">Sign Up</a></p>

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
