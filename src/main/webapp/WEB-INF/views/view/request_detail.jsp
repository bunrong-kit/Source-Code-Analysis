<body onload="load()">
<article class="content cards-page">
                    	
                    <section class="section">
                        <div class="row sameheight-container">
                            <div class="col-md-12">
                                <div class="card card-block sameheight-item">
                                    <div class="title-block">
                                        <h3 class="title"> Booking Request Information </h3> <br>
                                        <button type="button" class="btn btn-oval btn-success pull-left" onClick="goTO()" style="color:white;margin: 0 1% 0 2%;">Confirm</button>
                                        <button type="button" class="btn btn-oval btn-danger pull-left" onClick="reject()" style="color:white;">Reject</button>
                                        
                      
                                    </div>
                                    
                                    
                                    
                                   
                                    
                                    <form class="form-inline" id ="myForm">
                                    	<div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Name</label>
                                            <input type="text" class="form-control" id="uname" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">From</label>
                                            <input type="text" class="form-control" id="from" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">To</label>
                                            <input type="text" class="form-control" id="to" style="width: inherit;"> 
                                        </div>
                                        
                               			<div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Departure Date</label>
                                            <input type="text" class="form-control" id="dept_date" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Departure Time</label>
                                            <input type="text" class="form-control" id="dept_time" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Requested On</label>
                                            <input type="text" class="form-control" id="requestedOn" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Booking Time Allowance</label>
                                            <input type="text" name="time" class="form-control" id="timeAllowance" style="width: inherit;"> 
                                        </div>
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Number of bookings</label>
                                            <input type="text" class="form-control" id="no_booking" style="width: inherit;"> 
                                        </div>
                                       
                                        
                                        <div class="form-group col-md-4" style="margin-bottom:2%;">
                                            <label for="exampleInputPassword3"  style="margin-right:4%;">Status</label>
                                            <input type="text" class="form-control" id="status" style="width: inherit;"> 
                                        </div>
                                        <div class="form-group col-md-10" style="margin-bottom:2%;">
                                            <button class="btn btn-default" id="btnCancel" onclick="parent.history.go(-1)"><i class="fa fa-angle-left"></i><b>Back</b></button>
                                        </div>
                                        <button type="submit" id ="bsubmit" style="display:none;">aa</button>
                                        
                                        
                                        
                               
                                       
                                        
                                    </form>
                                </div>
                            </div>
                        </div>
                    </section>
                    
                </article>
                
</body>
<script type="text/javascript">
var id;
load = function () {
	var data = ${data};
	var request = data.request;
	var locations = data.locations;
	id= parseInt(request.id);
	console.log(data)
	$("#uname").val(request.user_id);
	$("#from").val(searchLocation(request.source_id,locations));
	$("#to").val(searchLocation(request.destination_id,locations));
	$("#dept_date").val(formatDate(request.dept_date));
	$("#dept_time").val(request.dept_time);
	$("#requestedOn").val(formatDate(request.created_at));
	$("#no_booking").val(request.number_of_booking);
	$("#description").val(request.description);
	$("#status").val(request.status);
	
	
	
	$("input").prop('disabled', true);
	$("#timeAllowance").prop('disabled', false);
}

$(document).ready(function(){
	$("#bookingRequestMng").addClass("active");
	$("#myForm").on('submit',function(e){
		e.preventDefault();
		$.ajax({
    		url:'confirmRequest',
    		type:'GET',
    		data:{	id:id,
    				provided_time:toDate($("#timeAllowance").val(),'h:m')
    			},
    		traditional: true,			
    		success: function(response){
    				if(response.status=="1")
    					{
    					setTimeout(function() {
    				        swal({
    				            title: "Done!",
    				            text: response.message,
    				            type: "success"
    				        }, function() {
    				            window.location = "admin_booking_request";
    				        });
    				    }, 10);
    					
    					}
    				//var obj = jQuery.parseJSON(response);
    				else 
     					swal("Oops!", response.message, "error")    
    				
    				},
    		error: function(err){
    				console.log(JSON.stringify(err));
    				
    				}
    		
    			});	
	});
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

goTO = function(){
	$('#bsubmit').trigger('click');
}
reject = function(){
	
	$.ajax({
		url:'rejectRequest',
		type:'GET',
		data:{	id:id	},
		traditional: true,			
		success: function(response){
				if(response.status=="1")
					{
					setTimeout(function() {
				        swal({
				            title: "Done!",
				            text: response.message,
				            type: "success"
				        }, function() {
				            window.location = "admin_booking_request";
				        });
				    }, 10);
					
					}
				//var obj = jQuery.parseJSON(response);
				else 
 					swal("Oops!", response.message, "error")    
				
				},
		error: function(err){
				console.log(JSON.stringify(err));
				
				}
		
			});	
	
}


function toDate(dStr,format) {
	var now = new Date();
	if (format == "h:m") {
 		now.setHours(dStr.substr(0,dStr.indexOf(":")));
 		now.setMinutes(dStr.substr(dStr.indexOf(":")+1));
 		now.setSeconds(0);
 		return now.getHours()+":"+now.getMinutes()+":"+now.getSeconds();
	}else 
		return "Invalid Format";
}

	
</script>
