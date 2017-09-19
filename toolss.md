# Tools

## Texture packer

	* Texture packer digunakn untuk menghemat penggunaan gamabar yang dilakukan berulang ulang

	* Cara menjalankan Texture Packer menggunakan gdx texture packer gui di https://github.com/crashinvaders/gdx-texture-packer-gui

	### Directory structure

	TexturePacker melakukan perulangan pada kumpulan gambar secara terus menerus pada satu shot

	### Image indexes

	* Aturan dalam penamaan gambar, seperti apabila gambar diakhiri dengan underscore diikuti dengan angka (ex: gambar_666.png) ,maka angka tersebut akan disimpan secara terpisah dan dianggap indeks.

	* TextureAtlas memungkinkan pengurutan gambar menurut indeks agar memudahkan urutan frame.

## Hiero

	* Tools membuat font (?) yang menggunakan format bitmap

	* Merupakan tools yang terpisah dari libgdx, dapat digunakan dengan cara mendownload di https://libgdx.badlogicgames.com/tools.html

	### Rasterization

	Terdapat 3 pilihan rasterization yaitu :
	1. FreeType : kualitas tertinggi

	1. Java's font : dapat menggunakan berbagai efek. Hasil akhir kadang blur pada ukuran kecil.

	1. OS native rendering : paling sederhana

	### Alternatives

	1. BitmapFontWriter : tools dari libgdx yang memungkinkan penulisan font menggunakan FreeTypeFontGenerator lalu dibuat dalam format PNG

	1. Glyph Designer : tools font bitmap berbayar untuk pengguna Mac. memungkinakn penggunaan background, gradient, dll.

	1. BMFont : menggunakan FreeType, tetapi memiliki tambahan fitur lain. Hanya dapat digunakan di OS Windows (untuk linux menggunakan wine)

	1. TWL Theme Editor

	1. gdx-fontpack

	1. FontPacker

	1. ShoeBox

	1. JME

	1. bmglyph

	1. Littera
	
## 2D Particle Editor

Tools untuk membuat efek efek partikel 