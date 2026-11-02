package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum m42 {
    ;

    public static final Throwable X = new Throwable("Terminated");

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        Throwable g01Var;
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == X) {
                return false;
            }
            if (th2 == null) {
                g01Var = th;
            } else if (th2 instanceof g01) {
                ArrayList arrayList = new ArrayList(((g01) th2).X);
                arrayList.add(th);
                g01Var = new g01(arrayList);
            } else {
                g01Var = new g01(th2, th);
            }
            while (!atomicReference.compareAndSet(th2, g01Var)) {
                if (atomicReference.get() != th2) {
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = X;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static m42 valueOf(String str) {
        p61.x(Enum.valueOf(m42.class, str));
        throw null;
    }
}
