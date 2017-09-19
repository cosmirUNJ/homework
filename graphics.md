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
* OpenGL ES Support
Libgdx didikung dengan OpenGL ES 2.0 dan 3.0. Untuk beberapa platform seperti IOS, GWT/HTML hanya support pada OpenGL ES 2.0. Untuk perangkat android, diperlukan setting tertentu pada android manifest agar aplikasi pada play store tidak terlihat pada perangkat yang tidak mendukung OpenGL 
    * Precision Modifiers
OpenGL ES 2.0 membutuhkan spesifikasi precision modifiers untuk atributes, uniforms dan locals. Oleh karena itu dibutuhkan settingan agar sesuai dengan OpenGL ES precision modifier. Desktop OpenGL tidak support untuk hal ini.
    * OpenGL ES 2.0 Documentation
Link untuk dokumentasi openGL sendiri telah disediakan pada dokumentasi ini.
    * Utility Classes
      - Rendering Shapes:
         * Terdapat link dokumentasi khusus untuk mempelajari pembuatan berbagai bentuk.
      - Texture & Texture Regions:
         * Menggunakan Spritebatch, Textureregions, and Sprites yang akan dibahas pada bab berikutnya
      - Meshes:
         * Terdapat penjelasan tentang membuat dan merender mesh. Mesh sendiri adalah kumpulan verteks yang mendiskripsikan geometri untuk rendering
      - Shaders:
         * Dalam OpenGL 2.0 ES semuanya dirender dengan shader. Shader merupakan program kecil yang berjalan pada GPU dan memproses data untuk dirender. Terdapat verteks shader(hanya mengeksekusi satu verteks) dan fragment shader(mengeksekusi setiap fragment). Selain itu, pada dokumentasi ini juga ada contoh sederhana program shader
      - Frame Buffer Objects:
         * Terdapat link dokumentasi khusus untuk mempelajari framebuffer
* 2D Graphics
    * Spritebatch, Textureregions, and Sprites
        * Disini dijelaskan prosedur menggambar pada OpenGL. Terdapat SpriteBatch class(mengirimkan beberapa segiempat untuk texture yang sama ke GPU sekaligus), Texture class(mendecode file gambar untuk di load pada GPU, file gambar diletakkan pada folder “assets” dan sebaiknya dimensinya pangkat dari 2), TextureRegion class(mendeskripsikan segiempat didalam texture yg digunakan untuk menggambar hanya sebagian texture), Sprite Class(mendeskripsikan geometri dan warna yang akan digambar), tinting(pewarnaan), blending(enabled untuk mencampur dengan yang sudah ada di layar, disabled untuk mengganti yang sudah ada di layar) viewport, dan peyetelan performance pada dokumentasi ini
    * 2D Animation
       * Animasi dibuat dengan menggunakan beberapa gambar/frame yang dijalankan pada setiap waktu. Pada libGDX terdapat Animation Class. Terdapat juga contoh TextureAtlas dan Spritesheet pada dokumentasi ini,
    * Clipping
       * Menggunakan scissorstack, akan membatasi rendering dalam batasan segiempat.
    * Orthographic Camera
       * Menjelaskan tentang Orthographic Camera dan penggunaannya.
    * Ninepatches
       * Menjelaskan tentang gambar NinePatch, bagaimana pembuatannya dan bagaimana digunakan pada konteks libGDX.
    * Bitmap fonts
      * Menjelaskan tentang Class Bitmap fonts (font pada gambat bitmap) spesifikasi file format untuk font file dan tools-nya.
         * Distance field fonts
            * Merupakan teknik yang mengizinkan kita untuk merender huruf bitmap tanpa ujung bergerigi bahkan dengan apabila dilakukan pembesaran. Dokumentasi ini menjelaskan cara mengimplementasi teknik ini dengan libgdx.
         * Color Markup Language
            * BitmapFontCache Class mendukung teks berwarna in-string melalui bahasa markup sederhana.
    * TextureAtlas
      * Dokumentasi TextureAtlas class bisa ditemukan pada dokumentasi Texture Packer
    * Pixmaps
      * Menjelaskan tentang pixmap, cara membuatnya dan menggambarnya
    * Packing atlases offline
      * Gunakan Texture Packer untuk packages offline
    * Packing atlases at runtime
      * Menyediakan beberapa link dokumentasi untuk packing atlas saat runtime
    * Texture Compression
      * LibGDX menyediakan 2 pilihan untuk mengkompres texture,  menggunakan ETC1 file format dan KTX/ZKTX format yang masing masing dijelaskan didokumentasi ini.
    * 2D ParticleEffect
      * Menjelaskan dasar penggunaan ParticleEffect, efisiensi dan contohnya
    * Tile maps
      * Menjelaskan api umum maps(peta) pada libgdx.
    * Scene2d
      * Menjelaskan tentang 2D scene graph untuk membangun aplikasi dan UI menggunakan hierarki aktor yang terdiri dari Drawing, Hit Detection, Event System dan Action. Komponen UI dari scene2d bisa dilihat di dokumentasi scene2d.ui. Terdapat juga table yang merupakan bagian dari WigetGroup scene2d.ui berfungsi untuk mengatur posisi dan ukuran pada childern menggunakan tabel logika, mirip seperti HTML. Terdapat juga Skin class pada dokumentasi ini. Skin class menyimpan resource untuk UI Widget untuk digunakan.
* 3D Graphics
    * Quick Start
      * Terdapat beberapa artikel untuk mempelajari dasar dari 3D API
    * Models
      * Model mereprentasikan 3d asset yang tediri  dari hierarki node. Oleh karena itu disini dijelaskan tentang node dan transformasinya.
    * Material and environment
      * Disini menjelaskan tentang menspesifikasi material dan environment. Keduanya juga meng-extend Atrribute class yang juga dijelaskan pada dokumentasi ini.
    * ModelBatch
      * Dokumentasi tentang modelbatch, yaitu class yang digunakan untuk mengelola pemangilan-pemanggilan render.
    * ModelCache
      * Dijelaskan tentang ModelCache, yaitu mengurangi jumlah render calls dengan cara mengoptimatlkan model dan menyatukan model. Dan juga dijelaskan cara penggunaan ModelCache.
    * ModelBuilder, MeshBuilder and MeshPartBuilder
      * Dijelaskan tentang penggunaan ModelBuilder yaitu class untuk membuat model menggunakan code. Dijelaskan juga cara membuat mesh menggunakan MeshBuilder. Selain itu dijelaskan juga pem 3D animations and skinning buatan bagian/part dari mesh yang method nya sudah disediakan pada MeshPartBuilder.
    * 3D animations and skinning
      * Menjelaskan tentang penggunaan animasi 3d pada libgdx serta skinning, yaitu transformasi model berdasarkan transformasi pada node.
    * Importing Blender models in LibGDX
      * Dijelaskan tentang meng-import model dari Blender, pertimbangannya, serta troubleshooting-nya.
    * 3D Particle Effects
      * Dijelaskan tentang 3d Particle effect, Flame(3d particle effect editor dalam libgdx), tipe-tipe partikel efek, penggunaan particle effect dan contohnya.
