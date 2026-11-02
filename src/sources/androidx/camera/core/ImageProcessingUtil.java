package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import defpackage.bt;
import defpackage.hi5;
import defpackage.j63;
import defpackage.l63;
import defpackage.n63;
import defpackage.q53;
import defpackage.q63;
import defpackage.u52;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(n63 n63Var) {
        if (!f(n63Var)) {
            hi5.z0("ImageProcessingUtil");
            return;
        }
        int iB = n63Var.b();
        int iA = n63Var.a();
        int iJ = n63Var.n()[0].j();
        int iJ2 = n63Var.n()[1].j();
        int iJ3 = n63Var.n()[2].j();
        int iZ = n63Var.n()[0].z();
        int iZ2 = n63Var.n()[1].z();
        if (nativeShiftPixel(n63Var.n()[0].c(), iJ, n63Var.n()[1].c(), iJ2, n63Var.n()[2].c(), iJ3, iZ, iZ2, iB, iA, iZ, iZ2, iZ2) != 0) {
            hi5.z0("ImageProcessingUtil");
        }
    }

    public static Bitmap b(n63 n63Var) {
        if (n63Var.getFormat() != 35) {
            bt.q("Input image format must be YUV_420_888");
            return null;
        }
        int iB = n63Var.b();
        int iA = n63Var.a();
        int iJ = n63Var.n()[0].j();
        int iJ2 = n63Var.n()[1].j();
        int iJ3 = n63Var.n()[2].j();
        int iZ = n63Var.n()[0].z();
        int iZ2 = n63Var.n()[1].z();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(n63Var.b(), n63Var.a(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(n63Var.n()[0].c(), iJ, n63Var.n()[1].c(), iJ2, n63Var.n()[2].c(), iJ3, iZ, iZ2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iB, iA) == 0) {
            return bitmapCreateBitmap;
        }
        u52.k("YUV to RGB conversion failed");
        return null;
    }

    public static q53 c(n63 n63Var, q63 q63Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!f(n63Var)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        System.currentTimeMillis();
        if (!e(i)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        Surface surface = q63Var.getSurface();
        int iB = n63Var.b();
        int iA = n63Var.a();
        int iJ = n63Var.n()[0].j();
        int iJ2 = n63Var.n()[1].j();
        int iJ3 = n63Var.n()[2].j();
        int iZ = n63Var.n()[0].z();
        int iZ2 = n63Var.n()[1].z();
        if (nativeConvertAndroid420ToABGR(n63Var.n()[0].c(), iJ, n63Var.n()[1].c(), iJ2, n63Var.n()[2].c(), iJ3, iZ, iZ2, surface, byteBuffer, iB, iA, z ? iZ : 0, z ? iZ2 : 0, z ? iZ2 : 0, i) != 0) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            hi5.z0("ImageProcessingUtil");
            a++;
        }
        n63 n63VarD = q63Var.d();
        if (n63VarD == null) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        q53 q53Var = new q53(n63VarD);
        q53Var.g(new j63(n63VarD, n63Var, (byte) 0));
        return q53Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean e(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    public static boolean f(n63 n63Var) {
        return n63Var.getFormat() == 35 && n63Var.n().length == 3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    public static q53 g(n63 n63Var, q63 q63Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        q53 q53Var;
        if (!f(n63Var)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        if (!e(i)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        if (i > 0) {
            int iB = n63Var.b();
            int iA = n63Var.a();
            int iJ = n63Var.n()[0].j();
            int iJ2 = n63Var.n()[1].j();
            int iJ3 = n63Var.n()[2].j();
            int iZ = n63Var.n()[1].z();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage == null) {
                q53Var = null;
            } else {
                q53Var = null;
                if (nativeRotateYUV(n63Var.n()[0].c(), iJ, n63Var.n()[1].c(), iJ2, n63Var.n()[2].c(), iJ3, iZ, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iB, iA, i) == 0) {
                    imageWriter.queueInputImage(imageDequeueInputImage);
                    n63 n63VarD = q63Var.d();
                    if (n63VarD == null) {
                        hi5.z0("ImageProcessingUtil");
                        return null;
                    }
                    q53 q53Var2 = new q53(n63VarD);
                    q53Var2.g(new j63(n63VarD, n63Var, (byte) 1));
                    return q53Var2;
                }
            }
        } else {
            q53Var = null;
        }
        hi5.z0("ImageProcessingUtil");
        return q53Var;
    }

    public static q53 h(n63 n63Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i) {
        if (!f(n63Var)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        if (!e(i)) {
            hi5.z0("ImageProcessingUtil");
            return null;
        }
        if (i == 0 && n63Var.n().length == 3 && n63Var.n()[1].z() == 2 && nativeGetYUVImageVUOff(n63Var.n()[2].c(), n63Var.n()[1].c()) == -1) {
            return null;
        }
        int i2 = i % 180;
        int iB = i2 == 0 ? n63Var.b() : n63Var.a();
        int iA = i2 == 0 ? n63Var.a() : n63Var.b();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(n63Var.n()[0].c(), n63Var.n()[0].j(), n63Var.n()[1].c(), n63Var.n()[1].j(), n63Var.n()[2].c(), n63Var.n()[2].j(), n63Var.n()[2].z(), byteBuffer4, iB, 1, byteBufferNativeNewDirectByteBuffer, iB, 2, byteBuffer5, iB, 2, byteBuffer, byteBuffer2, byteBuffer3, n63Var.b(), n63Var.a(), i) == 0) {
            return new q53(new l63(n63Var, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iB, iA));
        }
        hi5.z0("ImageProcessingUtil");
        return null;
    }

    public static void i(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            hi5.z0("ImageProcessingUtil");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
