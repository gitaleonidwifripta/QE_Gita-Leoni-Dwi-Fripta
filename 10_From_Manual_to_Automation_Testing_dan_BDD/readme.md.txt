Gita Leoni Dwi Fripta
Kelas A QE

From Manual to Automation Testing & BDD
Manual testing adalah proses pengujian perangkat lunak yang dilakukan secara manual oleh seorang pengujian atau QA (Quality Assurance) engineer.
Dalam manual testing, pengujian dilakukan dengan melakukan interaksi langsung dengan perangkat lunak untuk menguji fungsionalitas, kinerja, keamanan, 
dan kualitas perangkat lunak secara keseluruhan.

mengapa harus melakukan pengujian manual? yaitu
1. Pengujian Manual Exploratory yaitu Jenis pengujian ini dilakukan tanpa skenario pengujian yang jelas dan memungkinkan tester untuk melakukan eksplorasi 
   terhadap fitur dan fungsionalitas perangkat lunak. Pengujian exploratory dapat membantu mengidentifikasi masalah yang mungkin tidak 
   terdeteksi dengan pengujian yang terstruktur dan dapat membantu meningkatkan kualitas perangkat lunak.
2. Pengujian Manual Velocity yaituJenis pengujian ini bertujuan untuk mengukur seberapa cepat atau lambat perangkat lunak merespons input pengguna 
   atau melakukan tugas tertentu. 
3. Pengujian Manual Usability yaitu Jenis pengujian ini bertujuan untuk menguji seberapa mudah perangkat lunak digunakan oleh pengguna.

kelebihan pengujian manual 
1. dapatkan umpan balik visual yang cepat dan akurat
2. lebih murah karena tidak perlu menghabiskan anggran untuk alat otomasi dan proses
3. saat menguji perubahan kecil, pengujian otomasi akan membutuhkan pengkodean yang bisa memakan waktu. meskipun bisa menguji secara manual dan cepat.

kontra pengujian manual
1. selalu rawan kesalahan
2. tidak bisa direkam, jadi tidak mungkin menggunakan kembali test manual

automation testing
automation testing adalah pengujian otomasi berti menggunakan alat otomatisasi untuk menjalankan rangkaian kasus pengujian 

mengapa harus melakukan pengujian automation 
1. Pengujian Manual Flexibility yaitu Pengujian manual memungkinkan fleksibilitas dalam pengujian kasus penggunaan dengan variasi yang lebih besar dan 
   meniru pengalaman pengguna secara lebih akurat. Tester dapat menyesuaikan skenario pengujian dengan situasi yang lebih realistis dan dapat 
   menemukan masalah yang tidak terdeteksi dengan pengujian otomatis.
2. Pengujian Manual Velocity yaitu Pengujian manual velocity bertujuan untuk mengukur kecepatan perangkat lunak dalam merespons input pengguna atau melakukan tugas tertentu. 
3. Pengujian Manual Coverage: Pengujian manual dapat membantu dalam mencakup kasus uji yang mungkin tidak dapat dicakup oleh pengujian otomatis.
4. Pengujian Manual Error Avoidance: Tester dapat mencegah kesalahan yang dapat terjadi selama pengembangan perangkat lunak dengan melakukan 
   pengujian manual secara tepat dan hati-hati. Pengujian manual dapat membantu dalam meningkatkan kualitas perangkat lunak dan mengurangi risiko 
   kesalahan manusia.

Tes case yang akan diotomatisasi
1. uji kasus yang dijalankan berulang kali
2. uji kasus yang sangat membosankan atau sulit dilakukan secara manual
3. uji kasus yang memakan waktu untuk dilakukan secara manual

Tes case yang tidak untuk diotomatisasi
1. uji kasus yang baru dirancang dan tidak dieksekusi secara manual setidaknya sekali
2. uji kasus memenuhi persyaratan sering berubah

Automate Testing process
1. test tool selection adalah memilih alat pengujian yang sesuai dengan kebutuhan pengujian. Alat pengujian harus sesuai dengan 
   jenis perangkat lunak yang diuji dan memenuhi persyaratan fungsional dan non-fungsional.
2. define scope of automation adalah menentukan ruang lingkup pengujian yang akan diotomatisasi. 
   Bagian mana dari perangkat lunak yang akan diotomatisasi, dan bagaimana skenario pengujian akan dirancang untuk mencapai hasil pengujian yang optimal.
3. planing design and development adalah merencanakan desain dan pengembangan skenario pengujian yang akan diotomatisasi. 
   Hal ini meliputi desain tes, scripting pengujian, dan pengembangan kode program
4. test execution adalah menjalankan pengujian secara otomatis. Perangkat lunak pengujian akan mengeksekusi skenario pengujian sesuai dengan desain tes yang telah ditentukan.
5. maintenance Proses pengujian otomatis harus dipelihara untuk memastikan bahwa alat pengujian berfungsi dengan benar dan skenario pengujian tetap up-to-date dengan perangkat lunak yang sedang diuji.

pemilihan alat uji
1. Usability (Kemudahan Penggunaan): Alat uji harus mudah digunakan oleh pengguna, dengan antarmuka yang intuitif dan mudah dipahami. 
   Penggunaan alat uji yang sulit dapat menghambat proses pengujian dan menghasilkan data yang tidak akurat. 
2. Simplicity (Kesederhanaan): Alat uji yang sederhana dan mudah digunakan akan meminimalkan waktu dan biaya yang diperlukan untuk pelatihan. 
   Alat yang terlalu kompleks dapat membutuhkan waktu yang lama untuk dipahami dan dioperasikan, mengurangi efisiensi proses pengujian.
3. Cost (Biaya): Biaya alat uji harus seimbang dengan kebutuhan dan anggaran proyek pengembangan perangkat lunak. 
   Terlalu mahal atau terlalu murahnya alat uji dapat mempengaruhi kualitas pengujian dan efisiensi proses pengujian. 

contoh alat uji
1. Selenium: Selenium adalah alat uji otomatis yang digunakan untuk menguji aplikasi web. 
2. Appium: Appium adalah alat uji otomatis yang digunakan untuk menguji aplikasi mobile.
3. TestComplete: TestComplete adalah alat uji otomatis yang digunakan untuk menguji aplikasi desktop, web, dan mobile.
4. JMeter: JMeter adalah alat uji beban yang digunakan untuk menguji kinerja aplikasi web. 


Behavior Driven Development (BDD)
Behavior Driven Development (BDD) adalah suatu pendekatan dalam pengembangan perangkat lunak yang berfokus pada pemahaman dan spesifikasi perilaku 
atau behavior dari suatu sistem. BDD menggabungkan konsep dari Test Driven Development (TDD) dan Domain Driven Design (DDD) untuk memastikan bahwa 
perangkat lunak yang dibuat memenuhi kebutuhan bisnis dan pengguna

format BDD
1. user story
2. AS a [x] i want [y] so that [z]
3. scenario
4. Give When Then

BDD with Cucumber adalah salah satu implementasi dari pendekatan Behavior Driven Development (BDD) dengan menggunakan alat uji Cucumber. 
Cucumber adalah alat uji fungsional yang membantu dalam membangun dan menjalankan pengujian BDD secara otomatis.
Dalam BDD with Cucumber, penggunaan bahasa yang mudah dipahami oleh manusia, seperti bahasa Inggris, digunakan untuk menulis skenario pengujian.
Dalam BDD with Cucumber, penggunaan bahasa yang mudah dipahami oleh manusia, seperti bahasa Inggris, digunakan untuk menulis skenario pengujian. 
Skenario pengujian ini ditulis dalam format yang disebut Gherkin.





