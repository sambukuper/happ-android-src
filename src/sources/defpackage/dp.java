package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dp {
    public final long a;
    public final uo b;
    public final xr c;
    public final ap d;
    public final bs e;
    public final rr f;
    public final ir g;
    public final kr h;
    public final to i;
    public final er j;
    public final yr k;
    public final qr l;
    public final bp m;
    public final wr n;
    public final vr o;

    public dp(long j, uo uoVar, xr xrVar, ap apVar, bs bsVar, rr rrVar, ir irVar, kr krVar, to toVar, er erVar, yr yrVar, qr qrVar, bp bpVar, wr wrVar, vr vrVar) {
        uoVar.getClass();
        xrVar.getClass();
        apVar.getClass();
        bsVar.getClass();
        rrVar.getClass();
        irVar.getClass();
        krVar.getClass();
        toVar.getClass();
        erVar.getClass();
        yrVar.getClass();
        qrVar.getClass();
        bpVar.getClass();
        wrVar.getClass();
        vrVar.getClass();
        this.a = j;
        this.b = uoVar;
        this.c = xrVar;
        this.d = apVar;
        this.e = bsVar;
        this.f = rrVar;
        this.g = irVar;
        this.h = krVar;
        this.i = toVar;
        this.j = erVar;
        this.k = yrVar;
        this.l = qrVar;
        this.m = bpVar;
        this.n = wrVar;
        this.o = vrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        long j = dpVar.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && dh3.f(this.b, dpVar.b) && dh3.f(this.c, dpVar.c) && dh3.f(this.d, dpVar.d) && this.e.equals(dpVar.e) && this.f.equals(dpVar.f) && dh3.f(this.g, dpVar.g) && this.h.equals(dpVar.h) && this.i.equals(dpVar.i) && dh3.f(this.j, dpVar.j) && this.k.equals(dpVar.k) && dh3.f(this.l, dpVar.l) && dh3.f(this.m, dpVar.m) && dh3.f(this.n, dpVar.n) && this.o.equals(dpVar.o);
    }

    public final int hashCode() {
        int i = dw0.h;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppColors(primary=" + dw0.h(this.a) + ", background=" + this.b + ", text=" + this.c + ", border=" + this.d + ", toggle=" + this.e + ", radioButton=" + this.f + ", filledButton=" + this.g + ", icon=" + this.h + ", action=" + this.i + ", dialog=" + this.j + ", textField=" + this.k + ", progressIndicator=" + this.l + ", bottomSheet=" + this.m + ", snackbar=" + this.n + ", slider=" + this.o + ")";
    }
}
