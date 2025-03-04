# Shape Calculator

## 📌 Description
This is a simple Java program to calculate the **area, perimeter, and volume** of different shapes using:
- **Abstract class** (`Shape`)
- **Menu-driven approach**
- **Simple arrays and input handling**

## 📂 Project Structure
```
Shape_Calculator/
│── README.md          # Documentation
│── Main.java          # Entry point (Menu-driven program)
│── Shape.java         # Abstract class with common shape methods
│── Circle.java        # Circle class
│── Rectangle.java     # Rectangle class
│── Square.java        # Square class
│── Sphere.java        # Sphere class
│── Cylinder.java      # Cylinder class
│── Pyramid.java       # Equilateral Pyramid (Square Base) class
```

## 🛠 Methods & Functionality

### **1️⃣ Shape.java (Abstract Class)**
- `String shapeName;` (Now set manually in child classes)
- `calculateArea()`: Abstract method to calculate the area.
- `calculatePerimeter()`: Abstract method to calculate the perimeter.
- `calculateVolume()`: Abstract method to calculate volume (for 3D shapes).

### **2️⃣ Shapes Implementations (Extending Shape)**

#### **📌 Circle.java**
- `shapeName = "Circle";` (Set manually instead of `super("Circle")`)
- `calculateArea()`: Computes **π × r²**
- `calculatePerimeter()`: Computes **2 × π × r**

#### **📌 Rectangle.java**
- `shapeName = "Rectangle";`
- `calculateArea()`: Computes **length × width**
- `calculatePerimeter()`: Computes **2 × (length + width)**

#### **📌 Square.java**
- `shapeName = "Square";`
- `calculateArea()`: Computes **side²**
- `calculatePerimeter()`: Computes **4 × side**

#### **📌 Sphere.java**
- `shapeName = "Sphere";`
- `calculateArea()`: Computes **4 × π × r²**
- `calculateVolume()`: Computes **(4/3) × π × r³**

#### **📌 Cylinder.java**
- `shapeName = "Cylinder";`
- `calculateArea()`: Computes **2 × π × r × (r + h)**
- `calculateVolume()`: Computes **π × r² × h**

#### **📌 Pyramid.java (Equilateral with Square Base)**
- `shapeName = "Pyramid";`
- `calculateArea()`: Computes total surface area using base and slant height.
- `calculatePerimeter()`: Computes **4 × base**
- `calculateVolume()`: Computes **(1/3) × base² × height**

### **3️⃣ Main.java (Menu-Driven Program)**
- Displays menu to select shape.
- Calls appropriate class and methods.
- Supports **area, perimeter, and volume calculations**.

## 🚀 How to Compile & Run
```sh
javac Main.java
java Main
```

## 📎 Repository Link
🔗 **GitHub Repository:** [Assignment_5](https://github.com/pulkit100804/Assignment_5)


