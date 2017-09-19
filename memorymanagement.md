# Memory Management

* Libgdx mempunyai beberapa class yang menerapkan antarmuka sekali pakai yang mengindikasikan bahwa class ini harus dibuang secara manual pada akhir masa pakai
* Kegagalan membuang (dispose) sumber daya akan menyebabkan kebocoran memori yang parah. Berikut ini merupakan class yang membutuhkan untuk dibuang secara manual:
    *	AssetManager
    *	Bitmap
    *	BitmapFont
    *	BitmapFontCache
    *	CameraGroupStrategy
    *	DecalBatch
    *	ETC1Data
    *	FrameBuffer
    *	Mesh
    *	Model
    *	ModelBatch
    *	ParticleEffect
    *	Pixmap
    *	PixmapPacker
    *	Shader
    *	ShaderProgram
    *	Shape
    *	Skin
    *	SpriteBatch
    *	SpriteCache
    *	Stage
    *	Texture
    *	TextureAtlas
    *	TileAtlas
    *	TileMapRenderer
    *	com.badlogic.gdx.physics.box2d.World
    *	all bullet classes
* Object Pooling
      Prinsip object pooling adalah penggunaan kembali objek yang tidak aktif atau mati, alih-alih menciptakan objek baru setiap saat.
      LibGdx menawarkan beberapa tools untuk penggabungan yang mudah:
        *	Poolable Interface: objek yang mengimplementasikan interface ini akan memiliki reset () yang dipanggil saat dilewatkan ke Pool.free (Object)
        *	Pool: kolam objek yang bisa digunakan kembali untuk menghindari alokasi
        *	Pools: menyimpan peta Pools (biasanya ReflectionPools) menurut jenis untuk akses statis yang mudah digunakan
