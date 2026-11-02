package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vz7 implements g44, Serializable {
    public dn2 X;
    public volatile Object Y;
    public final Object Z;

    public vz7(dn2 dn2Var) {
        dn2Var.getClass();
        this.X = dn2Var;
        this.Y = lh4.L0;
        this.Z = this;
    }

    @Override // defpackage.g44
    public final boolean d() {
        return this.Y != lh4.L0;
    }

    @Override // defpackage.g44
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.Y;
        lh4 lh4Var = lh4.L0;
        if (obj != lh4Var) {
            return obj;
        }
        synchronized (this.Z) {
            objInvoke = this.Y;
            if (objInvoke == lh4Var) {
                dn2 dn2Var = this.X;
                dn2Var.getClass();
                objInvoke = dn2Var.invoke();
                this.Y = objInvoke;
                this.X = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
