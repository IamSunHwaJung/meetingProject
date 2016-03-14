<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE HTML>

<html>

  <head>

    <meta name="viewport" content="initial-scale=1.0,  width=device-width" />

    <meta charset="utf-8">

    <title>map App</title>

    <!-- 참조 plugin -->

    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.css" />

 <script src="http://code.jquery.com/jquery-1.6.4.min.js"></script>

 <script src="http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.js"></script>

    <script type="text/javascript" charset="utf-8" src="cordova.js"></script>

    

 <!--구글맵 appi 라이브러리 파일  -->

 <script src="http://maps.google.com/maps/api/js?sensor=true&language=ko"></script>

 

 <!--jquery-ui-map 플러그인  -->

 <script src="ui/min/jquery.ui.map.full.min.js"></script>

 <script src="ui/jquery.ui.map.extensions.js"></script>

 

 <!-- 사용자정의 -->

 <script src="js/myLocation.js"></script> <!-- 현재위치검색 -->

 <script src="js/myAddress.js"></script> <!-- 특정위치검색 -->

 <script src="js/myRoute.js"></script>    <!-- 경로검색 -->

 

 <style>

 #mapArea1, #mapArea2, #mapArea3 {width:100%; height:330px;}

 </style>

 

 <script charset="utf-8">

      $(document).ready(function(){

       initPhoneGap();  //폰갭api사용여부 확인

       

       //현재위치 맵표시 버튼클릭시 호출

       $("#btnLocationSearch").click(function(){ getMyLocation() });

       

       //검색위치 맵표시 버튼클릭시 호출

       $("#btnAddressSearch").click(function(){ getMapAddress() });

       

       //경로 맵표시 버튼클릭시 호출

       $("#btnRouteSearch").click(function(){ getMyRoute() });

       

      });//end of $(document).ready()

      

        var onDeviceReady = function() {

            navigator.notification.alert("OnDeviceReady fired.");

        };




        function initPhoneGap() {

            document.addEventListener("deviceready", onDeviceReady, true);

        }   

</script>

</head>

<body>

 <!-- 메인화면 : 현 위치 표시 페이지 시작------------------------------------------------------------------>

 <div data-role="page" id="myLocationSearchPage" data-position="fixed">

   <div data-role="header">

    <h1>Google 지도활용</h1>

    </div>

    

    <div data-role="content" >

     <div class="ui-bar ui-bar-e" id="box1">

      위도:<br/>

      경도:

     </div>

     <input type="button" value="현재 위치 맵 표시" id="btnLocationSearch"/>

     <div id="mapArea1"></div> <!-- 지도출력되는 영역 -->

    </div>

    

    <div data-role="footer"  data-position="fixed">

     <div data-role="navbar">

      <ul>

       <li><a href="#myLocationSearchPage">현위치검색</a></li>

       <li><a href="#myAddressSearchPage">지도 검색</a></li>

       <li><a href="#myRouteSearchPage">경로 검색</a></li>   

      </ul>

     </div>

    </div>

 </div>

 

 

  <!-- 2번째화면 : 지도검색 페이지 시작------------------------------------------------------------------>

 <div data-role="page" id="myAddressSearchPage" data-position="fixed">

   <div data-role="header">

    <h1>Google 지도활용</h1>

    </div>

    

    <div data-role="content" >

     <div class="ui-bar ui-bar-e" id="box2">

      <label for="addSearch">지역명:</label>

      <input type="search" name="addSearch" id="addSearch" placeholder="예)경영기술개발원"/>

     </div>

     <input type="button" value="검색 위치 맵 표시" id="btnAddressSearch"/>

     <div id="mapArea2"></div> <!-- 지도출력되는 영역 -->

    </div>

    

    <div data-role="footer"  data-position="fixed">

     <div data-role="navbar">

      <ul>

       <li><a href="#myLocationSearchPage">현위치검색</a></li>

       <li><a href="#myAddressSearchPage">지도 검색</a></li>

       <li><a href="#myRouteSearchPage">경로 검색</a></li>   

      </ul>

     </div>

    </div>

 </div>

 

 

  <!-- 3번째화면 : 경로검색 페이지 시작------------------------------------------------------------------>

 <div data-role="page" id="myRouteSearchPage" data-position="fixed">

   <div data-role="header">

    <h1>Google 지도활용</h1>

    </div>

    

    <div data-role="content" >

     <div class="ui-bar ui-bar-e" id="box3">

      <label for="strSearch">출발지:</label>

      <input type="search" name="strSearch" id="strSearch" placeholder="예)경영기술개발원"/>

      <label for="endSearch">도착지:</label>

      <input type="search" name="endSearch" id="endSearch" placeholder="예)구로역"/>

     </div>

     <input type="button" value="경로 맵 표시" id="btnRouteSearch"/>

     <div id="mapArea3"></div> <!-- 지도출력되는 영역 -->

    </div>

    

    <div data-role="footer"  data-position="fixed">

     <div data-role="navbar">

      <ul>

       <li><a href="#myLocationSearchPage">현위치검색</a></li>

       <li><a href="#myAddressSearchPage">지도 검색</a></li>

       <li><a href="#myRouteSearchPage">경로 검색</a></li>   

      </ul>

     </div>

    </div> 

 </div>

 

</body>

</html>


