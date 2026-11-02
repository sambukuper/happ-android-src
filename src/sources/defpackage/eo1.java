package defpackage;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SocketServerInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo1;", "Ls10;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class eo1 extends s10 {
    public final y5 t1;
    public final vz7 u1;
    public final vz7 v1;
    public y5 w1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eo1() {
        final byte b = 0;
        dn2 dn2Var = new dn2(this) { // from class: xn1
            public final /* synthetic */ eo1 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                q51 q51Var = null;
                dn8 dn8Var = dn8.a;
                eo1 eo1Var = this.Y;
                switch (b2) {
                    case 0:
                        Application application = eo1Var.M().getApplication();
                        application.getClass();
                        a aVar = new a();
                        Bundle bundle = ((qk2) eo1Var).h0;
                        String string = bundle != null ? bundle.getString("socket_server_info") : null;
                        if (string == null) {
                            bt.q("Required value was null.");
                            return null;
                        }
                        Object objC = aVar.c(string, new yi8(SocketServerInfo.class));
                        objC.getClass();
                        return new f27(application, (SocketServerInfo) objC);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return jm4.a0(w51.t(new co1(eo1Var.Z().f, (byte) 0)), ys0.z(((qk2) eo1Var).S0), h87.a, km5.f0);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        return new dw7((mh7) eo1Var.u1.getValue(), null, new yn1(2, eo1Var.Z(), l27.class, "onSubChecked", "onSubChecked-N_SCOKg(Ljava/lang/String;Z)V", 0, (byte) 0), new vb(3, eo1Var.Z(), l27.class, "onServerChecked", "onServerChecked-S0IonpA(Ljava/lang/String;Ljava/lang/String;Z)V", 0, (byte) 6), null, new d0(1, eo1Var.Z(), l27.class, "onChangedExpanded", "onChangedExpanded-PzuDCJM(Ljava/lang/String;)V", 0, (byte) 9), null, 164);
                    case 3:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 4:
                        jm4.Q(i21.H(eo1Var), (u61) null, new zn1(eo1Var, q51Var, (byte) 1), 3);
                        return dn8Var;
                    case 5:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 6:
                        eo1Var.R(false, false);
                        return dn8Var;
                    default:
                        eo1Var.R(false, false);
                        return dn8Var;
                }
            }
        };
        g44 g44VarP = x97.P(w74.Y, new f3(new f3(this, (byte) 21), (byte) 22));
        final byte b2 = 1;
        this.t1 = new y5(yb6.a.b(l27.class), new do1(g44VarP, (byte) 0), dn2Var, new do1(g44VarP, (byte) 1));
        this.u1 = new vz7(new dn2(this) { // from class: xn1
            public final /* synthetic */ eo1 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                q51 q51Var = null;
                dn8 dn8Var = dn8.a;
                eo1 eo1Var = this.Y;
                switch (b3) {
                    case 0:
                        Application application = eo1Var.M().getApplication();
                        application.getClass();
                        a aVar = new a();
                        Bundle bundle = ((qk2) eo1Var).h0;
                        String string = bundle != null ? bundle.getString("socket_server_info") : null;
                        if (string == null) {
                            bt.q("Required value was null.");
                            return null;
                        }
                        Object objC = aVar.c(string, new yi8(SocketServerInfo.class));
                        objC.getClass();
                        return new f27(application, (SocketServerInfo) objC);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return jm4.a0(w51.t(new co1(eo1Var.Z().f, (byte) 0)), ys0.z(((qk2) eo1Var).S0), h87.a, km5.f0);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        return new dw7((mh7) eo1Var.u1.getValue(), null, new yn1(2, eo1Var.Z(), l27.class, "onSubChecked", "onSubChecked-N_SCOKg(Ljava/lang/String;Z)V", 0, (byte) 0), new vb(3, eo1Var.Z(), l27.class, "onServerChecked", "onServerChecked-S0IonpA(Ljava/lang/String;Ljava/lang/String;Z)V", 0, (byte) 6), null, new d0(1, eo1Var.Z(), l27.class, "onChangedExpanded", "onChangedExpanded-PzuDCJM(Ljava/lang/String;)V", 0, (byte) 9), null, 164);
                    case 3:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 4:
                        jm4.Q(i21.H(eo1Var), (u61) null, new zn1(eo1Var, q51Var, (byte) 1), 3);
                        return dn8Var;
                    case 5:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 6:
                        eo1Var.R(false, false);
                        return dn8Var;
                    default:
                        eo1Var.R(false, false);
                        return dn8Var;
                }
            }
        });
        final byte b3 = 2;
        this.v1 = new vz7(new dn2(this) { // from class: xn1
            public final /* synthetic */ eo1 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b4 = b3;
                q51 q51Var = null;
                dn8 dn8Var = dn8.a;
                eo1 eo1Var = this.Y;
                switch (b4) {
                    case 0:
                        Application application = eo1Var.M().getApplication();
                        application.getClass();
                        a aVar = new a();
                        Bundle bundle = ((qk2) eo1Var).h0;
                        String string = bundle != null ? bundle.getString("socket_server_info") : null;
                        if (string == null) {
                            bt.q("Required value was null.");
                            return null;
                        }
                        Object objC = aVar.c(string, new yi8(SocketServerInfo.class));
                        objC.getClass();
                        return new f27(application, (SocketServerInfo) objC);
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        return jm4.a0(w51.t(new co1(eo1Var.Z().f, (byte) 0)), ys0.z(((qk2) eo1Var).S0), h87.a, km5.f0);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        return new dw7((mh7) eo1Var.u1.getValue(), null, new yn1(2, eo1Var.Z(), l27.class, "onSubChecked", "onSubChecked-N_SCOKg(Ljava/lang/String;Z)V", 0, (byte) 0), new vb(3, eo1Var.Z(), l27.class, "onServerChecked", "onServerChecked-S0IonpA(Ljava/lang/String;Ljava/lang/String;Z)V", 0, (byte) 6), null, new d0(1, eo1Var.Z(), l27.class, "onChangedExpanded", "onChangedExpanded-PzuDCJM(Ljava/lang/String;)V", 0, (byte) 9), null, 164);
                    case 3:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 4:
                        jm4.Q(i21.H(eo1Var), (u61) null, new zn1(eo1Var, q51Var, (byte) 1), 3);
                        return dn8Var;
                    case 5:
                        eo1Var.R(false, false);
                        return dn8Var;
                    case 6:
                        eo1Var.R(false, false);
                        return dn8Var;
                    default:
                        eo1Var.R(false, false);
                        return dn8Var;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y5 Y() {
        y5 y5Var = this.w1;
        if (y5Var != null) {
            return y5Var;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l27 Z() {
        return (l27) this.t1.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        l27 l27VarZ = Z();
        og7 og7Var = l27VarZ.g;
        if (og7Var != null) {
            og7Var.m((CancellationException) null);
        }
        l27VarZ.g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerViewB;
        String[] stringArray;
        Object value;
        layoutInflater.getClass();
        Object[] objArr = 0;
        View viewInflate = layoutInflater.inflate(t46.fragment_dialog_subscription_send_to_tv, viewGroup, false);
        int i = e46.btn_cancel;
        HappTextButton happTextButton = (HappTextButton) ln7.b(viewInflate, i);
        q51 q51Var = null;
        if (happTextButton != null) {
            i = e46.btn_send;
            HappTextButton happTextButton2 = (HappTextButton) ln7.b(viewInflate, i);
            if (happTextButton2 != null) {
                i = e46.root_layout;
                LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
                if (linearLayout != null && (recyclerViewB = ln7.b(viewInflate, (i = e46.rv_config_groups))) != null) {
                    this.w1 = new y5((LinearLayout) viewInflate, happTextButton, happTextButton2, linearLayout, recyclerViewB, (byte) 12);
                    ViewGroup.LayoutParams layoutParams = ((LinearLayout) Y().f0).getLayoutParams();
                    layoutParams.getClass();
                    BaseActivity baseActivityI = i();
                    baseActivityI.getClass();
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = baseActivityI.u();
                    final byte b = 1;
                    ((RecyclerView) Y().h0).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) Y().h0).setAdapter((dw7) this.v1.getValue());
                    AppCompatButton appCompatButton = (HappTextButton) Y().g0;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: wn1
                        public final /* synthetic */ eo1 Y;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.Y = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b2 = objArr2;
                            byte b3 = 0;
                            eo1 eo1Var = this.Y;
                            switch (b2) {
                                case 0:
                                    jm4.Q(ys0.z(eo1Var.h()), (u61) null, new zn1(eo1Var, null, b3), 3);
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                    eo1Var.R(false, false);
                                    break;
                                default:
                                    eo1Var.R(false, false);
                                    break;
                            }
                        }
                    });
                    ((HappTextButton) Y().Z).setOnClickListener(new View.OnClickListener(this) { // from class: wn1
                        public final /* synthetic */ eo1 Y;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.Y = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b2 = b;
                            byte b3 = 0;
                            eo1 eo1Var = this.Y;
                            switch (b2) {
                                case 0:
                                    jm4.Q(ys0.z(eo1Var.h()), (u61) null, new zn1(eo1Var, null, b3), 3);
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                    eo1Var.R(false, false);
                                    break;
                                default:
                                    eo1Var.R(false, false);
                                    break;
                            }
                        }
                    });
                    final byte b2 = 2;
                    ((LinearLayout) Y().Y).setOnClickListener(new View.OnClickListener(this) { // from class: wn1
                        public final /* synthetic */ eo1 Y;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.Y = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b3 = b2;
                            byte b4 = 0;
                            eo1 eo1Var = this.Y;
                            switch (b3) {
                                case 0:
                                    jm4.Q(ys0.z(eo1Var.h()), (u61) null, new zn1(eo1Var, null, b4), 3);
                                    break;
                                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                    eo1Var.R(false, false);
                                    break;
                                default:
                                    eo1Var.R(false, false);
                                    break;
                            }
                        }
                    });
                    Bundle bundle = ((qk2) this).h0;
                    if (bundle != null && (stringArray = bundle.getStringArray("config_list")) != null) {
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        for (String str : stringArray) {
                            a aVar = yw2.b;
                            aVar.getClass();
                            arrayList.add((ConfigGroupCache) aVar.c(str, new yi8(ConfigGroupCache.class)));
                        }
                        oh7 oh7Var = Z().e;
                        do {
                            value = oh7Var.getValue();
                        } while (!oh7Var.k(value, e27.a((e27) value, mb6.d0(arrayList), null, null, 13)));
                    }
                    l27 l27VarZ = Z();
                    q0 q0Var = new q0(this, (q51) null, (byte) 21);
                    tu0 tu0VarA = zw8.a(l27VarZ);
                    nf1 nf1Var = tp1.a;
                    l27VarZ.g = jm4.Q(tu0VarA, dm4.a, new t17(l27VarZ, q0Var, q51Var, (byte) 4), 2);
                    LinearLayout linearLayout2 = (LinearLayout) Y().Y;
                    linearLayout2.getClass();
                    return linearLayout2;
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
