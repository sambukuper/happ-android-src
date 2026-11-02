package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt5 extends tv0 {
    public final xt5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(ow3 ow3Var) {
        super(ow3Var);
        ow3Var.getClass();
        this.b = new xt5(ow3Var.d());
    }

    @Override // defpackage.tv0, defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        int iH = h(obj);
        xt5 xt5Var = this.b;
        ol7 ol7VarA = ol7Var.a(xt5Var);
        o(ol7VarA, obj, iH);
        ol7VarA.v(xt5Var);
    }

    @Override // defpackage.a1, defpackage.ow3
    public final Object b(rd1 rd1Var) {
        return i(rd1Var);
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return this.b;
    }

    @Override // defpackage.a1
    public final Object e() {
        return (wt5) k(n());
    }

    @Override // defpackage.a1
    public final int f(Object obj) {
        wt5 wt5Var = (wt5) obj;
        wt5Var.getClass();
        return wt5Var.d();
    }

    @Override // defpackage.a1
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.a1
    public final Object l(Object obj) {
        wt5 wt5Var = (wt5) obj;
        wt5Var.getClass();
        return wt5Var.a();
    }

    @Override // defpackage.tv0
    public final void m(int i, Object obj, Object obj2) {
        ((wt5) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public Object n() {
        return new boolean[0];
    }

    public void o(ol7 ol7Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        ol7Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.c(this.b, i2, zArr[i2]);
        }
    }
}
