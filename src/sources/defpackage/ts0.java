package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ts0[], still in use, count: 1, list:
  (r0v1 ts0[]) from 0x004e: CONSTRUCTOR (r0v1 ts0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ts0 {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    public static final /* synthetic */ n22 l0;
    public final id2 X;

    static {
        l0 = new n22(ts0VarArr);
    }

    public ts0(int i) {
        super(str, i);
        kd2 kd2Var = md2.f;
        kd2Var.getClass();
        this.X = new id2(kd2Var, i);
    }

    public static ts0 valueOf(String str) {
        return (ts0) Enum.valueOf(ts0.class, str);
    }

    public static ts0[] values() {
        return (ts0[]) k0.clone();
    }
}
