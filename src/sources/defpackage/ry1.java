package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public ry1(e37 e37Var, yn1 yn1Var) {
        e37Var.getClass();
        this.b = e37Var;
        this.c = yn1Var;
        int iE = e37Var.e();
        if (iE <= 64) {
            this.a = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iE - 1) >>> 6;
        ?? r3 = new long[i];
        if ((iE & 63) != 0) {
            r3[i - 1] = (-1) << iE;
        }
        this.d = r3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    public boolean a(j7 j7Var, m76 m76Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            p76 p76Var = (p76) it.next();
            p76Var.getClass();
            synchronized (p76Var) {
                if (z) {
                    try {
                        if (!(p76Var.g != null)) {
                            continue;
                        } else if (p76Var.h(j7Var, arrayList)) {
                            m76Var.a(p76Var);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (p76Var.h(j7Var, arrayList)) {
                    m76Var.a(p76Var);
                    return true;
                }
            }
        }
    }

    public int b(p76 p76Var, long j) {
        byte[] bArr = ks8.a;
        ArrayList arrayList = p76Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + p76Var.b.a.h + " was leaked. Did you forget to close a response body?";
                lo5 lo5Var = lo5.a;
                lo5.a.j(str, ((k76) reference).a);
                arrayList.remove(i);
                p76Var.j = true;
                if (arrayList.isEmpty()) {
                    p76Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public ry1(f28 f28Var) {
        f28Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = f28Var.d();
        this.c = new f23(this, oi0.p(new StringBuilder(), ks8.f, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }
}
