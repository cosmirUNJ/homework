# ShipDemo

#### Play with the framerate
 <p> Di sinilah Anda menetapkan properti awal untuk aplikasi Anda, seperti ukuran layar atau apakah dapat diubah ukurannya.</p>
 
#### Modify the size of the game window
 <p> Di sini ukuran dari game window, ketika width dan height nya diganti, background belakang akan mempunyai gambar yang tetap.
 Yang terlihat hanya saja seperti diresize</p>

      public static void main (String[] arg) {
      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
      // These are the configuration attributes
      config.width  = 1280;
      config.height = 720;
      config.resizable  = false;

      // THERE IS NO FULLSCREEN SUPPORT FOR RETINA MACS...
      // ... until LibGDX updates to LWGJL 3 (still testing as of December 2015) 
      config.fullscreen = false;

      // Create the new application and run it.
      new LwjglApplication(new GDXRoot(), config);
      }
 
#### Change the ship sizes
  <p> Harus dilakukan pengecekan pada CollisionController dan GameCanvas di kelas Ship.
  Selain merubah ukuran dari ship, kita juga harus merubah ukuran dari shadowsnya</p>

	    private static final int SHIP_SIZE  = 81;

#### Implement wrap-around
Jika ship tersebut menyentuh tembok, makan akan memantul.
Kami mengubahnya agar ship tersebut bisa tembus dan muncul dari sisi yang lainnya

#### Play with the draw mode
Pada file GameMode ada pembuatan photon, dan photon itu sendiri disimpan di dalam assets

#### Improve the photon appearance
Ada 3 tugas point yang harus dikerjakan yaitu
1. Modifikasi pewarnaan foton sehingga berubah warna terus menerus.
2. Ubah tembakan agar menghilang seiring bertambahnya usia, jadi mereka tidak tiba-tiba hilang saat dilepas.
3. Gambarkan setiap foton waktu ekstra dengan ukuran lebih besar (coba 4x) dan opacity yang lebih rendah / lebih cepat hingga memudar.
