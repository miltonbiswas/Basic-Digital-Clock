# My Clock Program by Milton Biswas

This is a simple clock program written in Java using Swing. It displays the current time and day of the week in a graphical user interface. The time updates every second, and the day of the week is also shown.

## Features
- Displays the current time in `hh:mm:ss a` format (12-hour clock with AM/PM).
- Displays the current day of the week (e.g., Monday, Tuesday).
- Updates the time every second.

## Requirements
- Java Development Kit (JDK) 8 or later.
- Any Java IDE (Eclipse, IntelliJ IDEA, etc.) or command-line tools.

## Installation
1. Ensure that Java is installed on your system.
   - You can check by running `java -version` in your terminal or command prompt.
2. Clone or download this repository to your local machine.
3. Open the project in your preferred Java IDE or editor.

## Running the Program
1. In your IDE, open the `MyFrame.java` file.
2. Run the program, and the clock window will appear displaying the time and day.

## Code Explanation
- **MyFrame.java**: Contains the main logic for the clock. It uses the `JFrame` to create a window, and `JLabel` to display the time and day.
- **SimpleDateFormat**: Used to format the time (`hh:mm:ss a`) and day (`EEEE`).
- **Thread.sleep(1000)**: Ensures that the time updates every second.


## License
This project is open-source and available under the MIT License.

```

This markdown README provides a clear overview of your clock program, its features, installation steps, and how to run it. You can also add more sections as necessary (e.g., contributing, license details, etc.).
