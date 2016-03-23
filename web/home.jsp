<%-- 
    Document   : home.jsp
    Created on : Jan 11, 2016, 6:32:14 PM
    Author     : Simi510

jsp should not have java code
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />

  <div class="container">
    
        <h3 id="regional" align="center"> Welcome ${sessionScope.User.username} ! </h3>

        <div class="row">
           <c:if test ="${requestScope.errorMsg!=null}"> 
            <div class="alert alert-warning">${errorMsg== null ? 'There was a issue' : errorMsg}</div>
           </c:if>
          <div class="col-md-4">


<img src="${pageContext.request.contextPath}/include/adminpanel.png" class="img-responsive"  id= "head"  alt="Responsive image" />
         <a href="${pageContext.request.contextPath}">
</a>
        <a href="/CS3520/AdminServlet"> Admin Page</a>
        
        <h3>Select an option...</h3>
        
        <a href="AdminServlet" class="btn btn-warning btn-info btn-lg" > Edit Users</a><br><br>
        
                <form action="QuoteServlet" method="post" class="form-horizontal" role="form">
        
                <input type="hidden" name="formType" value="quote" />
        
         <a href="QuoteServlet" name="typeForm" value="quote" class="btn btn-primary btn-info btn-lg" >View Quotes</a>
                </form>
         




          </div>
         </div>
        </div>
      
<c:import url="/include/footer.jsp" />