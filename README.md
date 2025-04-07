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
git clone https://github.com/walid269/Lazy-Colum
```

Open the project in **Android Studio** and run it on an emulator or physical device.

## 📄 Usage

### Sample Composable:
```kotlin
@Composable
fun AvatarCard(firstname: String, lastname: String, img: Int) {
    var context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .fillMaxWidth()
                .clickable {
                    Toast.makeText(context,"Clicked $firstname", Toast.LENGTH_SHORT).show()
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(60.dp)
                    .padding(end = 16.dp)
            )

            Column {
                Text(
                    text = firstname,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = lastname,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}

```

## 🧑‍💻 Author

**Tanvir ahmed (chy)**  
[GitHub Profile](https://github.com/walid269)

## 📜 License

This project is licensed under the MIT License. See the `LICENSE` file for details.
