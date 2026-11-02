package defpackage;

import android.widget.LinearLayout;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ek5 implements h91 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ uj5 Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ek5(uj5 uj5Var, byte b) {
        this.X = b;
        this.Y = uj5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        byte b = this.X;
        uj5 uj5Var = this.Y;
        switch (b) {
            case 0:
                return ((LinearLayout) uj5Var.X.n0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((LinearLayout) uj5Var.X.l0).requestFocus();
            default:
                return ((LinearLayout) uj5Var.X.l0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        switch (this.X) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        byte b = this.X;
        uj5 uj5Var = this.Y;
        switch (b) {
            case 0:
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                break;
        }
        return uj5Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        byte b = this.X;
        uj5 uj5Var = this.Y;
        switch (b) {
            case 0:
                return ((LinearLayout) uj5Var.X.m0).requestFocus();
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((LinearLayout) uj5Var.X.m0).requestFocus();
            default:
                return ((LinearLayout) uj5Var.X.n0).requestFocus();
        }
    }
}
