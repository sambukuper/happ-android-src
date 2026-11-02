package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import androidx.leanback.widget.SearchBar;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ y4(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((l5) obj).b();
                break;
            case 1:
                a8 a8Var = (a8) obj;
                a8Var.x.obtainMessage(1, a8Var.b).sendToTarget();
                break;
            case 2:
                q70 q70Var = (q70) obj;
                if (q70Var.m0 && q70Var.isShowing()) {
                    if (!q70Var.o0) {
                        TypedArray typedArrayObtainStyledAttributes = q70Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        q70Var.n0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        q70Var.o0 = true;
                    }
                    if (q70Var.n0) {
                        q70Var.cancel();
                    }
                    break;
                }
                break;
            case 3:
                wq4 wq4Var = (wq4) obj;
                int i = wq4Var.h1;
                if (i == 2) {
                    wq4Var.U(1);
                } else if (i == 1) {
                    wq4Var.U(2);
                }
                wq4Var.V(wq4Var.J0);
                break;
            case 4:
                SearchBar searchBar = (SearchBar) obj;
                if (!searchBar.A0) {
                    searchBar.a();
                } else {
                    searchBar.b();
                }
                break;
            default:
                h hVar = ((Toolbar) obj).R0;
                st4 st4Var = hVar == null ? null : hVar.Y;
                if (st4Var != null) {
                    st4Var.collapseActionView();
                }
                break;
        }
    }
}
