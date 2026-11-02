package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v60 extends s21 {
    public final /* synthetic */ byte b = 1;

    public v60(double d) {
        super(Double.valueOf(d));
    }

    @Override // defpackage.s21
    public final t14 a(vx4 vx4Var) {
        switch (this.b) {
            case 0:
                vx4Var.getClass();
                zz3 zz3VarF = vx4Var.f();
                zz3VarF.getClass();
                return zz3VarF.t(du5.BOOLEAN);
            case 1:
                vx4Var.getClass();
                zz3 zz3VarF2 = vx4Var.f();
                zz3VarF2.getClass();
                return zz3VarF2.t(du5.DOUBLE);
            default:
                vx4Var.getClass();
                zz3 zz3VarF3 = vx4Var.f();
                zz3VarF3.getClass();
                return zz3VarF3.t(du5.FLOAT);
        }
    }

    @Override // defpackage.s21
    public String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v60(Object obj) {
        super(obj);
    }

    public v60(float f) {
        super(Float.valueOf(f));
    }
}
