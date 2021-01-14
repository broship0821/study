window.onload = function(){
	//속성이 아닌 객체를 가져옴
	const kong = document.getElementById('kong');
	
	if(kong){//kong이 null이 아니면, 객체가 만들어졌으면
		//kong 버튼에 이벤트 집어넣기
		if(kong.addEventListener)//표준형이면
			kong.addEventListener("click", Kaja.JJIK, false);
		else
			kong.attachEvent('onclick', Kaja.JJIK); //IE 7,8
	}
	
}

const Kaja = { //Kaja객체, new 없어도 됨  Kaja.메소드() Kaja.속성 으로 사용
		JJIK: function(event) {
			if(document.getElementById('kaja1')!==null &&
					document.getElementById('kaja2')!==null){
				
				document.getElementById('kaja1').innerHTML = "babo";
				document.getElementById('kaja2').innerHTML = "ondal";
			}
		}
}