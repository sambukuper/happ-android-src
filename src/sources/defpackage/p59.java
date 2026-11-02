package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p59 {
    public final d85 a;
    public Object b;
    public boolean c = false;

    public p59(d85 d85Var) {
        this.a = d85Var;
    }

    public final Object a(Object obj) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        f50 f50Var = ((ex5) this.a).Y;
        try {
            Method method = f50Var.j0;
            Object objInvoke = method == null ? f50Var.k0.get(obj) : method.invoke(obj, null);
            this.b = objInvoke;
            return objInvoke;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new IllegalStateException("Problem accessing property '" + f50Var.Y.X + "': " + e2.getMessage(), e2);
        }
    }
}
