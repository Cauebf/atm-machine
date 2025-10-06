# 🖥️💸 ATM Console Application

## 📌 Table of Contents

- [🖥️💸 ATM Console Application](#-atm-console-application)
  - [🌐 Overview](#-overview)
  - [⚙️ Features](#️-features)
  - [💻 Technologies Used](#-technologies-used)
  - [🗝️ Key Takeaways](#️-key-takeaways)
  - [🚀 How to Run the Project](#-how-to-run-the-project)
    - [✅ Requirements](#-requirements)
    - [📦 Installation](#-installation)
    - [▶️ Running the Application](#️-running-the-application)
  - [🤝 Contributing](#-contributing)
  - [💬 Contact](#-contact)

## 🌐 Overview

**ATM Console Application** is a simple Java-based application that simulates basic ATM operations like checking balance, withdrawing, depositing, and viewing mini statements. It applies **Object-Oriented Programming (OOP)** principles and interfaces to simulate real-world ATM behavior via a command-line interface.

## ⚙️ Features

- ✅ **Login validation** (ATM number & PIN)
- ✅ **View available balance**
- ✅ **Withdraw money** (in multiples of 500 only)
- ✅ **Deposit money**
- ✅ **View mini statement** (transaction history)
- ✅ **Exit the application**

## 💻 Technologies Used

- **Java**: The core programming language used to build the entire application.
- **OOP Principles**: Encapsulation, abstraction via interfaces, and class design.
- **Java Collections**: `HashMap` used to store transaction history.
- **Scanner**: For user input via command line.

## 🗝️ Key Takeaways

1. Learned how to simulate an ATM system using Java.
2. Practiced using interfaces and class implementation.
3. Handled basic input validation, arithmetic logic, and data storage.
4. Reinforced concepts like loops, conditionals, encapsulation, and real-world modeling.

## 🚀 How to Run the Project

### ✅ Requirements

Before running the project, ensure you have:

- **Java JDK 8 or higher**
- A **terminal/command prompt** or an IDE like IntelliJ IDEA or Eclipse

### 📦 Installation

1.  **Clone the repository**:

    ```bash
    git clone https://github.com/Cauebf/atm-machine.git
    cd atm-machine
    ```

### ▶️ Running the Application

1. **Compile all `.java` files**:

   From the project root directory, run:

   ```bash
   javac -d out/production src/*.java
   ```

   > 🛠️ This compiles all `.java` source files located in the `src/` folder and places the compiled `.class` files into the `out/production` directory.

2. **Run the application**:

   ```bash
   java -cp out/production Main
   ```

   > 🚀 This runs the `Main` class using the compiled `.class` files found in the `out/production` directory by setting it as the classpath.

3. **Default login credentials**:

    - ATM Number: 12345
    - PIN: 123

   Once logged in, follow the menu instructions to interact with the ATM.

   > 💡 Tip: You can modify the ATM number and PIN in the `Main.java` file to customize your own login credentials.

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## 💬 Contact

For any inquiries or collaboration opportunities, feel free to reach out via:

[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:cauebrolesef@gmail.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cauebrolesef/)
[![Instagram](https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/cauebf_/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Cauebf)

<p align="right">(<a href="#-atm-console-application">back to top</a>)</p>
