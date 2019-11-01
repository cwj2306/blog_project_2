<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Ajax 테스트</h1>
	<hr />

	<div id="demo">
		1
	</div>
	<button type="button" onclick="loadDoc()">Change count</button>

	<script>
		function loadDoc() {
			var xhttp = new XMLHttpRequest();
			
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					document.querySelector("#demo").innerHTML = this.responseText;
				}
			};
			
			xhttp.open("POST", "http://localhost:8000/blog/test", true);
			xhttp.send("hello");
		}
	</script>

</body>
</html>