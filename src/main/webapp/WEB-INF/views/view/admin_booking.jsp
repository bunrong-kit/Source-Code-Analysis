<body onload="load()">
<article class="content cards-page">
                    <div class="title-block">
                        <h3 class="title"> Bookings </h3>
                         <p class="title-description"> View all bookings </p> 
                         <button type="button" class="btn btn-pill-right btn-info pull-right" style="color:white;" onclick="location.href='historical_booking';">View all historical bookings <i class="fa fa-angle-right"></i></button>
                    </div>
                    <section class="section">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card">
                                    <div class="card-block">
                                        <div class="card-title-block">
                                            <h3 class="title"> Current and future bookings </h3>
                                            
                                        </div>
                                        <section class="example">
                                            <div class="table-responsive">
                                                <table class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                        <tr>
                                                            <th>No</th>
                                                            <th>Name</th>
                                                            <th>From</th>
                                                            <th>To</th>
                                                            <th>Departure Date</th>
                                                            <th>Departure Time</th>
                                                            <th>Number of bookings</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody id="allBooking">
                                                       
                                                    </tbody>
                                                </table>
                                            </div>
                                        </section>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </article>
                
</body>
<script>
load = function(){	
	$.ajax({
		url:'getAllCurrentBookings',
		type:'GET',
		success: function(response){
			console.log(response)
			bookings = response.bookings;
			locations = response.locations;
			
			console.log(locations)
			for (var i=0;i<bookings.length;i++)
				{
				var booking = '<tr class="hoverr" data-url="booking_detail?id='+bookings[i].id+'"><td>'+(i+1)+'</td>'
									+'<td>'+bookings[i].user_id+'</td>'
									+'<td>'+searchLocation(bookings[i].source_id,locations)+'</td>'
									+'<td>'+searchLocation(bookings[i].destination_id,locations)+'</td>'
									+'<td>'+formatDate(bookings[i].dept_date)+'</td>'
									+'<td>'+bookings[i].dept_time+'</td>'
									+'<td>'+bookings[i].number_booking+'</td></tr>';
				$("#allBooking").append(booking);				
				}
			$(".hoverr").on('click', function() {
    	    	location.href=$(this).attr('data-url');
    		});
    	},
	error: function(err){
		swal("Oops!", "Cannot get all buses data", "error")
		console.log(JSON.stringify(err));
		}
		
	});
	
}



$(document).ready(function(){
	$("#bookingMng").addClass("active");
});


formatDate =function (date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
      if (day.length < 2) day = '0' + day;

    return [month, day, year].join('-');
};

function searchLocation(id, myArray){
    for (var i=0; i < myArray.length; i++) {
        if (myArray[i].id === id) {
            return myArray[i].name;
        }
    }
}
</script>