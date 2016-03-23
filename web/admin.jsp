<%-- 
    Document   : admin
    Created on : Jan 27, 2016, 6:35:30 PM
    Author     : Simi510
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/include/header.jsp" />



        <div class="container">
        <h1>Welcome to the Admin Page!!</h1>
        <p>You are logged in as ${sessionScope.User.username}</p>
        <table class="table" >
        <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Username</th>
                <th>Action</th>
            </tr>
        <c:forEach var="user" items="${requestScope.userlist}">
            
            <tr>
                <td class="firstname-cell">${user.firstname}</td>
                <td class="lastname-cell">${user.lastname}</td>
                <td class="email-cell">${user.email}</td>
                <td class="username-cell">${user.username}</td>
                <td>
                    <!-- Trigger the modal with a button -->
                    
              
        <form action="AdminServlet" method="post" class="form-horizontal" role="form">
            
                  <button class = "edit-button btn btn-warning btn-sm" id ="${user.email}" type="button" data-toggle="modal" 
        data-target="#editForm">Edit</button>
        
                <input type="hidden" name="formType" value="delete" />
                <input id = "delete-field" type="hidden" name="email" value="${user.email}"/>
         <button class = "delete-button btn btn-danger btn-sm" id ="${user.email}" type="Submit"  >Delete ${user.username}</button>
        </form>

                </td>
            </tr>
        </c:forEach>

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
            <form action="AdminServlet" method="post" class="form-horizontal" role="form">
              <div class="row">
                <input type="hidden" name="formType" value="edit" />
                <input id = "email-field" type="hidden" name="email" />

                <div class="col-md-12">


                   <label>Firstname</label> <input id = "firstname-field" type="text" class="form-control" name=
                  "firstname" /><br />
                   <label>Lastname</label> <input id = "lastname-field" type="text" class="form-control" name=
                  "lastname" /><br />
                   <label>Username</label> <input id = "username-field" type="text" class="form-control" name=
                  "username" /><br />

                  <label>Password</label> <input id = "password-field" type="password" class="form-control" name=
                  "password" /><br />
                  
                </div>
              </div>
                <input type="submit" class="btn" />
            </form>
          </div>
          
                  
                  
                  
              
                
              </div>
                
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              </div>
            </div>

          </div>
        </div>
      

        
        
        </div>
        
        
<script>
        $(document).ready(function() {
       // alert("hi!");
       $(".edit-button").click(function(){
          var $email = $(this).attr("id");
          var $tableRow = $(this).closest("tr"); 
          //alert($tableRow.children(".firstname-cell").text());
          var $firstname = $tableRow.children(".firstname-cell").text();
          var $lastname = $tableRow.children(".lastname-cell").text();
          var $username = $tableRow.children(".username-cell").text();
          var $password = $tableRow.children(".password-cell").text();
          // set the form input values
          $("#email-field").val($email);
          $("#firstname-field").val($firstname);
          $("#lastname-field").val($lastname);
          $("#username-field").val($username);
          $("#password-field").val($password);    
             
          

       });
    });
</script>

 <c:import url="/include/footer.jsp" />       