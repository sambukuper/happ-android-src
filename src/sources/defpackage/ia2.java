package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 implements sm {
    public final sm X;
    public final as5 Y;

    public ia2(sm smVar, as5 as5Var) {
        this.X = smVar;
        this.Y = as5Var;
    }

    @Override // defpackage.sm
    public final boolean isEmpty() {
        sm smVar = this.X;
        if ((smVar instanceof Collection) && ((Collection) smVar).isEmpty()) {
            return false;
        }
        Iterator it = smVar.iterator();
        while (it.hasNext()) {
            fk2 fk2VarD = ((gm) it.next()).d();
            if (fk2VarD != null && ((Boolean) this.Y.B(fk2VarD)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.X) {
            fk2 fk2VarD = ((gm) obj).d();
            if (fk2VarD != null && ((Boolean) this.Y.B(fk2VarD)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.sm
    public final boolean k(fk2 fk2Var) {
        fk2Var.getClass();
        if (((Boolean) this.Y.B(fk2Var)).booleanValue()) {
            return this.X.k(fk2Var);
        }
        return false;
    }

    @Override // defpackage.sm
    public final gm p(fk2 fk2Var) {
        fk2Var.getClass();
        if (((Boolean) this.Y.B(fk2Var)).booleanValue()) {
            return this.X.p(fk2Var);
        }
        return null;
    }
}
