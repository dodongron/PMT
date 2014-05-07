<%-- 
    Document   : print2
    Created on : May 7, 2014, 1:19:06 PM
    Author     : Guinness
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/media-queries.css" rel="stylesheet">
        <title></title>
    </head>
    <body>

        <div id="pdf">
            <embed src="C:\Users\Guinness\spot.pdf" width="500" height="500">
        </div><object height="950" data="sample-report.pdf" type="application/pdf" width="860">
            <p>It appears you don't have a PDF plugin for this browser.
                No biggie... you can <a href="C:\Users\Guinness\spot.pdf">click here to
                    download the PDF file.</a>
            </p>
        </object>

    </body>



</html>
