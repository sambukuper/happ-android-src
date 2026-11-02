package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e28 {
    public final f28 a;
    public final String b;
    public boolean c;
    public w18 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public e28(f28 f28Var, String str) {
        this.a = f28Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = ks8.a;
        synchronized (this.a) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        w18 w18Var = this.d;
        if (w18Var != null && w18Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((w18) arrayList.get(size)).b) {
                w18 w18Var2 = (w18) arrayList.get(size);
                if (f28.i.isLoggable(Level.FINE)) {
                    d28.e(w18Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(w18 w18Var, long j) {
        w18Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(w18Var, j, false)) {
                    this.a.c(this);
                }
            } else if (w18Var.b) {
                if (f28.i.isLoggable(Level.FINE)) {
                    d28.e(w18Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f28.i.isLoggable(Level.FINE)) {
                    d28.e(w18Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    public final boolean d(w18 w18Var, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        w18Var.getClass();
        e28 e28Var = w18Var.c;
        if (e28Var != this) {
            if (e28Var != null) {
                bt.i("task is in multiple queues");
                return false;
            }
            w18Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(w18Var);
        if (iIndexOf == -1) {
            w18Var.d = j2;
            if (f28.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(d28.d(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(d28.d(j2 - jNanoTime));
                }
                d28.e(w18Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((w18) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, w18Var);
            if (size == 0) {
                return true;
            }
        } else if (w18Var.d > j2) {
            arrayList.remove(iIndexOf);
            w18Var.d = j2;
            if (f28.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(d28.d(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(d28.d(j2 - jNanoTime));
                }
                d28.e(w18Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((w18) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, w18Var);
            if (size == 0) {
                return true;
            }
        } else if (f28.i.isLoggable(Level.FINE)) {
            d28.e(w18Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = ks8.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
