# The Application Framework

* Libgdx mempunyai enam tampilan untuk berinteraksi dengan OS, yaitu: Application, Files, Input, Net, Audio, dan Graphics

* Starter Class, diberikan source code untuk DesktopStarter dan AndroidStarter.

* Accessing Modules, adalah serangkaian global variable yang bisa diakses dengan mudah

	* The Life-Cycle
		* Implementasi dari ApplicationListener
		* Pada ApplicationListener dituliskan event apa yang akan terjadi, seperti: create, render, resize, pause, resume, dispose
	* Modules Overview
	![Alt](/img/appframe.png)
		* Input, menyediakan berbagai macam input untuk semua platform. Seperti: keyboard, touchscreen, accelerometer dan mouse jika mengembangkan aplikasi desktop

		* Graphics, memungkinkan gambar-gambar ke layar menggunakan hardware yang disediakan OpenGL ES. Modul Grafis juga menyediakan metode untuk menghasilkan Pixmaps dan Texture

		* Files, menyediakan cara untuk mengakses file terlepas dari platformnya. Ini memudahkan untuk membaca / menulis file. Penulisan file memiliki beberapa keterbatasan keamanan

		* Audio, memfasilitasi perekaman dan pemutaran suara pada semua platform. Dan mendukung format WAV, mp3 dan OGG

		* Networking, menyediakan metode untuk melakukan operasi networking, seperti simple HTTP dan post-request, serta soket komunikasi TCP server / klien

	* Starter Classes & Configuration
		* Desktop (LWJGL), pada class LwjglApplicationConfiguration memungkinkan seseorang menentukan berbagai pengaturan konfigurasi, seperti: resolusi layar awal
		* Android, aplikasi Android bisa memiliki banyak aktivitas
		* Fragment based libgdx, Android SDK telah mempekenalkan API untuk mebuat controller untuk bagian layar, yang dapat dengan mudah digunakan kembali di beberapa layar

	* Querying
		* Getting the Application Type, perlu bagian khusus dari aplikasi yang bergantung pada platform yang sedang dijalankan
		* Memory Consumption, untuk keperluan debugging dan profil, sering perlu untuk mengetahui konsumsi memori

	* Logging
		* Tergantung pada platformnya. Misalnya Console (Desktop), LogCat (Android) atau GWT TextArea yang disediakan di GwtApplicationConfiguration atau dibuat secara otomatis (html5)
		
	* Threading
		* Semua metode ApplicationListener dipanggil di thread yang sama. Thread ini adalah thread rendering dimana panggilan OpenGL dapat dilakukan
		* Untuk permainan cukup untuk menerapkan pembaruan logika dan rendering dalam metode ApplicationListener.render()
		* Di dalam Libgdx tidak ada class yang aman, kecuali jika secara eksplisit ditandai sebagai thread-safe di dalam dokumasi kelas

	* Interfacing With Platform-Specific Code
		* Implementasi spesifik dapat didefinisikan melalu antarmuka API yang umum, disebut interface class
		* Diberikan contoh menggunakan leaderboard API yang sangat sederhana yang ada di Android, kemudian platform yang lain hanya menyesuaikan
