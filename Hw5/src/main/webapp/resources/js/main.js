$(document).ready(function() {
    $('.infoBtn').on('click', function(event) {
		var studentId = $(this).attr('entryIndex');
		console.log(bookId);
	});

    $('.removeBtn').on('click', function(event) {
		var bookId = $(this).attr('entryIndex');
		$.get("/books/remove/" + bookId);
        window.location.reload();
	});


	$('#consoleTestBtn').on('click', function(event) {
		console.log($('#myInput').val());
	});

});