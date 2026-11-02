package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vm implements sm {
    public final /* synthetic */ byte X;
    public final Object Y;

    public vm(sm[] smVarArr) {
        this.X = (byte) 1;
        this.Y = eu.K0(smVarArr);
    }

    @Override // defpackage.sm
    public final boolean isEmpty() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((sm) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new rd2(new sd2(new hu((List) obj, (byte) 1), ag.t0, a37.X));
            default:
                return c02.X;
        }
    }

    @Override // defpackage.sm
    public final boolean k(fk2 fk2Var) {
        switch (this.X) {
            case 0:
                return z39.y(this, fk2Var);
            case 1:
                fk2Var.getClass();
                Iterator it = ((List) this.Y).iterator();
                while (it.hasNext()) {
                    if (((sm) it.next()).k(fk2Var)) {
                        return true;
                    }
                }
                return false;
            default:
                return z39.y(this, fk2Var);
        }
    }

    @Override // defpackage.sm
    public final gm p(fk2 fk2Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return z39.t(this, fk2Var);
            case 1:
                fk2Var.getClass();
                ka2 ka2Var = new ka2(w27.m0(new hu((List) obj, (byte) 1), new e01(fk2Var, (byte) 0)));
                return (gm) (ka2Var.hasNext() ? ka2Var.next() : null);
            default:
                fk2Var.getClass();
                if (fk2Var.equals((fk2) obj)) {
                    return p12.a;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.X) {
            case 0:
                return ((List) this.Y).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vm(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
