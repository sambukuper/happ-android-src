package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gg7 {
    public static final /* synthetic */ int a = 0;

    static {
        Object rj6Var;
        Object rj6Var2;
        Exception exc = new Exception();
        String simpleName = w79.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            rj6Var = r10.class.getCanonicalName();
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            rj6Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            rj6Var2 = gg7.class.getCanonicalName();
        } catch (Throwable th2) {
            rj6Var2 = new rj6(th2);
        }
        if (sj6.a(rj6Var2) != null) {
            rj6Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
