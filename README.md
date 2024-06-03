# Parking Management System

This project is a parking management system implemented in Java. It allows you to manage a parking lot by adding and removing vehicles, and checking the current status of the parking lot.

## Features

- Add a vehicle to the parking lot.
- Remove a vehicle from the parking lot.
- Check the current status of the parking lot.

## Classes

- `Vehiculo`: This is the base class for vehicles. It has attributes for space and ID.
- `Coche`: This class represents a car. It inherits from `Vehiculo`.
- `Camion`: This class represents a truck. It inherits from `Vehiculo`.
- `Parking`: This class represents the parking lot. It has methods to add and remove vehicles, and to check the current status of the parking lot.
- `BD`: This class is used for database connectivity.
- `Controller`: This class controls the flow of the application.
- `ShowParking`: This class is used to display the user interface.

## Database

The application uses a PostgreSQL database to store information about the vehicles in the parking lot. The database contains a table `Vehiculos` with fields for `id`, `tipo`, and `ocupado`.

## Setup

1. Set up a PostgreSQL database and create a table `Vehiculos` as described above.
2. Update the database connection details in the `BD` class.
3. Run the `App` class to start the application.

## Testing

Unit tests are provided in the `TestParking` class. You can run these tests to verify the functionality of the `Parking` class.

## Future Work

- Implement a graphical user interface using Java Swing.
- Add more features such as different types of vehicles, parking fees, etc.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
