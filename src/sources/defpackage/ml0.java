package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml0 implements d41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ml0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.d41
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                jg1 jg1Var = (jg1) obj3;
                by7 by7Var = (by7) obj2;
                by7Var.close();
                Surface surface = (Surface) jg1Var.h.remove(by7Var);
                if (surface != null) {
                    ib5 ib5Var = jg1Var.a;
                    fp2.d(ib5Var.a, true);
                    fp2.c(ib5Var.c);
                    ib5Var.j(surface, true);
                }
                break;
            default:
                cx1 cx1Var = (cx1) obj3;
                by7 by7Var2 = (by7) obj2;
                by7Var2.close();
                Surface surface2 = (Surface) cx1Var.h.remove(by7Var2);
                if (surface2 != null) {
                    ax1 ax1Var = cx1Var.a;
                    fp2.d(ax1Var.a, true);
                    fp2.c(ax1Var.c);
                    ax1Var.j(surface2, true);
                }
                break;
        }
    }
}
