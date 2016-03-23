<%-- 
    Document   : admin
    Created on : Jan 27, 2016, 6:35:30 PM
    Author     : Simi510
<script src="https://raw.githubusercontent.com/DLarsen/jquery-sumtr/master/jquery.sumtr.js" type="text/javascript"></script>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />



        <div class="container">
        <h1>Welcome to the Admin Quote Page!!</h1>
        <p>You are logged in as ${sessionScope.User.username}</p>
        <table class="table"  id="DataGrid">
        <tr>
                <th>PO#</th>
                <th>Origin</th>
                <th>Delivery</th>
                <th>Price</th>
                <th>MPG</th>
                <th>Distance</th>
                <th>Gas Cost</th>
                <th>PPM</th>
                <th>Gallons</th>
                <th>Gas Cost</th>
                <th>PPM Cost</th>
                <th>Profit</th>
                <th>ACTION</th>
            </tr>
        <c:forEach var="map" items="${requestScope.maplist}">
            
            <tr>
                <td class="id-cell">${map.id}</td>
                <td class="origin-cell">${map.origin}</td>
                <td class="destination-cell">${map.destination}</td>
                <td class="price-cell">${map.price}</td>
                <td class="mpg-cell">${map.mpg}</td>
                <td class="distance-cell">${map.distance}</td>
                <td class="gasType-cell">${map.gasType}</td>
                <td class="ppm-cell">${map.ppm}</td>
                <td class="gallons-cell">${map.gallons}</td>
                <td class="gasCost-cell">${map.gasCost}</td>
                <td class="ppmCost-cell">${map.ppmCost}</td>
                <td class="totalCost-cell">${map.totalCost}</td>
                <td>
                    <!-- Trigger the modal with a button -->
                    <div class="btn-group-vertical">
                        <button type="button" class="btn btn-info dropdown-toggle btn-block" data-toggle="dropdown">
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
              
        <form action="QuoteServlet" method="post" class="form-horizontal" role="form">
            
                  <li><button class = "edit-button btn btn-warning btn-block" id ="${map.id}" type="button" data-toggle="modal" 
        data-target="#editForm">Edit</button></li>
        
                <input type="hidden" name="formType" value="delete" />
                <input id = "delete-field" type="hidden" name="id" value="${map.id}"/>
                
                
    <li><button class = "delete-button btn btn-danger btn-block" id ="${map.id}" type="Submit"  >Delete PO: ${map.id}</button></li>
  
                

         
        </form>
        
        
        <form action="mapCreate" method="post" class="form-horizontal" role="form">
            
              
        
                <input type="hidden" name="formType" value="quote" />
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
         <li><button type="submit" class="btn btn-primary btn-block" name="action" value="makeQuote">Quote</button></li> 
        </form>
         </ul>
         </div>

                </td>
            </tr>
            
        </c:forEach>
           
                <tr class="success" >
                    <td>Total OR Average</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
            

        </table>

                <!-- Modal -->
        <div id="editForm" class="modal fade" role="dialog">
          <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Modal Header</h4>
              </div>
              <div class="modal-body">
                  
                  
                   
                  <div class="form-group">
            <form action="QuoteServlet" method="post" class="form-horizontal" role="form">
              <div class="row">
                <input type="hidden" name="formType" value="edit" />
                <input id = "id-field" type="hidden" name="id" />

                <div class="col-md-12"> 
 

                   <label>Origin</label> <input id = "origin-field" type="text" class="form-control" name=
                  "origin" /><br />
                   <label>Destination</label> <input id = "destination-field" type="text" class="form-control" name=
                  "destination" /><br />
                   <label>Price</label> <input id = "price-field" type="text" class="form-control" name=
                  "price" /><br />

                  <label>MPG</label> <input id = "mpg-field" type="text" class="form-control" name=
                  "mpg" /><br />
                  
                  <label>Distance</label> <input id = "distance-field" type="text" class="form-control" name=
                  "distance" /><br />
                  
                  <label>Gas Price</label> <input id = "gasType-field" type="text" class="form-control" name=
                  "gasType" /><br />
                  
                  <label>PPM</label> <input id = "ppm-field" type="text" class="form-control" name=
                  "ppm" /><br />
                  
                  <label>Gallons</label> <input id = "gallons-field" type="text" class="form-control" name=
                  "gallons" /><br />
                  
                  <label>Gas Cost</label> <input id = "gasCost-field" type="text" class="form-control" name=
                  "gasCost" /><br />
                  
                  <label>PPM Cost</label> <input id = "ppmCost-field" type="text" class="form-control" name=
                  "ppmCost" /><br />
                  
                  <label>Total Cost</label> <input id = "totalCost-field" type="text" class="form-control" name=
                  "totalCost" /><br />
                  
                  
                </div>
              </div>
                <input type="submit" class="btn btn-primary btn-block" />
            </form>
          </div>
          
                  
                  
                  
         
                
              </div>
                
              <div class="modal-footer">
                <button type="button" class="btn btn-danger btn-block" data-dismiss="modal">Close</button>
              </div>
            </div>

          </div>
        </div>
      

        
        
        </div>
        
        
<script>
    //id, origin,  destination,  price,  mpg, distance,  gasType,  ppm,  gallons,  gasCost, ppmCost, totalCost
        $(document).ready(function() {
       // alert("hi!");
       $(".edit-button").click(function(){
          var $id = $(this).attr("id");
          var $tableRow = $(this).closest("tr"); 
          //alert($tableRow.children(".firstname-cell").text());
          var $origin = $tableRow.children(".origin-cell").text();
          var $destination = $tableRow.children(".destination-cell").text();
          var $price = $tableRow.children(".price-cell").text();
          var $mpg = $tableRow.children(".mpg-cell").text();
          var $distance = $tableRow.children(".distance-cell").text();
          var $gasType = $tableRow.children(".gasType-cell").text();
          var $ppm = $tableRow.children(".ppm-cell").text();
          var $gallons = $tableRow.children(".gallons-cell").text();
          var $gasCost = $tableRow.children(".gasCost-cell").text();
          var $ppmCost = $tableRow.children(".ppmCost-cell").text();
          var $totalCost = $tableRow.children(".totalCost-cell").text();
          
          
          // set the form input values
          $("#id-field").val($id);
          $("#origin-field").val($origin); 
          $("#distance-field").val($distance); 
          $("#destination-field").val($destination);
          $("#price-field").val($price);
          $("#mpg-field").val($mpg);
          $("#distance-field").val($distance); 
          $("#gasType-field").val($gasType); 
          $("#ppm-field").val($ppm); 
          $("#gallons-field").val($gallons); 
          $("#ppmCost-field").val($ppmCost); 
          $("#gasCost-field").val($gasCost); 
          $("#totalCost-field").val($totalCost); 


             
          

       });
       
        var c3Total = 0;
        var c4Total = 0;
        var c5Total = 0;
        var c6Total = 0;
        var c7Total = 0;
        var c8Total = 0;
        var c9Total = 0;
        var c10Total = 0;  
        var c11Total = 0;
        var c12Total = 0;
        var $count = 0;
 

        $("tr").find("td").each(function(){
            var curVal = parseFloat($(this).text());
            

            if(!isNaN(curVal)){
                $count = $count + 1;
                if($(this).index() == 3){
                   c3Total += parseFloat($(this).text());
                }
                else if($(this).index() == 4){
                   c4Total += parseFloat($(this).text());
                }
                else if($(this).index() == 5){
                   c5Total += parseFloat($(this).text());
                }
                else if($(this).index() == 6){
                   c6Total += parseFloat($(this).text());
                }
                else if($(this).index() == 7){
                   c7Total += parseFloat($(this).text());
                }
                else if($(this).index() == 8){
                   c8Total += parseFloat($(this).text());
                }
                else if($(this).index() == 9){
                   c9Total += parseFloat($(this).text());
                }
                else if($(this).index() == 10){
                   c10Total += parseFloat($(this).text());
                }
                else if($(this).index() == 11){
                   c11Total += parseFloat($(this).text());
                }
                else if($(this).index() == 12){
                   c12Total += parseFloat($(this).text());
                   
                }
                 
            }
            
        });
        $count = $count/10;   //10 rows divide to find number of elements
        $("#DataGrid tr:last td:eq(2)").text($count.toFixed(2) );
        $("#DataGrid tr:last td:eq(3)").text(c3Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(4)").text((c4Total/ $count).toFixed(2) );
        $("#DataGrid tr:last td:eq(5)").text(c5Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(6)").text((c6Total/ $count).toFixed(2) );
        $("#DataGrid tr:last td:eq(7)").text((c7Total/ $count).toFixed(2) );
        $("#DataGrid tr:last td:eq(8)").text(c8Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(9)").text(c9Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(10)").text(c10Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(11)").text(c11Total.toFixed(2) );
        $("#DataGrid tr:last td:eq(12)").text(c12Total.toFixed(2) );

       // $('#DataGrid').sumtr({sumCells : '.totalCost-cell'});
    });
</script>
        

 <c:import url="/include/footer.jsp" />       