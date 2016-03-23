<%-- 
    Document   : footer
    Created on : Feb 10, 2016, 3:50:59 PM
    Author     : Simi510
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br>
<br>
<br>
</body>
<footer>
    <div class="col-md-10">
        
        <c:if test ="${requestScope.msg!=null}"> 
            <div class="alert alert-success">${msg== null ? 'Yay! ' : msg}</div>
           </c:if>

        <c:if test ="${requestScope.errMsg!=null}"> 
            <div class="alert alert-danger">${errMsg== null ? 'The following error occured ' : errMsg}</div>
           </c:if>
        
           
    <p>Posted by: Simi Singh<br>
    Your Password will be collected.</p>
    <p>Contact information: <a href="mailto:someone@example.com">
   someone@example.com</a>.</p>
  

    <p>&copy; Copyright 2016 Simi Singh</p>
    </div>
    
    <a href="${pageContext.request.contextPath}">
<img src="${pageContext.request.contextPath}/include/footer.png" class="img-responsive" alt="Responsive image" />
</a>
</footer>
</html>