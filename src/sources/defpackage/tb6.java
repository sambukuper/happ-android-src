package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tb6 implements dn2 {
    public static final we5 Z = new we5(10);
    public final dn2 X;
    public volatile SoftReference Y;

    public tb6(Object obj, dn2 dn2Var) {
        if (dn2Var == null) {
            bt.q("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.Y = null;
        this.X = dn2Var;
        if (obj != null) {
            this.Y = new SoftReference(obj);
        }
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        Object obj;
        Object obj2 = Z;
        SoftReference softReference = this.Y;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.X.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.Y = new SoftReference(obj2);
        return objInvoke;
    }
}
