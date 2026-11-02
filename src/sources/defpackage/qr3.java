package defpackage;

import io.sentry.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qr3 extends hs3 {
    public static final pr3 t0 = new pr3();
    public static final iq3 u0 = new iq3("closed");
    public final ArrayList q0;
    public String r0;
    public bo3 s0;

    public qr3() {
        super(t0);
        this.q0 = new ArrayList();
        this.s0 = xp3.X;
    }

    public final bo3 C0() {
        return (bo3) oi0.h(1, this.q0);
    }

    @Override // defpackage.hs3
    public final void F0() {
        bq3 bq3Var = new bq3();
        H0(bq3Var);
        this.q0.add(bq3Var);
    }

    public final void H0(bo3 bo3Var) {
        if (this.r0 != null) {
            if (!(bo3Var instanceof xp3) || this.m0) {
                ((bq3) C0()).e(this.r0, bo3Var);
            }
            this.r0 = null;
            return;
        }
        if (this.q0.isEmpty()) {
            this.s0 = bo3Var;
            return;
        }
        bo3 bo3VarC0 = C0();
        if (bo3VarC0 instanceof en3) {
            ((en3) bo3VarC0).e(bo3Var);
        } else {
            c2.g();
        }
    }

    @Override // defpackage.hs3
    public final void K0() {
        ArrayList arrayList = this.q0;
        if (arrayList.isEmpty() || this.r0 != null) {
            c2.g();
        } else if (C0() instanceof en3) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            c2.g();
        }
    }

    @Override // defpackage.hs3
    public final void Q0() {
        en3 en3Var = new en3();
        H0(en3Var);
        this.q0.add(en3Var);
    }

    @Override // defpackage.hs3
    public final void U(double d) {
        if (this.j0 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            c2.i("JSON forbids NaN and infinities: ", d);
        } else {
            H0(new iq3(Double.valueOf(d)));
        }
    }

    @Override // defpackage.hs3
    public final void X(long j) {
        H0(new iq3(Long.valueOf(j)));
    }

    @Override // defpackage.hs3
    public final void Y(Boolean bool) {
        if (bool == null) {
            H0(xp3.X);
        } else {
            H0(new iq3(bool));
        }
    }

    @Override // defpackage.hs3
    public final void a0(Number number) {
        if (number == null) {
            H0(xp3.X);
            return;
        }
        if (this.j0 != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                u52.j(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        H0(new iq3(number));
    }

    @Override // defpackage.hs3
    public final void c0(String str) {
        if (str == null) {
            H0(xp3.X);
        } else {
            H0(new iq3(str));
        }
    }

    @Override // defpackage.hs3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.q0;
        if (arrayList.isEmpty()) {
            arrayList.add(u0);
        } else {
            u52.s("Incomplete document");
        }
    }

    @Override // defpackage.hs3
    public final void j0() {
        ArrayList arrayList = this.q0;
        if (arrayList.isEmpty() || this.r0 != null) {
            c2.g();
        } else if (C0() instanceof bq3) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            c2.g();
        }
    }

    @Override // defpackage.hs3
    public final void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.q0.isEmpty() || this.r0 != null) {
            bt.i("Did not expect a name");
        } else if (C0() instanceof bq3) {
            this.r0 = str;
        } else {
            bt.i("Please begin an object before writing a name.");
        }
    }

    @Override // defpackage.hs3
    public final hs3 u() {
        H0(xp3.X);
        return this;
    }

    @Override // defpackage.hs3
    public final void u0(boolean z) {
        H0(new iq3(Boolean.valueOf(z)));
    }

    @Override // defpackage.hs3, java.io.Flushable
    public final void flush() {
    }
}
