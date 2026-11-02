package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.stories.StoryProgressView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lok7;", "Lsn1;", "<init>", "()V", "kk7", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ok7 extends sn1 {
    public wk2 t1;
    public final y5 u1;
    public float v1;
    public float w1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ok7() {
        g44 g44VarP = x97.P(w74.Y, new zk3(new zk3(this, (byte) 20), (byte) 21));
        this.u1 = new y5(yb6.a.b(qk7.class), new do1(g44VarP, (byte) 2), new c3(this, g44VarP, (byte) 28), new do1(g44VarP, (byte) 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        ((qk2) this).H0 = true;
        wk2 wk2Var = this.t1;
        if (wk2Var != null) {
            wk2Var.s0.b();
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        ((qk2) this).H0 = true;
        wk2 wk2Var = this.t1;
        if (wk2Var != null) {
            wk2Var.s0.c();
        } else {
            dh3.T("binding");
            throw null;
        }
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
    public final qk7 Y() {
        return (qk7) this.u1.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(Bundle bundle) {
        super.y(bundle);
        qk7 qk7VarY = Y();
        u15.S(qk7VarY.c, new jk7(this, (byte) 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        int i = wk2.w0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        q51 q51Var = null;
        wk2 wk2Var = (wk2) kw8.c(t46.fragment_dialog_stories, layoutInflater, (ViewGroup) null);
        wk2Var.getClass();
        this.t1 = wk2Var;
        final byte b = 0;
        wk2Var.r0.setUserInputEnabled(false);
        wk2 wk2Var2 = this.t1;
        if (wk2Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        wk2Var2.p0.setMax(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
        final byte b2 = 1;
        if (!((pk7) Y().d.X.getValue()).b) {
            wk2 wk2Var3 = this.t1;
            if (wk2Var3 == null) {
                dh3.T("binding");
                throw null;
            }
            wk2Var3.t0.setOnTouchListener(new View.OnTouchListener(this) { // from class: hk7
                public final /* synthetic */ ok7 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    byte b3 = b;
                    ok7 ok7Var = this.Y;
                    switch (b3) {
                        case 0:
                            int action = motionEvent.getAction();
                            if (action == 0) {
                                ok7Var.v1 = motionEvent.getRawX();
                            } else if (action == 1) {
                                float f = ok7Var.w1 - ok7Var.v1;
                                ok7Var.v1 = 0.0f;
                                ok7Var.w1 = 0.0f;
                                if (f > 100.0f) {
                                    ok7Var.R(false, false);
                                }
                            } else if (action == 2) {
                                ok7Var.w1 = motionEvent.getRawX();
                            }
                            return false;
                        default:
                            int action2 = motionEvent.getAction();
                            if (action2 == 0) {
                                wk2 wk2Var4 = ok7Var.t1;
                                if (wk2Var4 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                wk2Var4.s0.b();
                            } else {
                                if (action2 != 1) {
                                    return false;
                                }
                                wk2 wk2Var5 = ok7Var.t1;
                                if (wk2Var5 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                wk2Var5.s0.c();
                            }
                            return true;
                    }
                }
            });
            wk2 wk2Var4 = this.t1;
            if (wk2Var4 == null) {
                dh3.T("binding");
                throw null;
            }
            wk2Var4.t0.setOnClickListener(new View.OnClickListener(this) { // from class: ik7
                public final /* synthetic */ ok7 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    ok7 ok7Var = this.Y;
                    switch (b3) {
                        case 0:
                            wk2 wk2Var5 = ok7Var.t1;
                            if (wk2Var5 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            StoryProgressView storyProgressView = wk2Var5.s0;
                            storyProgressView.setCurrentStory(Math.max(storyProgressView.h0 - 1, 0));
                            return;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            wk2 wk2Var6 = ok7Var.t1;
                            if (wk2Var6 != null) {
                                wk2Var6.s0.a();
                                return;
                            } else {
                                dh3.T("binding");
                                throw null;
                            }
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            wk2 wk2Var7 = ok7Var.t1;
                            if (wk2Var7 != null) {
                                wk2Var7.s0.a();
                                return;
                            } else {
                                dh3.T("binding");
                                throw null;
                            }
                        default:
                            String str = ((pk7) ok7Var.Y().d.X.getValue()).d;
                            if (str != null) {
                                ss8 ss8Var = ss8.a;
                                ss8.B(ok7Var.N(), str);
                                return;
                            }
                            return;
                    }
                }
            });
            wk2 wk2Var5 = this.t1;
            if (wk2Var5 == null) {
                dh3.T("binding");
                throw null;
            }
            wk2Var5.u0.setOnClickListener(new View.OnClickListener(this) { // from class: ik7
                public final /* synthetic */ ok7 Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    ok7 ok7Var = this.Y;
                    switch (b3) {
                        case 0:
                            wk2 wk2Var6 = ok7Var.t1;
                            if (wk2Var6 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            StoryProgressView storyProgressView = wk2Var6.s0;
                            storyProgressView.setCurrentStory(Math.max(storyProgressView.h0 - 1, 0));
                            return;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            wk2 wk2Var7 = ok7Var.t1;
                            if (wk2Var7 != null) {
                                wk2Var7.s0.a();
                                return;
                            } else {
                                dh3.T("binding");
                                throw null;
                            }
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            wk2 wk2Var8 = ok7Var.t1;
                            if (wk2Var8 != null) {
                                wk2Var8.s0.a();
                                return;
                            } else {
                                dh3.T("binding");
                                throw null;
                            }
                        default:
                            String str = ((pk7) ok7Var.Y().d.X.getValue()).d;
                            if (str != null) {
                                ss8 ss8Var = ss8.a;
                                ss8.B(ok7Var.N(), str);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        final byte b3 = 3;
        jm4.Q(ys0.z(((qk2) this).S0), (u61) null, new lk7(this, q51Var, b2), 3);
        jm4.Q(ys0.z(((qk2) this).S0), (u61) null, new lk7(this, q51Var, b3), 3);
        int i2 = M().J0;
        int i3 = M().K0;
        float fApplyDimension = TypedValue.applyDimension(1, 16.0f, o().getDisplayMetrics());
        float fApplyDimension2 = TypedValue.applyDimension(1, 8.0f, o().getDisplayMetrics());
        wk2 wk2Var6 = this.t1;
        if (wk2Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        StoryProgressView storyProgressView = wk2Var6.s0;
        wk2 wk2Var7 = this.t1;
        if (wk2Var7 == null) {
            dh3.T("binding");
            throw null;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(wk2Var7.s0.getLayoutParams());
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) fApplyDimension) + i2;
        int i4 = (int) fApplyDimension2;
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(i4);
        storyProgressView.setLayoutParams(layoutParams);
        wk2 wk2Var8 = this.t1;
        if (wk2Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        StoryProgressView storyProgressView2 = wk2Var8.s0;
        storyProgressView2.getClass();
        storyProgressView2.setVisibility(((pk7) Y().d.X.getValue()).b ? 4 : 0);
        float fApplyDimension3 = TypedValue.applyDimension(1, 12.0f, o().getDisplayMetrics());
        float fApplyDimension4 = TypedValue.applyDimension(1, 20.0f, o().getDisplayMetrics());
        wk2 wk2Var9 = this.t1;
        if (wk2Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = wk2Var9.q0;
        wk2 wk2Var10 = this.t1;
        if (wk2Var10 == null) {
            dh3.T("binding");
            throw null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(wk2Var10.q0.getLayoutParams());
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2 + ((int) fApplyDimension3);
        constraintLayout.setLayoutParams(layoutParams2);
        wk2 wk2Var11 = this.t1;
        if (wk2Var11 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatButton appCompatButton = wk2Var11.n0;
        wk2 wk2Var12 = this.t1;
        if (wk2Var12 == null) {
            dh3.T("binding");
            throw null;
        }
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(wk2Var12.n0.getLayoutParams());
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i3 + ((int) fApplyDimension4);
        appCompatButton.setLayoutParams(layoutParams3);
        wk2 wk2Var13 = this.t1;
        if (wk2Var13 == null) {
            dh3.T("binding");
            throw null;
        }
        wk2Var13.r0.setAdapter(new kk7(((pk7) Y().d.X.getValue()).a, M()));
        wk2 wk2Var14 = this.t1;
        if (wk2Var14 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b4 = 2;
        ((ArrayList) wk2Var14.r0.h0.b).add(new i01(this, (byte) 2));
        wk2 wk2Var15 = this.t1;
        if (wk2Var15 == null) {
            dh3.T("binding");
            throw null;
        }
        StoryProgressView storyProgressView3 = wk2Var15.s0;
        storyProgressView3.getClass();
        boolean z = ((pk7) Y().d.X.getValue()).b;
        int iA = ((pk7) Y().d.X.getValue()).a.a();
        int i5 = ((pk7) Y().d.X.getValue()).g;
        lr5 lr5Var = new lr5(this, (byte) 17);
        storyProgressView3.f0 = iA;
        storyProgressView3.h0 = i5;
        storyProgressView3.g0 = z;
        storyProgressView3.k0 = lr5Var;
        jm4.Q(storyProgressView3.m0, (u61) null, new tk7(storyProgressView3, null, (byte) 0), 3);
        if (!((pk7) Y().d.X.getValue()).b) {
            wk2 wk2Var16 = this.t1;
            if (wk2Var16 == null) {
                dh3.T("binding");
                throw null;
            }
            wk2Var16.r0.setPageTransformer(new o61(this, (byte) 28));
        }
        wk2 wk2Var17 = this.t1;
        if (wk2Var17 == null) {
            dh3.T("binding");
            throw null;
        }
        wk2Var17.m0.setOnClickListener(new View.OnClickListener(this) { // from class: ik7
            public final /* synthetic */ ok7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b4;
                ok7 ok7Var = this.Y;
                switch (b5) {
                    case 0:
                        wk2 wk2Var18 = ok7Var.t1;
                        if (wk2Var18 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        StoryProgressView storyProgressView4 = wk2Var18.s0;
                        storyProgressView4.setCurrentStory(Math.max(storyProgressView4.h0 - 1, 0));
                        return;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        wk2 wk2Var19 = ok7Var.t1;
                        if (wk2Var19 != null) {
                            wk2Var19.s0.a();
                            return;
                        } else {
                            dh3.T("binding");
                            throw null;
                        }
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        wk2 wk2Var20 = ok7Var.t1;
                        if (wk2Var20 != null) {
                            wk2Var20.s0.a();
                            return;
                        } else {
                            dh3.T("binding");
                            throw null;
                        }
                    default:
                        String str = ((pk7) ok7Var.Y().d.X.getValue()).d;
                        if (str != null) {
                            ss8 ss8Var = ss8.a;
                            ss8.B(ok7Var.N(), str);
                            return;
                        }
                        return;
                }
            }
        });
        wk2 wk2Var18 = this.t1;
        if (wk2Var18 == null) {
            dh3.T("binding");
            throw null;
        }
        wk2Var18.n0.setOnClickListener(new View.OnClickListener(this) { // from class: ik7
            public final /* synthetic */ ok7 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b3;
                ok7 ok7Var = this.Y;
                switch (b5) {
                    case 0:
                        wk2 wk2Var19 = ok7Var.t1;
                        if (wk2Var19 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        StoryProgressView storyProgressView4 = wk2Var19.s0;
                        storyProgressView4.setCurrentStory(Math.max(storyProgressView4.h0 - 1, 0));
                        return;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        wk2 wk2Var110 = ok7Var.t1;
                        if (wk2Var110 != null) {
                            wk2Var110.s0.a();
                            return;
                        } else {
                            dh3.T("binding");
                            throw null;
                        }
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        wk2 wk2Var20 = ok7Var.t1;
                        if (wk2Var20 != null) {
                            wk2Var20.s0.a();
                            return;
                        } else {
                            dh3.T("binding");
                            throw null;
                        }
                    default:
                        String str = ((pk7) ok7Var.Y().d.X.getValue()).d;
                        if (str != null) {
                            ss8 ss8Var = ss8.a;
                            ss8.B(ok7Var.N(), str);
                            return;
                        }
                        return;
                }
            }
        });
        gv3.f(M().b(), this, new jk7(this, (byte) 0));
        wk2 wk2Var19 = this.t1;
        if (wk2Var19 != null) {
            return ((kw8) wk2Var19).Z;
        }
        dh3.T("binding");
        throw null;
    }
}
