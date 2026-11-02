package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface bx8 {
    default xw8 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default xw8 b(Class cls, sz4 sz4Var) {
        return a(cls);
    }

    default xw8 c(zu3 zu3Var, sz4 sz4Var) {
        zu3Var.getClass();
        return b(zc1.M(zu3Var), sz4Var);
    }
}
