package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w44 implements wf5 {
    public final z47 a;
    public final pe4 b;

    public w44(c6 c6Var) {
        this.a = new z47(c6Var, lh4.K0, new qc3(null));
        this.b = new pe4((ve4) c6Var.f0, new ConcurrentHashMap(3, 1.0f, 2), new ve7((byte) 15), (byte) 0);
    }

    @Override // defpackage.wf5
    public final boolean a(fk2 fk2Var) {
        fk2Var.getClass();
        return false;
    }

    @Override // defpackage.wf5
    public final void b(fk2 fk2Var, ArrayList arrayList) {
        fk2Var.getClass();
        arrayList.add(c(fk2Var));
    }

    public final v44 c(fk2 fk2Var) {
        fk2Var.getClass();
        Object objB = this.b.B(new re4(fk2Var, new c3((Object) this, (Object) new db6(fk2Var), (byte) 25)));
        if (objB != null) {
            return (v44) objB;
        }
        pe4.c(3);
        throw null;
    }

    @Override // defpackage.wf5
    public final Collection t(fk2 fk2Var, gn2 gn2Var) {
        fk2Var.getClass();
        List list = (List) c(fk2Var).o0.invoke();
        return list == null ? d02.X : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((wx4) ((c6) this.a.Y).n0);
    }
}
