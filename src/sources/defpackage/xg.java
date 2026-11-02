package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ch Y;

    public /* synthetic */ xg(ch chVar, byte b) {
        this.X = b;
        this.Y = chVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ch chVar = this.Y;
        switch (b) {
            case 0:
                dn2 dn2Var = (dn2) obj;
                View view = chVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    dn2Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new pb(dn2Var, (byte) 2));
                    }
                }
                return dn8Var;
            case 1:
                ActionMode actionMode = chVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return dn8Var;
            case 2:
                ActionMode actionMode2 = chVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return dn8Var;
            default:
                chVar.e.d();
                return new jd(chVar, (byte) 2);
        }
    }
}
