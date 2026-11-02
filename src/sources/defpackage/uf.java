package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ir5 Y;

    public /* synthetic */ uf(ir5 ir5Var, byte b) {
        this.X = b;
        this.Y = ir5Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ir5 ir5Var = this.Y;
        switch (b) {
            case 0:
                ir5Var.m21setPopupContentSizefhxjrPA((pf3) obj);
                ir5Var.q();
                break;
            case 1:
                y24 y24VarY = ((y24) obj).y();
                y24VarY.getClass();
                ir5Var.p(y24VarY);
                break;
            default:
                dn2 dn2Var = (dn2) obj;
                Handler handler = ir5Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = ir5Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new pb(dn2Var, (byte) 3));
                    }
                } else {
                    dn2Var.invoke();
                }
                break;
        }
        return dn8Var;
    }
}
