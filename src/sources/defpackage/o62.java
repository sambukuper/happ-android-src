package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o62 extends cw0 {
    public final jd0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o62(jd0 jd0Var, t14 t14Var) {
        super(t14Var);
        if (t14Var == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f0 = jd0Var;
    }

    public final String toString() {
        return c() + ": Ext {" + this.f0 + "}";
    }
}
