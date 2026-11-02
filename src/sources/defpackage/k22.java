package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k22 extends zp5 {
    public final j37 l;
    public final vz7 m;

    public k22(String str, int i) {
        super(str, null, i);
        this.l = j37.M;
        this.m = new vz7(new j22(i, str, this));
    }

    @Override // defpackage.zp5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e37)) {
            return false;
        }
        e37 e37Var = (e37) obj;
        return e37Var.r() == j37.M && this.a.equals(e37Var.a()) && dh3.f(wl7.o(this), wl7.o(e37Var));
    }

    @Override // defpackage.zp5, defpackage.e37
    public final e37 h(int i) {
        return ((e37[]) this.m.getValue())[i];
    }

    @Override // defpackage.zp5
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        w1 w1Var = new w1(this);
        int iHashCode2 = 1;
        while (w1Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) w1Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.zp5, defpackage.e37
    public final nr4 r() {
        return this.l;
    }

    @Override // defpackage.zp5
    public final String toString() {
        return wv0.y0(new gu(this, (byte) 3), ", ", this.a.concat("("), ")", null, 56);
    }
}
