package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ru4 implements bx6 {
    public final e2 a;
    public final gn8 b;
    public final u62 c;

    public ru4(gn8 gn8Var, u62 u62Var, e2 e2Var) {
        this.b = gn8Var;
        u62Var.getClass();
        this.c = u62Var;
        this.a = e2Var;
    }

    @Override // defpackage.bx6
    public final void a(Object obj, Object obj2) {
        ex6.k(this.b, obj, obj2);
    }

    @Override // defpackage.bx6
    public final void b(Object obj) {
        ((in8) this.b).getClass();
        hn8 hn8Var = ((cq2) obj).unknownFields;
        if (hn8Var.e) {
            hn8Var.e = false;
        }
        this.c.getClass();
        p61.x(obj);
        throw null;
    }

    @Override // defpackage.bx6
    public final boolean c(Object obj) {
        this.c.getClass();
        p61.x(obj);
        throw null;
    }

    @Override // defpackage.bx6
    public final boolean d(cq2 cq2Var, cq2 cq2Var2) {
        in8 in8Var = (in8) this.b;
        in8Var.getClass();
        hn8 hn8Var = cq2Var.unknownFields;
        in8Var.getClass();
        return hn8Var.equals(cq2Var2.unknownFields);
    }

    @Override // defpackage.bx6
    public final void e(Object obj, kv0 kv0Var, s62 s62Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.bx6
    public final int f(cq2 cq2Var) {
        ((in8) this.b).getClass();
        return cq2Var.unknownFields.hashCode();
    }

    @Override // defpackage.bx6
    public final int g(cq2 cq2Var) {
        ((in8) this.b).getClass();
        hn8 hn8Var = cq2Var.unknownFields;
        int i = hn8Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < hn8Var.a; i2++) {
            int i3 = hn8Var.b[i2] >>> 3;
            iF += mv0.f(3, (hb0) hn8Var.c[i2]) + mv0.i(i3) + mv0.h(2) + (mv0.h(1) * 2);
        }
        hn8Var.d = iF;
        return iF;
    }

    @Override // defpackage.bx6
    public final void h(Object obj, yr2 yr2Var) {
        this.c.getClass();
        p61.x(obj);
        throw null;
    }

    @Override // defpackage.bx6
    public final cq2 i() {
        e2 e2Var = this.a;
        return e2Var instanceof cq2 ? ((cq2) e2Var).i() : ((vp2) ((cq2) e2Var).c(5)).b();
    }
}
