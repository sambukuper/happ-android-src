package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jc8 b;

    public /* synthetic */ s40(jc8 jc8Var, byte b) {
        this.a = b;
        this.b = jc8Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(mq5 mq5Var, q51 q51Var) {
        byte b = this.a;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        jc8 jc8Var = this.b;
        switch (b) {
            case 0:
                Object objN = gv3.n(new r40(mq5Var, jc8Var, null, (byte) 0), q51Var);
                return objN == c71Var ? objN : dn8Var;
            default:
                Object objN2 = gv3.n(new r40(mq5Var, jc8Var, null, (byte) 1), q51Var);
                return objN2 == c71Var ? objN2 : dn8Var;
        }
    }
}
