package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jv0 {
    public int X;
    public Object Y;

    public jv0(int i) {
        this.X = i;
    }

    public abstract long A();

    public abstract boolean B(int i);

    public void D() throws qh3 {
        boolean zB;
        do {
            int iY = y();
            if (iY == 0) {
                return;
            }
            int i = this.X;
            if (i >= 100) {
                throw new qh3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.X = i + 1;
            zB = B(iY);
            this.X--;
        } while (zB);
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract w19 f(w19 w19Var, List list);

    public abstract xd6 g(c19 c19Var, xd6 xd6Var);

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract hb0 k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();

    public jv0() {
    }

    public void d(c19 c19Var) {
    }

    public void e(c19 c19Var) {
    }
}
