package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {
    public b3[] X;
    public int Y;
    public int Z;
    public lq7 f0;

    public final b3 d() {
        b3 b3VarF;
        lq7 lq7Var;
        synchronized (this) {
            try {
                b3[] b3VarArrH = this.X;
                if (b3VarArrH == null) {
                    b3VarArrH = h();
                    this.X = b3VarArrH;
                } else if (this.Y >= b3VarArrH.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(b3VarArrH, b3VarArrH.length * 2);
                    this.X = (b3[]) objArrCopyOf;
                    b3VarArrH = (b3[]) objArrCopyOf;
                }
                int i = this.Z;
                do {
                    b3VarF = b3VarArrH[i];
                    if (b3VarF == null) {
                        b3VarF = f();
                        b3VarArrH[i] = b3VarF;
                    }
                    i++;
                    if (i >= b3VarArrH.length) {
                        i = 0;
                    }
                } while (!b3VarF.a(this));
                this.Z = i;
                this.Y++;
                lq7Var = this.f0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lq7Var != null) {
            lq7Var.y(1);
        }
        return b3VarF;
    }

    public b3 f() {
        w77 w77Var = new w77();
        w77Var.a = -1L;
        return w77Var;
    }

    public b3[] h() {
        return new w77[2];
    }

    public final void i(b3 b3Var) {
        lq7 lq7Var;
        int i;
        q51[] q51VarArrB;
        synchronized (this) {
            try {
                int i2 = this.Y - 1;
                this.Y = i2;
                lq7Var = this.f0;
                if (i2 == 0) {
                    this.Z = 0;
                }
                b3Var.getClass();
                q51VarArrB = b3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (q51 q51Var : q51VarArrB) {
            if (q51Var != null) {
                q51Var.f(dn8.a);
            }
        }
        if (lq7Var != null) {
            lq7Var.y(-1);
        }
    }

    public final lq7 j() {
        lq7 lq7Var;
        synchronized (this) {
            lq7Var = this.f0;
            if (lq7Var == null) {
                int i = this.Y;
                lq7Var = new lq7(1, Integer.MAX_VALUE, l90.Y);
                lq7Var.g(Integer.valueOf(i));
                this.f0 = lq7Var;
            }
        }
        return lq7Var;
    }
}
