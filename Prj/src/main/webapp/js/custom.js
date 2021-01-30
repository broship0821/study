
//ㅅㅂ 왜 여기선 자동완성 안되냐        HelloWeb에서 ex37.js 파일에다 쓴다음 여기에 복사
//버튼 클릭하면 insertBoard 페이지로 넘어가게
const writeBtn = document.querySelector(".btn-write");

writeBtn.addEventListener("click", function(e) {
	location.href="/insertBoard.html";
});