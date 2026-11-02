package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oh1 extends jx4 {
    public final int q0 = j55.e(this);
    public jx4 r0;

    @Override // defpackage.jx4
    public final void O0() {
        super.O0();
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.X0(this.j0);
            if (!jx4Var.p0) {
                jx4Var.O0();
            }
        }
    }

    @Override // defpackage.jx4
    public final void P0() {
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.P0();
        }
        super.P0();
    }

    @Override // defpackage.jx4
    public final void T0() {
        super.T0();
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.T0();
        }
    }

    @Override // defpackage.jx4
    public final void U0() {
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.U0();
        }
        super.U0();
    }

    @Override // defpackage.jx4
    public final void V0() {
        super.V0();
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.V0();
        }
    }

    @Override // defpackage.jx4
    public final void W0(jx4 jx4Var) {
        this.X = jx4Var;
        for (jx4 jx4Var2 = this.r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
            jx4Var2.W0(jx4Var);
        }
    }

    @Override // defpackage.jx4
    public final void X0(i55 i55Var) {
        this.j0 = i55Var;
        for (jx4 jx4Var = this.r0; jx4Var != null; jx4Var = jx4Var.h0) {
            jx4Var.X0(i55Var);
        }
    }

    public final nh1 Y0(nh1 nh1Var) {
        jx4 jx4Var = ((jx4) nh1Var).X;
        if (jx4Var != nh1Var) {
            jx4 jx4Var2 = nh1Var instanceof jx4 ? (jx4) nh1Var : null;
            jx4 jx4Var3 = jx4Var2 != null ? jx4Var2.g0 : null;
            if (jx4Var != this.X || !dh3.f(jx4Var3, this)) {
                bt.i("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (jx4Var.p0) {
                wc3.b("Cannot delegate to an already attached node");
            }
            jx4Var.W0(this.X);
            int i = this.Z;
            int iF = j55.f(jx4Var);
            jx4Var.Z = iF;
            int i2 = this.Z;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof g34)) {
                wc3.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + jx4Var);
            }
            jx4Var.h0 = this.r0;
            this.r0 = jx4Var;
            jx4Var.g0 = this;
            a1(iF | this.Z, false);
            if (this.p0) {
                if (i3 == 0 || (i & 2) != 0) {
                    X0(this.j0);
                } else {
                    t6 t6Var = yn0.Z(this).H0;
                    this.X.X0(null);
                    t6Var.o();
                }
                jx4Var.O0();
                jx4Var.U0();
                if (!jx4Var.p0) {
                    wc3.b("autoInvalidateInsertedNode called on unattached node");
                }
                j55.a(jx4Var, -1, 1);
            }
        }
        return nh1Var;
    }

    public final void Z0(nh1 nh1Var) {
        jx4 jx4Var = null;
        for (jx4 jx4Var2 = this.r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
            if (jx4Var2 == nh1Var) {
                boolean z = jx4Var2.p0;
                if (z) {
                    f05 f05Var = j55.a;
                    if (!z) {
                        wc3.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    j55.a(jx4Var2, -1, 2);
                    jx4Var2.V0();
                    jx4Var2.P0();
                }
                jx4Var2.W0(jx4Var2);
                jx4Var2.f0 = 0;
                jx4 jx4Var3 = jx4Var2.h0;
                if (jx4Var == null) {
                    this.r0 = jx4Var3;
                } else {
                    jx4Var.h0 = jx4Var3;
                }
                jx4Var2.h0 = null;
                jx4Var2.g0 = null;
                int i = this.Z;
                int iF = j55.f(this);
                a1(iF, true);
                if (this.p0 && (i & 2) != 0 && (iF & 2) == 0) {
                    t6 t6Var = yn0.Z(this).H0;
                    this.X.X0(null);
                    t6Var.o();
                    return;
                }
                return;
            }
            jx4Var = jx4Var2;
        }
        b61.o(nh1Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void a1(int i, boolean z) {
        jx4 jx4Var;
        int i2 = this.Z;
        this.Z = i;
        if (i2 != i) {
            jx4 jx4Var2 = this.X;
            if (jx4Var2 == this) {
                this.f0 = i;
            }
            boolean z2 = this.p0;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.Z;
                    r2.Z = i;
                    if (r2 == jx4Var2) {
                        break;
                    } else {
                        r2 = r2.g0;
                    }
                }
                if (z && r2 == jx4Var2) {
                    i = j55.f(jx4Var2);
                    jx4Var2.Z = i;
                }
                int i3 = i | ((r2 == 0 || (jx4Var = r2.h0) == null) ? 0 : jx4Var.f0);
                for (?? r3 = r2; r3 != 0; r3 = r3.g0) {
                    i3 |= r3.Z;
                    r3.f0 = i3;
                }
            }
        }
    }
}
