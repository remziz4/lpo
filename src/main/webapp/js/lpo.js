//var serverContext = "[[@{/}]]";

$(function(){


});


function register(){
	$(".alert").html("").hide();
	var formData = JSON.stringify($("form").serializeJSON());
	console.log(formData)

	var csrfToken = $("#csrf").val();
	console.log(csrfToken)
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: "/auth/registerUser",
		headers: {'X-XSRF-TOKEN': csrfToken},
		data: formData,
		success: function (data, textStatus, jqXHR) {
			console.log("Success");
		}
	});
	
}

function getTest(){

	$.get("/searchCoaches?searchCriteria=anything", function (data){
		$("#data").html("ayy");
	})
	.fail (function (data) {
		$("#data").html("sadness");
	});
}