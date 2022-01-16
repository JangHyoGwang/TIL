// 외부 스크립트 방식 
window.onload = function() { // html태그가 다 로드가 될때까지 기다렸다가 그 다음에 js코드를 실행한다.
    var test1Tag = document.getElementById("test1");
    var test2Tag = document.getElementById("test2");
    
    test1Tag.onclick = function () { // (익명함수) 클릭했을때 함수를 실행해라. -> 고전 이벤트 모델 
        document.getElementById("area1").innerHTML = "test1()이 실행되었습니다.<br>";
    }
    
    test2Tag.onclick = function () {
        document.querySelector("#area1").innerHTML = "test2()가 실행되었습니다.<br>";
    }
    var btnTag = document.querySelector("#btn1");
    btnTag.addEventListener("reset", function () { // 전달값으로 익명함수 전달.
        document.querySelector("#area3").innerHTML = "표준 이벤트 모델로 실행되었습니다.";
    });   
};

function inlineFunc() { // (기명함수) 
    document.querySelector("#area2").innerHTML = "inlineFunc()가 실행되었습니다.<br>";
}