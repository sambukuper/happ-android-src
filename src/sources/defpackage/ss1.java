package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 implements v06 {
    public static final Object Z = new Object();
    public volatile v06 X;
    public volatile Object Y;

    public static v06 a(v06 v06Var) {
        if (v06Var instanceof ss1) {
            return v06Var;
        }
        ss1 ss1Var = new ss1();
        ss1Var.Y = Z;
        ss1Var.X = v06Var;
        return ss1Var;
    }

    @Override // defpackage.v06
    public final Object get() {
        Object obj;
        Object obj2 = this.Y;
        Object obj3 = Z;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.Y;
                if (obj == obj3) {
                    obj = this.X.get();
                    Object obj4 = this.Y;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.Y = obj;
                    this.X = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
