<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Enter Todo Details</h1>
	<form:form method="POST" modelAttribute="todo">
		<div class="col-6 mb-3">
			<label for="description" class="form-label">Description</label>
			<form:input type="text" cssClass="form-control" id="description"
				name="description" aria-describedby="descriptionHelp"
				path="description" required="required" />
			<form:errors path="description" id="descriptionHelp"
				cssClass="form-text text-danger" />
		</div>
		<div class="col-6 mb-3">
			<label for="targetDate" class="form-label">Target Date</label>
			<form:input type="text" cssClass="form-control datepicker"
				id="description" name="targetDate" aria-describedby="targetDateHelp"
				path="targetDate" required="required" />
			<form:errors path="targetDate" id="targetDateHelp"
				cssClass="form-text text-danger" />
		</div>
		<form:input path="id" type="hidden" />
		<form:input path="done" type="hidden" />
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
	$('.datepicker').datepicker({
		format : 'yyyy-mm-dd',
	});
</script>