# Aplikasi Java Spring Boot

Aplikasi ini adalah contoh proyek Spring Boot yang menyelesaikan beberapa soal pemrograman menggunakan Java. Di bawah ini Anda akan menemukan panduan tentang cara mengatur dan menjalankan aplikasi serta cara menggunakan berbagai endpoint yang disediakan.

## Prerequisites

Sebelum menjalankan aplikasi ini, pastikan Anda telah menginstal:
- JDK 11 atau versi yang lebih baru
- Maven (atau Gradle jika Anda mengubah build tool)

## Instalasi

1. **Clone Repository**

   Clone repository ini ke mesin lokal Anda:

   ```bash
   git clone https://github.com/username/repository.git
   cd repository

2. **Build Aplikasi**

    Gunakan Maven untuk membangun proyek:
    ```bash
   mvn clean install

## Menjalankan Aplikasi
Jalankan aplikasi Spring Boot menggunakan Maven:

```bash
mvn spring-boot:run
```

Aplikasi akan berjalan pada http://localhost:8080 secara default.

## Endpoint API
Setelah aplikasi berjalan, Anda dapat mengakses beberapa endpoint untuk melihat hasil dari solusi yang diberikan:

1. Reverse Words

    Endpoint: `/reverse-words`
    
    Method: `GET`
    
    Deskripsi: Mengubah kalimat yang diberikan menjadi kalimat yang mudah terbaca dengan membalikkan setiap kata.
    
    Contoh Response:
    ```bash
   melati dari jayagiri badai pasti berlalu bulan tertusuk ilalang
   ```
2. FizzBuzz

    Endpoint: `/fizzbuzz`
    
    Method: `GET`
    
    Deskripsi: Menghasilkan 100 baris angka dari 1 hingga 100 dengan aturan FizzBuzz.
    
    Contoh Response:
    ```bash
    1
    2
    3 Fizz
    4
    5 Buzz
    6 Fizz
    ...
    15 FizzBuzz
    ...
    ```
3. Fibonacci Series

    Endpoint: `/fibonacci`
    
    Method: `GET`
    
    Deskripsi: Menghasilkan deret angka Fibonacci.
    
    Contoh Response:
    ```bash
   0 1 1 2 3 5 8 13 21 34
   ```
4. Max Profit

    Endpoint: `/max-profit`
    
    Method: `GET`
    
    Deskripsi: Menghitung keuntungan maksimal dari harga saham.
    
    Contoh Response:
    ```bash
   10
   ```
5. Count Numbers

    Endpoint: `/count-numbers`
    
    Method: `GET`
    
    Deskripsi: Menghitung jumlah angka dalam list string.
    
    Contoh Response:
    ```bash
   4
   ```