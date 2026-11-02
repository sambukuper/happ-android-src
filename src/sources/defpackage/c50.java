package defpackage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c50 extends h50 {
    public final h50 m0;

    public c50(g50 g50Var) {
        super(g50Var, (wg) null, g50Var.h0);
        this.m0 = g50Var;
    }

    public final void A(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        if (this.g0 != null) {
            t37Var.getClass();
        }
        f50[] f50VarArr = this.f0;
        int i = 0;
        try {
            int length = f50VarArr.length;
            while (i < length) {
                f50 f50Var = f50VarArr[i];
                if (f50Var == null) {
                    ro3Var.X();
                } else {
                    f50Var.j(obj, ro3Var, t37Var);
                }
                i++;
            }
        } catch (Exception e) {
            lj7.n(t37Var, e, obj, f50VarArr[i].Y.X);
            throw null;
        } catch (StackOverflowError e2) {
            pp3 pp3Var = new pp3(ro3Var, "Infinite recursion (StackOverflowError)", e2);
            op3 op3Var = new op3(obj, f50VarArr[i].Y.X);
            LinkedList linkedList = pp3Var.X;
            if (linkedList == null) {
                linkedList = new LinkedList();
                pp3Var.X = linkedList;
            }
            if (linkedList.size() >= 1000) {
                throw pp3Var;
            }
            pp3Var.X.addFirst(op3Var);
            throw pp3Var;
        }
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) throws IOException {
        if (t37Var.X.j(n37.v0) && this.f0.length == 1) {
            A(obj, ro3Var, t37Var);
            return;
        }
        ro3Var.J0(obj);
        A(obj, ro3Var, t37Var);
        ro3Var.D();
    }

    @Override // defpackage.h50, defpackage.ar3
    public final void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws IOException {
        if (this.j0 != null) {
            o(obj, ro3Var, t37Var, ri8Var);
            return;
        }
        z76 z76VarQ = q(ri8Var, obj, gr3.START_ARRAY);
        ri8Var.e(ro3Var, z76VarQ);
        ro3Var.m(obj);
        A(obj, ro3Var, t37Var);
        ri8Var.f(ro3Var, z76VarQ);
    }

    @Override // defpackage.ar3
    public final ar3 g(c25 c25Var) {
        return this.m0.g(c25Var);
    }

    public final String toString() {
        return "BeanAsArraySerializer for ".concat(this.X.getName());
    }

    @Override // defpackage.h50
    public final h50 w(Set set, Set set2) {
        return new c50(this, set, set2);
    }

    @Override // defpackage.h50
    public final h50 x(Object obj) {
        return new c50(this, this.j0, obj);
    }

    @Override // defpackage.h50
    public final h50 y(wg wgVar) {
        return this.m0.y(wgVar);
    }

    public c50(c50 c50Var, wg wgVar, Object obj) {
        super(c50Var, wgVar, obj);
        this.m0 = c50Var;
    }

    public c50(c50 c50Var, Set set, Set set2) {
        super(c50Var, set, set2);
        this.m0 = c50Var;
    }
}
