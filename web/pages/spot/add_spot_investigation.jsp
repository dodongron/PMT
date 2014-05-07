<%-- 
    Document   : dashboard
    Created on : May 6, 2014, 10:36:41 AM
    Author     : Guinness
--%>

<%@page import="java.util.List"%>
<%@page import="com.pmt.occupancy_types.OccupancyTypesBean"%>
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
        <link href="css/media-queries.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css"/>
        <title>Dashboard</title>    
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
                    <form action="addSpot">
                        <s:token name="token"></s:token> 
                            <div class="db-content">
                                <div class="container col-md-8">
                                    <form role="form">
                                        <div class="form-group pull-right">
                                            <a class="btn btn-default" href="javascript:history.back()">Cancel</a> 
                                            <input type="submit" class="btn btn-primary" value="Save"/> 

                                        </div>
                                        <div class="form-group">
                                            <label>DATE/ TIME OF OCCURRENCE</label>
                                            <input type="text" class="form-control col-lg-5" value="" id="datetimepicker_mask" name="sir_datetime_of_occurence" ><br />
                                        </div>
                                        <div class="form-group">
                                            <label>PLACE OF OCCURENCE</label>
                                            <input type="text" class="form-control" name="sir_place_of_occurence">
                                        </div>
                                        <div class="form-group">
                                            <label>TIME OF FIRST RESPONDING UNIT DEPARTS FROM STATION</label><br />
                                            <input type="text" class="form-control col-lg-5" id="datetimepicker1" name="sir_departure_time"/>
                                        </div>
                                        <div class="form-group">
                                            <label>TIME FOR ARRIVAL OF FIRST RESPONDING UNIT AT THE FIRE SCENE</label><br />
                                            <input type="text" class="form-control col-lg-5" id="datetimepicker2" name="sir_arrival_time"/>
                                        </div>
                                        <div class="form-group">
                                            <label>INVOLVE TYPE OF OCCUPANCY</label>
                                        <%
                                            List<OccupancyTypesBean.to_maintenance_occupancy_types> occupancy_types_list = OccupancyTypesBean.ret_data("");
                                        %>
                                        <select class="form-control" name="sir_type_of_occupancy">
                                            <%   for (OccupancyTypesBean.to_maintenance_occupancy_types occupancy_type : occupancy_types_list) {%>
                                            <option value="<%=occupancy_type.occupancy%>"><%=occupancy_type.occupancy%></option>
                                            <%  }%>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>NAME OF ESTABLISHMENT</label>
                                        <input type="text" class="form-control" name="sir_name_of_establishment">
                                    </div>
                                    <div class="form-group">
                                        <label>OWNER</label>
                                        <input type="text" class="form-control" name="sir_owner">
                                    </div>
                                    <div class="form-group">
                                        <label>OCCUPANT</label>
                                        <input type="text" class="form-control" name="sir_occupant">
                                    </div>
                                    <div class="form-group">
                                        <label>CASUALTY</label>
                                        <input type="text" class="form-control" placeholder="Fatality" name="sir_casualty">
                                        <input type="text" class="form-control mt-10" placeholder="Injured">
                                    </div>
                                    <div class="form-group">
                                        <label>ESTIMATED DAMAGE</label>
                                        <input type="text" class="form-control" name="sir_estimated_damage">
                                    </div>
                                    <div class="form-group">
                                        <label>TIME FIRE STARTED</label><br />
                                        <input type="text" class="form-control col-lg-5" id="datetimepicker3" name="sir_time_fire_started"/>
                                    </div>
                                    <div class="form-group">
                                        <label>TIME OF FIRE OUT</label><br />
                                        <input type="text" class="form-control col-lg-5" id="datetimepicker4" name="sir_time_fire_out"/>
                                    </div>
                                    <div class="form-group">
                                        <label>ALARM</label>
                                        <input type="text" class="form-control col-lg-5" id="datetimepicker5" name="sir_time_alarm_received"/>
                                    </div>
                                    <div class="form-group">
                                        <label>DETAILS OF INVESTIGATION</label>
                                        <textarea class="form-control" rows="3" name="sir_details_of_investigation"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>DISPOSITION</label>
                                        <textarea class="form-control" rows="3" name="sir_disposition"></textarea>
                                    </div>
                                    <div class="form-group pull-right">

                                        <a class="btn btn-default" href="javascript:history.back()">Cancel</a> 
                                        <input type="submit" class="btn btn-primary" value="Save"/> 
                                    </div>
                                </form>
                            </div>
                        </div>

                    </form>

                </div>
        </section>  

        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/jquery.datetimepicker.js"></script>

        <script type="text/javascript">
                            $('#datetimepicker_mask').datetimepicker({
                                mask: '9999/19/39 29:59'
                            });
                            $('#datetimepicker1').datetimepicker({
                                datepicker: false,
                                format: 'H:i',
                                step: 5
                            });
                            $('#datetimepicker2').datetimepicker({
                                datepicker: false,
                                format: 'H:i',
                                step: 5
                            });
                            $('#datetimepicker3').datetimepicker({
                                datepicker: false,
                                format: 'H:i',
                                step: 5
                            });
                            $('#datetimepicker4').datetimepicker({
                                datepicker: false,
                                format: 'H:i',
                                step: 5
                            });
                            $('#datetimepicker5').datetimepicker({
                                datepicker: false,
                                format: 'H:i',
                                step: 5
                            });

        </script>
    </body>

</body>
</html>
