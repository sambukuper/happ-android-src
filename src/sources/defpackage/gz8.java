package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gz8[], still in use, count: 1, list:
  (r0v1 gz8[]) from 0x0040: CONSTRUCTOR (r0v1 gz8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:65) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gz8 {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public static final /* synthetic */ n22 i0;
    public final id2 X;

    static {
        i0 = new n22(gz8VarArr);
    }

    public gz8(int i) {
        super(str, i);
        kd2 kd2Var = md2.d;
        kd2Var.getClass();
        this.X = new id2(kd2Var, i);
    }

    public static gz8 valueOf(String str) {
        return (gz8) Enum.valueOf(gz8.class, str);
    }

    public static gz8[] values() {
        return (gz8[]) h0.clone();
    }
}
