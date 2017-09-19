# Input Handling

Tiap platform mempunyai fasilitas input yang berbeda. Pada desktop bisa menggunakan mouse dan keyboar, sedangkan pada Android menggunakan touch screen

* Configuration & Querying
    * Disabling Accelerometer & Compass (Android only)
    * Enabling Gyroscope (Android only)
    * Querying Available Input Devices
*	Mouse, Touch & Keyboard * Polling * Event Handling
    * Input utama yang disupport libgdx yaitu mouse untuk desktop/browser, touch screen di Android, dan keyboard.
    *	Keyboard, tiga method utama untuk keyboard:
         - keyDown(): dipanggil ketika tombol ditekan.
         - keyUp(): dipanggil ketika tombol dilepas.
         - keyTyped(): dipanggil ketika karakter Unicode degenerate oleh input keyboard
    *	Mouse and Touch, lima method untuk mouse & touch events :
         - touchDown(): dipanggil ketika mouse di tekan atau layer di sentuh.
         - touchUp(): dipanggil ketika mouse atau sentuhan di lepas.
         - touchDragged(): dipanggil ketika mouse atau touch di drag.
         - mouseMoved(): dipanggil ketika mouse berpindah posisi pada layar tanpa menekan tombol pada mouse.
         - scrolled(): dipanggil ketika scroll pada mouse diputar.
* Controllers
  The goals:
    *	Enumerate connected controllers
    *	Support for buttons, axes, sliders, POVs and accelerometers per controller
    *	Listen for controller events globally or per controller
    *	Poll controller state
*	Gesture Detection
    *	touchDown: ketika user menyentuh layar
    *	longPress: ketika user menyentuh layar untuk beberapa lama
    *	tap: user menyentuh layar dan mengangkat jarinya lagi
    *	pan: user menyeret jari ke layar
    *	panStop: dipanggil saat tidak lagi panning
    *	fling: user menyeret jari ke seberang layar, lalu mengangkatnya seperti sedang menggesek
    *	zoom: user meletakkan dua jari di layar dan memindahkannya bersama-sama
    *	pinch: mirip dengan zoom
*	Simple Text Input
  * Jika pada aplikasi membutuhkan username dan password
*	Accelerometer
  * Mengukur percepatan perangkat pada tiga sumbu (pada Android)
*	Compass
  * Beberapa perangkat Android dan iOS memiliki sensor medan magnet yang berorientasi terhadap kutub utara
*	Gyroscope
  * Beberapa perangkat Android memiliki sensor gyroscope yang memberikan informasi tentang laju putaran di rad/s di sekitar sumbu x, y, dan z
*	Vibrator
  * Memungkinkan untuk menggetarkan telepon user, fungsinya sebagai umpan balik
*	Cursor Visibility & Catching
  * Cursor catching dan positioning hanya ada pada desktop
*	Back and Menu Key Catching
  * Ketika user menekan tombol kembali pada Android, makabiasanya membunuh aktivitas yang sedang berjalan. Permainan mungkin menampilkan dialog konfirmasi sebelum membiarkan pengguna keluar
*	On Screen Keyboard
  * Fungsi ini hanya tersedia pada platform Android dan iOS
