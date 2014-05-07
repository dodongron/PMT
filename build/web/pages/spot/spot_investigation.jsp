<%-- 
    Document   : dashboard
    Created on : May 6, 2014, 10:36:41 AM
    Author     : Guinness
--%>

<%@page import="com.pmt.util.MyConnection"%>
<%@page import="com.pmt.util.MyDate"%>
<%@page import="java.util.List"%>
<%@page import="com.pmt.spot_investigation.SpotInvestigationBean"%>
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
        <title>Spot Investigation</title>    
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

                        <%
                            MyConnection.setPort("" + request.getServerPort());
                        %>
                        <span>Fire Prevention  </span>

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
                    <div class="col-md-10 db-content" >



                        <div class="form-group">
                            <form action="viewSpot">
                                <input type="text" class="pull-left">
                                <button class="db-search-btn pull-left" type="button"><i class="fa fa-search"></i></button>
                                <button class="btn-add-new pull-right" type="submit">ADD NEW REPORT</button>
                            </form>
                        </div>
                        <br>


                        <table class="table table-striped table-bordered table-hover" id="example">
                            <thead>
                                <tr >
                                    <th style="width:80px;">Series #</th> 
                                    <th style="width:150px;">Name of Establisment</th> 
                                    <th style="width:150px;">Owner</th> 
                                    <th style="width:40px;">Date/Time of Occurence</th>
                                    <th style="width:20px;">Time Fire Started/Out</th>
                                    <th style="width:50px;">Place of Occurence</th> 
                                    <th style="width:30px;">Occupancy</th>                        
                                    <th style="width:60px;">Details</th>
                                    <th style="width:120px;">Disposition</th>
                                    <th style="width:30px;">Status</th>  
                                    <th style="width:10px;" >  </th>     
                                    <th style="width:10px;">  </th>  
                                    <th style="width:10px;">  </th>  
                                </tr>
                            </thead>
                            <tbody>                              
                                <%
                                    String where = "";
                                    List<SpotInvestigationBean.to_spot_investigation_report> spot_investigation_list = SpotInvestigationBean.ret_data(where);
                                    for (SpotInvestigationBean.to_spot_investigation_report sil : spot_investigation_list) {
                                %>
                                <tr>
                                    <%
                                        String spot_datetime = MyDate.parse_to_time3(sil.sir_time_fire_out);
                                        String time_start = MyDate.parse_to_time2(sil.sir_time_fire_out);
                                        String time_out = MyDate.parse_to_time2(sil.sir_time_fire_out);
                                        String status = "Not Approved";
                                        if (sil.sir_status == 1) {
                                            status = "Approved";
                                        }
                                    %>
                                    <td><%=sil.id%></td>
                                    <td><%=sil.sir_name_of_establishment%></td>
                                    <td><%=sil.sir_owner%></td>
                                    <td><%=spot_datetime%></td>

                                    <td><%=time_start + " - "%> <%=time_out%></td>
                                    <td><%=sil.sir_place_of_occurence%></td>
                                    <td><%=sil.sir_type_of_occupancy%></td>
                                    <td><%=sil.sir_details_of_investigation%></td>
                                    <td><%=sil.sir_disposition%></td>
                                    <td><%=status%></td>
                                    <td> 
                                        <form action="viewSpotUpdate">         
                                            <input type="hidden" name="spotId" value="<%=sil.id%>">
                                            <input type="hidden" name="sir_date" value="<%=sil.sir_date%>">
                                            <input type="hidden" name="sir_datetime_of_occurence" value="<%=sil.sir_datetime_of_occurence%>">
                                            <input type="hidden" name="sir_departure_time" value="<%=sil.sir_departure_time%>">
                                            <input type="hidden" name="sir_arrival_time" value="<%=sil.sir_arrival_time%>">
                                            <input type="hidden" name="sir_type_of_occupancy" value="<%=sil.sir_type_of_occupancy%>">
                                            <input type="hidden" name="sir_name_of_establishment" value="<%=sil.sir_name_of_establishment%>">
                                            <input type="hidden" name="sir_owner" value="<%=sil.sir_owner%>">
                                            <input type="hidden" name="sir_occupant" value="<%=sil.sir_occupant%>">
                                            <input type="hidden" name="sir_casualty" value="<%=sil.sir_casualty%>">
                                            <input type="hidden" name="sir_estimated_damage" value="<%=sil.sir_estimated_damage%>">
                                            <input type="hidden" name="sir_time_fire_started" value="<%=sil.sir_time_fire_started%>">
                                            <input type="hidden" name="sir_time_fire_out" value="<%=sil.sir_time_fire_out%>">
                                            <input type="hidden" name="sir_time_alarm_received" value="<%=sil.sir_time_alarm_received%>">
                                            <input type="hidden" name="sir_details_of_investigation" value="<%=sil.sir_details_of_investigation%>">
                                            <input type="hidden" name="sir_disposition" value="<%=sil.sir_disposition%>">
                                            <input type="hidden" name="sir_place_of_occurence" value="<%=sil.sir_place_of_occurence%>">
                                            <input type="submit" class="btn btn-info btn-sm" value="Update"/>  
                                        </form> 
                                    </td>
                                    <td>
                                        <form action="spotPrint">    
                                            <input type="hidden" name="spotId" value="<%=sil.id%>">
                                            <input type="hidden" name="sir_date" value="<%=sil.id%>">
                                            <input type="hidden" name="sir_datetime_of_occurence" value="<%=sil.sir_datetime_of_occurence%>">
                                            <input type="hidden" name="sir_departure_time" value="<%=sil.sir_departure_time%>">
                                            <input type="hidden" name="sir_arrival_time" value="<%=sil.sir_arrival_time%>">
                                            <input type="hidden" name="sir_type_of_occupancy" value="<%=sil.sir_type_of_occupancy%>">
                                            <input type="hidden" name="sir_name_of_establishment" value="<%=sil.sir_name_of_establishment%>">
                                            <input type="hidden" name="sir_owner" value="<%=sil.sir_owner%>">
                                            <input type="hidden" name="sir_occupant" value="<%=sil.sir_occupant%>">
                                            <input type="hidden" name="sir_casualty" value="<%=sil.sir_casualty%>">
                                            <input type="hidden" name="sir_estimated_damage" value="<%=sil.sir_estimated_damage%>">
                                            <input type="hidden" name="sir_time_fire_started" value="<%=sil.sir_time_fire_started%>">
                                            <input type="hidden" name="sir_time_fire_out" value="<%=sil.sir_time_fire_out%>">
                                            <input type="hidden" name="sir_time_alarm_received" value="<%=sil.sir_time_alarm_received%>">
                                            <input type="hidden" name="sir_details_of_investigation" value="<%=sil.sir_details_of_investigation%>">
                                            <input type="hidden" name="sir_disposition" value="<%=sil.sir_disposition%>">
                                            <input type="hidden" name="sir_place_of_occurence" value="<%=sil.sir_place_of_occurence%>">
                                            <input type="submit" class="btn btn-sm btn-sm" value="Print"/>  
                                        </form> 
                                    </td>
                                    <td>
                                        <form action="spotDelete">    
                                            <s:token name="token"></s:token> 
                                            <input type="hidden" name="spotId" value="<%=sil.id%>">
                                            <input type="submit" class="btn btn-danger btn-sm" value="Delete"/>  
                                        </form> 
                                    </td>
                                </tr>
                                <%}%>                               
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>  
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-1.10.2.js"></script>

        <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
        <script type="text/javascript" language="javascript" src="js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" language="javascript" src="js/jquery-DT-pagination.js"></script>
        <!-- Page-Level Plugin Scripts - Tables -->
        <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
        <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>
        <script src="js/sb-admin.js"></script>

        <script type="text/javascript" src="js/jquery-2.1.0.js"></script>
        <script type="text/javascript" src="js/bootstrap-multiselect.js"></script>    
        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
//                            $(document).ready(function() {
//                                $('#example').dataTable({
//                                    "bSort": false, // Disable sorting
//                                    "iDisplayLength": 15, //records per page
//                                    "sDom": "t<'row'<'col-md-6'i><'col-md-6'p>>",
//                                    "sPaginationType": "bootstrap"
//                                });
//
//                            });


        </script>
        <script type="text/javascript">
        </script>
    </body>

</body>
</html>
