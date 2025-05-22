# 🔐 Random Password Generator Web Application

A clean and responsive **Java Servlet-based web application** that generates a **random secure password** based on user preferences. Designed with modern HTML, CSS, and Java Servlets (Jakarta EE), it provides an engaging user interface and customizable options.

---

## 🚀 Features

- User can specify the **length** of the password.
- Option to include **lowercase**, **uppercase**, **numbers**, and **special characters**.
- Password generated using a **cryptographically secure random** algorithm.
- Displays the generated password on a separate result page using **JSP**.
- Fully **responsive UI** with modern CSS styling.
- Built with **Java Servlets (Jakarta EE 10)** and **JSP**.

---

## 🛠️ Requirements

- **Java JDK** 17 or higher  
- **Apache Tomcat** 10.x or 10.1.x (compatible with Jakarta EE 10)  
- **Eclipse IDE** (or any Java IDE with Dynamic Web Project support)  
- **Jakarta Servlet API** version 6.0.0  
- **Web browser** (for testing the UI)

---

## 📁 Project Structure

RandomPasswordGeneratorWeb/

├── `.classpath` 
 
├── `.project`
  
├── `.settings/`  

│ └── `org.eclipse.jdt.core.prefs`  

├── `build/` 
 
├── `src/` 

│ └── `main/`  

│     └── `java/`   

│ └── `com/`  

│     └── `password/`  

│         └── `PasswordGeneratorServlet.java` 
 
├── `Webapp/`  
│ ├── `index.jsp`  

│ ├── `result.jsp` 
 
│ ├── `style.css`  

│ └── `WEB-INF/`  

│     ├── `web.xml`  

│     └── `lib/`                                      *(if needed)*
  
└── `README.md`  

---

## 🌐 How It Works

1. User enters the desired **password length** and selects which character types to include.
2. Form sends a **POST request** to `/generate`.
3. `PasswordGeneratorServlet.java` processes the input and generates a password.
4. The password is displayed in `result.jsp`.

---

## 🎨 UI Snapshot (Design Overview)

- Gradient background with clean card-style container.
- Stylish form layout with checkbox options.
- Responsive design for mobile and desktop.
- Animated button hover effects.
- Password displayed in a styled box with option to generate again.

---

## ▶️ Running the Project

1. Open the project in **Eclipse** (as a Dynamic Web Project).
2. Ensure **Apache Tomcat 10.1+** is configured.
3. Right-click the project > `Run As` > `Run on Server`.
4. Open your browser and go to:  
   `http://localhost:8080/RandomPasswordGeneratorWeb/`

---

## 🧪 Example Usage

| Password Length | Options Selected                    | Example Output         |
|-----------------|-------------------------------------|------------------------|
| `12`            | Uppercase, Lowercase, Numbers       | `gH3kL2dP9sX1`         |
| `8`             | Lowercase only                      | `dfgjzpta`             |
| `16`            | All character types                 | `4G#j!u&zWpR2^m8Q`     |
| `10`            | Uppercase, Special Characters only  | `@Z^Y*L!Q&P`           |

---

## 🙋‍♀️ Author

Developed by: **Rohini363**  
GitHub: [github.com/Rohini363/RandomPasswordGenerator](https://github.com/Rohini363/RandomPasswordGenerator)
