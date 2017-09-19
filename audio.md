# Audio

* Libgdx menyediakan metode untuk memutar ulang efek suara kecil serta mengalirkan potongan musik yang lebih besar langsung dari disk. Ini juga menyediakan kemudahan membaca dan menulis akses ke perangkat keras audio
* Sound Effect, efek suara bisa disimpan dalam berbagai format. Libgdx mendukung file MP3, OGG dan WAV. RoboVM (iOS) saat ini tidak mendukung file OGG
* Streaming Music, untuk suara yang lebih lama dari beberapa detik, lebih baik mengalirkannya dari disk alih-alih memasukkannya ke RAM sepenuhnya
* Playing PCM Audio, output PCM langsung tidak didukung di back-end JavaScript / WebGL
* Recording PCM Audio, dapat mengakses data PCM dari microphone PC atau ponsel Android. Audio recording tidak didukung dalam JavaScript / WebGL
