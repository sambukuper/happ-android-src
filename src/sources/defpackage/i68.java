package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i68 {
    public final a23 a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public long d = 0;
    public ev2 e = ev2.Z;
    public boolean f = true;
    public kp5 g = lh4.z0;
    public final /* synthetic */ r68 h;

    public i68(r68 r68Var, a23 a23Var) {
        this.h = r68Var;
        this.a = a23Var;
    }

    public final void a() {
        c();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff A[PHI: r16
  0x00ff: PHI (r16v4 long) = (r16v3 long), (r16v5 long) binds: [B:60:0x0113, B:56:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(long j) {
        int iIntValue;
        int iD;
        kp5 kp5Var;
        ql qlVar;
        long j2;
        r68 r68Var = this.h;
        boolean z = r68Var.i;
        kd8 kd8Var = r68Var.a;
        y78 y78Var = r68Var.b;
        if (!z || y78Var.c() == null || kd8Var.d().Z.length() == 0) {
            return;
        }
        long jF = z85.f(this.d, j);
        this.d = jF;
        long jF2 = z85.f(this.c, jF);
        if (this.b >= 0 || y78Var.f(jF2)) {
            x78 x78VarC = y78Var.c();
            int length = (x78VarC == null || (qlVar = x78VarC.a.a) == null) ? 0 : qlVar.Y.length();
            int i = this.b;
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > length) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : y78Var.d(this.c, false);
            iD = y78Var.d(jF2, false);
            if (this.b < 0 && iIntValue == iD) {
                return;
            }
            kp5Var = this.g;
            r68Var.y(s88.Z);
        } else {
            iIntValue = y78Var.d(this.c, true);
            iD = y78Var.d(jF2, true);
            kp5Var = iIntValue == iD ? lh4.z0 : this.g;
        }
        kp5 kp5Var2 = kp5Var;
        int i2 = iIntValue;
        int i3 = iD;
        long j3 = kd8Var.d().f0;
        long jC = r68Var.C(r68Var.a.d(), i2, i3, false, kp5Var2, false, false, new fz2(9));
        if (this.b == -1 && !f88.b(jC)) {
            this.b = (int) (jC >> 32);
        }
        if (f88.e(jC)) {
            jC = ct7.c((int) (jC & 4294967295L), (int) (jC >> 32));
        }
        if (f88.a(jC, j3)) {
            j2 = j3;
        } else {
            int i4 = (int) (jC >> 32);
            int i5 = (int) (j3 >> 32);
            ev2 ev2Var = ev2.Y;
            if (i4 == i5 || ((int) (jC & 4294967295L)) != ((int) (j3 & 4294967295L))) {
                ev2 ev2Var2 = ev2.Z;
                if (i4 == i5) {
                    j2 = j3;
                    if (((int) (jC & 4294967295L)) != ((int) (j2 & 4294967295L))) {
                        ev2Var = ev2Var2;
                    }
                } else {
                    j2 = j3;
                }
                if ((i4 + ((int) (jC & 4294967295L))) / 2.0f > (i5 + ((int) (j2 & 4294967295L))) / 2.0f) {
                    ev2Var = ev2Var2;
                }
            } else {
                j2 = j3;
            }
            this.e = ev2Var;
            this.f = false;
        }
        if (f88.b(j2) || !f88.b(jC)) {
            kd8Var.j(jC);
        }
        r68Var.B(this.e, jF2);
    }

    public final void c() {
        if ((this.c & 9223372034707292159L) != 9205357640488583168L) {
            r68 r68Var = this.h;
            r68Var.b();
            this.b = -1;
            this.c = 9205357640488583168L;
            this.d = 0L;
            r68Var.v = -1;
            this.g = lh4.z0;
            r68Var.q.setValue(g68.X);
            this.a.invoke();
            if (this.f) {
                r68Var.s();
            }
        }
    }

    public final void d(long j, kp5 kp5Var) {
        r68 r68Var = this.h;
        boolean z = r68Var.i;
        kd8 kd8Var = r68Var.a;
        y78 y78Var = r68Var.b;
        if (z) {
            r68Var.B(this.e, j);
            r68Var.x(false);
            r68Var.q.setValue(g68.Y);
            this.c = j;
            this.d = 0L;
            r68Var.v = -1;
            this.f = true;
            this.g = kp5Var;
            if (y78Var.c() == null) {
                return;
            }
            if (y78Var.f(j)) {
                if (kd8Var.d().Z.length() == 0) {
                    return;
                }
                int iD = y78Var.d(j, true);
                long jC = r68Var.C(new h48(r68Var.a.d(), f88.b, null, null, null, null, null, 124), iD, iD, false, this.g, false, false, new fz2(0));
                kd8Var.j(jC);
                r68Var.y(s88.Z);
                this.b = (int) (jC >> 32);
                return;
            }
            int iD2 = y78Var.d(j, true);
            ez2 ez2Var = r68Var.j;
            if (ez2Var != null) {
                ((so5) ez2Var).a(0);
            }
            kd8Var.getClass();
            kd8Var.j(ct7.c(iD2, iD2));
            r68Var.x(true);
            this.f = false;
            r68Var.y(s88.Y);
        }
    }

    public final void e() {
        c();
    }
}
