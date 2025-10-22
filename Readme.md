{===Percobaan 1===}

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!  
Jawaban:
> Komponen perulangan for terdiri dari:
> Inisialisasi → Menentukan nilai awal variabel penghitung.
  Contoh: for (int i = 1; ... ) → int i = 1 adalah inisialisasi.

> Kondisi → Mengecek apakah perulangan masih perlu dijalankan.
  Contoh: i <= 10 berarti perulangan akan berjalan selama nilai i kurang dari atau sama dengan 10.

> Update (Increment/Decrement) → Mengubah nilai variabel penghitung setiap kali loop selesai.
 Contoh: i++ berarti nilai i akan bertambah 1 setiap perulangan.

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah
diinisialisasi 0?
Jawaban:
> alasannya : karena nilai siswa yang di asumsikan di rentang 0-100.
> tertinggi : Karena diinisialisasi 0 supaya setiap nilai valid (>0) dapat menggantikan nilai tertinggi awal jika lebih besar.
> terendah  : Karena diinisialisasi 100 supaya setiap nilai valid (<100>) dapat menggantikan terendah awal jika lebih kecil.

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut! 
   if (nilai > tertinggi) {
    tertinggi = nilai;
   }
   if (nilai < terendah>) {
    terendah = nilai;
   }
Jawab:
> untuk menyimpan nilai tertinggi dan rendah membandingkan nilai yang diimputkan.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa 
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). 
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi 
dan terendah! 
Jawab: 
> sudah di commit & push

5. Commit dan push kode program ke Github
Jawab: 
> Sudah


{===Percobaan 2===}

1. a. nilai < 0 || nilai > 100 
  b. continue
Jawab:
>  Kondisi ini digunakan untuk memeriksa apakah nilai yang dimasukkan berada di luar rentang yang valid (0-100). Jika nilai kurang dari 0 atau lebih dari 100, maka program akan melanjutkan ke iterasi berikutnya tanpa memproses nilai tersebut.
> continue digunakan untuk melewati iterasi jika kondisi tertentu terpenuhi, seperti nilai tidak valid, dan melanjutkan ke interaksi berikutnya.

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
Jawab:
> sintaks i++ diletakkan diakhir agar nilai yg ada di dalam nya tidak lebih dahulu bertambah dan menjalankan kode di atas nya karena jika i++ berada di atas maka kode (i+1) akan dimulai dari angka 2.

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
Jawab: 
> akan tetap dikarenakan nilai i = 0

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
Jawab: 
> sudah di commit dan push 

5. Commit dan push kode program ke Github
Jawab:
> Sudah


{===Percobaan 3===}

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
Jawab:
> tidak akan melakukan apa apa dikarebakan langsung memaksa ke break

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
Jawab:
> Kondisi berhenti perulangan do-while adalah saat pengguna mengetik "batal" sebagai nama pelanggan, yang menyebabkan perintah break menghentikan loop.

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE? 
> true agar program di jalankan secara terus menerus tanpa henti,akan terus menerus mengulang  selama tidak selama tidak ada perintah break.

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
>  karena kontrol perulangan diatur sepenuhnya oleh kondisi dan perintah di dalam perulangan (while(kondisi)).