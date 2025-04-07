# 🚀 Jetpack Compose Android App

A modern Android application built using **Jetpack Compose**, Android’s modern toolkit for building native UI.

## 🛠 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **LazyVerticalGrid**
- **Toast Messages**

## 📽️ Screen Recording

https://github.com/user-attachments/assets/fa005eb7-b790-44cb-b072-bec3b92dc717



This video shows how clicking on each image item displays a Toast message with the corresponding name:

```
Clicked {row user name}
```

_Add your screen recording here (e.g., as a YouTube or GitHub link)._

## 📦 Features

- 🎨 UI built with Jetpack Compose
- 🧱 Uses LazyVerticalGrid to display a grid of images and names
- 🔔 Toast message on click: `Clicked {UserName}`
- 🧼 Clean and minimal UI

## 🧰 Installation

Clone the repository:
```bash
git clone https://github.com/yourusername/your-repo-name.git
```

Open the project in **Android Studio** and run it on an emulator or physical device.

## 📄 Usage

### Sample Composable:
```kotlin
@Composable
fun UserCard(userName: String, imageRes: Int) {
    Column(
        modifier = Modifier
            .clickable {
                Toast.makeText(context, "Clicked $userName", Toast.LENGTH_SHORT).show()
            }
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = imageRes), contentDescription = userName)
        Text(text = userName)
    }
}
```

## 🧑‍💻 Author

**Your Name**  
[GitHub Profile](https://github.com/yourusername)

## 📜 License

This project is licensed under the MIT License. See the `LICENSE` file for details.
