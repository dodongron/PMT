<%-- 
    Document   : print_spot_investigation
    Created on : May 7, 2014, 12:00:20 PM
    Author     : Guinness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1"/>
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <link href="css/media-queries.css" rel="stylesheet">
        <meta name="robots" content="noindex,nofollow">
        <!--<link rel="stylesheet" type="text/css" href="css/print.css" />-->
        <link media="" type="text/css" rel="stylesheet" href="http://nbi.njis-ph.com/css/builds/84902b7c5994aab9b919cec308f13b00.css">


        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> 
        <script src="js/jquery-1.10.2.js" type="text/JavaScript" language="javascript"></script>
        <script src="js/jquery.PrintArea.js" type="text/JavaScript" language="javascript"></script>
        <script type='text/javascript'>
            $(document).ready(function() {
                $(".print").click(function() {
                    $("div#printable").printArea();
                });
            });
        </script>	

        <title></title>
    </head>
    <body>
        <div class="header">
        </div>
        <div class="container ">
            <br>
            <div class="col-md-8">
                <div class="row">
                    <div class="col-md-12">

                        <button class="btn btn-success pull-right btn-lg print">PRINT APPLICATION</button>
                        <!-- &nbsp;
                        <a class="btn btn-warning pull-right btn-lg close-application" >DONE</a> -->
                    </div>
                </div>
                <br/>
                <br/>
                <div id="printable">
                    <div class="row center-block" id="printview" border="0" width="100%" style="border-bottom: none">
                        <form id="spot-investigation-report-form" >  

                            <!--                            <div class="form-group">
                                                            <div class="col-md-2 text-right" width="25%">
                                                                <img src="images/dilg-logo.png" alt="" />  </div>
                                                            <div align="center" width="50%" class="col-md-6 form-heading">
                                                                <p>Republic of the Philippines</p>
                                                                <p>Department of the Interior and Local Government</p>
                                                                <p>BUREAU OF FIRE PROTECTION</p>
                                                                <p>REGION VII</p>
                                                                <p>(Province)</p>
                                                                <p>(Name of Station)</p>
                                                                <p>(Address of Station)</p>
                                                            </div>
                                                            <div class="col-md-2">
                                                                <img src="images/bfp-logo.png" alt="" />  
                                                            </div>
                            
                                                        </div>-->

                            <div class="row form-content">
                                <div align="left" width="25%"class="col-md-12">
                                    <div class="form-group ">

                                        MEMORANDUM<br>   
                                        FOR &emsp;&emsp;&emsp;&emsp;&emsp; <br>   
                                        DATE &emsp;&emsp;&emsp;&emsp;&emsp;:2014-05-06 
                                    </div>

                                    SPOT INVESTIGATION REPORT
                                    <table class="table mt-30">
                                        <tr>
                                            <td>DATE/ TIME AND PLACE OF OCCURRENCE/ <br />DEPARTS FROM STATION</td>
                                            <td>:</td>
                                            <td>
                                                2014-05-06 17:09:00<br/>
                                                <br/>
                                                00:01:23</td>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>TIME OF FIRST RESPONDING UNIT  <br />LOCATION</td>
                                            <td>:</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>TIME FOR ARRIVAL OF FIRST   <br />RESPONDING UNIT AT THE FIRE SCENE</td>
                                            <td>:</td>
                                            <td>00:01:23</td>
                                        </tr>
                                        <tr>
                                            <td>INVOLVE TYPE OF OCCUPANCY</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td>NAME OF ESTABLISHMENT</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td>OWNER</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td>OCCUPANT</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td colspan="3">CASUALTY</td>
                                        </tr>
                                        <tr>
                                            <td class="text-right">Fatality</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td class="text-right">Injured</td>
                                            <td>:</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>ESTIMATED DAMAGE</td>
                                            <td>:</td>
                                            <td>123</td>
                                        </tr>
                                        <tr>
                                            <td>TIME FIRE STARTED</td>
                                            <td>:</td>
                                            <td>17:09:00</td>
                                        </tr>
                                        <tr>
                                            <td>TIME OF FIRE OUT</td>
                                            <td>:</td>
                                            <td>17:09:00</td>
                                        </tr>
                                        <tr>
                                            <td>ALARM</td>
                                            <td>:</td>
                                            <td>17:09:00</td>
                                        </tr>
                                        <tr>
                                            <td colspan="3" style="font-weight:bold;">DETAILS OF INVESTIGATION</td>
                                        </tr>
                                        <tr>
                                            <td colspan="3">123</td>
                                        </tr>
                                        <tr>
                                            <td colspan="3" style="font-weight:bold;">DISPOSITION</td>
                                        </tr>
                                        <tr>
                                            <td colspan="3">123</td>
                                        </tr>
                                    </table>
                                </div>
                            </div>


                            <div class="row  ">
                                <div class="span8 col-lg-offset-8  ">

                                </div>
                                <div class="form-group ">

                                    Prepared by:
                                    <h6>(Name) </h6>
                                    <h6>(Rank) </h6>
                                    <h6>(Position) </h6>
                                </div>
                                <div class="span4  col-lg-offset-1">
                                    Noted by:
                                    <h6>(Name) </h6>
                                    <h6>(Rank) </h6>
                                    <h6>(Position) </h6>
                                </div>

                            </div>





                            <div class="form-group">
                                <div class="modal-footer">
                                    <!--<button type="button" class="btn btn-default printviewbtn" data-dismiss="modal">Print1</button> -->
                                </div>
                        </form>  </div>
                </diV>	</div>
        </div>




    </div>

    <div class="container">
        <div class="footer">
            &copy; 2014 All Rights Reserved
        </div>
    </div>

</body>
</html>
