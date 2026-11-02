package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l75 implements ow3 {
    public final ow3 a;
    public final f37 b;

    public l75(ow3 ow3Var) {
        ow3Var.getClass();
        this.a = ow3Var;
        this.b = new f37(ow3Var.d());
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        if (obj != null) {
            ol7Var.r(this.a, obj);
        } else {
            ol7Var.o();
        }
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        if (rd1Var.w()) {
            return rd1Var.a(this.a);
        }
        return null;
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l75.class == obj.getClass() && dh3.f(this.a, ((l75) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
