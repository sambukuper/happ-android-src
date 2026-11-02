package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nj0 {
    public final Context a;
    public final pj0 b;
    public final mj0 c;
    public final yr2 d;
    public final lj0 e;
    public final oj0 f;

    public nj0(Context context, pj0 pj0Var, lj0 lj0Var) {
        mj0 mj0Var = new mj0((byte) 0);
        yr2 yr2Var = new yr2((byte) 13);
        oj0 oj0Var = new oj0();
        this.a = context;
        this.b = pj0Var;
        this.c = mj0Var;
        this.d = yr2Var;
        this.e = lj0Var;
        this.f = oj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nj0) {
            nj0 nj0Var = (nj0) obj;
            if (this.a.equals(nj0Var.a) && this.b.equals(nj0Var.b) && this.c == nj0Var.c && this.d == nj0Var.d && this.e.equals(nj0Var.e) && this.f.equals(nj0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return pc6.f((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961, 31, false);
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
