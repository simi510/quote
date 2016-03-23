

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />



<div class="container">
    <div class="row">
        
        <button type="button" class="btn btn-success btn-block" name="back" onclick="history.back()">Go Back</button><br><br>
        <%--
        <form action="mapCreate" method="post" class="form-horizontal" role="form">
        <input type="hidden" name="formType" value="print" />

                <input  type="hidden" name="id" value="${map.id}"/>
                <input  type="hidden" name="origin" value="${map.origin}"/>
                <input  type="hidden" name="destination" value="${map.destination}"/>
                <input  type="hidden" name="price" value="${map.price}"/>
                <input  type="hidden" name="mpg" value="${map.mpg}"/>
                <input  type="hidden" name="distance" value="${map.distance}"/>
                <input  type="hidden" name="gasType" value="${map.gasType}"/>
                <input  type="hidden" name="ppm" value="${map.gallons}"/>
                <input  type="hidden" name="gasCost" value="${map.gasCost}"/>
		<input  type="hidden" name="ppmCost" value="${map.ppmCost}"/>
		<input  type="hidden" name="totalCost" value="${map.totalCost}"/>
        <button type="submit" class="btn btn-info btn-block" name="action" value="print">Print</button>
        </form>
        --%>
        
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
    								<td class="text-center"> ${dist} miles</td>
                                                                <td class="text-center">$${ppm}</td>
    								<td class="text-center">${gallons} gal</td>
                                                                <td class="text-right">Per Mile: $${ppmCost}<br /> Fuel: $${gasCost}</td>
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

       
 <c:import url="/include/footer.jsp" /> 