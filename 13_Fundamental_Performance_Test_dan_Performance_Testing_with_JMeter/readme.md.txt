Gita Leoni Dwi Fripta
QE A

Fundamental Performance Test & Performance Testing with JMeter

Performance Test 
Performance Test yaitu teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja.
perfomance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) dan penggunaan sumber daya.

yang diukur dari performance test
1. performa suatu aplikasi sampai suatu batas tertentu
2. bukan merupakan functional test
3. bisa dalam berbagai macam bentuk untuk memahami reability, stability dan availability pada environment.
   contoh
   - mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak.
   - melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.
mengapa performance Test jarang dilakukan?
pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, namun dapat dijadikan tlak ukur apakah sistem tersebut dapat mengakomodasi trafic yang ada.

hal yang perlu diperhatikan dari performance test
Dalam melakukan performance test biasanya yang menjadi perhatian adalah throughput dan response data-nya.

Contoh Kasus Performance Test

Langkah yang harus dilakukan:
1. Membuat test plan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test

type performance test
1. Smoke Testing
   Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUS.
2. Load Testing
   Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk 
   mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.
3. Stress Testing
   Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem.
   Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery.
4. Spike Testing
   Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak.
   Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.
5. Soak Testing
   Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb.
   Tips: metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di production.
6. Tabel Tier
   Table Tier ini bisa dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.

Introduction JMeter and Tutorial Record with JMeter
tools yang digunakan adalah jmeter
Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web.
Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya. 

Pros of Jmeter
- Open source
- Easy to use with GUI / Non GUI

Some components of JMeter script
-Test Plan
 Rencana besar tes yang akan dilakukan (parent)
-Thread Groups
 Kumpulan thread yang menjalankan skenario yang sama
-Samplers
 Sebutan untuk request yang dikirim ke server
-Config elements
 Elemen yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server
-Listeners
 Perekam data yang dihasilkan dari tes
-Timers
 Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan
-Assertions
 Seperti assert pada API/Web/Testing, merupakan kriteria tambahan apakah pass/tidak
-Pre-post processors
Fitur yang memproses response data sebelum/sesudah tes


link google doc https://docs.google.com/document/d/18kAybcwNWoOUgGvOAbVPX3VL1UKkuWYH3YNKLcR6IxA/edit#