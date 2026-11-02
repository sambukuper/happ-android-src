package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jr6 {
    public static volatile g55 a = new g55((byte) 15);
    public static volatile we5 c = new we5(16);
    public static volatile we5 b = new we5(14);

    public static o85 a(o85 o85Var) {
        return (o85) b.a(o85Var);
    }

    public static void b(Throwable th) {
        try {
            a.mo8a((Object) th);
        } catch (Throwable th2) {
            System.err.println("The onError handler threw an Exception. It shouldn't. => " + th2.getMessage());
            th2.printStackTrace();
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            Thread threadCurrentThread2 = Thread.currentThread();
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        }
    }

    public static Throwable c(Throwable th) {
        return (Throwable) c.a(th);
    }
}
