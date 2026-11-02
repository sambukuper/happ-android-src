package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kr {
    public static final kr d = new kr(ep.c, ep.f, dw0.c);
    public final long a;
    public final long b;
    public final long c;

    public kr(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr)) {
            return false;
        }
        kr krVar = (kr) obj;
        long j = krVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, krVar.b) && tk8.a(this.c, krVar.c);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.c) + p61.g(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strH = dw0.h(this.a);
        String strH2 = dw0.h(this.b);
        return oi0.p(oi0.t("AppIconColors(dropdownMenu=", strH, ", chevron=", strH2, ", swipeUnderlayButton="), dw0.h(this.c), ")");
    }
}
