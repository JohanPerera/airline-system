------------- Airline System -------------

Author - Johan Perera
Github Repository - https://github.com/JohanPerera/airline-system.git 

********* How to run *********

1. create the mysql database using attached sql dump file. (To get sample data)
2. using command prompt type "java -jar AirlineSystem-0.0.1-SNAPSHOT.jar" in AirlineSystem directory.
3. Go to "localhost:8080" using web browser.


********* Folder Structure *********

This application is based on MVC architecture.

********* User Guide ********* 

*Airport Management
	-Save-
		1. Go to "Airport" tab to see all airports. (screenshot - "airports")
		2. Click "Add Airport" to add a new airport.
		3. fill the form and click "Submit" to save the new airport. (screenshot - "airports-new")
	-Update-
		1. Go to "Airport" tab to see all airports. (screenshot - "airports")
		2. Click "Update" button to edit specific airport.
		3. fill the form and click "Submit" to update the airport. (screenshot - "airports-edit")
	-delete-
		1. Go to "Airport" tab to see all airports. (screenshot - "airports")
		2. Click "Delete" button to delete specific airport.

*Flight Management
	-Save-
		1. Go to "Flights" tab to see all flights. (screenshot - "flights")
		2. Click "Add Flight" to add a new flight.
		3. fill the form and click "Submit" to save the new flight. (screenshot - "flights-new")
	-Update-
		1. Go to "Flights" tab to see all flights. (screenshot - "flights")
		2. Click "Update" button to edit specific flight.
		3. fill the form and click "Submit" to update the flight. (screenshot - "flights-edit")
	-delete-
		1. Go to "Flights" tab to see all flights. (screenshot - "flights")
		2. Click "Delete" button to delete specific flight.

*Passenger Management
	-Save-
		1. Go to "Passengers" tab to see all passengers. (screenshot - "passengers")
		2. Click "Add Passenger" to add a new passenger.
		3. fill the form and click "Submit" to save the new passenger. (screenshot - "passengers-new")
	-Update-
		1. Go to "Passengers" tab to see all passengers. (screenshot - "passengers")
		2. Click "Update" button to edit specific passenger.
		3. fill the form and click "Submit" to update the passenger. (screenshot - "passengers-edit")
	-delete-
		1. Go to "Passengers" tab to see all passengers. (screenshot - "passengers")
		2. Click "Delete" button to delete specific passenger.

********* Things I learnt *********

*Hibernate
*JPARepository
*Springboot 
*Bean annotations
*Thymeleaf 

*Different between asterisk and dollar signs in using thymeleaf
*Different between RestController vs Controller annotations
*deployment methods (executable and non-executable jar files)
*Hibernate Relationships and validations (ORM)
