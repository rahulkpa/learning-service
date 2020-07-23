# learning-service

This service is running on eclipse-jetty server. And use of this service is to create the employee details.


Endpoint-Description:

* GET Request : **/employees/{empId}** --It provides employee details if it is available in Postgres DB.

* POST Request : **/employee** - It takes the employee details like empName, emailId, phoneNo, departmentName in request body and returns empId once it gets saved into DB.
  