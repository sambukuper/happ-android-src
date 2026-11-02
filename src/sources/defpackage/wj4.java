package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ComponentActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class wj4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ MainActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj4(MainActivity mainActivity, boolean z, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainActivity;
        this.h0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) throws Exception {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 4:
                ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 5:
                ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 6:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 12:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 16:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((wj4) n((q51) obj2, bool)).q(dn8Var);
                return dn8Var;
            case 18:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((wj4) n((q51) obj2, bool2)).q(dn8Var);
                return dn8Var;
            case 20:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 22:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 23:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 26:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 27:
                ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 28:
                return ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                ((wj4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        MainActivity mainActivity = this.i0;
        switch (b) {
            case 0:
                return new wj4(mainActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new wj4(mainActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new wj4(mainActivity, q51Var, (byte) 2);
            case 3:
                return new wj4(mainActivity, this.h0, q51Var, (byte) 3);
            case 4:
                return new wj4(mainActivity, this.h0, q51Var, (byte) 4);
            case 5:
                return new wj4(mainActivity, q51Var, (byte) 5);
            case 6:
                return new wj4(mainActivity, q51Var, (byte) 6);
            case 7:
                return new wj4(mainActivity, q51Var, (byte) 7);
            case 8:
                return new wj4(mainActivity, q51Var, (byte) 8);
            case 9:
                return new wj4(mainActivity, q51Var, (byte) 9);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                return new wj4(mainActivity, q51Var, (byte) 10);
            case 11:
                return new wj4(mainActivity, q51Var, (byte) 11);
            case 12:
                return new wj4(mainActivity, q51Var, (byte) 12);
            case 13:
                return new wj4(mainActivity, q51Var, (byte) 13);
            case 14:
                return new wj4(mainActivity, q51Var, (byte) 14);
            case 15:
                return new wj4(mainActivity, q51Var, (byte) 15);
            case 16:
                return new wj4(mainActivity, q51Var, (byte) 16);
            case 17:
                wj4 wj4Var = new wj4(mainActivity, q51Var, (byte) 17);
                wj4Var.h0 = ((Boolean) obj).booleanValue();
                return wj4Var;
            case 18:
                return new wj4(mainActivity, q51Var, (byte) 18);
            case 19:
                wj4 wj4Var2 = new wj4(mainActivity, q51Var, (byte) 19);
                wj4Var2.h0 = ((Boolean) obj).booleanValue();
                return wj4Var2;
            case 20:
                return new wj4(mainActivity, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new wj4(mainActivity, q51Var, (byte) 21);
            case 22:
                return new wj4(mainActivity, q51Var, (byte) 22);
            case 23:
                return new wj4(mainActivity, q51Var, (byte) 23);
            case 24:
                return new wj4(mainActivity, q51Var, (byte) 24);
            case 25:
                return new wj4(mainActivity, q51Var, (byte) 25);
            case 26:
                return new wj4(mainActivity, q51Var, (byte) 26);
            case 27:
                return new wj4(mainActivity, q51Var, (byte) 27);
            case 28:
                return new wj4(mainActivity, q51Var, (byte) 28);
            default:
                return new wj4(mainActivity, q51Var, (byte) 29);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.content.Context, su.happ.proxyutility.feature.main.MainActivity] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.app.Activity, su.happ.proxyutility.feature.main.MainActivity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object q(Object obj) throws Exception {
        FirebaseMessaging firebaseMessaging;
        Object objQ;
        byte b = 8;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 0;
        byte b5 = 1;
        q51 q51Var = null;
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    MainActivity mainActivity = this.i0;
                    this.h0 = true;
                    int i = MainActivity.y1;
                    if (mainActivity.h0(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    MainActivity mainActivity2 = this.i0;
                    this.h0 = true;
                    int i2 = MainActivity.y1;
                    if (mainActivity2.E(this) == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                c71 c71Var3 = c71.X;
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    MainActivity mainActivity3 = this.i0;
                    this.h0 = true;
                    int i3 = MainActivity.y1;
                    if (mainActivity3.E(this) == c71Var3) {
                        return c71Var3;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 3:
                w39.n0(obj);
                MainActivity mainActivity4 = this.i0;
                mainActivity4.k1.getAndSet(true);
                MainViewModel.C(mainActivity4.G(), this.h0, 2);
                return dn8.a;
            case 4:
                w39.n0(obj);
                ?? r12 = this.i0;
                boolean z4 = this.h0;
                int i4 = MainActivity.y1;
                b6 b6Var = r12.Q0;
                if (b6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = b6Var.A0.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                b6 b6Var2 = r12.Q0;
                if (b6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ConstraintLayout.LayoutParams layoutParams2 = b6Var2.A0.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams3 = layoutParams2 instanceof ConstraintLayout.LayoutParams ? layoutParams2 : null;
                b6 b6Var3 = r12.Q0;
                if (z4) {
                    if (b6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView = b6Var3.I0;
                    if (appCompatTextView != null) {
                        appCompatTextView.setVisibility(8);
                    }
                    b6 b6Var4 = r12.Q0;
                    if (b6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var4.i0.requestFocus();
                    if (!ue3.y((Context) r12)) {
                        b6 b6Var5 = r12.Q0;
                        if (b6Var5 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout = b6Var5.v0;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(0);
                        }
                    }
                    marginLayoutParams.bottomMargin = (int) r12.getResources().getDimension(k36.main_content_padding_secondary);
                    if (layoutParams3 != null) {
                        b6 b6Var6 = r12.Q0;
                        if (b6Var6 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout2 = b6Var6.v0;
                        constraintLayout2.getClass();
                        layoutParams3.k = constraintLayout2.getId();
                    }
                    if (layoutParams3 != null) {
                        layoutParams3.l = -1;
                    }
                    r12.a0();
                } else {
                    if (b6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView2 = b6Var3.I0;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setVisibility(((xm4) r12.G().x.X.getValue()).e ? 0 : 8);
                    }
                    if (!ue3.y((Context) r12)) {
                        b6 b6Var7 = r12.Q0;
                        if (b6Var7 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ConstraintLayout constraintLayout3 = b6Var7.v0;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(8);
                        }
                    }
                    marginLayoutParams.bottomMargin = 0;
                    if (layoutParams3 != null) {
                        b6 b6Var8 = r12.Q0;
                        if (b6Var8 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        layoutParams3.l = b6Var8.u0.getId();
                    }
                    if (layoutParams3 != null) {
                        layoutParams3.k = -1;
                    }
                    r12.a0();
                }
                return dn8.a;
            case 5:
                c71 c71Var4 = c71.X;
                boolean z5 = this.h0;
                if (z5) {
                    if (!z5) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    b61.n();
                    return null;
                }
                w39.n0(obj);
                MainActivity mainActivity5 = this.i0;
                u77 u77Var = mainActivity5.d1;
                yk4 yk4Var = new yk4(mainActivity5, (byte) 0);
                this.h0 = true;
                u77Var.a(yk4Var, this);
                return c71Var4;
            case 6:
                c71 c71Var5 = c71.X;
                boolean z6 = this.h0;
                if (!z6) {
                    w39.n0(obj);
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(xa2.b());
                    }
                    firebaseMessaging.getClass();
                    fb9 fb9VarD = firebaseMessaging.d();
                    fb9VarD.a(new nj4(this.i0, (byte) 4));
                    this.h0 = true;
                    if (fb9VarD.h()) {
                        Exception excF = fb9VarD.f();
                        if (excF != null) {
                            throw excF;
                        }
                        if (fb9VarD.d) {
                            throw new CancellationException("Task " + fb9VarD + " was cancelled normally.");
                        }
                        objQ = fb9VarD.g();
                    } else {
                        mm0 mm0Var = new mm0(1, mb6.H(this));
                        mm0Var.s();
                        fb9VarD.b(dp1.Z, new lr5(mm0Var, (byte) 22));
                        objQ = mm0Var.q();
                    }
                    if (objQ == c71Var5) {
                        return c71Var5;
                    }
                } else {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 7:
                dn8 dn8Var = dn8.a;
                ?? r1 = this.i0;
                c71 c71Var6 = c71.X;
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    be beVar = gx1.Y;
                    long jM0 = vj8.m0(1000L, lx1.Z);
                    this.h0 = true;
                    if (u70.G(jM0, this) == c71Var6) {
                        return c71Var6;
                    }
                } else {
                    if (!z7) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                Bundle extras = r1.getIntent().getExtras();
                boolean z8 = extras != null && extras.getBoolean("show_stories");
                boolean z9 = extras != null && extras.getBoolean("show_stories_force");
                if (!z8 || z9) {
                    List list = (List) ((qc2) r1.G().g.getValue()).h.X.getValue();
                    if (list != null) {
                        int i5 = MainActivity.y1;
                        r1.f0(list, true);
                    }
                } else {
                    r1.f0(((xm4) r1.G().x.X.getValue()).d, false);
                }
                return dn8Var;
            case 8:
                MainActivity mainActivity6 = this.i0;
                c71 c71Var7 = c71.X;
                boolean z10 = this.h0;
                if (!z10) {
                    w39.n0(obj);
                    xe2 xe2VarT = w51.t(new o(mainActivity6.G().x, (byte) 7));
                    yk4 yk4Var2 = new yk4(mainActivity6, (byte) 1);
                    this.h0 = true;
                    if (xe2VarT.a(yk4Var2, this) == c71Var7) {
                        return c71Var7;
                    }
                } else {
                    if (!z10) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 9:
                c71 c71Var8 = c71.X;
                boolean z11 = this.h0;
                if (!z11) {
                    w39.n0(obj);
                    MainActivity mainActivity7 = this.i0;
                    wj4 wj4Var = new wj4(mainActivity7, q51Var, b);
                    this.h0 = true;
                    if (u15.L(mainActivity7, wj4Var, this) == c71Var8) {
                        return c71Var8;
                    }
                } else {
                    if (!z11) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                MainActivity mainActivity8 = this.i0;
                c71 c71Var9 = c71.X;
                boolean z12 = this.h0;
                if (!z12) {
                    w39.n0(obj);
                    if (!mainActivity8.G().p.isEmpty()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = mainActivity8.G().p;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            String strD = ((SubId) ((qg5) obj2).X).d();
                            HappApplication happApplication = HappApplication.M0;
                            qs7 qs7VarA = k32.i().h().a(strD);
                            if (qs7VarA != null && qs7VarA.b) {
                                arrayList.add(obj2);
                            }
                        }
                        int size = arrayList.size();
                        this.h0 = true;
                        if (mainActivity8.m0(arrayList, 0, size, this) == c71Var9) {
                            return c71Var9;
                        }
                    }
                } else {
                    if (!z12) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                int i6 = MainActivity.y1;
                if (!((Collection) mainActivity8.G().H.X.getValue()).isEmpty()) {
                    HappApplication.P0 = false;
                    mainActivity8.m1.set(true);
                    jm4.Q(ys0.z(((ComponentActivity) mainActivity8).X), (u61) null, new wj4(mainActivity8, q51Var, b2), 3);
                }
                return dn8.a;
            case 11:
                c71 c71Var10 = c71.X;
                boolean z13 = this.h0;
                if (!z13) {
                    w39.n0(obj);
                    MainViewModel mainViewModelG = this.i0.G();
                    gn4 gn4Var = gn4.a;
                    this.h0 = true;
                    if (mainViewModelG.z(gn4Var, this) == c71Var10) {
                        return c71Var10;
                    }
                } else {
                    if (!z13) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 12:
                c71 c71Var11 = c71.X;
                boolean z14 = this.h0;
                if (!z14) {
                    w39.n0(obj);
                    MainViewModel mainViewModelG2 = this.i0.G();
                    hn4 hn4Var = hn4.a;
                    this.h0 = true;
                    if (mainViewModelG2.z(hn4Var, this) == c71Var11) {
                        return c71Var11;
                    }
                } else {
                    if (!z14) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 13:
                c71 c71Var12 = c71.X;
                boolean z15 = this.h0;
                if (!z15) {
                    w39.n0(obj);
                    MainActivity mainActivity9 = this.i0;
                    this.h0 = true;
                    int i7 = MainActivity.y1;
                    if (mainActivity9.l0(this) == c71Var12) {
                        return c71Var12;
                    }
                } else {
                    if (!z15) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 14:
                MainActivity mainActivity10 = this.i0;
                c71 c71Var13 = c71.X;
                boolean z16 = this.h0;
                if (!z16) {
                    w39.n0(obj);
                    xe2 xe2VarT2 = w51.t(new qg2(mainActivity10.G().H, w51.t(new o(mainActivity10.G().x, (byte) 8)), new dl4(3, (q51) null, (byte) 0), (byte) 0));
                    el4 el4Var = new el4(mainActivity10, q51Var, b4);
                    this.h0 = true;
                    if (z91.n(xe2VarT2, el4Var, this) == c71Var13) {
                        return c71Var13;
                    }
                } else {
                    if (!z16) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 15:
                MainActivity mainActivity11 = this.i0;
                c71 c71Var14 = c71.X;
                boolean z17 = this.h0;
                if (!z17) {
                    w39.n0(obj);
                    xe2 xe2VarT3 = w51.t(new o(mainActivity11.G().x, (byte) 9));
                    el4 el4Var2 = new el4(mainActivity11, q51Var, b5);
                    this.h0 = true;
                    if (z91.n(xe2VarT3, el4Var2, this) == c71Var14) {
                        return c71Var14;
                    }
                } else {
                    if (!z17) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 16:
                c71 c71Var15 = c71.X;
                boolean z18 = this.h0;
                if (!z18) {
                    w39.n0(obj);
                    MainActivity mainActivity12 = this.i0;
                    wj4 wj4Var2 = new wj4(mainActivity12, q51Var, (byte) 15);
                    this.h0 = true;
                    if (u15.L(mainActivity12, wj4Var2, this) == c71Var15) {
                        return c71Var15;
                    }
                } else {
                    if (!z18) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 17:
                boolean z19 = this.h0;
                w39.n0(obj);
                if (!z19) {
                    MainActivity mainActivity13 = this.i0;
                    int i8 = MainActivity.y1;
                    mainActivity13.C();
                }
                return dn8.a;
            case 18:
                MainActivity mainActivity14 = this.i0;
                c71 c71Var16 = c71.X;
                boolean z20 = this.h0;
                if (!z20) {
                    w39.n0(obj);
                    xe2 xe2VarT4 = w51.t(new o(mainActivity14.G().x, (byte) 10));
                    wj4 wj4Var3 = new wj4(mainActivity14, q51Var, (byte) 17);
                    this.h0 = true;
                    if (z91.n(xe2VarT4, wj4Var3, this) == c71Var16) {
                        return c71Var16;
                    }
                } else {
                    if (!z20) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 19:
                boolean z21 = this.h0;
                w39.n0(obj);
                b6 b6Var9 = this.i0.Q0;
                if (b6Var9 != null) {
                    rp7.e(b6Var9.h0, z21);
                    return dn8.a;
                }
                dh3.T("binding");
                throw null;
            case 20:
                MainActivity mainActivity15 = this.i0;
                c71 c71Var17 = c71.X;
                boolean z22 = this.h0;
                if (!z22) {
                    w39.n0(obj);
                    xe2 xe2VarT5 = w51.t(new o(mainActivity15.G().x, (byte) 11));
                    wj4 wj4Var4 = new wj4(mainActivity15, q51Var, (byte) 19);
                    this.h0 = true;
                    if (z91.n(xe2VarT5, wj4Var4, this) == c71Var17) {
                        return c71Var17;
                    }
                } else {
                    if (!z22) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                c71 c71Var18 = c71.X;
                boolean z23 = this.h0;
                if (!z23) {
                    w39.n0(obj);
                    MainActivity mainActivity16 = this.i0;
                    wj4 wj4Var5 = new wj4(mainActivity16, q51Var, (byte) 20);
                    this.h0 = true;
                    if (u15.L(mainActivity16, wj4Var5, this) == c71Var18) {
                        return c71Var18;
                    }
                } else {
                    if (!z23) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 22:
                c71 c71Var19 = c71.X;
                boolean z24 = this.h0;
                if (!z24) {
                    w39.n0(obj);
                    MainActivity mainActivity17 = this.i0;
                    wj4 wj4Var6 = new wj4(mainActivity17, q51Var, (byte) 14);
                    this.h0 = true;
                    if (u15.L(mainActivity17, wj4Var6, this) == c71Var19) {
                        return c71Var19;
                    }
                } else {
                    if (!z24) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 23:
                dn8 dn8Var2 = dn8.a;
                c71 c71Var20 = c71.X;
                boolean z25 = this.h0;
                if (!z25) {
                    w39.n0(obj);
                    MainViewModel mainViewModelG3 = this.i0.G();
                    this.h0 = true;
                    Object objN = z91.n(((qc2) mainViewModelG3.g.getValue()).g, new yn4(mainViewModelG3, null, (byte) 0), this);
                    if (objN != c71Var20) {
                        objN = dn8Var2;
                    }
                    if (objN == c71Var20) {
                        return c71Var20;
                    }
                } else {
                    if (!z25) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var2;
            case 24:
                c71 c71Var21 = c71.X;
                boolean z26 = this.h0;
                if (!z26) {
                    w39.n0(obj);
                    MainActivity mainActivity18 = this.i0;
                    wj4 wj4Var7 = new wj4(mainActivity18, q51Var, (byte) 23);
                    this.h0 = true;
                    if (u15.L(mainActivity18, wj4Var7, this) == c71Var21) {
                        return c71Var21;
                    }
                } else {
                    if (!z26) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 25:
                MainActivity mainActivity19 = this.i0;
                c71 c71Var22 = c71.X;
                boolean z27 = this.h0;
                if (!z27) {
                    w39.n0(obj);
                    xe2 xe2VarT6 = w51.t(new o(mainActivity19.G().x, (byte) 12));
                    el4 el4Var3 = new el4(mainActivity19, q51Var, b2);
                    this.h0 = true;
                    if (z91.n(xe2VarT6, el4Var3, this) == c71Var22) {
                        return c71Var22;
                    }
                } else {
                    if (!z27) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 26:
                c71 c71Var23 = c71.X;
                boolean z28 = this.h0;
                if (!z28) {
                    w39.n0(obj);
                    MainActivity mainActivity20 = this.i0;
                    wj4 wj4Var8 = new wj4(mainActivity20, q51Var, (byte) 25);
                    this.h0 = true;
                    if (u15.L(mainActivity20, wj4Var8, this) == c71Var23) {
                        return c71Var23;
                    }
                } else {
                    if (!z28) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            case 27:
                MainActivity mainActivity21 = this.i0;
                c71 c71Var24 = c71.X;
                boolean z29 = this.h0;
                if (!z29) {
                    w39.n0(obj);
                    mh7 mh7Var = (mh7) mainActivity21.G().y.getValue();
                    y9 y9Var = new y9(mainActivity21, (q51) null, (byte) 10);
                    mh7Var.getClass();
                    this.h0 = true;
                    if (z91.n(mh7Var, y9Var, this) == c71Var24) {
                        return c71Var24;
                    }
                } else {
                    if (!z29) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 28:
                c71 c71Var25 = c71.X;
                boolean z30 = this.h0;
                if (!z30) {
                    w39.n0(obj);
                    MainActivity mainActivity22 = this.i0;
                    wj4 wj4Var9 = new wj4(mainActivity22, q51Var, (byte) 27);
                    this.h0 = true;
                    if (u15.L(mainActivity22, wj4Var9, this) == c71Var25) {
                        return c71Var25;
                    }
                } else {
                    if (!z30) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                MainActivity mainActivity23 = this.i0;
                c71 c71Var26 = c71.X;
                boolean z31 = this.h0;
                if (!z31) {
                    w39.n0(obj);
                    h76 h76Var = mainActivity23.G().D;
                    el4 el4Var4 = new el4(mainActivity23, q51Var, b3);
                    h76Var.getClass();
                    this.h0 = true;
                    if (z91.n(h76Var, el4Var4, this) == c71Var26) {
                        return c71Var26;
                    }
                } else {
                    if (!z31) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj4(MainActivity mainActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainActivity;
    }
}
