package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends ui8 {
    public final hi8[] b;
    public final ni8[] c;
    public final boolean d;

    public nb3(hi8[] hi8VarArr, ni8[] ni8VarArr, boolean z) {
        hi8VarArr.getClass();
        ni8VarArr.getClass();
        this.b = hi8VarArr;
        this.c = ni8VarArr;
        this.d = z;
    }

    @Override // defpackage.ui8
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.ui8
    public final ni8 d(t14 t14Var) {
        ot0 ot0VarX = t14Var.n0().x();
        hi8 hi8Var = ot0VarX instanceof hi8 ? (hi8) ot0VarX : null;
        if (hi8Var != null) {
            int index = hi8Var.getIndex();
            hi8[] hi8VarArr = this.b;
            if (index < hi8VarArr.length && dh3.f(hi8VarArr[index].l(), hi8Var.l())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // defpackage.ui8
    public final boolean e() {
        return this.c.length == 0;
    }
}
