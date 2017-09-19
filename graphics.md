# Graphics

* Querying & configuring graphics (monitor, display modes, vsync)
    * LibGDX memiliki API yang rumit yang memungkinkan kita memantau dan menampilkan permintaan. Perubahan mode tampilan tidak didukung oleh Android dan iOS
* Continuous & Non-Continuous Rendering
    * Secara default di libgdx, thread rendering memanggil metode render() class ApplicationListener secara terus menerus, dengan frekuensi yang bergantung pada perangkat keras (30-50-80 kali per detik)
    * Jika rendering terus menerus disetel ke false, metode render() akan dipanggil hanya jika hal-hal berikut terjadi:
      - An input event is triggered
      - Gdx.graphics.requestRendering() is called
      - Gdx.app.postRunnable() is called
* Clearing the Screen
    * Untuk menghapus layar di Libgdx tidak seperti membersihkan layar dalam aplikasi OpenGL biasa. Satu-satunya perbedaan adalah bagaimana seseorang mengakses konteks OpenGL
* Taking a Screenshot
* Profiling
    * Mengupdate panggilan OpenGL aktual yang terjadi saat permainan berjalan seringkali tidak terlalu mudah dilakukan, karena libGDX mencoba untuk menghapus semua hal tingkat rendah. Untuk memungkinkan pengumpulan informasi ini, ada GLProfiler
* Viewports
    * Saat berhadapan dengan layar yang berbeda, seringkali perlu diputuskan untuk menentukan strategi tertentu bagaimana ukuran dan rasio aspek layar yang berbeda harus ditangani. Camera and Stage mendukung strategi viewport yang berbeda, misalnya saat melakukan pemotretan melalui Camera.project (vec, viewportX, viewportY, viewportWidth, viewportHeight).
