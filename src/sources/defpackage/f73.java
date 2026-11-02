package defpackage;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f73 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final e73 j;
    public boolean k;

    public f73(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        long j2 = (i2 & 32) != 0 ? dw0.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        e73 e73Var = new e73(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = e73Var;
        arrayList.add(e73Var);
    }

    public static void a(f73 f73Var, ArrayList arrayList, fe7 fe7Var) {
        if (f73Var.k) {
            wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((e73) oi0.h(1, f73Var.i)).j.add(new iu8(_UrlKt.FRAGMENT_ENCODE_SET, arrayList, 0, fe7Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final g73 b() {
        if (this.k) {
            wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                e73 e73Var = this.j;
                g73 g73Var = new g73(this.a, this.b, this.c, this.d, this.e, new fu8(e73Var.a, e73Var.b, e73Var.c, e73Var.d, e73Var.e, e73Var.f, e73Var.g, e73Var.h, e73Var.i, e73Var.j), this.f, this.g, this.h);
                this.k = true;
                return g73Var;
            }
            if (this.k) {
                wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            e73 e73Var2 = (e73) arrayList.remove(arrayList.size() - 1);
            ((e73) oi0.h(1, arrayList)).j.add(new fu8(e73Var2.a, e73Var2.b, e73Var2.c, e73Var2.d, e73Var2.e, e73Var2.f, e73Var2.g, e73Var2.h, e73Var2.i, e73Var2.j));
        }
    }
}
