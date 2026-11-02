package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b60 implements sd1 {
    public final d73 a;
    public final pd5 b;
    public final k17 c;
    public final e62 d;

    public b60(d73 d73Var, pd5 pd5Var, k17 k17Var, e62 e62Var) {
        this.a = d73Var;
        this.b = pd5Var;
        this.c = k17Var;
        this.d = e62Var;
    }

    public static final nd1 b(b60 b60Var) throws Exception {
        v52 v52Var;
        boolean z;
        Bitmap bitmapCreateBitmap;
        int i;
        int iMin;
        double dMax;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        pd5 pd5Var = b60Var.b;
        y50 y50Var = new y50(b60Var.a.source());
        j76 j76Var = new j76(y50Var);
        options.inJustDecodeBounds = true;
        byte b = 2;
        BitmapFactory.decodeStream(new h90(j76Var.peek(), b), null, options);
        Exception exc = y50Var.X;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = f62.a;
        String str = options.outMimeType;
        b60Var.d.getClass();
        if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
            c62 c62Var = new c62(new d62(new h90(j76Var.peek(), b)));
            int iC = c62Var.c(1, "Orientation");
            boolean z2 = iC == 2 || iC == 7 || iC == 4 || iC == 5;
            switch (c62Var.c(1, "Orientation")) {
                case 3:
                case 4:
                    i2 = 180;
                    break;
                case 5:
                case 8:
                    i2 = 270;
                    break;
                case 6:
                case 7:
                    i2 = 90;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            v52Var = new v52(i2, z2);
        } else {
            v52Var = v52.c;
        }
        int i3 = v52Var.b;
        boolean z3 = v52Var.a;
        Exception exc2 = y50Var.X;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && b73.b(pd5Var) != null) {
            options.inPreferredColorSpace = bt.a(z68.G(pd5Var, b73.c));
        }
        boolean zBooleanValue = ((Boolean) z68.G(pd5Var, b73.d)).booleanValue();
        Context context = pd5Var.a;
        options.inPremultiplied = zBooleanValue;
        Bitmap.Config config = (Bitmap.Config) z68.G(pd5Var, b73.b);
        if ((z3 || i3 > 0) && (config == null || ue3.z(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) z68.G(pd5Var, b73.h)).booleanValue() && config == Bitmap.Config.ARGB_8888 && dh3.f(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i4 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i5 = options.outWidth;
        if (i5 <= 0 || (i = options.outHeight) <= 0) {
            options.inSampleSize = 1;
            z = false;
            options.inScaled = false;
        } else {
            int i6 = (i3 == 90 || i3 == 270) ? i : i5;
            if (i3 != 90 && i3 != 270) {
                i5 = i;
            }
            ta7 ta7Var = pd5Var.b;
            pw6 pw6Var = pd5Var.c;
            f4 f4Var = y63.b;
            long jL = w79.l(i6, i5, ta7Var, pw6Var, (ta7) z68.G(pd5Var, f4Var));
            z3 = z3;
            int i7 = (int) (jL >> 32);
            int i8 = (int) (jL & 4294967295L);
            int iHighestOneBit = Integer.highestOneBit(i6 / i7);
            int iHighestOneBit2 = Integer.highestOneBit(i5 / i8);
            int iOrdinal = pw6Var.ordinal();
            if (iOrdinal == 0) {
                iMin = Math.min(iHighestOneBit, iHighestOneBit2);
            } else {
                if (iOrdinal != 1) {
                    b61.c();
                    return null;
                }
                iMin = Math.max(iHighestOneBit, iHighestOneBit2);
            }
            if (iMin < 1) {
                iMin = 1;
            }
            options.inSampleSize = iMin;
            context = context;
            double d = iMin;
            double d2 = ((double) i6) / d;
            double d3 = ((double) i5) / d;
            ta7 ta7Var2 = (ta7) z68.G(pd5Var, f4Var);
            double d4 = ((double) i7) / d2;
            double d5 = ((double) i8) / d3;
            int iOrdinal2 = pw6Var.ordinal();
            if (iOrdinal2 == 0) {
                dMax = Math.max(d4, d5);
            } else {
                if (iOrdinal2 != 1) {
                    b61.c();
                    return null;
                }
                dMax = Math.min(d4, d5);
            }
            yo1 yo1Var = ta7Var2.a;
            if (yo1Var instanceof wo1) {
                double d6 = ((double) ((wo1) yo1Var).a) / d2;
                if (dMax > d6) {
                    dMax = d6;
                }
            }
            yo1 yo1Var2 = ta7Var2.b;
            if (yo1Var2 instanceof wo1) {
                double d7 = ((double) ((wo1) yo1Var2).a) / d3;
                if (dMax > d7) {
                    dMax = d7;
                }
            }
            if (pd5Var.d == tr5.Y && dMax > 1.0d) {
                dMax = 1.0d;
            }
            boolean z4 = dMax == 1.0d;
            options.inScaled = !z4;
            if (!z4) {
                if (dMax > 1.0d) {
                    options.inDensity = nr4.N(2.147483647E9d / dMax);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = nr4.N(2.147483647E9d * dMax);
                }
            }
            z = false;
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new h90(j76Var, (byte) 2), null, options);
            j76Var.close();
            Exception exc3 = y50Var.X;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                bt.i("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                return null;
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z3 || i3 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z3) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i3 > 0) {
                    matrix.postRotate(i3, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f = rectF.left;
                if (f != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f, -rectF.top);
                }
                if (i3 == 90 || i3 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, f62.a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new nd1(z39.h(new BitmapDrawable(context.getResources(), bitmapDecodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(j76Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sd1
    public final Object a(q51 q51Var) throws Throwable {
        a60 a60Var;
        k17 k17Var;
        Throwable th;
        k17 k17Var2;
        if (q51Var instanceof a60) {
            a60Var = (a60) q51Var;
            int i = a60Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                a60Var.i0 = i - Integer.MIN_VALUE;
            } else {
                a60Var = new a60(this, (s51) q51Var);
            }
        } else {
            a60Var = new a60(this, (s51) q51Var);
        }
        Object obj = a60Var.g0;
        int i2 = a60Var.i0;
        q51 q51Var2 = null;
        c71 c71Var = c71.X;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                k17Var = this.c;
                a60Var.f0 = k17Var;
                a60Var.i0 = 1;
                if (k17Var.a(a60Var) != c71Var) {
                }
                return c71Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k17Var2 = a60Var.f0;
                try {
                    w39.n0(obj);
                    nd1 nd1Var = (nd1) obj;
                    k17Var2.c();
                    return nd1Var;
                } catch (Throwable th2) {
                    th = th2;
                    k17Var2.c();
                    throw th;
                }
            }
            k17 k17Var3 = a60Var.f0;
            w39.n0(obj);
            k17Var = k17Var3;
            o7 o7Var = new o7((Object) this, (byte) 12);
            a60Var.f0 = k17Var;
            a60Var.i0 = 2;
            Object objW = w51.W(b02.X, new pg3(o7Var, q51Var2, (byte) 0), a60Var);
            if (objW != c71Var) {
                k17 k17Var4 = k17Var;
                obj = objW;
                k17Var2 = k17Var4;
                nd1 nd1Var2 = (nd1) obj;
                k17Var2.c();
                return nd1Var2;
            }
            return c71Var;
        } catch (Throwable th3) {
            k17 k17Var5 = k17Var;
            th = th3;
            k17Var2 = k17Var5;
            k17Var2.c();
            throw th;
        }
    }
}
