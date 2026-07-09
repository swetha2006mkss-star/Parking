# Parking Management System 🚗🅿️

A simple **Java Console-Based Parking Management System** that allows users to manage vehicle parking operations efficiently using object-oriented programming concepts.

## Features

* Park a new vehicle
* Remove a parked vehicle
* Search for a vehicle using vehicle number
* View all parked vehicles
* Display available parking slots
* Prevent duplicate vehicle entries
* Prevent multiple vehicles from occupying the same slot

## Technologies Used

* Java
* ArrayList Collection Framework
* Object-Oriented Programming (OOP)
* Scanner Class for User Input

## Project Structure

```
Main.java
│
├── Vehicle Class
│   ├── vehicleNo
│   ├── ownerName
│   ├── vehicleType
│   └── slotNo
│
└── Main Class
    ├── parkVehicle()
    ├── removeVehicle()
    ├── searchVehicle()
    ├── viewAllVehicles()
    ├── showFreeSlots()
    └── main()
```

## Menu Options

```
=== Parking Management System ===
1. Park Vehicle
2. Remove Vehicle
3. Search Vehicle
4. View All Vehicles
5. Show Free Slots
6. Exit
```

## Sample Execution

### Park Vehicle

```
Enter Vehicle Number: TN45AB1234
Enter Owner Name: Nithya
Enter Vehicle Type: Car
Enter Slot Number: 3

Vehicle Parked Successfully
```

### Search Vehicle

```
Enter Vehicle Number: TN45AB1234

Vehicle Number: TN45AB1234
Owner Name: Nithya
Vehicle Type: Car
Slot Number: 3
```

### Remove Vehicle

```
Enter Vehicle Number: TN45AB1234

Vehicle Removed
```

## Validation Implemented

* Duplicate vehicle numbers are not allowed.
* Parking slot number must be between 1 and 10.
* Occupied slots cannot be assigned to another vehicle.
* Vehicle search and removal handle invalid vehicle numbers gracefully.

## Concepts Demonstrated

* Classes and Objects
* Constructors
* Encapsulation
* ArrayList Operations
* Loops and Conditional Statements
* Method Creation and Reusability

## Future Enhancements

* Automatic slot allocation
* Parking fee calculation
* Vehicle entry and exit timestamps
* File or database storage
* GUI implementation using Java Swing or JavaFX
* Admin login and authentication

## Author

**Nithyashree N B**
B.E Computer Science and Engineering
J.J. College of Engineering and Technology

## License

This project is developed for learning and educational purposes.
