WORK IN PROGRESS!


# MindShift: Habit Tracking & Breaking App


An Android app designed to help users gradually quit bad habits (smoking, alcohol, etc.) by reducing daily limits step-by-step. Inspired by Duolingo's gamified approach, featuring motivational widgets and notifications.

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org)
[![Compose](https://img.shields.io/badge/Jetpack%20Compose-1.6.0-brightgreen)](https://developer.android.com/jetpack/compose)

## 🚀 Key Features
- **Habit Tracking**: Log relapses with a single tap.
- **Progressive Limits**: Daily limits automatically decrease (e.g., 200 → 175 → 150).
- **Home Screen Widgets**: Track progress at a glance.
- **Motivational Alerts**: Scheduled notifications via WorkManager.
- **Progress Analytics**: Weekly/monthly statistics with charts.

## 🛠 Tech Stack
- **Language**: Kotlin
- **Architecture**: Clean Architecture + MVVM
- **UI**: Jetpack Compose, Material 3
- **Local Database**: Room
- **Dependency Injection**: Hilt
- **Background Tasks**: WorkManager
- **Widgets**: Glance API

## 📥 Installation
1. Clone the repository:
   ``` git clone https://github.com/whoisshecodes/MindShift_app.git```

## 🏗 Project Structure
```
app/
├── data/           # Data layer (Room, Repositories)
│   ├── local/      # Database, DAOs
│   └── repository/ # Repository implementations
├── domain/         # Business logic
│   ├── model/      # Entities
│   └── usecase/    # Use Cases
└── presentation/   # UI Layer
    ├── viewmodel/  # ViewModels
    └── ui/         # Composable components
```

## 🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss your ideas.

## 📄 License

MIT License
Copyright (c) 2023 whoisshecodes
