package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i74 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ int h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i74(Object obj, int i, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.h0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((i74) n((q51) obj2, (xx6) obj)).q(dn8Var);
                break;
            case 1:
                ((i74) n((q51) obj2, (b71) obj)).q(dn8Var);
                break;
            default:
                ((i74) n((q51) obj2, Integer.valueOf(((Number) obj).intValue()))).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                return new i74((j74) obj2, this.h0, q51Var, (byte) 0);
            case 1:
                return new i74((PerAppProxyActivity) obj2, this.h0, q51Var, (byte) 1);
            default:
                i74 i74Var = new i74((ok7) obj2, q51Var);
                i74Var.h0 = ((Number) obj).intValue();
                return i74Var;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                w39.n0(obj);
                j74 j74Var = (j74) obj2;
                int i = this.h0;
                wg wgVar = j74Var.g0;
                if (((oh5) wgVar.b).l() != i || ((oh5) wgVar.c).l() != 0) {
                    d64 d64Var = j74Var.p0;
                    d64Var.d();
                    d64Var.b = null;
                    d64Var.c = -1;
                }
                wgVar.B(i, 0);
                wgVar.d = null;
                LayoutNode layoutNode = j74Var.m0;
                if (layoutNode != null) {
                    layoutNode.k();
                }
                return dn8Var;
            case 1:
                w39.n0(obj);
                c6 c6Var = ((PerAppProxyActivity) obj2).Q0;
                if (c6Var != null) {
                    ((RecyclerView) ((View) c6Var.k0)).j0(this.h0);
                    return dn8Var;
                }
                dh3.T("binding");
                throw null;
            default:
                int i2 = this.h0;
                w39.n0(obj);
                ok7 ok7Var = (ok7) obj2;
                wk2 wk2Var = ok7Var.t1;
                if (i2 == 0) {
                    if (wk2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView = wk2Var.o0;
                    happTextView.getClass();
                    happTextView.setVisibility(8);
                    wk2 wk2Var2 = ok7Var.t1;
                    if (wk2Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    CircularProgressIndicator circularProgressIndicator = wk2Var2.p0;
                    circularProgressIndicator.getClass();
                    circularProgressIndicator.setVisibility(8);
                    wk2 wk2Var3 = ok7Var.t1;
                    if (wk2Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatImageButton appCompatImageButton = wk2Var3.m0;
                    appCompatImageButton.getClass();
                    appCompatImageButton.setVisibility(0);
                } else {
                    if (wk2Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatImageButton appCompatImageButton2 = wk2Var.m0;
                    appCompatImageButton2.getClass();
                    appCompatImageButton2.setVisibility(8);
                    wk2 wk2Var4 = ok7Var.t1;
                    if (wk2Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    HappTextView happTextView2 = wk2Var4.o0;
                    happTextView2.getClass();
                    happTextView2.setVisibility(0);
                    wk2 wk2Var5 = ok7Var.t1;
                    if (wk2Var5 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    CircularProgressIndicator circularProgressIndicator2 = wk2Var5.p0;
                    circularProgressIndicator2.getClass();
                    circularProgressIndicator2.setVisibility(0);
                }
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i74(ok7 ok7Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 2;
        this.i0 = ok7Var;
    }
}
