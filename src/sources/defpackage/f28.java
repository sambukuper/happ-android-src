package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f28 {
    public static final f28 h;
    public static final Logger i;
    public final y45 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final xb g = new xb(this, 21);

    static {
        js8 js8Var = new js8(oi0.p(new StringBuilder(), ks8.f, " TaskRunner"), true, (byte) 0);
        y45 y45Var = new y45();
        y45Var.X = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), js8Var);
        h = new f28(y45Var);
        Logger logger = Logger.getLogger(f28.class.getName());
        logger.getClass();
        i = logger;
    }

    public f28(y45 y45Var) {
        this.a = y45Var;
    }

    public final void a(w18 w18Var, long j) {
        byte[] bArr = ks8.a;
        e28 e28Var = w18Var.c;
        e28Var.getClass();
        if (e28Var.d != w18Var) {
            bt.i("Check failed.");
            return;
        }
        boolean z = e28Var.f;
        e28Var.f = false;
        e28Var.d = null;
        this.e.remove(e28Var);
        if (j != -1 && !z && !e28Var.c) {
            e28Var.d(w18Var, j, true);
        }
        if (e28Var.e.isEmpty()) {
            return;
        }
        this.f.add(e28Var);
    }

    public final w18 b() {
        boolean z;
        byte[] bArr = ks8.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            w18 w18Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                w18 w18Var2 = (w18) ((e28) it.next()).e.get(0);
                long jMax = Math.max(0L, w18Var2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (w18Var != null) {
                        z = true;
                        break;
                    }
                    w18Var = w18Var2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (w18Var != null) {
                byte[] bArr2 = ks8.a;
                w18Var.d = -1L;
                e28 e28Var = w18Var.c;
                e28Var.getClass();
                e28Var.e.remove(w18Var);
                arrayList.remove(e28Var);
                e28Var.d = w18Var;
                arrayList2.add(e28Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.a.X).execute(this.g);
                }
                return w18Var;
            }
            if (this.c) {
                if (jMin >= this.d - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.c = true;
            this.d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((e28) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        e28 e28Var2 = (e28) arrayList.get(size2);
                        e28Var2.b();
                        if (e28Var2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        return null;
    }

    public final void c(e28 e28Var) {
        e28Var.getClass();
        byte[] bArr = ks8.a;
        if (e28Var.d == null) {
            boolean zIsEmpty = e28Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(e28Var);
            } else if (!arrayList.contains(e28Var)) {
                arrayList.add(e28Var);
            }
        }
        if (this.c) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.a.X).execute(this.g);
        }
    }

    public final e28 d() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new e28(this, pc6.j(i2, "Q"));
    }

    public final void e(w18 w18Var) {
        byte[] bArr = ks8.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(w18Var.a);
        try {
            long jA = w18Var.a();
            synchronized (this) {
                a(w18Var, jA);
            }
        } finally {
            synchronized (this) {
                a(w18Var, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }
}
