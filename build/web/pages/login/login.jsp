<%-- 
    Document   : login
    Created on : May 6, 2014, 10:27:35 AM
    Author     : Guinness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="images/favicon.png">
        <title>Bureau of Fire Protection - Region 7</title>    
        <link href="css/media-queries.css" rel="stylesheet">
        <title></title>
    </head>
    <body>

        <!-- Wrap all page content here -->
        <form action="login">
            <div id="wrap">
                <section class="login">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <img src="images/bfp-logo.png" alt="BFP">
                                <p>Bureau of Fire Protection - Region 7</p>
                                <span>PMT Monitoring Scheme</span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="login-con">
                                <img src="images/user-icon.PNG" alt="BFP">
                                <form role="form" class="mt-15">

                                    <div class="form-group mt-15">
                                        <input type="text" class="form-control" id="" placeholder="Username">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" id="" placeholder="Password">
                                    </div>
                                    <button type="submit" class="btn btn-default">Sign in</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </form>
         <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
