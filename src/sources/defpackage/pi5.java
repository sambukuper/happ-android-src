package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pi5 extends dt8 {
    public d90 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public d90 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public om7 q;
    public final lf r;
    public lf s;
    public lf t;
    public final g44 u;

    public pi5() {
        int i = gu8.a;
        this.d = d02.X;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        lf lfVarA = nf.a();
        this.r = lfVarA;
        this.s = lfVarA;
        this.u = x97.P(w74.Y, new dw4((byte) 16));
    }

    @Override // defpackage.dt8
    public final void a(sv1 sv1Var) {
        sv1 sv1Var2;
        om7 om7Var;
        if (this.n) {
            ys0.d0(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        d90 d90Var = this.b;
        if (d90Var != null) {
            sv1Var2 = sv1Var;
            sv1.d0(sv1Var2, this.s, d90Var, this.c, null, 56);
        } else {
            sv1Var2 = sv1Var;
        }
        d90 d90Var2 = this.g;
        if (d90Var2 != null) {
            om7 om7Var2 = this.q;
            if (this.o || om7Var2 == null) {
                om7 om7Var3 = new om7(this.f, this.j, this.h, this.i, 16);
                this.q = om7Var3;
                this.o = false;
                om7Var = om7Var3;
            } else {
                om7Var = om7Var2;
            }
            sv1.d0(sv1Var2, this.s, d90Var2, this.e, om7Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        lf lfVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = lfVar;
            return;
        }
        lf lfVar2 = this.s;
        if (lfVar2 != lfVar) {
            Path.FillType fillType = lfVar2.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        } else {
            this.s = nf.a();
        }
        g44 g44Var = this.u;
        ((mf) g44Var.getValue()).a.setPath(lfVar.a, false);
        float length = ((mf) g44Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((mf) g44Var.getValue()).a(f4, f5, this.s);
            return;
        }
        lf lfVarA = this.t;
        if (lfVarA == null) {
            lfVarA = nf.a();
            this.t = lfVarA;
        }
        lfVarA.g();
        ((mf) g44Var.getValue()).a(f4, length, lfVarA);
        lf.a(this.s, lfVarA);
        lfVarA.g();
        ((mf) g44Var.getValue()).a(0.0f, f5, lfVarA);
        lf.a(this.s, lfVarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
