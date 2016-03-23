

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />


 <div class="container">

    <title>Sign Up</title>
    <h1>Sign Up</h1>
    <p>Enter your information to sign up.</p>
    <p><i>${message}</i></p>
   
        
        
          
     <div class="row">
                 

 
          <form action="createAccount" method="post" class="form-horizontal" role="form">
        <div class="row">
          <input type="hidden" name="formType" value="create" />

          <div class="col-md-4">
            <label>Username</label> <input type="text" class="form-control" name=
            "username" /><br />
            
             <label>Firstname</label> <input type="text" class="form-control" name=
            "firstname" /><br />
             <label>Lastname</label> <input type="text" class="form-control" name=
            "lastname" /><br />
            
            <label>Password</label> <input type="password" class="form-control" name=
            "password" /><br />
            <label>Email</label> <input type="email" class="form-control" name=
            "email" /><br />
            <button type="submit" class="btn btn-primary btn-block" value="Create">Create</button>


                     </div>    
             </div>
      </form>


        
         
<br /><br /> 
<button><a href="index.jsp">Return Index</a></button>


      </div>
    </div>       

             
                  
                  

        
 <c:import url="/include/footer.jsp" /> 