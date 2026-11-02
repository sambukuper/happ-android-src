package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappEditText;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class i81 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i81(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((HappInputField) ((k81) obj).X.f0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappEditText) ((zz2) ((lr) obj).Y).Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((RelativeLayout) ((jr2) obj).X.f0).requestFocus();
            case 3:
                HappInputField happInputField = (HappInputField) obj;
                return happInputField.requestFocus() && happInputField.dispatchKeyEvent(new KeyEvent(0, 4));
            case 4:
                return ((qi3) ((q02) obj).Y).Z.requestFocus();
            case 5:
                return ((ConstraintLayout) ((gk5) obj).X.f0).requestFocus();
            case 6:
                return ((qi3) ((f63) obj).Y).Z.requestFocus();
            default:
                return ((AppCompatEditText) ((aq6) obj).X.Z).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        f63 f63Var;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((HappInputField) ((k81) obj).X.f0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                lr lrVar = (lr) obj;
                w42 w42Var = ((j52) lrVar.Z).d;
                int iB = ((i52) lrVar.f0).b();
                v5 v5Var = w42Var.X;
                RecyclerView recyclerView = v5Var.p0;
                recyclerView.getClass();
                l lVarI = recyclerView.I(iB - 1);
                i52 i52Var = lVarI instanceof i52 ? (i52) lVarI : null;
                return i52Var == null ? v5Var.n0.requestFocus() : ((HappEditText) ((zz2) i52Var.v.Y).Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                jr2 jr2Var = (jr2) obj;
                aq6 aq6Var = jr2Var.Y.c;
                int iB2 = jr2Var.Z.b();
                z47 z47Var = aq6Var.X;
                l lVarI2 = ((RecyclerView) z47Var.f0).I(iB2 - 1);
                kr2 kr2Var = lVarI2 instanceof kr2 ? (kr2) lVarI2 : null;
                return kr2Var == null ? ((AppCompatEditText) z47Var.Z).requestFocus() : ((RelativeLayout) ((jr2) kr2Var.v.getValue()).X.f0).requestFocus();
            case 3:
                HappInputField happInputField = (HappInputField) obj;
                return happInputField.requestFocus() && happInputField.dispatchKeyEvent(new KeyEvent(0, 4));
            case 4:
                return false;
            case 5:
                gk5 gk5Var = (gk5) obj;
                uj5 uj5Var = gk5Var.Y.c;
                int iB3 = gk5Var.Z.b();
                c6 c6Var = uj5Var.X;
                l lVarI3 = ((View) c6Var.k0).I(iB3 - 1);
                hk5 hk5Var = lVarI3 instanceof hk5 ? (hk5) lVarI3 : null;
                return hk5Var == null ? ((LinearLayout) c6Var.m0).requestFocus() : ((ConstraintLayout) hk5Var.r().X.f0).requestFocus();
            case 6:
                f63 f63Var2 = (f63) obj;
                l lVarI4 = ((RecyclerView) ((in5) f63Var2.Z).e.X.i0).I(((hn5) f63Var2.f0).b() - 1);
                hn5 hn5Var = lVarI4 instanceof hn5 ? (hn5) lVarI4 : null;
                if (hn5Var == null || (f63Var = hn5Var.v) == null) {
                    return false;
                }
                return ((qi3) f63Var.Y).Z.requestFocus();
            default:
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        f63 f63Var;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((TextProcessor) ((k81) obj).X.Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                lr lrVar = (lr) obj;
                w42 w42Var = ((j52) lrVar.Z).d;
                int iB = ((i52) lrVar.f0).b();
                RecyclerView recyclerView = w42Var.X.p0;
                recyclerView.getClass();
                l lVarI = recyclerView.I(iB + 1);
                i52 i52Var = lVarI instanceof i52 ? (i52) lVarI : null;
                if (i52Var == null) {
                    return false;
                }
                return ((HappEditText) ((zz2) i52Var.v.Y).Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                jr2 jr2Var = (jr2) obj;
                aq6 aq6Var = jr2Var.Y.c;
                int iB2 = jr2Var.Z.b();
                z47 z47Var = aq6Var.X;
                l lVarI2 = ((RecyclerView) z47Var.f0).I(iB2 + 1);
                kr2 kr2Var = lVarI2 instanceof kr2 ? (kr2) lVarI2 : null;
                if (kr2Var != null) {
                    return ((RelativeLayout) ((jr2) kr2Var.v.getValue()).X.f0).requestFocus();
                }
                l lVarI3 = ((RecyclerView) z47Var.f0).I(iB2);
                kr2 kr2Var2 = lVarI3 instanceof kr2 ? (kr2) lVarI3 : null;
                if (kr2Var2 == null) {
                    return false;
                }
                return ((RelativeLayout) ((jr2) kr2Var2.v.getValue()).X.f0).requestFocus();
            case 3:
                HappInputField happInputField = (HappInputField) obj;
                return happInputField.requestFocus() && happInputField.dispatchKeyEvent(new KeyEvent(0, 4));
            case 4:
                return false;
            case 5:
                gk5 gk5Var = (gk5) obj;
                uj5 uj5Var = gk5Var.Y.c;
                int iB3 = gk5Var.Z.b();
                c6 c6Var = uj5Var.X;
                l lVarI4 = ((View) c6Var.k0).I(iB3 + 1);
                hk5 hk5Var = lVarI4 instanceof hk5 ? (hk5) lVarI4 : null;
                if (hk5Var != null) {
                    return ((ConstraintLayout) hk5Var.r().X.f0).requestFocus();
                }
                l lVarI5 = ((View) c6Var.k0).I(iB3);
                hk5 hk5Var2 = lVarI5 instanceof hk5 ? (hk5) lVarI5 : null;
                if (hk5Var2 == null) {
                    return false;
                }
                return ((ConstraintLayout) hk5Var2.r().X.f0).requestFocus();
            case 6:
                f63 f63Var2 = (f63) obj;
                xn5 xn5Var = ((in5) f63Var2.Z).e;
                int iB4 = ((hn5) f63Var2.f0).b();
                d6 d6Var = xn5Var.X;
                l lVarI6 = ((RecyclerView) d6Var.i0).I(iB4 + 1);
                hn5 hn5Var = lVarI6 instanceof hn5 ? (hn5) lVarI6 : null;
                return (hn5Var == null || (f63Var = hn5Var.v) == null) ? ((HappSpinnerField) d6Var.Z).requestFocus() : ((qi3) f63Var.Y).Z.requestFocus();
            default:
                l lVarI7 = ((RecyclerView) ((aq6) obj).X.f0).I(0);
                kr2 kr2Var3 = lVarI7 instanceof kr2 ? (kr2) lVarI7 : null;
                if (kr2Var3 == null) {
                    return false;
                }
                return ((RelativeLayout) ((jr2) kr2Var3.v.getValue()).X.f0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((HappInputField) ((k81) obj).X.f0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((HappEditText) ((zz2) ((lr) obj).Y).Z).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((RelativeLayout) ((jr2) obj).X.f0).requestFocus();
            case 3:
                HappInputField happInputField = (HappInputField) obj;
                return happInputField.requestFocus() && happInputField.dispatchKeyEvent(new KeyEvent(0, 4));
            case 4:
                return ((qi3) ((q02) obj).Y).Z.requestFocus();
            case 5:
                return ((ConstraintLayout) ((gk5) obj).X.f0).requestFocus();
            case 6:
                return ((qi3) ((f63) obj).Y).Z.requestFocus();
            default:
                return ((AppCompatEditText) ((aq6) obj).X.Z).requestFocus();
        }
    }
}
