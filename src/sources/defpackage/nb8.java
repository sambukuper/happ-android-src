package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb8 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Toolbar Y;

    public /* synthetic */ nb8(Toolbar toolbar, byte b) {
        this.X = b;
        this.Y = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        Toolbar toolbar = this.Y;
        switch (b) {
            case 0:
                h hVar = toolbar.R0;
                st4 st4Var = hVar == null ? null : hVar.Y;
                if (st4Var != null) {
                    st4Var.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
