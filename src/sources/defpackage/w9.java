package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 implements xx6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xx6
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                z9 z9Var = (z9) obj2;
                float fC = z9Var.L0.c(f);
                float fL = fC - z9Var.L0.f.l();
                ((ia) obj).a(fC, 0.0f);
                return fL;
            default:
                sy6 sy6Var = (sy6) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) sy6Var.h.invoke()).booleanValue()) {
                    return sy6Var.e(sy6Var.h(((ry6) obj).a(2, sy6Var.f(sy6Var.i(f)))));
                }
                throw new le2("The fling animation was cancelled");
        }
    }
}
