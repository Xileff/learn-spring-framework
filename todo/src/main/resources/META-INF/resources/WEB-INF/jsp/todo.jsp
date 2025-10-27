<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navbar.jspf" %>
<div class="container">
    <h1>Todo Detail</h1>
    <form:form method="post" modelAttribute="todo">
        <form:hidden path="id"/>
        <form:hidden path="done" />
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <input type="submit" class="btn btn-success">
    </form:form>
</div>
<%@ include file="commons/footer.jspf"%>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy/mm/dd'
    });
</script>