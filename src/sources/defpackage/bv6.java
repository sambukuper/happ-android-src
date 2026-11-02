package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bv6 implements g44, Serializable {
    public static final /* synthetic */ long Z = iu.a.objectFieldOffset(bv6.class.getDeclaredField("Y"));
    public volatile dn2 X;
    public volatile Object Y;

    @Override // defpackage.g44
    public final boolean d() {
        return this.Y != lh4.L0;
    }

    @Override // defpackage.g44
    public final Object getValue() {
        bv6 bv6Var;
        Object obj = this.Y;
        lh4 lh4Var = lh4.L0;
        if (obj != lh4Var) {
            return obj;
        }
        dn2 dn2Var = this.X;
        if (dn2Var != null) {
            Object objInvoke = dn2Var.invoke();
            while (true) {
                bv6Var = this;
                if (iu.a.compareAndSwapObject(bv6Var, Z, lh4Var, objInvoke)) {
                    bv6Var.X = null;
                    return objInvoke;
                }
                if (iu.a.getObjectVolatile(bv6Var, Z) == lh4Var) {
                    this = bv6Var;
                }
            }
        } else {
            bv6Var = this;
        }
        return bv6Var.Y;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
