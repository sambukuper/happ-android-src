package defpackage;

import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hi7 implements sd1 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final pd5 c;
    public final k17 d;

    public hi7(ImageDecoder.Source source, AutoCloseable autoCloseable, pd5 pd5Var, k17 k17Var) {
        this.a = source;
        this.b = autoCloseable;
        this.c = pd5Var;
        this.d = k17Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.sd1
    public final Object a(q51 q51Var) {
        gi7 gi7Var;
        k17 k17Var;
        if (q51Var instanceof gi7) {
            gi7Var = (gi7) q51Var;
            int i = gi7Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi7Var.i0 = i - Integer.MIN_VALUE;
            } else {
                gi7Var = new gi7(this, (s51) q51Var);
            }
        } else {
            gi7Var = new gi7(this, (s51) q51Var);
        }
        Object obj = gi7Var.g0;
        int i2 = gi7Var.i0;
        byte b = 1;
        if (i2 == 0) {
            w39.n0(obj);
            k17 k17Var2 = this.d;
            gi7Var.f0 = k17Var2;
            gi7Var.i0 = 1;
            Object objA = k17Var2.a(gi7Var);
            c71 c71Var = c71.X;
            if (objA == c71Var) {
                return c71Var;
            }
            k17Var = k17Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k17Var = gi7Var.f0;
            w39.n0(obj);
        }
        try {
            AutoCloseable autoCloseable = this.b;
            try {
                aa6 aa6Var = new aa6();
                nd1 nd1Var = new nd1(new d60(ImageDecoder.decodeBitmap(this.a, new pj(this, aa6Var, b))), aa6Var.X);
                u15.h(autoCloseable, null);
                k17Var.c();
                return nd1Var;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            k17Var.c();
            throw th3;
        }
    }
}
