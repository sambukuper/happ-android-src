package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.databinding.DataBinderMapperImpl;
import com.google.gson.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lwu7;", "Lsn1;", "<init>", "()V", "tu7", "uu7", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class wu7 extends sn1 {
    public static final a y1 = new a();
    public static final m51 z1;
    public yk2 t1;
    public final oh7 u1 = ph7.a((Object) null);
    public final y5 v1;
    public uu7 w1;
    public final vz7 x1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        z1 = gv3.c(g33.K(ow7VarB, dm4.a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wu7() {
        g44 g44VarP = x97.P(w74.Y, new zk3(new zk3(this, (byte) 22), (byte) 23));
        this.v1 = new y5(yb6.a.b(pu7.class), new do1(g44VarP, (byte) 4), new c3(this, g44VarP, (byte) 29), new do1(g44VarP, (byte) 5));
        this.x1 = new vz7(new hr5(this, (byte) 26));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        Window window;
        view.getClass();
        Dialog dialog = ((sn1) this).o1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        window.setAttributes(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dialog T(Bundle bundle) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(i(), p56.AppThemeDialogFull).create();
        alertDialogCreate.getClass();
        return alertDialogCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y() {
        Object value;
        d27 d27Var = (d27) ((pu7) this.v1.getValue()).b.getValue();
        og7 og7Var = d27Var.c;
        if (og7Var != null) {
            og7Var.m((CancellationException) null);
        }
        oh7 oh7Var = d27Var.b;
        do {
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, w17.Z));
        R(false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(Context context) {
        super.x(context);
        this.w1 = context instanceof uu7 ? (uu7) context : null;
        pu7 pu7Var = (pu7) this.v1.getValue();
        jm4.Q(zw8.a(pu7Var), (u61) null, new t17(pu7Var, new lr5(this, (byte) 18), null, (byte) 11), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        LayoutInflater layoutInflaterL = l();
        int i = yk2.A0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        yk2 yk2VarC = kw8.c(t46.fragment_dialog_subscription_sync, layoutInflaterL, (ViewGroup) null);
        yk2VarC.getClass();
        this.t1 = yk2VarC;
        mb6.g((ou7) this.x1.getValue());
        yk2 yk2Var = this.t1;
        if (yk2Var == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b = 0;
        yk2Var.n0.setOnClickListener(new View.OnClickListener(this) { // from class: qu7
            public final /* synthetic */ wu7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                wu7 wu7Var = this.Y;
                switch (b2) {
                    case 0:
                        a aVar = wu7.y1;
                        pu7 pu7Var = (pu7) wu7Var.v1.getValue();
                        jm4.Q(zw8.a(pu7Var), (u61) null, new t17(pu7Var, new y45(wu7Var), null, (byte) 12), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        a aVar2 = wu7.y1;
                        wu7Var.Y();
                        break;
                    default:
                        a aVar3 = wu7.y1;
                        pu7 pu7Var2 = (pu7) wu7Var.v1.getValue();
                        jm4.Q(zw8.a(pu7Var2), (u61) null, new t17(pu7Var2, new lr5(wu7Var, (byte) 18), null, (byte) 11), 3);
                        break;
                }
            }
        });
        u84 u84VarZ = ys0.z(((qk2) this).S0);
        nf1 nf1Var = tp1.a;
        jm4.Q(u84VarZ, dm4.a, new vu7(this, null, (byte) 1), 2);
        gv3.f(M().b(), this, new t16(this, (byte) 28));
        yk2 yk2Var2 = this.t1;
        if (yk2Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        View view = ((kw8) yk2Var2).Z;
        view.getClass();
        return view;
    }
}
