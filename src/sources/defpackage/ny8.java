package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ny8 implements cj0 {
    public final cj0 X;
    public final py8 Y;
    public final qy8 Z;
    public final oy8 f0;

    public ny8(cj0 cj0Var, oy8 oy8Var, kp5 kp5Var) {
        this.X = cj0Var;
        this.f0 = oy8Var;
        this.Y = new py8(cj0Var.g());
        this.Z = new qy8(cj0Var.s());
    }

    @Override // defpackage.cj0
    public final xb4 a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.cj0
    public final r85 b() {
        return this.X.b();
    }

    @Override // defpackage.gq8
    public final void d(hq8 hq8Var) {
        s08.b();
        this.f0.d(hq8Var);
    }

    @Override // defpackage.gq8
    public final void f(hq8 hq8Var) {
        s08.b();
        this.f0.f(hq8Var);
    }

    @Override // defpackage.cj0
    public final qh0 g() {
        return this.Y;
    }

    @Override // defpackage.gq8
    public final void i(hq8 hq8Var) {
        s08.b();
        this.f0.i(hq8Var);
    }

    @Override // defpackage.gq8
    public final void k(hq8 hq8Var) {
        s08.b();
        this.f0.k(hq8Var);
    }

    @Override // defpackage.cj0
    public final void n(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.cj0
    public final void o(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.cj0
    public final boolean q() {
        return false;
    }

    @Override // defpackage.cj0
    public final aj0 s() {
        return this.Z;
    }
}
