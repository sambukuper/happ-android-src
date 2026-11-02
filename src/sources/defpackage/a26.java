package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class a26 {
    public static final /* synthetic */ int a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumMap enumMap = new EnumMap(md1.class);
        e10 e10Var = e10.r0;
        e10 e10Var2 = e10.s0;
        e10 e10Var3 = e10.X;
        e10 e10Var4 = e10.Y;
        e10 e10Var5 = e10.Z;
        e10 e10Var6 = e10.f0;
        e10 e10Var7 = e10.g0;
        e10 e10Var8 = e10.h0;
        e10 e10Var9 = e10.i0;
        e10 e10Var10 = e10.j0;
        e10 e10Var11 = e10.k0;
        e10 e10Var12 = e10.l0;
        e10 e10Var13 = e10.m0;
        e10 e10Var14 = e10.n0;
        ArrayList arrayListF = i21.f(new e10[]{e10Var3, e10Var4, e10Var5, e10Var6, e10Var7, e10Var8, e10Var9, e10Var10, e10Var11, e10Var12, e10Var13, e10Var14, e10.o0, e10.p0, e10.q0, e10Var, e10Var2});
        enumMap.put(md1.Y, e10Var14);
        enumMap.put(md1.X, arrayListF);
        enumMap.put(md1.Z, "utf-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap a(String str) {
        Bitmap rj6Var;
        try {
            HashMap map = new HashMap();
            map.put(r02.Y, "utf-8");
            w50 w50VarH = w45.H(str, map);
            int[] iArr = new int[640000];
            for (int i = 0; i < 800; i++) {
                for (int i2 = 0; i2 < 800; i2++) {
                    if (w50VarH.b(i2, i)) {
                        iArr[(i * 800) + i2] = -16777216;
                    } else {
                        iArr[(i * 800) + i2] = -1;
                    }
                }
            }
            rj6Var = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            rj6Var.setPixels(iArr, 0, 800, 0, 0, 800, 800);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        return rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Bitmap bitmap) {
        String rj6Var;
        vj6 rj6Var2;
        try {
            lr5 lr5Var = new lr5((byte) 3);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            i66 i66Var = new i66(width, height, iArr);
            try {
                rj6Var2 = lr5Var.B(new dq(new lr(i66Var), (byte) 22));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var2 = new rj6(th);
            }
            if (sj6.a(rj6Var2) != null) {
                try {
                    rj6Var2 = lr5Var.B(new dq(new lr(new gi3(i66Var)), (byte) 22));
                } catch (Throwable th2) {
                    rj6Var2 = new rj6(th2);
                }
            }
            if (rj6Var2 instanceof rj6) {
                rj6Var2 = null;
            }
            vj6 vj6Var = rj6Var2;
            rj6Var = vj6Var != null ? vj6Var.a : null;
        } catch (Throwable th3) {
            if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                throw th3;
            }
            rj6Var = new rj6(th3);
        }
        return rj6Var instanceof rj6 ? null : rj6Var;
    }
}
