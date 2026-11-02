package defpackage;

import android.graphics.Bitmap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt8 extends dt8 {
    public final ou2 b;
    public String c;
    public boolean d;
    public final ov1 e;
    public dn2 f;
    public final rh5 g;
    public g60 h;
    public final rh5 i;
    public long j;
    public float k;
    public float l;
    public final st8 m;

    public tt8(ou2 ou2Var) {
        this.b = ou2Var;
        ou2Var.i = new st8(this, (byte) 0);
        this.c = _UrlKt.FRAGMENT_ENCODE_SET;
        this.d = true;
        this.e = new ov1();
        this.f = new ng8((byte) 16);
        this.g = z51.H(null);
        this.i = z51.H(new ua7(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new st8(this, (byte) 1);
    }

    @Override // defpackage.dt8
    public final void a(sv1 sv1Var) {
        e(sv1Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    public final void e(sv1 sv1Var, float f, g60 g60Var) {
        int i;
        g60 g60Var2;
        je jeVarD;
        char c;
        long j;
        long jB;
        g60 g60Var3;
        int iK0;
        int i2;
        int i3;
        ou2 ou2Var = this.b;
        boolean z = ou2Var.d;
        rh5 rh5Var = this.g;
        if (!z || ou2Var.e == 16) {
            i = 0;
        } else {
            g60 g60Var4 = (g60) rh5Var.getValue();
            int i4 = gu8.a;
            if (!(g60Var4 instanceof g60) ? g60Var4 == null : (i3 = g60Var4.c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(g60Var instanceof g60) ? g60Var == null : (i2 = g60Var.c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        ov1 ov1Var = this.e;
        if (z2 || !ua7.a(this.j, sv1Var.e())) {
            if (i == 1) {
                jB = ou2Var.e;
                int i5 = gu8.a;
                if (dw0.c(jB) != 1.0f) {
                    jB = dw0.b(1.0f, jB);
                }
                g60Var2 = new g60(jB, 5);
            } else {
                g60Var2 = null;
            }
            this.h = g60Var2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() >> 32));
            rh5 rh5Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((ua7) rh5Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) / Float.intBitsToFloat((int) (((ua7) rh5Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv1Var.e() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L))))) & 4294967295L);
            z24 layoutDirection = sv1Var.getLayoutDirection();
            jeVarD = ov1Var.a;
            eb ebVarA = ov1Var.b;
            if (jeVarD != null || ebVarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = jeVarD.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || ov1Var.d != i) {
                }
                ov1Var.c = jCeil;
                um0 um0Var = ov1Var.e;
                tm0 tm0Var = um0Var.X;
                long jR = u15.R(jCeil);
                fi1 fi1Var = tm0Var.a;
                z24 z24Var = tm0Var.b;
                sm0 sm0Var = tm0Var.c;
                eb ebVar = ebVarA;
                long j2 = tm0Var.d;
                tm0Var.a = sv1Var;
                tm0Var.b = layoutDirection;
                tm0Var.c = ebVar;
                tm0Var.d = jR;
                ebVar.g();
                sv1.k0(um0Var, dw0.b, 0L, 0L, 0.0f, 62);
                this.m.B(um0Var);
                ebVar.p();
                tm0Var.a = fi1Var;
                tm0Var.b = z24Var;
                tm0Var.c = sm0Var;
                tm0Var.d = j2;
                jeVarD.a.prepareToDraw();
                this.d = false;
                this.j = sv1Var.e();
            }
            jeVarD = mb6.d((int) (jCeil >> c), (int) (jCeil & j), i);
            ebVarA = fb.a(jeVarD);
            ov1Var.a = jeVarD;
            ov1Var.b = ebVarA;
            ov1Var.d = i;
            ov1Var.c = jCeil;
            um0 um0Var2 = ov1Var.e;
            tm0 tm0Var2 = um0Var2.X;
            long jR2 = u15.R(jCeil);
            fi1 fi1Var2 = tm0Var2.a;
            z24 z24Var2 = tm0Var2.b;
            sm0 sm0Var2 = tm0Var2.c;
            eb ebVar2 = ebVarA;
            long j3 = tm0Var2.d;
            tm0Var2.a = sv1Var;
            tm0Var2.b = layoutDirection;
            tm0Var2.c = ebVar2;
            tm0Var2.d = jR2;
            ebVar2.g();
            sv1.k0(um0Var2, dw0.b, 0L, 0L, 0.0f, 62);
            this.m.B(um0Var2);
            ebVar2.p();
            tm0Var2.a = fi1Var2;
            tm0Var2.b = z24Var2;
            tm0Var2.c = sm0Var2;
            tm0Var2.d = j3;
            jeVarD.a.prepareToDraw();
            this.d = false;
            this.j = sv1Var.e();
        } else {
            je jeVar = ov1Var.a;
            if (jeVar != null) {
                Bitmap.Config config = jeVar.a.getConfig();
                config.getClass();
                iK0 = ue3.k0(config);
            } else {
                iK0 = 0;
            }
            if (i != iK0) {
                if (i == 1) {
                    jB = ou2Var.e;
                    int i7 = gu8.a;
                    if (dw0.c(jB) != 1.0f) {
                        jB = dw0.b(1.0f, jB);
                    }
                    g60Var2 = new g60(jB, 5);
                } else {
                    g60Var2 = null;
                }
                this.h = g60Var2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sv1Var.e() >> 32));
                rh5 rh5Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((ua7) rh5Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) / Float.intBitsToFloat((int) (((ua7) rh5Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv1Var.e() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L))))) & 4294967295L);
                z24 layoutDirection2 = sv1Var.getLayoutDirection();
                jeVarD = ov1Var.a;
                eb ebVarA2 = ov1Var.b;
                if (jeVarD != null) {
                    c = ' ';
                    j = 4294967295L;
                    jeVarD = mb6.d((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    ebVarA2 = fb.a(jeVarD);
                    ov1Var.a = jeVarD;
                    ov1Var.b = ebVarA2;
                    ov1Var.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    jeVarD = mb6.d((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    ebVarA2 = fb.a(jeVarD);
                    ov1Var.a = jeVarD;
                    ov1Var.b = ebVarA2;
                    ov1Var.d = i;
                }
                ov1Var.c = jCeil2;
                um0 um0Var3 = ov1Var.e;
                tm0 tm0Var3 = um0Var3.X;
                long jR3 = u15.R(jCeil2);
                fi1 fi1Var3 = tm0Var3.a;
                z24 z24Var3 = tm0Var3.b;
                sm0 sm0Var3 = tm0Var3.c;
                eb ebVar3 = ebVarA2;
                long j4 = tm0Var3.d;
                tm0Var3.a = sv1Var;
                tm0Var3.b = layoutDirection2;
                tm0Var3.c = ebVar3;
                tm0Var3.d = jR3;
                ebVar3.g();
                sv1.k0(um0Var3, dw0.b, 0L, 0L, 0.0f, 62);
                this.m.B(um0Var3);
                ebVar3.p();
                tm0Var3.a = fi1Var3;
                tm0Var3.b = z24Var3;
                tm0Var3.c = sm0Var3;
                tm0Var3.d = j4;
                jeVarD.a.prepareToDraw();
                this.d = false;
                this.j = sv1Var.e();
            }
        }
        if (g60Var != null) {
            g60Var3 = g60Var;
        } else {
            g60Var3 = ((g60) rh5Var.getValue()) != null ? (g60) rh5Var.getValue() : this.h;
        }
        je jeVar2 = ov1Var.a;
        if (jeVar2 == null) {
            wc3.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        sv1.D(sv1Var, jeVar2, ov1Var.c, 0L, f, g60Var3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        rh5 rh5Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((ua7) rh5Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((ua7) rh5Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
