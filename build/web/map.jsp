<%-- 
    Document   : map
    Created on : Feb 14, 2016, 11:53:07 AM
    Author     : Simi510

customer pay distance time directions, mpg, driver pay, profit
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<c:import url="/include/header.jsp" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true&libraries=places"></script>




<div class="container">
         <h2>Trip calculator</h2>
    <div class="new">
        <h3> Enter the values for the map.</h3>
    </div>

    <form action="mapCreate" method="post" class="form-horizontal" role="form"> 

    <div class="container-fluid">
    <div class="row">
    <div class="col-sm-3">
      
    <div class="form-group">
     
 
          <input type="hidden" name="formType" value="create" />
          <%--
          <input id = "gas-field-hidden" type="hidden" name="gas" value="default">
<input id = "dist-field-hidden" type="hidden" name="dist" value="default"> --%>
      
          
          

            <div id="mapCanvas">&#160;</div>
            <div id="directionsPanel">
                 <div class="directionInputs">
                    <label>Origin</label> <input id="dirSource" type="text" class="form-control" name=
                        "origin" value="${origin== null ? 'Salinas, CA' : origin}" /> <br />
                    <label>Destination</label> <input id="dirDestination" type="text" class="form-control" name=
                        "destination" value="${destination== null ? 'Allentown, PA' : destination}" /> <br />
                </div>
             </div>
 
            <label>Initial Price</label> <input type="text" class="form-control" name=
                "price" value="${price== null ? '4500' : price}"/> <br />
            <label>MPG</label> <input type="text" class="form-control" name=
                "mpg" value="${mpg== null ? '6' : mpg}"/> <br />
            <label>Driver Pay Per Mile</label> <input type="text" class="form-control" name=
                "ppm" value="${ppm== null ? '0.40' : ppm}"/> <br />
            
            
           
              <label for="gasList">Select Fuel type:</label>
              <select class="form-control" id="gasList" name="gasList">
                <option>Diesel</option>
                <option>CNG</option>
                <option>E85</option>
                <option>Electric</option>
                <option>LPG</option>
                <option>Regular</option>
                <option>Midgrade</option>
                <option>Premium</option>            
              </select>
             
            <br />
            <button type="submit" class="btn btn-primary btn-block" value="Submit">Create</button>
          
      
        </div>
  

  
    
    <c:import var="gasInfo" url="http://www.fueleconomy.gov/ws/rest/fuelprices"/>
        <x:parse xml="${gasInfo}" var="gasOutput" /> 
        The National Premium Fuel Average is.. <b> <x:out select="$gasOutput/fuelPrices/premium" /></b>.
        

 
<c:if test ="${requestScope.origin!=null}">  
    
     <c:import var="mapInfo" url="http://maps.googleapis.com/maps/api/distancematrix/xml?origins=${requestScope.urlOrigin}&destinations=${requestScope.urlDestination}&units=imperial&mode=driving&language=en&sensor=false"/>
    <x:parse xml="${mapInfo}" var="output" />
    <x:set var="dist" select="$output//DistanceMatrixResponse/row/element/distance/value" />

    <%--<fmt:parseNumber var="miles" value="${mapInfo}"/> 
            <p>My test text is ${sessionScope.test}</p>
   
    
            <div class="well">
                <h3>DeBug.info</h3>
                <p>Your origin formated is ${sessionScope.map.origin}</p>
                  <p>Your origin is  ${origin}</p>
                  <p>Your destination formated is  ${sessionScope.map.destination}</p>
                 <p>Your destination is  ${destination}</p>
                  <p>Your  price is ${sessionScope.map.price}</p>
                   <p>Your  mpg is ${sessionScope.map.mpg}</p>
                    <p>My Prem gas is ${sessionScope.distance}</p>
                     <p>My distance is ${sessionScope.gasType}</p>
                     <p>My Prem gas is ${distance}</p>
                     <p>My distance is ${gasType}</p>
                     <p>My Prem gas is ${sessionScope.map.distance}</p>
                     <p>My distance is ${sessionScope.map.gasType}</p>
                      <p>My distance is ${miles}</p>
                    <p>My test is <c:out value="${gasType}" /></p> 
                    <p>My test text is ${sessionScope.test}</p>
                   
                   <p> distance is <x:out select="$output/DistanceMatrixResponse/row/element/distance/value" /> </p>
                          
                   
                   
<p>Parsed Number (1) : <c:out value="${dist}" /></p>
<c:set var="mult" value="${sessionScope.map.mpg * $output/DistanceMatrixResponse/row/element/distance/value}"/>
                 <p> Your Cost in fuel for this trip is  <c:out value="${mult}" />  </p>


                   
   

    <b>The Distance from ${origin} to ${destination} is <x:out select="$output/DistanceMatrixResponse/row/element/distance/text" /> </b>
    <br>
--%>
  
    
    
    
    
   
    

                   <%--
<x:parse xml="${mapInfo}" var="output" />
         

<br>
<br>

<b>The title of the first book is</b>: 
<br>
<x:out select="$output/DistanceMatrixResponse/row/element/distance/text" />
 <x:out select="$DistanceMatrixResponse/row/element[0]/distance[0]/text" />
<br>
         
                  <p>https://maps.googleapis.com/maps/api/distancematrix/xml?origins=Vancouver+BC|Seattle&destinations=San+Francisco|Vancouver+BC&mode=bicycling&language=fr-FR&key=AIzaSyAtUzHb_NmeWA0YFuWcGM8yWcQpTHQlBbY</p>
       
            <c:import var="mapInfo2" url="https://maps.googleapis.com/maps/api/distancematrix/json?origins=Seattle&destinations=San+Francisco&units=imperial&key=AIzaSyAtUzHb_NmeWA0YFuWcGM8yWcQpTHQlBbY"/>
    
                   --%>
   

</c:if> 
                   
            
                    </div>

<c:if test ="${requestScope.origin!=null}"> 
    <div class="col-sm-3">
        
        <label>Distance Traveled In Miles</label> <input id = "dist-field" type="text" class="form-control" name=
            "dist" value="Calculating..."/><br />
        <label>Gallons Used</label> <input  id = "gallons-field"type="text" class="form-control" name=
            "gallons" value="Calculating..."/><br />
        <label>National Average Cost of Fuel</label> <input  id = "gas-field" type="text" class="form-control" name=
            "gas" value="Calculating..."/><br />
        <label>Cost of Diesel</label> <input  id = "gasCost-field" type="text" class="form-control" name=
            "gasCost" value="Calculating..."/><br />
        <label>Driver Pay Per Mile Cost</label> <input id = "ppm-field" type="text" class="form-control" name=
            "ppmCost" value="Calculating..."/><br />
        <label>Ending Balance</label> <input id = "totalCost-field" type="text" class="form-control" name=
            "totalCost" value="Calculating..."/><br />
        
        
        
         <input type="hidden" name="formType" value="quote" />
         <button type="submit" class="btn btn-primary btn-block" name="action" value="makeQuote">Make Quote</button> <br>
         <button type="submit" class="btn btn-success btn-block" name="action" value="saveQuote">Save Quote</button> <br>
         <button type="submit" class="btn btn-info btn-block" name="action" value="print">Print</button>
    </div>

        

        
 
    
    
    
                 <div class="col-sm-6">
            
      <div style="overflow:hidden;width:850px;height:500px;resize:none;max-width:100%;"><div id="gmap_canvas" style="height:100%; width:100%;max-width:100%;"><iframe style="height:100%;width:100%;border:0;" frameborder="0" src="https://www.google.com/maps/embed/v1/directions?origin=${requestScope.urlOrigin}&destination=${requestScope.urlDestination}&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU"></iframe></div><a class="code-for-google-map" href="https://www.bootstrapskins.com" id="enable-map-data">buy html themes</a></div>
      <script src="https://www.bootstrapskins.com/google-maps-authorization.js?id=662dfadd-2c44-ff05-e721-3920adb6b7eb&c=code-for-google-map&u=1455863258" defer="defer" async="async"></script>      
            </div>
      
      
      
<script>
        $(document).ready(function() {
             $("#gasList").val("${gasList}").attr('selected', 'selected');
            
               if($( "#gasList option:selected" ).text() === "Diesel") {  var $gas = <x:out select="$gasOutput/fuelPrices/diesel" />; }
          else if($( "#gasList option:selected" ).text() === "CNG") {     var $gas = <x:out select="$gasOutput/fuelPrices/cng" />; }
          else if($( "#gasList option:selected" ).text() === "Electric") {var $gas = <x:out select="$gasOutput/fuelPrices/electric" />; }
          else if($( "#gasList option:selected" ).text() === "LPG") {     var $gas = <x:out select="$gasOutput/fuelPrices/lpg" />; }
          else if($( "#gasList option:selected" ).text() === "Regular") { var $gas = <x:out select="$gasOutput/fuelPrices/regular" />; }
          else if($( "#gasList option:selected" ).text() === "Midgrade") {var $gas = <x:out select="$gasOutput/fuelPrices/midgrade" />; }
          else if($( "#gasList option:selected" ).text() === "Premium") { var $gas = <x:out select="$gasOutput/fuelPrices/premium" />; }


          var $pri =  ${price};
          var $mp  =  ${mpg};
          var $pm =  ${ppm};
          var $dist= ( <x:out select="$output/DistanceMatrixResponse/row/element/distance/value" />  / 1000000000 * 621371);
          
          var $gallons = ($dist / $mp );
          var $ppmCost = ($pm * $dist);
          var $gasCost = ($gallons * $gas ) ;
          var $totalCost = ($pri - $gasCost - $ppmCost);
          
          $("#dist-field").val($dist.toFixed(3));
          $("#gas-field").val($gas.toFixed(2));
          $("#gallons-field").val($gallons.toFixed(2));
          $("#gasCost-field").val($gasCost.toFixed(2));
          $("#ppm-field").val($ppmCost.toFixed(2));
          $("#totalCost-field").val($totalCost.toFixed(2));
          
          //$("#dist-field-hidden").val($dist.toFixed(3));
         // $("#gas-field-hidden").val($gas);

          <%-- 
          var $org = ${sessionScope.map.origin};
          var $des = ${sessionScope.map.distance};
          alert($org);
          
          $("#origin-field").val($org);
                 
          document.forms[0].elements["gas"].value = $gas;
          document.forms[0].elements["dist"].value = $dist;
          document.forms[0].elements["gascost"].value = $gasCost;
          document.forms[0].elements["totalCost"].value = $totalCost; --%>

    });
    

</script>


      </c:if> 
     
    
      </div>    
   
    </div>  
   </form>
</div> 
            
            
            










<script type="text/javascript" src="include/js/map.js"></script>

<c:import url="/include/footer.jsp" />