package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu implements v82 {
    public final /* synthetic */ byte a;

    public /* synthetic */ tu(byte b) {
        this.a = b;
    }

    @Override // defpackage.v82
    public final w82 a(Object obj, pd5 pd5Var, v76 v76Var) {
        byte b = 0;
        byte b2 = 1;
        byte b3 = 2;
        switch (this.a) {
            case 0:
                dq8 dq8Var = (dq8) obj;
                Bitmap.Config[] configArr = at8.a;
                if (dh3.f(dq8Var.c, "file") && dh3.f(wv0.t0(rq7.j(dq8Var)), "android_asset")) {
                    return new uu(dq8Var, pd5Var, b);
                }
                return null;
            case 1:
                return new c60((Bitmap) obj);
            case 2:
                return new xa0((byte[]) obj, pd5Var, b);
            case 3:
                return new xa0((ByteBuffer) obj, pd5Var, b2);
            case 4:
                dq8 dq8Var2 = (dq8) obj;
                if (dh3.f(dq8Var2.c, "content")) {
                    return new d51(dq8Var2, pd5Var);
                }
                return null;
            case 5:
                dq8 dq8Var3 = (dq8) obj;
                if (dh3.f(dq8Var3.c, "data")) {
                    return new uu(dq8Var3, pd5Var, b2);
                }
                return null;
            case 6:
                return new xa0((Drawable) obj, pd5Var, b3);
            case 7:
                dq8 dq8Var4 = (dq8) obj;
                String str = dq8Var4.c;
                if ((str != null && !str.equals("file")) || dq8Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = at8.a;
                if (dh3.f(dq8Var4.c, "file") && dh3.f(wv0.t0(rq7.j(dq8Var4)), "android_asset")) {
                    return null;
                }
                return new uu(dq8Var4, pd5Var, b3);
            case 8:
                dq8 dq8Var5 = (dq8) obj;
                if (dh3.f(dq8Var5.c, "jar:file")) {
                    return new uu(dq8Var5, pd5Var, (byte) 3);
                }
                return null;
            default:
                dq8 dq8Var6 = (dq8) obj;
                if (dh3.f(dq8Var6.c, "android.resource")) {
                    return new uu(dq8Var6, pd5Var, (byte) 4);
                }
                return null;
        }
    }
}
