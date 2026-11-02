package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u03 {
    public int a;
    public float b;
    public final Object c;

    public u03(v78 v78Var) {
        this.c = v78Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        v78 v78Var = (v78) this.c;
        int i2 = 1;
        if (z) {
            int iZ = gv3.z(v78Var.f, i, z);
            int lineStart = v78Var.f.getLineStart(iZ);
            int iE = v78Var.e(iZ);
            if (i == lineStart || i == iE) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fI = z3 ? v78Var.i(i, z) : v78Var.j(i, z);
        if (z2) {
            this.a = i4;
            this.b = fI;
        }
        return fI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, s51 s51Var) {
        uc6 uc6Var;
        if (s51Var instanceof uc6) {
            uc6Var = (uc6) s51Var;
            int i = uc6Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc6Var.h0 = i - Integer.MIN_VALUE;
            } else {
                uc6Var = new uc6(this, s51Var);
            }
        } else {
            uc6Var = new uc6(this, s51Var);
        }
        Object objK = uc6Var.f0;
        int i2 = uc6Var.h0;
        if (i2 == 0) {
            w39.n0(objK);
            oz0 oz0Var = (oz0) this.c;
            Float f2 = new Float(f);
            uc6Var.h0 = 1;
            objK = oz0Var.K(f2, uc6Var);
            c71 c71Var = c71.X;
            if (objK == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objK);
        }
        this.b += ((Number) objK).floatValue();
        return dn8.a;
    }

    public u03(int i, oz0 oz0Var) {
        this.a = i;
        this.c = oz0Var;
    }
}
