package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sq4 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final /* synthetic */ Object Z;

    public sq4(i iVar) {
        this.X = (byte) 2;
        this.Z = iVar;
        Context context = iVar.a.getContext();
        CharSequence charSequence = iVar.h;
        d5 d5Var = new d5();
        d5Var.e = 4096;
        d5Var.g = 4096;
        d5Var.l = null;
        d5Var.m = null;
        d5Var.n = false;
        d5Var.o = false;
        d5Var.p = 16;
        d5Var.i = context;
        d5Var.a = charSequence;
        this.Y = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        Object obj = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                wq4 wq4Var = (wq4) obj2;
                int iK1 = ((LinearLayoutManager) wq4Var.k1.getLayoutManager()).k1();
                e eVar = (e) obj;
                eVar.h = 2;
                wq4Var.T(eVar.l(iK1 + 1));
                break;
            case 1:
                wq4 wq4Var2 = (wq4) obj2;
                int iL1 = ((LinearLayoutManager) wq4Var2.k1.getLayoutManager()).l1();
                e eVar2 = (e) obj;
                eVar2.h = 1;
                wq4Var2.T(eVar2.l(iL1 - 1));
                break;
            default:
                i iVar = (i) obj2;
                Window.Callback callback = iVar.k;
                if (callback != null && iVar.l) {
                    callback.onMenuItemSelected(0, (d5) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sq4(wq4 wq4Var, e eVar, byte b) {
        this.X = b;
        this.Z = wq4Var;
        this.Y = eVar;
    }
}
