<jsp:include page="layouts/header.jsp" />
<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<section>
	<div class="col-md-6 add-form">
		<form:errors path="users.*" />
		<div class="alert alert-secondary" role="alert">
			A simple secondary alert—check it out!
		  </div>
		<form action="add-action" method="post">
			<div class="mb-3">
				<label for="name" class="form-label">User Name</label>
				<input type="text" name="name" class="form-control" id="name" placeholder="Enter Name">
			</div>
			<div class="mb-3">
				<label for="age" class="form-label">Age</label>
				<input type="text" name="age" class="form-control" id="age" />
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email</label>
				<input type="text" name="email" class="form-control" id="email" />
			</div>
			<div class="mb-3">
				<input type="submit" class="btn btn-warning" id="submit" />
			</div>
		</form>
	</div>
</section>
<jsp:include page="layouts/footer.jsp" />