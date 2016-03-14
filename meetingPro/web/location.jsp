<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>

<style type="text/css">

@media(min-width:320px)and(max-width:767px)
{
body{background:#F96;}

}
@media(min-width:768px)and(max-width:1024px)
{
	body{background:#C39;}
}
@media(min-width:1025px)
{
	body{backgroun:#663;}
}
 html { height : 100% }

 body { height : 100%; margin: 3% 0% 0% 1.5%; padding: 0 }

 #map_canvas { height : 100% }

</style>

<script type = "text/javascript"

 src = "http://maps.googleapis.com/maps/api/js?sensor=true">

</script>

<script type = "text/javascript">




var map;

var infowindow;

var marker;

//여러 함수에서 같은 변수를 사용할 때에는 함수 밖에 변수를 지정해 놓으면 에러가 안 납니다.




 function initialize(){




  var latlng = new google.maps.LatLng(37.5240220, 126.9265940);

  var myOptions = {

   zoom: 15,

   center:latlng,

   mapTypeId: google.maps.MapTypeId.ROADMAP   

  };

  

  map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

 

   

  google.maps.event.addListener(map, 'click', Setmarker);

  /*지도에 특정 지점에 click event(즉, 특정지점을 클릭함)이 일어나면,

                  아래의 Setmarker라는 함수가 실행되게 함*/

   

  infowindow = new google.maps.InfoWindow();




 };

        //클릭한 지점에 마커를 표시하는 함수입니다.

 function Setmarker(event) {

         marker = new google.maps.Marker({

    position: event.latLng,

    map: map

   } );

      /*marker를 만드는 부분입니다. 

         position 변수는 marker의 위치로 위도/경도 좌표를 변수로 사용합니다. 

         여기서는 click event 때 event 클래스의 저장된 클릭 위치 좌표를 position 변수에 넣었

         습니다.

         map은 마커를 표시할 지도로 당연히 위의 map을 지정합니다. */

   infowindow.setContent("여기에 마커가 표시됩니다.");

   infowindow.open(map,marker);

                /*infowindow를 marker와 연동시킵니다. open() 함수를 쓸 때 열릴 지도 변수 뒤에        

                marker 등의 모든 MVC object와 연동을 시키면 marker의 위치에 infowindow도 같이 나타

                나게 됩니다.*/

  };




 

</script>

</head>

<body onload="initialize()">
<h1>회사 위치</h1>
 

 <div id="map_canvas" style="width:80%; height:60%"></div>

</body>

</html>



