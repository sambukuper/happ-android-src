package defpackage;

import android.graphics.Typeface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp implements d41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.d41
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 1:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 2:
                super/*android.widget.TextView*/.setTypeface((Typeface) obj);
                break;
            case 3:
                mz mzVar = (mz) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i = mzVar.b - ((xy) entry.getKey()).f;
                    if (((xy) entry.getKey()).g) {
                        i = -i;
                    }
                    int i2 = hd8.i(i);
                    xx7 xx7Var = (xx7) entry.getValue();
                    xx7Var.getClass();
                    s08.g(new vx7(xx7Var, i2, -1));
                }
                break;
            case 4:
                mf1 mf1Var = (mf1) obj2;
                hi5.z0("SurfaceViewImpl");
                if (mf1Var != null) {
                    mf1Var.c();
                }
                break;
            default:
                ((qd0) obj2).b((lz) obj);
                break;
        }
    }
}
