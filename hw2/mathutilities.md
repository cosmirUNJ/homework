# Math Utilities

Merupakan package yang berguna untuk menyelesaikan permasalahan matematika seperti geometri, ajlabar linear, dll. Terdapat beberapa class sebagai berikut :

* Math Utils
	
	* Mencakup peluang dan tujuan yang berguna. Ada ada static random untuk menghindari instantiating. Ada konstanta untuk konversi antara radian dan derajat. Dan lain lain

* Catmull-Rom Spline
	
	* Berguna untuk menggambarkan gerakan badan yang halus dari space. 
	
	*Ear-Clipping Triangulator
	
	*Windowed Mean

* Untuk melacak nilai floating point dalam rentang tertentu.


## Interpolation 

Memungkinkan untuk menghasilkan transisi yanglebih halus secara komputasi. Jenis jenis interpolasi seperti bounce, lingkaran, elastis, dll. Contoh penggunaan :

```kotlin
val easAlpha:Interpolation = Interpolation.fade
val lifeTime:Int = 2
var elapsed:Float = 0f
..
fun update(delta:Float)
{
    elapsed += delta

    val progress = Math.min(1f, elapsed/lifeTime)   // 0 -> 1 
    val alpha = easAlpha.apply(progress)
}
```

## Vector, Matrices, Quaternion

* Vector

	* Merupakan besaran seperti posisi, kecepatan, dan percepatan yang memiliki arah.
	
	* Umumnya digunakan untuk mengambarkan gerak tubuh.
	
	* Pada LibGDX, ada vector ruang dan vector dimensi.
	
Berikut contoh pemanggilan vector dari  (x1, y1, z1) ke (x2, y2, z2):

```java
Vector3 vec = new Vector3( x2, y2, z2 ).sub( x1, y1, z1 ).nor();
```

Setara dengan

```java
Vector3 vec = new Vector3( x2, y2, z2 );  // new vector at (x2, y2, z2)
vec.sub( x1, y1, z1 );                    // subtract point (x1, y1, z1)
vec.nor();                                // normalize result
```

* Matrices

	* Deret angka dua dimensi
	
	* Biasa digunakan pada grafik, untuk transformasi, dan lain lain.
	
	* Pada libGDX, penggunaan yang paling umum pada pengontrolan kamera

* Quaternion

	* Digunakan dalam rotasi pada ruang tiga dimensi.
	
	* LibGDX juga menyediakan metode untuk mengkonversi antara quaternion dan representasi rotasi lainnya seperti sudut euler, matriks, rotasi, dan lain lain

## Circles, Planes, Rays, etc.

LibGDX memiliki beberapa class untuk menangani permasalahan bentuk, area, volume.

* Bounding Boxes

	* Boxes yang memiliki batasan untuk melakukan tes tertentu.

* Circles

	* Class untuk menggambarkan lingkaran dengan titik pusat dan jari-jari
	
* Frustum

	* Merupakan piramida 4 sisi
	
	* Untuk memproyeksikan adegan 3D ke 2D. 
	
* Planes

	* Digunakan untuk membagi ruang dan sector pada suatu objek
	
* Poligon

* Rays

	* Sinar garis satu arah
	
	* Ditentukan berdasarkan titik asal, arah, satuan, dan panjang
	
	* Dapat diuji dengan bounding boxes
	
	* Digunakan untuk menggambarkan mouse atau titik sentuh dari proyeksi tempat kejadian berdasarkan sudut pandang kamera
	
* Rectangle

	* Class yang digunakan untuk menguji titik untuk penahanan di dalam persegi panjang
	
* Segmen

* Sphere

	* Class untuk membatasi bidang tiga dimensi yang didefinisikan dari titik pusat dan radius.
	
## Path interface & Splines

* Path interface memungkinkan kita melintasi serangkaian titik secara lancar.

* Ada 3 implementasi dari path interface, yaitu Bezier, BSpline, CatmullRomSpline

