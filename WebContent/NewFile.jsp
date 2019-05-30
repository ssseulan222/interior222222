<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<style type="text/css">
.check {
	height: 60px;
	width: 60px;
	opacity: 0;
	padding-left: 30px;
	position: relative;
	left: 72px;
}
</style>
<script type="text/javascript">
	$(function() {
		$('.check').hover(function() {
			var select = $(this).attr('title');
			$('.star').each(function() {
				if ($(this).attr('title') == select) {
					$(this).attr('src', './img/star_hover.png');
				}
			});
		}, function() {
			if (!$(this).prop('checked')) {
				var select = $(this).attr('title');
				$('.star').each(function() {
					if ($(this).attr('title') == select) {
						$(this).attr('src', './img/star.png');
					}
				});
			} else {
				$('.check').each(function() {
					if ($(this).prop('checked')) {
						var select = $(this).attr('title');
						$('.star').each(function() {
							if ($(this).attr('title') == select) {
								$(this).attr('src', './img/star_select.png');
							}
						});
					} else {
						var select = $(this).attr('title');
						$('.star').each(function() {
							if ($(this).attr('title') == select) {
								$(this).attr('src', './img/star.png');
							}
						});
					}
				});
			}

		});

		$('.check').click(function() {
			var c = $(this).prop('checked');
			var check = true;
			var select = $(this).attr('title');

			if (c == true) {
				$('.star').each(function() {
					if ($(this).attr('title') == select) {
						$(this).attr('src', './img/star_select.png');
					}
				});
			} else {
				$('.star').each(function() {
					if ($(this).attr('title') == select) {
						$(this).attr('src', './img/star.png');
					}
				});
			}
		});

	});
</script>
</head>
<body>
	<div class="point">
		<span> <input type="checkbox" value="1" class="check" title="1">
			<img alt="star" src="./img/star.png" class="star" title="1">
		</span> <span> <input type="checkbox" value="2" class="check"
			title="2"> <img alt="star" src="./img/star.png" class="star"
			title="2">
		</span> <span> <input type="checkbox" value="3" class="check"
			title="3"> <img alt="star" src="./img/star.png" class="star"
			title="3">
		</span> <span> <input type="checkbox" value="4" class="check"
			title="4"> <img alt="star" src="./img/star.png" class="star"
			title="4">
		</span> <span> <input type="checkbox" value="5" class="check"
			title="5"> <img alt="star" src="./img/star.png" class="star"
			title="5">
		</span>
	</div>
</body>
</html>