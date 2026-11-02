package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sd implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(mq5 mq5Var, q51 q51Var) {
        byte b = this.a;
        byte b2 = 3;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        q51 q51Var2 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object objI = mb6.i(mq5Var, new rd((td) obj, q51Var2, (byte) 0), q51Var);
                return objI == c71Var ? objI : dn8Var;
            case 1:
                Object objD = q18.d(mq5Var, null, new xo((dn2) obj, b2), q51Var, 7);
                return objD == c71Var ? objD : dn8Var;
            case 2:
                wb7 wb7Var = (wb7) obj;
                Object objD2 = q18.d(mq5Var, new lo4(wb7Var, (q51) null), new rb7(wb7Var, b2), q51Var, 3);
                return objD2 == c71Var ? objD2 : dn8Var;
            case 3:
                Object objI2 = mb6.i(mq5Var, new at5((sm7) obj, null), q51Var);
                return objI2 == c71Var ? objI2 : dn8Var;
            case 4:
                Object objI3 = mb6.i(mq5Var, new rd(new al5(1, (l38) obj, l38.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 22), q51Var2, (byte) 1), q51Var);
                if (objI3 != c71Var) {
                    objI3 = dn8Var;
                }
                return objI3 == c71Var ? objI3 : dn8Var;
            default:
                Object objN = gv3.n(new co(obj, (Object) mq5Var, q51Var2, (byte) 13), q51Var);
                return objN == c71Var ? objN : dn8Var;
        }
    }
}
