NixCrypt v1.0

🇮🇩 Bahasa Indonesia
NixCrypt adalah sistem sandi (cipher) sederhana buatan Nix, menggunakan konversi karakter unik.
Cocok untuk belajar enkripsi dasar, bermain rahasia dengan teman, atau membuat aplikasi encode/decode.

🇬🇧 English
NixCrypt is a simple cipher system created by Nix, using unique character conversion.
Suitable for learning basic encryption, secret communication with friends, or building encode/decode apps.


---

Cara Pakai / How to Use

1. Masukkan teks asli ke dalam encoder. / Enter plain text into the encoder.


2. Hasil encode akan berupa teks rahasia dengan pola NixCrypt. / The result will be secret text in NixCrypt pattern.


3. Untuk decode, masukkan kembali teks sandi ke decoder. / To decode, re-enter the cipher text into the decoder.




---

Contoh / Example

Teks asli / Plain text: hello
Encode: -3))9


---

Struktur Folder / Folder Structure

/app       : Aplikasi untuk encrypt dan decrypt teks  
/src/*     : Source code dari NixCrypt  
/keys      : Key resmi terenkripsi dan untuk decrypt  
README.txt : Panduan penggunaan / Usage guide  
LICENSE.txt: Lisensi MIT / MIT License


---

File

README.txt : Panduan penggunaan / Usage guide

LICENSE.txt : Lisensi MIT / MIT License

Key.enc : Key terenkripsi dengan NixCrypt (Base64 + AES)

Key.dec : Key resmi untuk decrypt (Base64 + AES) 



---

© 2025 NixStudios / Nix
