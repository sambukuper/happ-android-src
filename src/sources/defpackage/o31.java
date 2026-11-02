package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 {
    public final Uri a;
    public final boolean b;

    public o31(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o31.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o31 o31Var = (o31) obj;
        return this.a.equals(o31Var.a) && this.b == o31Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
