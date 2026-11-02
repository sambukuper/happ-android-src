package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class va5 implements o85 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ va5(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.w4
    /* JADX INFO: renamed from: a */
    public final void mo8a(Object obj) {
        switch (this.X) {
            case 0:
                aq7 aq7Var = (aq7) obj;
                ua5 ua5Var = new ua5(new m5(aq7Var));
                aq7Var.X.b(ua5Var);
                aq7Var.X.b(ua5Var.m0);
                aq7Var.f(new q02((Object) ua5Var, (byte) 26));
                if (!aq7Var.X.Y) {
                    ((q85) this.Y).d(ua5Var);
                }
                break;
            case 1:
                aq7 aq7Var2 = (aq7) obj;
                aq7Var2.f(new wa5(aq7Var2, (Object[]) this.Y));
                break;
            case 2:
                aq7 aq7Var3 = (aq7) obj;
                try {
                    Iterator it = ((ArrayList) this.Y).iterator();
                    boolean zHasNext = it.hasNext();
                    if (!aq7Var3.X.Y) {
                        if (!zHasNext) {
                            aq7Var3.b();
                        } else {
                            aq7Var3.f(new xa5(aq7Var3, it));
                        }
                    }
                } catch (Throwable th) {
                    vr3.d0(th, aq7Var3);
                    return;
                }
                break;
            default:
                aq7 aq7Var4 = (aq7) obj;
                Object obj2 = this.Y;
                aq7Var4.f(ow6.Z ? new ka7(aq7Var4, obj2) : new o8((Object) aq7Var4, obj2, (byte) 9));
                break;
        }
    }
}
