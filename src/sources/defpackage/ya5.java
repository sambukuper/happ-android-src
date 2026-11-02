package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya5 implements o85 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;

    public ya5(ow6 ow6Var, cn2 cn2Var) {
        this.X = (byte) 2;
        this.Z = ow6Var;
        this.Y = cn2Var;
    }

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a */
    public final void mo8a(Object obj) {
        byte b = this.X;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                aq7 aq7Var = (aq7) obj;
                try {
                    mr6.c.b().getClass();
                    aq7 aq7Var2 = (aq7) ((p85) obj2).a(aq7Var);
                    try {
                        aq7Var2.d();
                        ((o85) obj3).mo8a(aq7Var2);
                    } catch (Throwable th) {
                        vr3.c0(th);
                        aq7Var2.onError(th);
                    }
                } catch (Throwable th2) {
                    vr3.c0(th2);
                    aq7Var.onError(th2);
                    return;
                }
                break;
            case 1:
                aq7 aq7Var3 = (aq7) obj;
                za5 za5Var = new za5(aq7Var3, (cn2) obj2);
                aq7Var3.X.b(za5Var);
                ((q85) obj3).d(za5Var);
                break;
            default:
                aq7 aq7Var4 = (aq7) obj;
                q85 q85Var = (q85) ((cn2) obj3).a(((ow6) obj2).Y);
                if (!(q85Var instanceof ow6)) {
                    q85Var.d(new m5(aq7Var4, aq7Var4));
                } else {
                    Object obj4 = ((ow6) q85Var).Y;
                    aq7Var4.f(ow6.Z ? new ka7(aq7Var4, obj4) : new o8(aq7Var4, obj4, (byte) 9));
                }
                break;
        }
    }

    public /* synthetic */ ya5(Object obj, cn2 cn2Var, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = cn2Var;
    }
}
