

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />
<div class="container">

    <title>Contact Us</title>
    <h1>Contact Us</h1>
    <p>Send us a message below.</p>
    <p><i>${message}</i></p>
   
        
     
          
     <div class="row">
                 

     <div class="col-md-4">
       

         <form method="post" action="//flipmail.co/api/fAB9a3bjgAPrDVJfU2UN">
    <input type="hidden" name="_subject" value="CS3520 Website">
    <input type="hidden" name="_replyto" value="simi510@gmail.com">
    <input type="hidden" name="_after" value="http://localhost:8080/CS3520/index.jsp">
    <input type="text" name="_honey" value="" style="display:none">
    <label>Name : </label>   <input type="text" class="form-control" name="name" placeholder="Your name"><br>
   <label>Email: </label>  <input type="email" class="form-control"name="email" placeholder="Your email"><br>
  <label>Comment: </label>  <textarea name="message"  class="form-control" rows="5" placeholder="Your message"></textarea> <br>
    <button type="submit" class="btn btn-primary btn-block">Submit Form</button>
</form>
         <br><br><img src="${pageContext.request.contextPath}/include/contact.jpg" class="img-responsive center-block"  id= "head"  alt="Responsive image" />
                 
                  
                </div>
         <div class="col-md-2">
             
             <h1>Email:</h1> sample@example.com <br>
           <h1>Phone: </h1> (510)-555-5555<br>
           <h1>Fax: </h1>(510)-555-5556<br>
           <h1>Skype: </h1>ExampleUser
         <h1>Address: </h1><a href="https://goo.gl/maps/Ju4YpMPRAuo" >25800 Carlos Bee Blvd<br> Hayward, CA 94542</a>
         </div>
   <div class="col-md-6">
       
                   <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d674.6746242464287!2d-122.04776574877395!3d37.65559382252634!2m3!1f270!2f41.49603439153316!3f0!3m2!1i1024!2i768!4f20!3m3!1m2!1s0x808f938bac8d448b%3A0xbb5e0e05ccf4fd12!2sCalifornia+State+University%2C+East+Bay!5e1!3m2!1sen!2sus!4v1457195077314" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
   </div>
                   
                    </div>
     </div>
             
                 
                  

        
 <c:import url="/include/footer.jsp" /> 