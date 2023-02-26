Gita leoni Dwi Fripta
Kelas A

Git dan Github

Versioning adalah mengatur versi atau pelacakan perubahan dari source code program 
Git adalah salah satu version control system popular yang digunakan para developer untuk mengembangkan software secara bersama sama.
Di git bisa melihat semua perubahan, dan perubahan tersebut bisa disimpan dan bisa terlihat siapa yang mengubah dan kapan dirubah. 
Git juga dapat membatalkan beberapa point yang disebut dengan commit.
Repository adalah sebuah folder yang berisikan project atau tugas yang kita miliki yang disana kitab isa berkolaborasi mengerjakan project Bersama.

Setting up
-git init adalah perintah untuk membuat repository Git baru pada direktori kerja lokal.
-git clone adalah perintah untuk mengunduh repository Git yang sudah ada.
-config adalah perintah yang digunakan untuk mengatur konfigurasi Git seperti konfigurasi pengguna.

Saving changes
-git add adalah perintah yang digunakan untuk menambahkan perubahan pada file ke staging area sehingga siap untuk dicommit.
-git commit adalah perintah yang digunakan untuk menyimpan perubahan .
-git diff adalah perintah yang digunakan untuk membandingkan perbedaan antara dua versi file atau commit pada repository Git.
-git stash adalah perintah yang digunakan untuk menyimpan perubahan pada file dalam area agar bisa kembali ke versi sebelumnya, 
tanpa harus melakukan commit terlebih dahulu.
-git ignore adalah perintah yang digunakan untuk membuat file . File-file tersebut tidak akan muncul pada output git status

Inspecting repository dan undoing
-git log adalah perintah yang digunakan untuk menampilkan daftar commit pada repository Git, termasuk informasi tentang penulis, tanggal, dan pesan commit.
-git checkout adalah perintah yang digunakan untuk beralih ke branch atau commit tertentu pada repository Git, dan mengubah posisi HEAD ke branch atau 
commit yang dipilih.
-git reset adalah perintah yang digunakan untuk menghapus commit yang tidak diinginkan atau membatalkan perubahan yang belum dicommit pada repository Git.

syncing pada Git biasanya mengacu pada dua perintah: git fetch dan git pull. git fetch digunakan untuk menarik perubahan dari repositori jarak jauh 
tanpa menggabungkannya ke branch lokal, sedangkan git pull digunakan untuk menarik dan menggabungkan perubahan dari repositori jarak jauh ke branch lokal.
-git remote adalah perintah yang digunakan untuk menambahkan, menghapus, atau mengelola koneksi ke repositori jarak jauh pada repository Git lokal.
-git fetch adalah perintah yang digunakan untuk menarik perubahan dari repositori jarak jauh dan menyimpannya di branch lokal tanpa menggabungkannya ke 
branch lokal.
-git push adalah perintah yang digunakan untuk mengirim perubahan pada repository Git lokal ke repositori jarak jauh.

Branches
-Branches pada GitHub adalah fitur untuk mengembangkan dan menguji fitur baru pada repository Git tanpa mempengaruhi kode di branch utama 
(biasanya bernama main atau master). Dengan membuat branch baru, kita dapat membuat salinan dari kode di branch utama dan bekerja pada 
perubahan tanpa mempengaruhi kode di branch utama..
-Pull request
pull request pada GitHub adalah cara untuk mengusulkan perubahan pada repository Git. Ketika Anda melakukan perubahan pada branch pada repository 
Git yang di-host di GitHub, Anda dapat membuat pull request untuk mengajukan perubahan tersebut ke branch utama.

Workflow kolaborasi pada GitHub yang umum digunakan dalam pengembangan proyek:
1. Forking Workflow
2. Branching Workflow
3. Gitflow Workflow
4. Release Workflow
