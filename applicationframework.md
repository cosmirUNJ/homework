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

	* Querying

	* Logging

	* Threading

	* Interfacing With Platform-Specific Code
