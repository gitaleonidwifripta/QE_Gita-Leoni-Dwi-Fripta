Gita Leoni Dwi Fripta
kelas QE A

RESTful API Introduction & Testing


Api adalah singkatan untuk aplication programming interface
Api memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/sistem yang terpisah 

HTTP METHOD
1. Resource yaitu URL
2. GET adalah metode HTTP yang digunakan untuk mengambil data atau resource dari server,
   server akan mengirimkan data atau resource yang diminta oleh klien sebagai respons. 
3. PUT adalah metode HTTP yang digunakan untuk memperbarui atau mengganti data atau resource yang ada di server dengan data yang baru
4. POST adalah metode HTTP yang digunakan untuk mengirimkan data baru ke server.
5. DELETE adalah metode HTTP yang digunakan untuk menghapus resource dari server.

Approach of API Testing
- mengerti fungsi dari API
- dapat mengapilkasikan teknik testing
- input parameter untuk API perlu direncanakan dan ditentukan sebelumnya
- jalankan tes case dan bandingkan antara hasil yang diharapkan dengan hasil yang didapatkan

what's API Testing
- API Test sangat berbeda dengan GUI
- mengirim request dan mendapatkan responya
- memverifikasi response yang benar dan error hadling

kind Of API Testing
- Jenis pengujian ini bertujuan untuk memastikan bahwa API berfungsi dengan benar sesuai dengan spesifikasi atau dokumen API yang telah ditetapkan. 
  Pengujian fungsional melibatkan pengujian semua operasi atau fungsi API yang tersedia, seperti GET, POST, PUT, dan DELETE
- load test Jenis pengujian ini dilakukan untuk mengetahui bagaimana API berkinerja dalam situasi beban yang tinggi atau saat banyak pengguna mengakses API secara bersamaan. 
  Pengujian beban melibatkan mengirimkan permintaan API secara berulang dan pada tingkat yang lebih tinggi dari biasanya.
- security Jenis pengujian ini bertujuan untuk memastikan bahwa API aman dari serangan atau ancaman keamanan. 
  Pengujian keamanan melibatkan mencari celah keamanan pada API dan mencoba untuk memanfaatkannya untuk mengakses informasi atau merusak sistem.

output of an API
- pada umumnya berbentuk JSON, XML
- Status balikan (response) apakah Passed ata Fail
memanggil fungsi API lain

Link Tes Case google sheet https://docs.google.com/spreadsheets/d/1hkpWkiYWsHWrFuxvsc2gnSapR9n-k9VBowFt9anmSxQ/edit#gid=0
