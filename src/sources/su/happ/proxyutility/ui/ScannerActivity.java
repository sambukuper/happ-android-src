package su.happ.proxyutility.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.view.PreviewView;
import com.google.android.material.button.MaterialButton;
import defpackage.bm4;
import defpackage.e46;
import defpackage.ff6;
import defpackage.ln7;
import defpackage.r84;
import defpackage.t46;
import defpackage.x79;
import defpackage.y46;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.ScannerActivity;
import su.happ.proxyutility.ui.widget.QROverlayView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/ui/ScannerActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ScannerActivity extends BaseActivity {
    public static final /* synthetic */ int T0 = 0;
    public lr Q0;
    public zo0 R0;
    public final r6 S0 = m(new o61(this, (byte) 24), new n6((byte) 0));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: su.happ.proxyutility.ui.ScannerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(xu5 xu5Var) {
        dn8 rj6Var;
        lr lrVar = this.Q0;
        if (lrVar == null) {
            dh3.T("binding");
            throw null;
        }
        ((PreviewView) lrVar.f0).setImplementationMode(st5.Y);
        mt5 mt5Var = new mt5(qd5.c(new h53((byte) 2).Y));
        i63.G(mt5Var);
        hq8 lt5Var = new lt5(mt5Var);
        ((lt5) lt5Var).r = lt5.y;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        final byte b = 1;
        linkedHashSet.add(new i84(1));
        lk0 lk0Var = new lk0(linkedHashSet);
        lr lrVar2 = this.Q0;
        if (lrVar2 == null) {
            dh3.T("binding");
            throw null;
        }
        lt5Var.J(((PreviewView) lrVar2.f0).getSurfaceProvider());
        final byte b2 = 0;
        h53 h53Var = new h53((byte) 0);
        h53Var.Y.o(i63.A, new ef6(pz2.t0, new ff6(new Size(1280, 720))));
        h53Var.Y.o(o53.Y, 0);
        o53 o53Var = new o53(qd5.c(h53Var.Y));
        i63.G(o53Var);
        hq8 k53Var = new k53(o53Var);
        Executor executorY = w79.y(this);
        zz2 zz2Var = new zz2(new lr5(this, (byte) 10));
        synchronized (((k53) k53Var).q) {
            try {
                m53 m53Var = ((k53) k53Var).r;
                if (m53Var != null) {
                    o61 o61Var = new o61(zz2Var, (byte) 10);
                    synchronized (m53Var.v0) {
                        m53Var.X = o61Var;
                        m53Var.i0 = executorY;
                    }
                }
                if (((k53) k53Var).t == null) {
                    k53Var.q();
                }
                ((k53) k53Var).s = executorY;
                ((k53) k53Var).t = zz2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            p84 p84VarA = xu5Var.a(this, lk0Var, new hq8[]{lt5Var, k53Var});
            lr lrVar3 = this.Q0;
            if (lrVar3 == null) {
                dh3.T("binding");
                throw null;
            }
            ((QROverlayView) lrVar3.Z).setVisibility(0);
            lr lrVar4 = this.Q0;
            if (lrVar4 == null) {
                dh3.T("binding");
                throw null;
            }
            QROverlayView qROverlayView = (QROverlayView) lrVar4.Z;
            dn2 dn2Var = new dn2(this) { // from class: tw6
                public final /* synthetic */ ScannerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, su.happ.proxyutility.ui.ScannerActivity] */
                public final Object invoke() {
                    byte b3 = b2;
                    dn8 dn8Var = dn8.a;
                    ?? r4 = this.Y;
                    switch (b3) {
                        case 0:
                            int i = ScannerActivity.T0;
                            r4.finish();
                            break;
                        default:
                            r6 r6Var = r4.S0;
                            c4.g();
                            pz2 pz2Var = pz2.Y;
                            c4.g();
                            ym5 ym5Var = new ym5();
                            ym5Var.a = k6.a;
                            c4.g();
                            ym5Var.a = l6.a;
                            ym5Var.b = pz2Var;
                            r6Var.h0(ym5Var);
                            break;
                    }
                    return dn8Var;
                }
            };
            yr6 yr6Var = qROverlayView.f0;
            ((AppCompatImageButton) yr6Var.Z).setVisibility(0);
            ((AppCompatImageButton) yr6Var.Z).setOnClickListener(new st0(dn2Var, (byte) 13));
            boolean zQ = p84VarA.c().Y.q();
            lr lrVar5 = this.Q0;
            if (zQ) {
                if (lrVar5 == null) {
                    dh3.T("binding");
                    throw null;
                }
                QROverlayView qROverlayView2 = (QROverlayView) lrVar5.Z;
                t16 t16Var = new t16(p84VarA, (byte) 10);
                yr6 yr6Var2 = qROverlayView2.f0;
                ((MaterialButton) yr6Var2.g0).setVisibility(0);
                ((MaterialButton) yr6Var2.g0).setOnClickListener(new st0(t16Var, (byte) 14));
                p84VarA.c().Y.f().e(this, new bm4(new t16(this, (byte) 11), (byte) 2));
            } else {
                if (lrVar5 == null) {
                    dh3.T("binding");
                    throw null;
                }
                QROverlayView qROverlayView3 = (QROverlayView) lrVar5.Z;
                zw5 zw5Var = new zw5((byte) 7);
                yr6 yr6Var3 = qROverlayView3.f0;
                ((MaterialButton) yr6Var3.g0).setVisibility(8);
                ((MaterialButton) yr6Var3.g0).setOnClickListener(new st0(zw5Var, (byte) 14));
            }
            lr lrVar6 = this.Q0;
            if (lrVar6 == null) {
                dh3.T("binding");
                throw null;
            }
            QROverlayView qROverlayView4 = (QROverlayView) lrVar6.Z;
            dn2 dn2Var2 = new dn2(this) { // from class: tw6
                public final /* synthetic */ ScannerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, su.happ.proxyutility.ui.ScannerActivity] */
                public final Object invoke() {
                    byte b3 = b;
                    dn8 dn8Var = dn8.a;
                    ?? r4 = this.Y;
                    switch (b3) {
                        case 0:
                            int i = ScannerActivity.T0;
                            r4.finish();
                            break;
                        default:
                            r6 r6Var = r4.S0;
                            c4.g();
                            pz2 pz2Var = pz2.Y;
                            c4.g();
                            ym5 ym5Var = new ym5();
                            ym5Var.a = k6.a;
                            c4.g();
                            ym5Var.a = l6.a;
                            ym5Var.b = pz2Var;
                            r6Var.h0(ym5Var);
                            break;
                    }
                    return dn8Var;
                }
            };
            yr6 yr6Var4 = qROverlayView4.f0;
            ((MaterialButton) yr6Var4.f0).setVisibility(0);
            ((MaterialButton) yr6Var4.f0).setOnClickListener(new st0(dn2Var2, (byte) 15));
            rj6Var = dn8.a;
            if (sj6.a(rj6Var) != null) {
                lr lrVar7 = this.Q0;
                if (lrVar7 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((QROverlayView) lrVar7.Z).setVisibility(4);
                x79.h(this, y46.toast_camera_failure);
            }
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.ui.ScannerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void B(String str) {
        setResult(-1, new Intent().putExtra("SCAN_RESULT", str));
        finish();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: su.happ.proxyutility.ui.ScannerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        PreviewView previewViewB;
        t84 t84Var;
        xb4 xb4VarP;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_scanner, (ViewGroup) null, false);
        int i = e46.overlay_view;
        QROverlayView qROverlayView = (QROverlayView) ln7.b(viewInflate, i);
        if (qROverlayView == null || (previewViewB = ln7.b(viewInflate, (i = e46.preview_view))) == null) {
            b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
        this.Q0 = new lr((FrameLayout) viewInflate, qROverlayView, previewViewB, (byte) 5);
        setBarsParams(qROverlayView);
        lr lrVar = this.Q0;
        if (lrVar == null) {
            dh3.T("binding");
            throw null;
        }
        setContentView((FrameLayout) lrVar.Y);
        lr lrVar2 = this.Q0;
        if (lrVar2 == null) {
            dh3.T("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = ((QROverlayView) lrVar2.Z).getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = u() + marginLayoutParams.bottomMargin;
        d6 d6Var = xu5.b.a;
        synchronized (d6Var.Y) {
            Object obj = o51.a;
            int iK = Build.VERSION.SDK_INT >= 34 ? u3.k(this) : 0;
            LinkedHashMap linkedHashMap = r84.a;
            synchronized (linkedHashMap) {
                try {
                    Integer numValueOf = Integer.valueOf(iK);
                    Object t84Var2 = linkedHashMap.get(numValueOf);
                    if (t84Var2 == null) {
                        t84Var2 = new t84();
                        linkedHashMap.put(numValueOf, t84Var2);
                    }
                    t84Var = (t84) t84Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d6Var.j0 = t84Var;
            xb4VarP = (yo2) d6Var.g0;
            if (xb4VarP == null) {
                zl0 zl0Var = new zl0(this, (q84) null);
                zo0 zo0VarG0 = vr3.g0(vr3.g0(yo2.b((xb4) d6Var.h0), new o61(new vj2(zl0Var, (byte) 15), (byte) 12), dp1.a()), new vk1(new o61(new sn(d6Var, zl0Var, this, (byte) 12), (byte) 13), (byte) 13), dp1.a());
                d6Var.g0 = zo0VarG0;
                zo0VarG0.a(new zo2(zo0VarG0, new q02(d6Var, (byte) 16), (byte) 0), dp1.a());
                xb4VarP = vr3.P(zo0VarG0);
            }
        }
        zo0 zo0VarG1 = vr3.g0(xb4VarP, new vk1(new kp5(new dx4((byte) 27)), (byte) 13), dp1.a());
        this.R0 = zo0VarG1;
        zo0VarG1.a(new fl6(this, (byte) 2), w79.y(this));
    }
}
