package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ex4[], still in use, count: 1, list:
  (r0v1 ex4[]) from 0x0030: CONSTRUCTOR (r0v1 ex4[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ex4 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    public static final /* synthetic */ n22 i0;
    public final id2 X;

    static {
        i0 = new n22(ex4VarArr);
    }

    public ex4(int i) {
        super(str, i);
        kd2 kd2Var = md2.e;
        kd2Var.getClass();
        this.X = new id2(kd2Var, i);
    }

    public static ex4 valueOf(String str) {
        return (ex4) Enum.valueOf(ex4.class, str);
    }

    public static ex4[] values() {
        return (ex4[]) h0.clone();
    }
}
