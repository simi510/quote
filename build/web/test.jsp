
<!DOCTYPE html>
<html>
  <head>
    <title>address suggest</title>
    <link rel="stylesheet" href="demo.css" type="text/css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false" type="text/javascript"></script>
  
 <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" type="text/css" />

    
    
    <style>
        .features_table h1{
    font-size:25px !important;
	
}
li{
    list-style:none;
    }
h1{
     font-size:21px !important;
    }    
.features-table li {
    background: #da9748 none repeat scroll 0 0;
    border-bottom: 2px solid #e5a253;
    color: #f1f1f1;
    font-size: 16px;
    padding: 15px 24px;
}
.features-table li:hover{
	background:  #e5a253;
	cursor:pointer;
	-webkit-transition: all .35s;
    -moz-transition: all .35s;
    transition: all .35s;
}
.features-table-free li, .features-table-paid li {
    background: #efefef none repeat scroll 0 0;
    border-bottom: 2px solid #d4d4d4;
	text-align:center;
    padding: 16.4px 21px;
	cursor:pointer;
}
.features-table-free h1, .features-table-paid h1 {
    text-align: center;
}
.features-table-free li:hover, .features-table-paid li:hover {
    background: #dedede none repeat scroll 0 0;
	-webkit-transition: all .35s;
    -moz-transition: all .35s;
    transition: all .35s;
}
.features_table h1 {
    font-size: 23px !important;
}
.features-table h1, .features-table-free h1, .features-table-paid h1 {
    background: #6b6b6b none repeat scroll 0 0;
    color: #fff;
    font-weight: 600;
    margin: 0;
    padding: 19px 21px;
    text-transform: uppercase;
}
.features-table h1 {
    border-top-left-radius: 20px;
	text-align:center;
}
.features-table-paid h1 {
    border-top-right-radius: 20px;
}
.features-table-free li {
    border-right: 2px solid #d4d4d4;
}

.fa.fa-check {
    color: #2cc14f;
}
.fa.fa-times {
    color: #BA5340;
}
.fa{
	font-size:30px;
}
.no-padding{
	padding:0;
}
ul{
	padding:0;
}

body {
  counter-reset: section;                   /* Set the section counter to 0 */
}
.features-table li::before {
  counter-increment: section;               /* Increment the section counter*/
  content: "" counter(section) ": "; /* Display the counter */
}
    </style>
    

  </head>
  <body>
    
      
      
  <html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
  </head>
 <body>
  
  <section class="features_table">
        <div class="container ">
        	<div class="col-sm-4 col-4 col-xs-6 no-padding">
            	<div class="features-table">
                	<ul>
                    	<h1>Features</h1>
                    	<li>Memes? </li>
                        <li>Directions?</li>
                        <li>Contact us?</li>
                        <li>Pay Monies?</li>
                        <li>Free Soda?</li>
                        
                        
                    </ul>
                </div>
            </div>
            <div class="col-sm-1 col-1 col-xs-6 no-padding">
            <div class="features-table-free">
                	<ul>
                    	<h1>Free</h1>
                        <li><i class="fa fa-times"></i></li>
                        <li><i class="fa fa-times"></i></li>
                        <li><i class="fa fa-times"></i></li>
                        <li><i class="fa fa-times"></i></li>
                        <li><i class="fa fa-times"></i></li>
                
                        
                        
                        
                    </ul>
                </div>
            
            </div>
             <div class="col-sm-1 col-1 col-xs-6 no-padding">
             	 <div class="features-table-paid">
                	<ul>
                    	<h1>Pro</h1>
                        <li><i class="fa fa-check"></i></li>
                        <li><i class="fa fa-check"></i></li>
                        <li><i class="fa fa-check"></i></li>
                        <li><i class="fa fa-check"></i></li>
                        <li><i class="fa fa-check"></i></li>
                        
                        
                        
                        
                    </ul>
                </div>
             </div>
        </div>
    
    </section>
     <%--
     <ul class="tp-revslider-mainul" style="visibility: visible; display: block; overflow: hidden; width: 100%; height: 100%; max-height: none;">	<!-- SLIDE  -->
	<li data-index="rs-1" data-transition="random" data-slotamount="7" data-easein="default" data-easeout="default" data-masterspeed="300" data-thumb="" data-rotate="0" data-saveperformance="off" data-title="Slide" data-description="" class="tp-revslider-slidesli rs-pause-timer-always active-revslide" style="width: 100%; height: 100%; overflow: hidden; z-index: 20; visibility: inherit; opacity: 1;">
		<!-- MAIN IMAGE -->
		<div class="slotholder" style="width: 100%; height: 100%; visibility: inherit; opacity: 1;"><!--Runtime Modification - Img tag is Still Available for SEO Goals in Source - <img src="http://www.coyote.com/wp-content/plugins/revslider/admin/assets/images/dummy.png" style="background-color:#0c0c0c" alt="" data-lazyload="http://www.coyote.com/wp-content/plugins/revslider/admin/assets/images/transparent.png" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="off" class="rev-slidebg defaultimg" data-no-retina="">--><div class="tp-bgimg defaultimg" style="width: 100%; height: 100%; opacity: 1; visibility: inherit; z-index: 20; background-image: url(&quot;http://www.coyote.com/wp-content/plugins/revslider/admin/assets/images/transparent.png&quot;); background-color: rgb(12, 12, 12); background-size: cover; background-position: 50% 0%; background-repeat: no-repeat;" src="http://www.coyote.com/wp-content/plugins/revslider/admin/assets/images/transparent.png"></div></div>
		<!-- LAYERS -->

		<!-- LAYER NR. 1 -->
		<div class="tp-parallax-wrap" style="position: absolute; visibility: visible; left: 0px; top: 0px; z-index: 5;"><div class="tp-loop-wrap" style="position:absolute;"><div class="tp-mask-wrap" style="position: absolute; overflow: visible; height: auto; width: auto;"><div class="tp-caption   tp-resizeme fullscreenvideo rs-parallaxlevel-0 tp-videolayer HasListener videoisplaying" id="slide-1-layer-1" data-x="0" data-y="0" data-width="" data-height="" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="opacity:0;s:300;e:Power3.easeInOut;" data-transform_out="auto:auto;s:300;" data-start="0" data-responsive_offset="on" data-videocontrols="controls" data-videowidth="100%" data-videoheight="100%" data-videomp4="http://www.coyote.com/wp-content/uploads/Hero_Video_AE_10801.mp4" data-videopreload="none" data-videoloop="loopandnoslidestop" data-forcecover="1" data-aspectratio="16:9" data-autoplay="on" style="z-index: 5; visibility: inherit; width: 557px; height: 286px; transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px; white-space: nowrap; max-height: none; max-width: none; opacity: 1; transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1); transform-origin: 50% 50% 0px;"> 
		<div class="html5vid fullcoveredvideo" style="position: relative; top: 0px; left: 0px; width: 100%; height: 100%; overflow: hidden; transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><video style="object-fit: cover; width: 100%; height: 109.55%; transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px; position: absolute; left: 0px; top: -4.77491%; display: block; visibility: inherit; opacity: 1; background-size: cover;" class="" loop="" preload="undefined"><source src="http://www.coyote.com/wp-content/uploads/Hero_Video_AE_10801.mp4" type="video/mp4" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"></video></div><div class="tp-video-controls" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 4px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><div class="tp-video-button-wrap" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px 4px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><button type="button" class="tp-video-button tp-vid-play-pause" style="transition: none; line-height: 9px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 9px;">Pause</button></div><div class="tp-video-seek-bar-wrap" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px 4px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><input type="range" class="tp-seek-bar" value="0" style="transition: none; line-height: 9px; border-width: 1px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 300; font-size: 14px;"></div><div class="tp-video-button-wrap" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px 4px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><button type="button" class="tp-video-button tp-vid-mute" style="transition: none; line-height: 9px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 9px;">Mute</button></div><div class="tp-video-vol-bar-wrap" style="transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px 4px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><input type="range" class="tp-volume-bar" min="0" max="1" step="0.1" value="1" style="transition: none; line-height: 9px; border-width: 1px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 300; font-size: 14px;"></div></div><div class="tp-video-play-button" style="transition: none; line-height: 17px; border-width: 0px; margin: -18px 0px 0px -18px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"><i class="revicon-right-dir" style="transition: none; line-height: 36px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 29px;"></i><span class="tp-revstop" style="transition: none; line-height: 14px; border-width: 0px 4px; margin: 11px 0px 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 18px;">&nbsp;</span></div></div></div></div></div>

		<!-- LAYER NR. 2 -->
		<div class="tp-parallax-wrap" style="position: absolute; visibility: visible; left: -1151px; top: -243px; z-index: 6;"><div class="tp-loop-wrap" style="position:absolute;"><div class="tp-mask-wrap" style="position: absolute; overflow: visible; height: auto; width: auto;"><div class="tp-caption   tp-resizeme rs-parallaxlevel-0" id="slide-1-layer-2" data-x="[&#39;center&#39;,&#39;center&#39;,&#39;center&#39;,&#39;center&#39;]" data-hoffset="[&#39;0&#39;,&#39;0&#39;,&#39;0&#39;,&#39;0&#39;]" data-y="[&#39;middle&#39;,&#39;middle&#39;,&#39;middle&#39;,&#39;middle&#39;]" data-voffset="[&#39;0&#39;,&#39;0&#39;,&#39;0&#39;,&#39;0&#39;]" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="opacity:0;s:300;e:Power3.easeInOut;" data-transform_out="auto:auto;s:300;" data-start="0" data-responsive_offset="on" style="z-index: 6; visibility: inherit; transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px; white-space: nowrap; min-height: 0px; min-width: 0px; max-height: none; max-width: none; opacity: 1; transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1); transform-origin: 50% 50% 0px;"><img src="./Coyote - Freight Broker & Logistics Services Provider_files/Video-Overlay_Mask_23_4000.png" alt="" width="4000" height="1080" data-ww="" data-hh="" data-lazyload="http://www.coyote.com/wp-content/uploads/Video-Overlay_Mask_23_4000.png" data-no-retina="" style="width: 2860px; height: 772.2px; transition: none; line-height: 17px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: 0px; font-weight: 400; font-size: 11px;"> 
		</div></div></div></div>

		<!-- LAYER NR. 3 -->
		<div class="tp-parallax-wrap" style="position: absolute; visibility: visible; left: -8px; top: 93px; z-index: 7;"><div class="tp-loop-wrap" style="position:absolute;"><div class="tp-mask-wrap" style="position: absolute; overflow: visible; height: auto; width: auto;"><div class="tp-caption homelargeboldwhite   tp-resizeme rs-parallaxlevel-0" id="slide-1-layer-3" data-x="[&#39;center&#39;,&#39;center&#39;,&#39;center&#39;,&#39;center&#39;]" data-hoffset="[&#39;0&#39;,&#39;0&#39;,&#39;0&#39;,&#39;0&#39;]" data-y="[&#39;middle&#39;,&#39;middle&#39;,&#39;middle&#39;,&#39;middle&#39;]" data-voffset="[&#39;40&#39;,&#39;40&#39;,&#39;40&#39;,&#39;40&#39;]" data-width="none" data-height="none" data-whitespace="nowrap" data-transform_idle="o:1;" data-transform_in="opacity:0;s:300;e:Power3.easeInOut;" data-transform_out="auto:auto;s:300;" data-start="0" data-splitin="none" data-splitout="none" data-responsive_offset="on" style="z-index: 7; white-space: nowrap; font-size: 86px; line-height: 79px; font-weight: 600; border-color: rgb(255, 214, 88); visibility: inherit; transition: none; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: -4px; min-height: 0px; min-width: 0px; max-height: none; max-width: none; opacity: 1; transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1); transform-origin: 50% 50% 0px;">REAL. SMART. <br style="transition: none; line-height: 79px; border-width: 0px; margin: 0px; padding: 0px; letter-spacing: -4px; font-weight: 600; font-size: 86px;">
LOGISTICS. 
		</div></div></div></div>
	</li>
</ul>
      --%>
      
      
  </body>
</html>