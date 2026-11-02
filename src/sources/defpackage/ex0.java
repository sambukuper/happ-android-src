package defpackage;

import java.io.Serializable;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements s61, Serializable {
    public final s61 X;
    public final q61 Y;

    public ex0(q61 q61Var, s61 s61Var) {
        s61Var.getClass();
        this.X = s61Var;
        this.Y = q61Var;
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        s61Var.getClass();
        return s61Var == b02.X ? this : (s61) s61Var.U(new dx0((byte) 22), this);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        r61Var.getClass();
        while (true) {
            q61 q61VarH0 = this.Y.H0(r61Var);
            if (q61VarH0 != null) {
                return q61VarH0;
            }
            s61 s61Var = this.X;
            if (!(s61Var instanceof ex0)) {
                return s61Var.H0(r61Var);
            }
            this = (ex0) s61Var;
        }
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(this.X.U(rn2Var, obj), this.Y);
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        r61Var.getClass();
        q61 q61Var = this.Y;
        q61 q61VarH0 = q61Var.H0(r61Var);
        s61 s61Var = this.X;
        if (q61VarH0 != null) {
            return s61Var;
        }
        s61 s61VarA0 = s61Var.a0(r61Var);
        if (s61VarA0 == s61Var) {
            return this;
        }
        return s61VarA0 == b02.X ? q61Var : new ex0(q61Var, s61VarA0);
    }

    public final boolean equals(Object obj) {
        boolean zF;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ex0) {
            ex0 ex0Var = (ex0) obj;
            int i = 2;
            ex0 ex0Var2 = ex0Var;
            int i2 = 2;
            while (true) {
                s61 s61Var = ex0Var2.X;
                ex0Var2 = s61Var instanceof ex0 ? (ex0) s61Var : null;
                if (ex0Var2 == null) {
                    break;
                }
                i2++;
            }
            ex0 ex0Var3 = this;
            while (true) {
                s61 s61Var2 = ex0Var3.X;
                ex0Var3 = s61Var2 instanceof ex0 ? (ex0) s61Var2 : null;
                if (ex0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    q61 q61Var = this.Y;
                    if (!dh3.f(ex0Var.H0(q61Var.getKey()), q61Var)) {
                        zF = false;
                        break;
                    }
                    s61 s61Var3 = this.X;
                    if (!(s61Var3 instanceof ex0)) {
                        s61Var3.getClass();
                        q61 q61Var2 = (q61) s61Var3;
                        zF = dh3.f(ex0Var.H0(q61Var2.getKey()), q61Var2);
                        break;
                    }
                    this = (ex0) s61Var3;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode();
    }

    public final String toString() {
        return oi0.o(new StringBuilder("["), (String) U(new dx0((byte) 0), _UrlKt.FRAGMENT_ENCODE_SET), ']');
    }
}
