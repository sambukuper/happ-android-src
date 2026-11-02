package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v73 extends wg1 {
    public final /* synthetic */ byte n = 0;
    public final Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v73(hy7 hy7Var, Size size) {
        super(34, size);
        this.o = hy7Var;
    }

    @Override // defpackage.wg1
    public final xb4 f() {
        byte b = this.n;
        Object obj = this.o;
        switch (b) {
            case 0:
                return vr3.H((Surface) obj);
            default:
                return ((hy7) obj).f;
        }
    }

    public v73(Surface surface, Size size, int i) {
        super(i, size);
        this.o = surface;
    }
}
