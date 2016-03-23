

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    
    <meta name="generator" content=
  "HTML Tidy for Linux/x86 (vers 25 March 2009), see www.w3.org" />

  <title>Harsimranjeet Singh</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <!-- Latest compiled and minified CSS -->
  
  <script src="include/js/jquery-1.12.0.min.js" type="text/javascript">
</script><!-- Latest compiled JavaScript -->
  
  
 <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" type="text/css" />
  <link rel="stylesheet" href="include/styles/main.css" type="text/css" />
  <%-- <link rel="stylesheet" href="include/styles/bootstrap.css" type="text/css" />> --%>
      

  
  <!-- jQuery library -->



  <script src="include/js/bootstrap.min.js" type="text/javascript">
</script>
</head>
<body>




<div class="container">
    <div class="row">
        <input type="hidden" name="formType" value="quote" />
        <div class="col-xs-12">
    		<div class="invoice-title">
                    <c:if test ="${quoteId!=null}"><h2>Quote</h2><h3 class="pull-right"><b>PO # ${quoteId}</b></h3></c:if> 
    		</div>
    		<hr>
    		<div class="row">
    			<div class="col-xs-6">
    				<address>
    				<strong>Billed To:</strong><br>
    					John Smith<br>
    					1234 Main<br>
    					Apt. 4B<br>
    					Springfield, ST 54321
    				</address>
    			</div>
    			<div class="col-xs-6 text-right">
    				<address>
        			<strong>Shipped From:</strong><br>
                                    ${origin}
    				</address>
    			</div>
    		</div>
    		<div class="row">
    			<div class="col-xs-6">
    				<address>
    					<strong>Payment Method:</strong><br>
    					Net 30<br>
    					${sessionScope.user.email}
    				</address>
    			</div>
    			<div class="col-xs-6 text-right">
    				<address>
        			<strong>Shipped To:</strong><br>
                                    ${destination}
    				</address>
    			</div>
    		</div>
    	</div>
    </div>
    
    <div class="row">
    	<div class="col-md-12">
    		<div class="panel panel-default">
    			<div class="panel-heading">
    				<h3 class="panel-title"><strong>Order summary</strong></h3>
    			</div>
    			<div class="panel-body">
    				<div class="table-responsive">
    					<table class="table table-condensed">
    						<thead>
                                <tr>
        							<td><strong>Trip</strong></td>
        							<td class="text-center"><strong>Distance Traveled</strong></td>
                                                                <td class="text-center"><strong>Pay Per Mile</strong></td>
        							<td class="text-center"><strong>Fuel Use (${gasList})</strong></td>
        							<td class="text-right"><strong>Driver Pay</strong></td>
                                </tr>
    						</thead>
    						<tbody>
    							<!-- foreach ($order->lineItems as $line) or some such thing here -->
    							<tr>
    								<td> ${origin} -to- ${destination}</td>
    								<td class="text-center"> ${map.distance} miles</td>
                                                                <td class="text-center">$${ppm}</td>
    								<td class="text-center">${map.gallons} gal</td>
                                                                <td class="text-right">Per Mile: $${ppmCost}<br /> Fuel: $${map.gasCost}</td>
                                                        </tr> <%--
                                <tr>
        							<td>BS-400</td>
    								<td class="text-center">$20.00</td>
    								<td class="text-center">3</td>
    								<td class="text-right">$60.00</td>
    							</tr>
                                <tr>
            						<td>BS-1000</td>
    								<td class="text-center">$600.00</td>
    								<td class="text-center">1</td>
    								<td class="text-right">$600.00</td>
</tr> --%>
    							<tr>
    								<td class="thick-line"></td>
    								<td class="thick-line"></td>
                                                                <td class="thick-line"></td>
    								<td class="thick-line text-center"><strong>Subtotal</strong></td>
    								<td class="thick-line text-right">$${ppmCost + gasCost}</td>
    							</tr>
    							<tr>
    								<td class="no-line"></td>
    								<td class="no-line"></td>
                                                                <td class="no-line"></td>
    								<td class="no-line text-center"><strong>Fuel Surcharge</strong></td>
    								<td class="no-line text-right">$0.00</td>
    							</tr>
    							<tr>
    								<td class="no-line"></td>
    								<td class="no-line"></td>
                                                                <td class="no-line"></td>
    								<td class="no-line text-center"><strong>Total</strong></td>
    								<td class="no-line text-right"> $${ppmCost + gasCost}</td>
    							</tr>
    						</tbody>
    					</table>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
</div>

                                                        
                                                        
</body>
</html>