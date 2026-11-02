package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class en3 extends bo3 implements Iterable {
    public final ArrayList X = new ArrayList();

    @Override // defpackage.bo3
    public final int a() {
        return f().a();
    }

    @Override // defpackage.bo3
    public final String d() {
        return f().d();
    }

    public final void e(bo3 bo3Var) {
        if (bo3Var == null) {
            bo3Var = xp3.X;
        }
        this.X.add(bo3Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof en3) && ((en3) obj).X.equals(this.X);
        }
        return true;
    }

    public final bo3 f() {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        if (size == 1) {
            return (bo3) arrayList.get(0);
        }
        bt.i(pc6.j(size, "Array must have size 1, but has size "));
        return null;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.X.iterator();
    }
}
