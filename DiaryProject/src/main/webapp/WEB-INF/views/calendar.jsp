<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='/static/fullcalendar/lib/main.css' rel='stylesheet' />
<script src='/static/fullcalendar/lib/main.js' ></script>
<script>
	document.addEventListener('DOMContentLoaded', function() {
		var calendarEl = document.getElementById('calendar');
		var calendar = new FullCalendar.Calendar(calendarEl, {
			initialView : 'dayGridMonth'
		});
		calendar.render();
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>MyCalendar</h1>
	<div id='calendar'></div>
</body>
</html>