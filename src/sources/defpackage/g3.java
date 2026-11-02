package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements lh8 {
    public final /* synthetic */ km1 X;

    public g3(km1 km1Var) {
        this.X = km1Var;
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return true;
    }

    @Override // defpackage.lh8
    public final Collection c() {
        Collection collectionC = this.X.J0().n0().c();
        collectionC.getClass();
        return collectionC;
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        return el1.e(this.X);
    }

    @Override // defpackage.lh8
    public final List g() {
        List list = this.X.t0;
        if (list != null) {
            return list;
        }
        dh3.T("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.X.getName().b() + ']';
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return this.X;
    }
}
