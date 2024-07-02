# News App

This is a News App built using Kotlin and Jetpack components following the Clean Code architecture. It utilizes the Paging Library for efficient data loading, Dagger Hilt for dependency injection, and Retrofit to fetch news from the News API.
 
 
https://github.com/mohitdamke/NewsApp/assets/112572179/84c7147c-9c74-40bb-952a-98a1001f237f


## Features

- **Clean Code Architecture:** Ensures separation of concerns and makes the codebase more maintainable.
- **Kotlin:** Leverages the modern language features to write concise and expressive code.
- **Jetpack Components:** Uses components like LiveData, ViewModel, and Paging.
- **Dependency Injection:** Utilizes Dagger Hilt to manage dependencies.
- **Paging Library:** Efficiently loads large data sets by paging the data.
- **Retrofit:** Simplifies HTTP requests to the News API.

## Architecture

The app is built using the Clean Code architecture, which divides the code into three main layers:

1. **Presentation Layer:** Contains UI-related components such as Activities, Fragments, and ViewModels.
2. **Domain Layer:** Contains business logic and use cases.
3. **Data Layer:** Manages data sources such as APIs and databases.

## Tech Stack

- **Language:** Kotlin
- **Architecture:** Clean Code Architecture(MVVM)
- **Dependency Injection:** Dagger Hilt
- **Networking:** Retrofit
- **Paging:** Paging Library
- **Room Database:** Room Database Library
- **LiveData & ViewModel:** Jetpack Components

## Setup and Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/mohitdamke/NewsApp
    ```

2. **Open the project in Android Studio.**

3. **Get your News API key from [NewsAPI](https://newsapi.org/) 
 
4. **Build and run the project.**

## Usage

Once the app is installed and running, you can browse the latest news articles. The app will efficiently load news articles using the Paging Library, ensuring a smooth user experience even with large data sets.

## Screenshots
<div align="center">
	<img width = "33%" src="[https://i.imgur.com/8BgVXcY.png](https://github.com/mohitdamke/NewsApp/assets/112572179/1203790a-6665-42db-b63a-28d72a7eaf65)">
</div>
![](https://github.com/mohitdamke/NewsApp/assets/112572179/1203790a-6665-42db-b63a-28d72a7eaf65)
![](https://github.com/mohitdamke/NewsApp/assets/112572179/25e3be2b-3743-4ab2-a91a-1f405ccd46e9)
![](https://github.com/mohitdamke/NewsApp/assets/112572179/e45e1fad-1b00-4fb3-b04a-37e80b4d3318)
![](https://github.com/mohitdamke/NewsApp/assets/112572179/19049678-46d6-4175-95be-0a86e1ecde03)
![](https://github.com/mohitdamke/NewsApp/assets/112572179/42a17c63-0d36-45cb-a396-d81edfba05bf)
![](https://github.com/mohitdamke/NewsApp/assets/112572179/1af31062-4ebc-407f-8435-500b7b309c04)


## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [NewsAPI](https://newsapi.org/) for providing the news data.
- [Jetpack](https://developer.android.com/jetpack) for the amazing components.
- [Dagger Hilt](https://dagger.dev/hilt/) for the dependency injection framework.
- [Retrofit](https://square.github.io/retrofit/) for the networking library.

