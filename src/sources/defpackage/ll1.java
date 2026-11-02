package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ll1 implements sm {
    public static final /* synthetic */ nw3[] Y = {new lx5(ll1.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final te4 X;

    public ll1(ve4 ve4Var, dn2 dn2Var) {
        ve4Var.getClass();
        this.X = new te4(ve4Var, dn2Var);
    }

    @Override // defpackage.sm
    public boolean isEmpty() {
        Y[0].getClass();
        return ((List) this.X.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Y[0].getClass();
        return ((List) this.X.invoke()).iterator();
    }

    @Override // defpackage.sm
    public final /* bridge */ boolean k(fk2 fk2Var) {
        return z39.y(this, fk2Var);
    }

    @Override // defpackage.sm
    public final /* bridge */ gm p(fk2 fk2Var) {
        return z39.t(this, fk2Var);
    }
}
