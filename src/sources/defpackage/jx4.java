package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jx4 implements nh1 {
    public m51 Y;
    public int Z;
    public jx4 g0;
    public jx4 h0;
    public x85 i0;
    public i55 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public p5 o0;
    public boolean p0;
    public jx4 X = this;
    public int f0 = -1;

    public final b71 M0() {
        m51 m51Var = this.Y;
        if (m51Var != null) {
            return m51Var;
        }
        m51 m51VarC = gv3.c(yn0.a0(this).getCoroutineContext().B0(new dm3((bm3) yn0.a0(this).getCoroutineContext().H0(oy1.E0))));
        this.Y = m51VarC;
        return m51VarC;
    }

    public boolean N0() {
        return !(this instanceof y00);
    }

    public void O0() {
        if (this.p0) {
            wc3.b("node attached multiple times");
        }
        if (this.j0 == null) {
            wc3.b("attach invoked on a node without a coordinator");
        }
        this.p0 = true;
        this.m0 = true;
    }

    public void P0() {
        if (!this.p0) {
            wc3.b("Cannot detach a node that is not attached");
        }
        if (this.m0) {
            wc3.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.n0) {
            wc3.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.p0 = false;
        m51 m51Var = this.Y;
        if (m51Var != null) {
            gv3.i(m51Var, new px4("The Modifier.Node was detached"));
            this.Y = null;
        }
    }

    public void T0() {
        if (!this.p0) {
            wc3.b("reset() called on an unattached node");
        }
        S0();
    }

    public void U0() {
        if (!this.p0) {
            wc3.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.m0) {
            wc3.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.m0 = false;
        Q0();
        this.n0 = true;
    }

    public void V0() {
        if (!this.p0) {
            wc3.b("node detached multiple times");
        }
        if (this.j0 == null) {
            wc3.b("detach invoked on a node without a coordinator");
        }
        if (!this.n0) {
            wc3.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.n0 = false;
        p5 p5Var = this.o0;
        if (p5Var != null) {
            p5Var.invoke();
        }
        R0();
    }

    public void W0(jx4 jx4Var) {
        this.X = jx4Var;
    }

    public void X0(i55 i55Var) {
        this.j0 = i55Var;
    }

    public void Q0() {
    }

    public void R0() {
    }

    public void S0() {
    }
}
