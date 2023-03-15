<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<jsp:include page="layouts/header.jsp" />
<section>
    <h1>
        <c:out value="${users.name}" />
    </h1>
</section>
<jsp:include page="layouts/footer.jsp" />