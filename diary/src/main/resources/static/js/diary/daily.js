// 목록으로 이동
$(function(){
	fn_goList();
})

function fn_goList(){
	$('#list').click(function(){
		location.href="/daily";
	})
}
