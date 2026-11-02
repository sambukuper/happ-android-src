package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dl6 {
    public final long a = dw0.g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl6)) {
            return false;
        }
        long j = ((dl6) obj).a;
        int i = dw0.h;
        return tk8.a(this.a, j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) dw0.h(this.a)) + ", rippleAlpha=null)";
    }
}
