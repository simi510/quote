

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />


 <div class="container">

    <title>Simi's Mailing List</title>
    <h1>Join our email list</h1>
    <p>To join our email list, enter your name and
       email address below.</p>
    <p><i>${message}</i></p>
   
        
           <div class="row">
          <div class="col-md-4">
          <div class="form-group">
            <form action="EmailListServlet" method="post" class="form-horizontal" role="form">
           
                 <input type="hidden" name="action" value="add">

               
                 
                    <label>Email: </label> <input id = "password-field" type="email" class="form-control" name=
                  "email"  value="${user.email}" /><br />
                   <label>First Name: </label> <input id = "firstname-field" type="text" class="form-control" name=
                  "firstname"  value="${user.firstname}" /><br />
                   <label>Last Name: </label> <input id = "lastname-field" type="text" class="form-control" name=
                  "lastname" value="${user.lastname}" /><br />
             
        <input type="submit" class="btn btn-primary btn-block" value="Join Now" class="margin_left">
    </form>           
        
         <h3>Contact Us</h3>

        <form action="//flipmail.co/api/fAB9a3bjgAPrDVJfU2UN" method="post">
                <label>Name : </label>       <input type="text"  class="form-control" name="name">
 <label>Email: </label>   <input type="email" class="form-control" name="email">
   <input type="text" name="_honey" value="" style="display:none">
   <input type="hidden" name="_confirmation" value="<b>Thank you!</b> We have received your message and will get back to you asap.">
   
   <label>Comment: </label> <textarea class="form-control" rows="5" name="message"></textarea> <br />
  <label>File attachment : </label>  <input type="file"  name="file"> <br />
   <button type="submit" class="btn btn-primary btn-block">Submit Form</button>
    </form>

         

                  
                  
                </div>
              </div>
           
                    <div class="col-md-2"></div>
                   <div class="col-md-6">
                  <img src="${pageContext.request.contextPath}/include/MailingList.png" class="img-responsive center-block"  id= "head"  alt="Responsive image" />
                   </div>
                
                
                   
          </div>
                  
        </div>
            
                  

                   
                  
                  

        
 <c:import url="/include/footer.jsp" /> 