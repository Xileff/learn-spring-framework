<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navbar.jspf" %>
<div class="container">
    <h1>Hi ${name}</h1>
    <table class="table">
        <thead>
            <tr>
                <td>Id</td>
                <td>Description</td>
                <td>Target Date</td>
                <td>Done</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                    <td><a href="update-todo?id=${todo.id}" class="btn btn-warning">Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<%@ include file="commons/footer.jspf"%>