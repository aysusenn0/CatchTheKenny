# 🎯 Catch The Kenny

This is a simple Android game project developed in **Kotlin** using **View Binding**.

## 👩‍💻 Developed by Aysu Şen

Hi, I'm Aysu Şen, a Computer Engineering student passionate about Android development.  
This is my simple Catch The Kenny game project to improve Kotlin and Android fundamentals.

---

## 📱 About the Game

- The game displays multiple Kenny images (ImageViews) in a grid layout.
- Only **one Kenny appears at a time**, and it changes its position randomly every ~550 milliseconds.
- The player must **tap Kenny** as fast as possible before time runs out to increase their score.
- The game ends after **15 seconds**, showing an AlertDialog asking if the player wants to restart.

---

## ⚙️ Technical Details

- **Language:** Kotlin  
- **UI:** View Binding with `ActivityMainBinding`
- **Timers:** Uses `CountDownTimer` for the game timer and `Handler + Runnable` for changing Kenny’s visibility rapidly.
- **Randomness:** `kotlin.random.Random` selects a random index for Kenny to appear.
- **AlertDialog:** Displays Game Over dialog with options to restart or exit.

---

## 💻 Key Code Features

- `hideImages()` function hides all Kenny images and randomly makes one visible.
- `increaseScore(view: View)` function is called on Kenny's `onClick` to increase the score.
- The `CountDownTimer` controls the game duration and manages game over state.

---

## 📝 How to Play

1. Run the app on your Android device or emulator.
2. Tap the Kenny image as it randomly appears to increase your score.
3. When time runs out, choose to restart or finish.

---

## 🔧 Possible Improvements

You can extend the project by:

- Adding **background music** or sound effects.
- Animating Kenny for smoother appearance.
- Creating a **high score system** with SharedPreferences.
- Designing a **start menu** and settings page.

---

### 🚀 [LinkedIn](https://www.linkedin.com/in/aysu-%C5%9Fen-b7b1452a5/)

Feel free to connect with me!
