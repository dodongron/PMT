<%-- 
    Document   : dashboard
    Created on : May 6, 2014, 10:36:41 AM
    Author     : Guinness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="images/favicon.png">
        <title>Dashboard</title>    
        <link href="css/media-queries.css" rel="stylesheet">
        <title></title>
    </head>
    <body >
        <section class="db-header">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-5">
                        <img src="images/db-logo.png" alt="">
                    </div>
                    <div class="col-md-4 db-header-search">
                        <div class="input-group">
                            <input type="text" class="form-control">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </div>
                    <div class="col-md-3 db-signout">
                        <a href="">SIGN OUT</a> <img src="images/db-user-ico.png" alt="BFP">
                    </div>
                </div>
            </div>
        </section>

        <section class="db-body" >
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-2 db-sidebar">
                        <span>Fire Prevention</span>

                        <!--Fire Safety Checklist</a>-->
                        <a href="">Fire Safety Checklist</a>
                        <a href="">Fire Safety Evaluation Clearance</a>
                        <a href="">Inspection Order</a>
                        <a href="">After Inspection Report</a>
                        <a href="">Notice to Comply</a>
                        <a href="">Notice to Correct Violation</a>
                        <a href="">Order to Pay Fine</a>
                        <a href="">Fire Safety Inspection Certificate</a>
                        <hr>
                        <span>Fire Investigation</span>

                        <a href="" onclick="javascript:confirmGetMessage()" id="pSpot">Spot Report</a>
                        <a href="">After Operation Report</a>
                        <a href="">Progress Investigation Report</a>
                        <a href="">Final Investigation Report</a>
                    </div>
                    <div class="col-md-10 db-content" id="aw">

                        <s:include value="/pages/spot/spot_investigation.jsp"></s:include>
                       
                    </div>
                </div>
        </section>  

        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
        </script>
    </body>

</body>
</html>
