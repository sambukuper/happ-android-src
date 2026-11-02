package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hp0[], still in use, count: 1, list:
  (r0v1 hp0[]) from 0x001a: CONSTRUCTOR (r0v1 hp0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:27) call: n22.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hp0 {
    /* JADX INFO: Fake field, exist only in values array */
    DOMAIN("domain"),
    /* JADX INFO: Fake field, exist only in values array */
    URL("URL");

    public static final be Y = new be((byte) 10);
    public static final /* synthetic */ n22 f0 = new n22(new hp0[]{new hp0("domain"), new hp0("URL")});
    public final String X;

    static {
    }

    public hp0(String str) {
        super(str, i);
        this.X = str;
    }

    public static hp0 valueOf(String str) {
        return (hp0) Enum.valueOf(hp0.class, str);
    }

    public static hp0[] values() {
        return (hp0[]) Z.clone();
    }
}
