package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r68 b;

    public /* synthetic */ w30(r68 r68Var, byte b) {
        this.a = b;
        this.b = r68Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(mq5 mq5Var, q51 q51Var) {
        byte b = this.a;
        c71 c71Var = c71.X;
        r68 r68Var = this.b;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                Object objN = gv3.n(new co(r68Var, mq5Var, (q51) null, (byte) 14), q51Var);
                if (objN != c71Var) {
                    objN = dn8Var;
                }
                return objN == c71Var ? objN : dn8Var;
            case 1:
                Object objN2 = gv3.n(new qk4(r68Var, mq5Var, true, (q51) null), q51Var);
                if (objN2 != c71Var) {
                    objN2 = dn8Var;
                }
                return objN2 == c71Var ? objN2 : dn8Var;
            default:
                Object objN3 = gv3.n(new qk4(r68Var, mq5Var, false, (q51) null), q51Var);
                if (objN3 != c71Var) {
                    objN3 = dn8Var;
                }
                return objN3 == c71Var ? objN3 : dn8Var;
        }
    }
}
