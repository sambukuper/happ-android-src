package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class la {
    public final rh5 c;
    public final rh5 d;
    public final nh5 g;
    public final rh5 h;
    public final rh5 i;
    public final ia j;
    public final y2 a = new y2((byte) 6);
    public final m15 b = new m15();
    public final zi1 e = rd7.b(new ba(this, 0));
    public final nh5 f = new nh5(Float.NaN);

    public la(Object obj) {
        this.c = z51.H(obj);
        this.d = z51.H(obj);
        new rv(0);
        new yi1(kd7.h().g());
        this.g = new nh5(0.0f);
        this.h = z51.H(null);
        this.i = z51.H(new ke1(d02.X, new float[0]));
        this.j = new ia(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, f15 f15Var, tn2 tn2Var, q51 q51Var) {
        fa faVar;
        if (q51Var instanceof fa) {
            faVar = (fa) q51Var;
            int i = faVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                faVar.h0 = i - Integer.MIN_VALUE;
            } else {
                faVar = new fa(this, q51Var);
            }
        } else {
            faVar = new fa(this, q51Var);
        }
        Object obj2 = faVar.f0;
        int i2 = faVar.h0;
        rh5 rh5Var = this.h;
        q51 q51Var2 = null;
        try {
            if (i2 == 0) {
                w39.n0(obj2);
                if (b().a.indexOf(obj) != -1) {
                    m15 m15Var = this.b;
                    ga gaVar = new ga(this, obj, tn2Var, q51Var2, (byte) 1);
                    faVar.h0 = 1;
                    m15Var.getClass();
                    Object objN = gv3.n(new kg3(f15Var, m15Var, gaVar, q51Var2, (byte) 1), faVar);
                    c71 c71Var = c71.X;
                    if (objN == c71Var) {
                        return c71Var;
                    }
                } else {
                    this.d.setValue(obj);
                    this.c.setValue(obj);
                }
                return dn8.a;
            }
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj2);
            rh5Var.setValue(null);
            return dn8.a;
        } catch (Throwable th) {
            rh5Var.setValue(null);
            throw th;
        }
    }

    public final ke1 b() {
        return (ke1) this.i.getValue();
    }

    public final float c(float f) {
        float fMin;
        nh5 nh5Var = this.f;
        float fL = (Float.isNaN(nh5Var.l()) ? 0.0f : nh5Var.l()) + f;
        float[] fArr = b().b;
        float fMax = Float.NaN;
        int i = 1;
        if (fArr.length != 0) {
            fMin = fArr[0];
            int length = fArr.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            fMin = Float.NaN;
        }
        float[] fArr2 = b().b;
        if (fArr2.length != 0) {
            fMax = fArr2[0];
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i]);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return x97.m(fL, fMin, fMax);
    }
}
