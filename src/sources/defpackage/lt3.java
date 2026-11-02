package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt3 extends vr3 {
    public final String l;
    public final String m;

    public lt3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.l = str;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt3)) {
            return false;
        }
        lt3 lt3Var = (lt3) obj;
        return dh3.f(this.l, lt3Var.l) && dh3.f(this.m, lt3Var.m);
    }

    @Override // defpackage.vr3
    public final String g() {
        return this.l + this.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + (this.l.hashCode() * 31);
    }
}
