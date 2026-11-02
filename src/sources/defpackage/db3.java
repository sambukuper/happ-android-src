package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 implements rb1, ca8, h61 {
    public final cb3 a;
    public final eb3 b;

    public /* synthetic */ db3() {
        this(new cb3(), new eb3());
    }

    @Override // defpackage.h61
    public final Object a() {
        cb3 cb3Var = this.a;
        hb3 hb3Var = cb3Var.a;
        cb3 cb3Var2 = new cb3(new hb3(hb3Var.a, hb3Var.b), cb3Var.b, cb3Var.c, cb3Var.d);
        eb3 eb3Var = this.b;
        return new db3(cb3Var2, new eb3(eb3Var.a, eb3Var.b, eb3Var.c, eb3Var.d, eb3Var.e, eb3Var.f));
    }

    @Override // defpackage.ca8
    public final void b(cd1 cd1Var) {
        this.b.b(cd1Var);
    }

    @Override // defpackage.ca8
    public final a9 c() {
        return this.b.c;
    }

    @Override // defpackage.ca8
    public final void d(Integer num) {
        this.b.b = num;
    }

    @Override // defpackage.ca8
    public final void e(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.x69
    public final void f(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.ca8
    public final Integer g() {
        return this.b.d;
    }

    @Override // defpackage.ca8
    public final void h(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.x69
    public final Integer i() {
        return this.a.a.a;
    }

    @Override // defpackage.rb1
    public final Integer j() {
        return this.a.c;
    }

    @Override // defpackage.ca8
    public final cd1 k() {
        return this.b.k();
    }

    @Override // defpackage.ca8
    public final Integer l() {
        return this.b.f;
    }

    @Override // defpackage.ca8
    public final Integer m() {
        return this.b.b;
    }

    @Override // defpackage.rb1
    public final Integer n() {
        return this.a.b;
    }

    @Override // defpackage.rb1
    public final void o(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.ca8
    public final void p(a9 a9Var) {
        this.b.c = a9Var;
    }

    @Override // defpackage.rb1
    public final Integer q() {
        return this.a.d;
    }

    @Override // defpackage.x69
    public final void r(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.x69
    public final Integer s() {
        return this.a.a.b;
    }

    @Override // defpackage.rb1
    public final void t(Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.ca8
    public final void u(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.ca8
    public final Integer v() {
        return this.b.a;
    }

    @Override // defpackage.ca8
    public final Integer w() {
        return this.b.e;
    }

    @Override // defpackage.ca8
    public final void x(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.rb1
    public final void y(Integer num) {
        this.a.d = num;
    }

    public db3(cb3 cb3Var, eb3 eb3Var) {
        this.a = cb3Var;
        this.b = eb3Var;
    }
}
