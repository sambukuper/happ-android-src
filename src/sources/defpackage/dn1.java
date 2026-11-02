package defpackage;

import android.widget.Button;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dn1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Button Y;
    public final /* synthetic */ Button Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dn1(Button button, Button button2, byte b) {
        this.X = b;
        this.Y = button;
        this.Z = button2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Button button;
        byte b = this.X;
        float f = Float.MAX_VALUE;
        Button button2 = this.Z;
        Button button3 = this.Y;
        switch (b) {
            case 0:
                float f2 = d28.f(button3.getTextSize(), button3.getResources().getDisplayMetrics());
                if (button2 != null) {
                    button = button2.getVisibility() == 0 ? button2 : null;
                    if (button != null) {
                        f = d28.f(button.getTextSize(), button.getResources().getDisplayMetrics());
                    }
                }
                float fMin = Math.min(f2, f);
                button3.setTextSize(fMin);
                if (button2 != null) {
                    button2.setTextSize(fMin);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                float fMin2 = Math.min(d28.f(button3.getTextSize(), button3.getResources().getDisplayMetrics()), d28.f(button2.getTextSize(), button2.getResources().getDisplayMetrics()));
                button3.setTextSize(fMin2);
                button2.setTextSize(fMin2);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                float f3 = d28.f(button3.getTextSize(), button3.getResources().getDisplayMetrics());
                if (button2 != null) {
                    button = button2.getVisibility() == 0 ? button2 : null;
                    if (button != null) {
                        f = d28.f(button.getTextSize(), button.getResources().getDisplayMetrics());
                    }
                }
                float fMin3 = Math.min(f3, f);
                button3.setTextSize(fMin3);
                if (button2 != null) {
                    button2.setTextSize(fMin3);
                }
                break;
            default:
                float fMin4 = Math.min(d28.f(button3.getTextSize(), button3.getResources().getDisplayMetrics()), d28.f(button2.getTextSize(), button2.getResources().getDisplayMetrics()));
                button3.setTextSize(fMin4);
                button2.setTextSize(fMin4);
                break;
        }
    }
}
