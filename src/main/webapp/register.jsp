<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        body, html {
            height: 100%;
        }
        .bg-image {
            background-image: url('D.jpg');
            background-size: cover;
            background-position: center;

        }
        .card {
            /*border-radius: 30px; !* Adjusted border radius *!*/
            /*box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1); !* Soft shadow *!*/
            background-color: transparent;
        }
        .p-5 {
            padding: 2rem !important; /* Increased padding */
        }
        .form-outline input.form-control:focus {
            /*border-color: #80bdff; !* Focus color for input fields *!*/
            /*box-shadow: 0 0 0 0.25rem rgba(0, 123, 255, 0.25); !* Focus shadow for input fields *!*/
        }


        .custom-btn {
            background-color:#ffcc00; /* Change to your desired color */
            border: none; /* Change border color if needed */
        }

        /* Hover state */
        .custom-btn:hover {
            background-color: #e6b800; /* Change to a different color on hover */
            border: none; /* Change border color on hover if needed */
        }
    </style>
</head>
<body>
<form class="vh-100 bg-image" action="register" method="POST">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
<%--                <div class="card shadow-2-strong">--%>
                    <div class="card-body p-5 text-center">
                        <h3 class=" fs-1 mb-5" style="font-weight: bold;">Sign in</h3>
                        <div class="form-outline mb-4">
                            <input type="email" id="typeEmailX-2" class="form-control form-control-lg" name="email"/>
                            <label class="form-label email-label" for="typeEmailX-2" style="color: white; font-weight: bold;">Email</label>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="password" id="typePasswordX-2" class="form-control form-control-lg" name="password"/>
                            <label class="form-label password-label" for="typePasswordX-2" style="color: white; font-weight: bold;">Password</label>
                        </div>
                        <input class="btn btn-lg btn-block custom-btn" type="submit" value="Register Now"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>