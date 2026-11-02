package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q06 {
    public final x74 a;

    public q06(dn2 dn2Var) {
        this.a = new x74(dn2Var);
    }

    public t06 a(Object obj) {
        return new t06(this, obj, obj == null, null, null, true);
    }

    public jt8 b() {
        return this.a;
    }

    public final t06 c(gn2 gn2Var) {
        return new t06(this, null, false, null, gn2Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r4
  0x0034: PHI (r4v2 jt8) = (r4v6 jt8), (r4v7 jt8) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final jt8 d(t06 t06Var, jt8 jt8Var) {
        a11 a11Var;
        jt8 jt8Var2;
        li7 li7Var;
        vx1 vx1Var;
        jt8 jt8Var3 = null;
        jt8Var3 = null;
        jt8Var3 = null;
        jt8Var3 = null;
        jt8Var3 = null;
        jt8Var3 = null;
        if (jt8Var instanceof vx1) {
            if (t06Var.e) {
                vx1Var = (vx1) jt8Var;
                vx1Var.a.setValue(t06Var.a());
            }
        } else if (jt8Var instanceof li7) {
            if ((t06Var.b || t06Var.f != null) && !t06Var.e) {
                li7Var = (li7) jt8Var;
                if (dh3.f(t06Var.a(), li7Var.a)) {
                    jt8Var2 = a11Var;
                    jt8Var2 = li7Var;
                    jt8Var3 = jt8Var2;
                }
            }
        } else if (jt8Var instanceof a11) {
            a11Var = (a11) jt8Var;
            if (t06Var.d == a11Var.a) {
                jt8Var2 = a11Var;
                jt8Var2 = li7Var;
                jt8Var3 = jt8Var2;
            }
        }
        if (jt8Var3 != null) {
            jt8Var3 = vx1Var;
            return jt8Var3;
        }
        if (!t06Var.e) {
            gn2 gn2Var = t06Var.d;
            if (gn2Var != null) {
                jt8Var3 = vx1Var;
                return new a11(gn2Var);
            }
            jt8Var3 = vx1Var;
            return new li7(t06Var.a());
        }
        Object obj = t06Var.f;
        qd7 qd7Var = t06Var.c;
        if (qd7Var == null) {
            jt8Var3 = vx1Var;
            qd7Var = qe4.v0;
        }
        jt8Var3 = vx1Var;
        return new vx1(new rh5(obj, qd7Var));
    }
}
