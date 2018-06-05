//var serverContext = "[[@{/}]]";

$(function(){


});


function register(){
	$(".alert").html("").hide();
	var formData= $('form').serialize();

	var csrfToken = $("#csrf").val();
	console.log(csrfToken)
	$.ajax({
		type: "POST",
		url: "/auth/registerUser",
		headers: {'X-XSRF-TOKEN': csrfToken},
		data: formData,
		success: function (data, textStatus, jqXHR) {
			console.log("Success");
		}
	});
	
	/*$.post("/auth/registerUser",formData ,function(data){
		if(data.message == "success"){
			//window.location.href = serverContext +"/successRegister.html";
			console.log("Success");
		}
	})
	.fail(function(data) {
		console.log("Fail")
	});
	*/
}

function getTest(){

	$.get("/searchCoaches?searchCriteria=anything", function (data){
		$("#data").html("ayy");
	})
	.fail (function (data) {
		$("#data").html("sadness");
	});
}