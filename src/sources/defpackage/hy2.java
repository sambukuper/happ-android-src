package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements PointerInputEventHandler {
    public final /* synthetic */ ky2 a;
    public final /* synthetic */ b71 b;
    public final /* synthetic */ oi c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public hy2(ky2 ky2Var, b71 b71Var, oi oiVar, float f, float f2) {
        this.a = ky2Var;
        this.b = b71Var;
        this.c = oiVar;
        this.d = f;
        this.e = f2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(mq5 mq5Var, q51 q51Var) {
        Object objI = mb6.i(mq5Var, new gy2(this.a, this.b, this.c, this.d, this.e, null), q51Var);
        return objI == c71.X ? objI : dn8.a;
    }
}
