var videoLinks = document.getElementsByTagName('a');
console.log(videoLinks.length);
for (var i = 0; i < videoLinks.length; i++) {
	var videoLink = videoLinks[i];
	var thumbnailImg = document.createElement('img');
	thumbnailImg.setAttribute('src', (i+1)+".jpg");
	videoLink.appendChild(thumbnailImg);
}

