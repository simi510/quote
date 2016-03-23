

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />


 <div class="container">

    <title>Log in</title>
    <h1>Login in</h1>
    <p>Enter your information to log in.</p>
    <p><i>${message}</i></p>
   
        
        
          
     <div class="row">
                 

 
     

      <form action="loginAccount" method="post" class="form-horizontal" role="form">
        <div class="row">
           <c:if test ="${requestScope.errorMsg!=null}"> 
            <div class="alert alert-warning">${errorMsg== null ? 'There was a issue' : errorMsg}</div>
           </c:if>
          <div class="col-md-2"><label>Username</label>

            <input type="hidden" name="formType"  value="login" /> 
            <input type="text" class="form-control" name="username" /><br />
            <label>Password</label><br />
            <input type="password" class="form-control" name="password" /><br /> 
            <button type="submit"   value="Login">Login</button>
          </div>
        </div>
      </form>
 
         
    </div>
       

        
         
<br /><br /> <form action="" method="post">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return Home">
    </form>
                  
                  
                </div>
 
             
                  
                  

        
 <c:import url="/include/footer.jsp" /> 