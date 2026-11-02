package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g42 implements Runnable, Comparable, gq1 {
    public long X;
    public int Y = -1;
    private volatile Object _heap;

    public g42(long j) {
        this.X = j;
    }

    @Override // defpackage.gq1
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                z31 z31Var = j42.a;
                if (obj == z31Var) {
                    return;
                }
                h42 h42Var = obj instanceof h42 ? (h42) obj : null;
                if (h42Var != null) {
                    synchronized (h42Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof m98 ? (m98) obj2 : null) != null) {
                            h42Var.c(this.Y);
                        }
                    }
                }
                this._heap = z31Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, h42 h42Var, i42 i42Var) {
        synchronized (this) {
            if (this._heap == j42.a) {
                return 2;
            }
            synchronized (h42Var) {
                try {
                    g42[] g42VarArr = h42Var.a;
                    g42 g42Var = g42VarArr != null ? g42VarArr[0] : null;
                    int i = i42.l0;
                    if (iu.a.getIntVolatile(i42Var, i42.j0) == 1) {
                        return 1;
                    }
                    if (g42Var == null) {
                        h42Var.c = j;
                    } else {
                        long j2 = g42Var.X;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = h42Var.c;
                        if (j - j3 > 0) {
                            h42Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.X - j < 0) {
                        this.X = j;
                    }
                    h42Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.X - ((g42) obj).X;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(h42 h42Var) {
        if (this._heap != j42.a) {
            this._heap = h42Var;
        } else {
            bt.q("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.X + ']';
    }
}
