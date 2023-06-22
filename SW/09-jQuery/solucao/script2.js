var videoLinks = $('a');
for(var i = 0; i < videoLinks.length; i++) {
	var videoLink = $(videoLinks[i]);
	var thumbnailImg = $('<img>');
	thumbnailImg.attr('src', (i+1)+".jpg");
	videoLink.append(thumbnailImg);
}