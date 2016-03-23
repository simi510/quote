
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />
<script>
    
var image_x = document.getElementById('head');
image_x.parentNode.removeChild(image_x);
</script>

    
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=true&libraries=places"></script>
		<link href="include/styles/style1.css" type="text/css" rel="stylesheet" />
    
  </head>

    <div id="mapCanvas">&#160;</div>
    
    <div id="directionsPanel">
              
    	<a href="#geoLocation" id="useGPS">Use Current Location</a>
        <!--<p class="or">[OR]</p>-->
    	<div class="directionInputs">
             <form>
                <!--<a href="#getcar" id="getcar" class="btn" ><img src="icon-car.gif" width="48" height="48" ></a>
                <a href="#gettrain" id="gettrain" class="btn" ><img src="icon_train.gif" width="48" height="48"></a>
                <a href="#getwalk" id="getwalk" class="btn" ><img src="icon-walk.gif" width="48" height="48"></a>	-->	
	    		<p><label>Origin</label><input type="text" value="" id="dirSource" class="form-control" /></p>
	    		<p><label>Destination</label><input type="text" value="" id="dirDestination" class="form-control" /></p>
                        <a href="#getDirections" id="getDirections">Get Directions</a><br />
                        
                <br /><a href="#reset" id="paneReset">Reset</a>
    		</form>	
    	</div>
    	<div id="directionSteps">
    		<p class="msg">Direction Steps Will Render Here</p>
    	</div>
    	<a href="#toggleBtn" id="paneToggle" class="out">&lt;</a>
    </div>
    <script type="text/javascript" src="include/js/map.js"></script> 
  </body>
</html>