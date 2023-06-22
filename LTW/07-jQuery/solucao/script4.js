$('h1').funText(50, 'rainbow');

var thumbnailCallback = function(e) {
	e.preventDefault();
	linkUrl = this.href;
	var urlList = linkUrl.split("/");
	urlList.splice(3,0,"embed");
	urlList[2] = "www.youtube.com";
	var embedUrl = urlList.join("/");
	var videoWatcher = $('#player');
	videoWatcher.attr('src', embedUrl);
}

var thumbnailify = function(videoLink) {
	var thumbnailImg = $('<img>');
	thumbnailImg.attr('src', (i+1)+".jpg");
	videoLink.innerHTML = "";
	videoLink.append(thumbnailImg);
	linkUrl = videoLink.attr('href');
	videoLink.on('click', thumbnailCallback);
};

var videoLinks = $('a');
for (var i = 0; i < videoLinks.length; i++) {
	var videoLink = $(videoLinks[i]);
	var linkUrl = videoLink.attr('href');
	thumbnailify(videoLink);
}