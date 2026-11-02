package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.ui.ActionView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin1;", "Lr70;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class in1 extends r70 {
    public final ak7 t1;
    public jl1 u1;
    public String v1;
    public boolean w1;
    public boolean x1;
    public gv7 y1;
    public final vz7 z1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public in1() {
        HappApplication happApplication = HappApplication.M0;
        Context applicationContext = k32.i().getApplicationContext();
        applicationContext.getClass();
        this.t1 = new ak7(applicationContext);
        SubId.Companion.getClass();
        this.v1 = SubId.c();
        this.z1 = new vz7(new o7(this, (byte) 27));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(View view) {
        view.getClass();
        gv3.f(M().b(), this, new y0(this, (byte) 21));
        U().setOnShowListener(new gn1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int S() {
        return p56.HappBottomSheetDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(Context context) {
        super/*sn1*/.x(context);
        this.y1 = context instanceof gv7 ? (gv7) context : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object next;
        ActionView actionView;
        layoutInflater.getClass();
        Bundle bundle = ((qk2) this).h0;
        if (bundle == null) {
            bt.q("Required value was null.");
            return null;
        }
        String string = bundle.getString("sub_id", "");
        string.getClass();
        this.v1 = string;
        this.w1 = bundle.getBoolean("is_sub_config_group");
        bundle.getBoolean("is_empty_config_group");
        this.x1 = bundle.getBoolean("is_restricted_access");
        final byte b = 0;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(t46.fragment_dialog_config_group_actions, viewGroup, false);
        int i = e46.act_delete;
        ActionView actionView2 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
        if (actionView2 != null) {
            i = e46.act_edit;
            ActionView actionView3 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
            if (actionView3 != null) {
                i = e46.act_pin;
                ActionView actionView4 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
                if (actionView4 != null) {
                    i = e46.act_ping;
                    ActionView actionView5 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
                    if (actionView5 != null) {
                        i = e46.act_routing;
                        ActionView actionView6 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
                        if (actionView6 != null) {
                            i = e46.act_settings;
                            ActionView actionView7 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
                            if (actionView7 != null) {
                                i = e46.act_update_sub;
                                ActionView actionView8 = (ActionView) ln7.b(coordinatorLayoutInflate, i);
                                if (actionView8 != null) {
                                    i = e46.fragment_main;
                                    LinearLayout linearLayout = (LinearLayout) ln7.b(coordinatorLayoutInflate, i);
                                    if (linearLayout != null) {
                                        this.u1 = new jl1(coordinatorLayoutInflate, actionView2, actionView3, actionView4, actionView5, actionView6, actionView7, actionView8, linearLayout);
                                        mb6.g((hn1) this.z1.getValue());
                                        jl1 jl1Var = this.u1;
                                        if (jl1Var == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        LinearLayout linearLayout2 = (LinearLayout) jl1Var.k0;
                                        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), M().u());
                                        jl1 jl1Var2 = this.u1;
                                        if (jl1Var2 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var2.i0).setVisibility(!this.x1 ? 0 : 8);
                                        jl1 jl1Var3 = this.u1;
                                        if (jl1Var3 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var3.h0).setVisibility(!this.x1 ? 0 : 8);
                                        jl1 jl1Var4 = this.u1;
                                        if (jl1Var4 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var4.j0).setVisibility((!this.w1 || this.x1) ? 8 : 0);
                                        jl1 jl1Var5 = this.u1;
                                        if (jl1Var5 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var5.g0).setVisibility(!this.x1 ? 0 : 8);
                                        jl1 jl1Var6 = this.u1;
                                        if (jl1Var6 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var6.Z).setVisibility((!this.w1 || this.x1) ? 8 : 0);
                                        jl1 jl1Var7 = this.u1;
                                        if (jl1Var7 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var7.f0).setVisibility(this.x1 ? 8 : 0);
                                        jl1 jl1Var8 = this.u1;
                                        if (jl1Var8 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        Iterator it = i21.L(new ActionView[]{(ActionView) jl1Var8.i0, (ActionView) jl1Var8.h0, (ActionView) jl1Var8.j0, (ActionView) jl1Var8.g0, (ActionView) jl1Var8.Z, (ActionView) jl1Var8.f0, (ActionView) jl1Var8.Y}).iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            actionView = (ActionView) next;
                                            actionView.getClass();
                                        } while (actionView.getVisibility() != 0);
                                        ActionView actionView9 = (ActionView) next;
                                        if (actionView9 != null) {
                                            actionView9.requestFocus();
                                        }
                                        jl1 jl1Var9 = this.u1;
                                        if (jl1Var9 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        ((ActionView) jl1Var9.i0).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            /* JADX WARN: Code duplicated, block: B:25:0x0085  */
                                            /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
                                            /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
                                            /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
                                            /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
                                            /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
                                            /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
                                            /* JADX WARN: Code duplicated, block: B:53:0x0109  */
                                            /* JADX WARN: Code duplicated, block: B:59:0x0124  */
                                            /* JADX WARN: Code duplicated, block: B:61:0x012c  */
                                            /* JADX WARN: Code duplicated, block: B:88:0x011f A[SYNTHETIC] */
                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
                                                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:47)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var10 = this.u1;
                                        if (jl1Var10 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b2 = 1;
                                        ((ActionView) jl1Var10.h0).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var11 = this.u1;
                                        if (jl1Var11 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b3 = 2;
                                        ((ActionView) jl1Var11.j0).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var12 = this.u1;
                                        if (jl1Var12 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b4 = 3;
                                        ((ActionView) jl1Var12.g0).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var13 = this.u1;
                                        if (jl1Var13 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b5 = 4;
                                        ((ActionView) jl1Var13.Z).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var14 = this.u1;
                                        if (jl1Var14 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b6 = 5;
                                        ((ActionView) jl1Var14.f0).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        jl1 jl1Var15 = this.u1;
                                        if (jl1Var15 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        final byte b7 = 6;
                                        ((ActionView) jl1Var15.Y).setOnClickListener(new View.OnClickListener(this) { // from class: fn1
                                            public final /* synthetic */ in1 Y;

                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            {
                                                this.Y = this;
                                            }

                                            /*  JADX ERROR: JadxRuntimeException in pass: SwitchBreakVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v8 java.lang.Object, still in use, count: 2, list:
                                                  (r7v8 java.lang.Object) from 0x00bc: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v8 java.lang.Object) binds: [B:38:0x00bb, B:83:0x00bc] A[DONT_GENERATE, DONT_INLINE]
                                                  (r7v8 java.lang.Object) from 0x00a6: CHECK_CAST (pb3) (r7v8 java.lang.Object)
                                                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                                                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                                                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                                                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                                                */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View r15) {
                                                /*
                                                    r14 = this;
                                                    byte r15 = r2
                                                    java.lang.String r0 = "sub_id"
                                                    r1 = 0
                                                    java.lang.String r2 = "pinSubIdInStorage"
                                                    r3 = 0
                                                    in1 r14 = r14.Y
                                                    switch(r15) {
                                                        case 0: goto L1d0;
                                                        case 1: goto L1b4;
                                                        case 2: goto L187;
                                                        case 3: goto L178;
                                                        case 4: goto L152;
                                                        case 5: goto L54;
                                                        default: goto Ld;
                                                    }
                                                Ld:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L53
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    vz7 r0 = r15.W0
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    tu0 r4 = zw8.a(r15)
                                                    nf1 r5 = tp1.a
                                                    ye1 r5 = ye1.Z
                                                    k r6 = new k
                                                    r7 = 21
                                                    r6.<init>(r14, r15, r3, r7)
                                                    r15 = 2
                                                    jm4.Q(r4, r5, r6, r15)
                                                    java.lang.Object r15 = r0.getValue()
                                                    ak7 r15 = (defpackage.ak7) r15
                                                    java.lang.String r15 = defpackage.ak7.a(r15, r2)
                                                    if (r15 == 0) goto L41
                                                    r3 = r15
                                                L41:
                                                    if (r3 != 0) goto L44
                                                    goto L48
                                                L44:
                                                    boolean r1 = r3.equals(r14)
                                                L48:
                                                    if (r1 == 0) goto L53
                                                    java.lang.Object r14 = r0.getValue()
                                                    ak7 r14 = (defpackage.ak7) r14
                                                    r14.b(r2)
                                                L53:
                                                    return
                                                L54:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L151
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r15 = r15.G()
                                                    java.util.concurrent.CopyOnWriteArrayList r0 = r15.q
                                                    ak7 r4 = r15.E
                                                    r4.getClass()
                                                    android.content.SharedPreferences r5 = r4.a
                                                    boolean r5 = r5.contains(r2)
                                                    if (r5 == 0) goto L85
                                                    java.lang.String r5 = defpackage.ak7.a(r4, r2)
                                                    if (r5 == 0) goto L7c
                                                    goto L7d
                                                L7c:
                                                    r5 = r3
                                                L7d:
                                                    if (r5 == 0) goto L85
                                                    su.happ.proxyutility.domain.sub.SubId r6 = new su.happ.proxyutility.domain.sub.SubId
                                                    r6.<init>(r5)
                                                    goto L86
                                                L85:
                                                    r6 = r3
                                                L86:
                                                    if (r6 == 0) goto L8d
                                                    java.lang.String r5 = r6.d()
                                                    goto L8e
                                                L8d:
                                                    r5 = r3
                                                L8e:
                                                    gu r6 = wv0.d1(r0)
                                                    java.util.Iterator r6 = r6.iterator()
                                                L96:
                                                    r7 = r6
                                                    rw1 r7 = (rw1) r7
                                                    java.util.Iterator r8 = r7.Y
                                                    boolean r8 = r8.hasNext()
                                                    if (r8 == 0) goto Lbb
                                                    java.lang.Object r7 = r7.next()
                                                    r8 = r7
                                                    pb3 r8 = (pb3) r8
                                                    java.lang.Object r8 = r8.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    java.lang.String r8 = r8.getSubId()
                                                    if (r5 != 0) goto Lb4
                                                    r8 = r1
                                                    goto Lb8
                                                Lb4:
                                                    boolean r8 = dh3.f(r8, r5)
                                                Lb8:
                                                    if (r8 == 0) goto L96
                                                    goto Lbc
                                                Lbb:
                                                    r7 = r3
                                                Lbc:
                                                    pb3 r7 = (pb3) r7
                                                    if (r7 == 0) goto Lc7
                                                    int r6 = r7.a
                                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                                    goto Lc8
                                                Lc7:
                                                    r6 = r3
                                                Lc8:
                                                    if (r6 == 0) goto Le9
                                                    int r7 = r6.intValue()
                                                    int r6 = r6.intValue()
                                                    java.lang.Object r6 = r0.get(r6)
                                                    r6.getClass()
                                                    r8 = r6
                                                    su.happ.proxyutility.dto.ConfigGroupCache r8 = (su.happ.proxyutility.dto.ConfigGroupCache) r8
                                                    r12 = 0
                                                    r13 = 15
                                                    r9 = 0
                                                    r10 = 0
                                                    r11 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = su.happ.proxyutility.dto.ConfigGroupCache.a(r8, r9, r10, r11, r12, r13)
                                                    r0.set(r7, r6)
                                                Le9:
                                                    if (r5 != 0) goto Lec
                                                    goto Lf0
                                                Lec:
                                                    boolean r1 = r5.equals(r14)
                                                Lf0:
                                                    if (r1 == 0) goto Lf6
                                                    r4.b(r2)
                                                    goto L14e
                                                Lf6:
                                                    gu r1 = wv0.d1(r0)
                                                    java.util.Iterator r1 = r1.iterator()
                                                Lfe:
                                                    r5 = r1
                                                    rw1 r5 = (rw1) r5
                                                    java.util.Iterator r6 = r5.Y
                                                    boolean r6 = r6.hasNext()
                                                    if (r6 == 0) goto L11f
                                                    java.lang.Object r5 = r5.next()
                                                    r6 = r5
                                                    pb3 r6 = (pb3) r6
                                                    java.lang.Object r6 = r6.b
                                                    su.happ.proxyutility.dto.ConfigGroupCache r6 = (su.happ.proxyutility.dto.ConfigGroupCache) r6
                                                    java.lang.String r6 = r6.getSubId()
                                                    boolean r6 = dh3.f(r6, r14)
                                                    if (r6 == 0) goto Lfe
                                                    goto L120
                                                L11f:
                                                    r5 = r3
                                                L120:
                                                    pb3 r5 = (pb3) r5
                                                    if (r5 == 0) goto L12a
                                                    int r1 = r5.a
                                                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                                                L12a:
                                                    if (r3 == 0) goto L14b
                                                    int r1 = r3.intValue()
                                                    int r3 = r3.intValue()
                                                    java.lang.Object r3 = r0.get(r3)
                                                    r3.getClass()
                                                    r5 = r3
                                                    su.happ.proxyutility.dto.ConfigGroupCache r5 = (su.happ.proxyutility.dto.ConfigGroupCache) r5
                                                    r9 = 1
                                                    r10 = 15
                                                    r6 = 0
                                                    r7 = 0
                                                    r8 = 0
                                                    su.happ.proxyutility.dto.ConfigGroupCache r3 = su.happ.proxyutility.dto.ConfigGroupCache.a(r5, r6, r7, r8, r9, r10)
                                                    r0.set(r1, r3)
                                                L14b:
                                                    r4.d(r2, r14)
                                                L14e:
                                                    r15.s()
                                                L151:
                                                    return
                                                L152:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L177
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r14.getClass()
                                                    su.happ.proxyutility.feature.main.MainViewModel r0 = r15.G()
                                                    r0.w(r14)
                                                    y5 r15 = r15.j1
                                                    java.lang.Object r15 = r15.getValue()
                                                    kr7 r15 = (defpackage.kr7) r15
                                                    zq7 r0 = new zq7
                                                    r0.<init>(r14)
                                                    r15.f(r0)
                                                L177:
                                                    return
                                                L178:
                                                    r14.Y()
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L186
                                                    java.lang.String r14 = r14.v1
                                                    su.happ.proxyutility.feature.main.MainActivity r15 = (su.happ.proxyutility.feature.main.MainActivity) r15
                                                    r15.X(r14)
                                                L186:
                                                    return
                                                L187:
                                                    r14.Y()
                                                    kw4 r15 = defpackage.kw4.a
                                                    java.lang.String r15 = r14.v1
                                                    su.happ.proxyutility.dto.SubscriptionItem r7 = defpackage.kw4.f(r15)
                                                    if (r7 == 0) goto L1b3
                                                    gv7 r15 = r14.y1
                                                    if (r15 == 0) goto L1b3
                                                    java.lang.String r6 = r14.v1
                                                    r5 = r15
                                                    su.happ.proxyutility.feature.main.MainActivity r5 = (su.happ.proxyutility.feature.main.MainActivity) r5
                                                    r6.getClass()
                                                    g94 r14 = r5.X
                                                    u84 r14 = ys0.z(r14)
                                                    pi r4 = new pi
                                                    r9 = 0
                                                    r10 = 14
                                                    r8 = 0
                                                    r4.<init>(r5, r6, r7, r8, r9, r10)
                                                    r15 = 3
                                                    jm4.Q(r14, r3, r4, r15)
                                                L1b3:
                                                    return
                                                L1b4:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.routing.sub.SubRoutingActivity> r3 = su.happ.proxyutility.feature.routing.sub.SubRoutingActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                L1d0:
                                                    r14.Y()
                                                    android.content.Context r15 = r14.N()
                                                    android.content.Intent r1 = new android.content.Intent
                                                    android.content.Context r2 = r14.N()
                                                    java.lang.Class<su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity> r3 = su.happ.proxyutility.feature.subscription_properties.SubscriptionPropertiesActivity.class
                                                    r1.<init>(r2, r3)
                                                    java.lang.String r14 = r14.v1
                                                    android.content.Intent r14 = c4.y(r1, r0, r14)
                                                    r15.startActivity(r14)
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.onClick(android.view.View):void");
                                            }
                                        });
                                        ak7 ak7Var = this.t1;
                                        ak7Var.getClass();
                                        if (dh3.f(ak7Var.a.getString("pinSubIdInStorage", null), this.v1)) {
                                            jl1 jl1Var16 = this.u1;
                                            if (jl1Var16 == null) {
                                                dh3.T("binding");
                                                throw null;
                                            }
                                            ActionView actionView10 = (ActionView) jl1Var16.f0;
                                            String strP = p(y46.dialog_config_group_actions_unpin);
                                            strP.getClass();
                                            actionView10.setText(strP);
                                        }
                                        jl1 jl1Var17 = this.u1;
                                        if (jl1Var17 == null) {
                                            dh3.T("binding");
                                            throw null;
                                        }
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) jl1Var17.X;
                                        coordinatorLayout.getClass();
                                        return coordinatorLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
        return null;
    }
}
