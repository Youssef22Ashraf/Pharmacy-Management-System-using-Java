# Java GUI Pharmacy Ordering Project

---

## Introduction:

This Java GUI project aims to create a pharmacy management system. It provides functionalities to add drugs to different categories, remove drugs, display drug lists, order drugs, and get the total sales. The system operates within the pharmacy's capacity.

---

## UML Diagram:

*(in UMLdiagram.png)*

---

## Classes and Functionalities:

1. **App Class:**
   - Serves as the entry point for the application.
   - Initializes, launches, and displays the GUI.
   - Contains the `start` method to initialize and display the GUI by loading the "capacity.fxml" file.
   - Contains the `main` method to launch the JavaFX application.

2. **Drugs Class:**
   - Represents a drug entity with attributes such as name, ID, price, available quantity, and category.
   - Includes static lists to store drugs categorized as cosmetics, prescription, and others.

3. **Project Class:**
   - Extends the `Drugs` class and represents the main logic and functionality of the pharmacy management system.
   - Contains methods to handle different functionalities such as switching windows, adding drugs, removing drugs, placing orders, and getting sales.

---

## Additional Functionality (FXML Files):

1. **add.fxml:** UI for adding a drug to the pharmacy system.
2. **capacity.fxml:** UI for setting the capacity of the pharmacy system.
3. **main.fxml:** Main UI of the pharmacy system for navigating functionalities.
4. **place.fxml:** UI for placing an order in the pharmacy system.
5. **remove.fxml:** UI for removing a drug from the pharmacy system.

---

## Running the Application:

To run the application:
1. Compile all Java files.
2. Launch the application using the `App` class.

---

## Contributors:

- [Youssef Ashraf ElNaggar]
- [Youssef.ashraf.elnaggar@gmail.com]
