package defpackage;

import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qw2 implements i72 {
    public final OkHttpClient b;

    public qw2() {
        i72.a.getClass();
        this.b = ((OkHttpClient.Builder) h72.b.getValue()).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        pw2 pw2Var;
        if (s51Var instanceof pw2) {
            pw2Var = (pw2) s51Var;
            int i = pw2Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw2Var.h0 = i - Integer.MIN_VALUE;
            } else {
                pw2Var = new pw2(this, s51Var);
            }
        } else {
            pw2Var = new pw2(this, s51Var);
        }
        Object objW = pw2Var.f0;
        int i2 = pw2Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objW);
            nf1 nf1Var = tp1.a;
            ye1 ye1Var = ye1.Z;
            l40 l40Var = new l40((Object) this, q51Var, (byte) 5);
            pw2Var.h0 = 1;
            objW = w51.W(ye1Var, l40Var, pw2Var);
            c71 c71Var = c71.X;
            if (objW == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objW);
        }
        return ((sj6) objW).X;
    }
}
