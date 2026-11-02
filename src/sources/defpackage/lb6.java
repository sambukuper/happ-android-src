package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb6 implements kb6 {
    public final yu3 X;

    public lb6(yu3 yu3Var) {
        yu3Var.getClass();
        this.X = yu3Var;
        zc1.X(null, new ub(0, this, mb6.class, "computeAbsentArguments", "computeAbsentArguments(Lkotlin/reflect/jvm/internal/ReflectKCallable;)[Ljava/lang/Object;", 1, (byte) 26));
    }

    public final Object S(Object... objArr) throws a53 {
        try {
            return r().d(objArr);
        } catch (IllegalAccessException e) {
            throw new a53(e);
        }
    }

    @Override // defpackage.kb6
    public List l() {
        return g();
    }
}
