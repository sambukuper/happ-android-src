package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ComponentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.gson.a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class el4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ MainActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el4(MainActivity mainActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (qg5) obj).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n((q51) obj2, (ServerConfig) obj).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                n((q51) obj2, (qm4) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (Long) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        MainActivity mainActivity = this.i0;
        switch (b) {
            case 0:
                el4 el4Var = new el4(mainActivity, q51Var, (byte) 0);
                el4Var.h0 = obj;
                return el4Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                el4 el4Var2 = new el4(mainActivity, q51Var, (byte) 1);
                el4Var2.h0 = obj;
                return el4Var2;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                el4 el4Var3 = new el4(mainActivity, q51Var, (byte) 2);
                el4Var3.h0 = obj;
                return el4Var3;
            default:
                el4 el4Var4 = new el4(mainActivity, q51Var, (byte) 3);
                el4Var4.h0 = obj;
                return el4Var4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final Object q(Object obj) {
        int length;
        byte b = this.g0;
        MainActivity mainActivity = this.i0;
        dn8 dn8Var = dn8.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                qg5 qg5Var = (qg5) this.h0;
                w39.n0(obj);
                List list = (List) qg5Var.X;
                a45 a45Var = (a45) qg5Var.Y;
                ComponentActivity componentActivity = this.i0;
                g94 g94Var = componentActivity.X;
                componentActivity.G().A();
                q51 q51Var = null;
                if (!((xm4) componentActivity.G().x.X.getValue()).e) {
                    b6 b6Var = componentActivity.Q0;
                    if (b6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView = b6Var.I0;
                    if (appCompatTextView != null) {
                        appCompatTextView.setVisibility(8);
                    }
                }
                u84 u84VarZ = ys0.z(g94Var);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new qk4(componentActivity, list, a45Var, (q51) null, (byte) 0), 2);
                boolean zIsEmpty = list.isEmpty();
                if (!componentActivity.G().u() && !((xm4) componentActivity.G().x.X.getValue()).q) {
                    componentActivity.b0(false);
                }
                if (zIsEmpty) {
                    b6 b6Var2 = componentActivity.Q0;
                    if (b6Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ConstraintLayout constraintLayout = b6Var2.v0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    b6 b6Var3 = componentActivity.Q0;
                    if (b6Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var3.Y.setVisibility(0);
                    b6 b6Var4 = componentActivity.Q0;
                    if (b6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var4.J0.setVisibility(0);
                    b6 b6Var5 = componentActivity.Q0;
                    if (b6Var5 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var5.y0.setVisibility(0);
                    b6 b6Var6 = componentActivity.Q0;
                    if (b6Var6 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var6.A0.postDelayed(new vl4(componentActivity, (byte) 0), 300L);
                    b6 b6Var7 = componentActivity.Q0;
                    if (b6Var7 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView2 = b6Var7.I0;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setVisibility(8);
                    }
                    b6 b6Var8 = componentActivity.Q0;
                    if (b6Var8 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView3 = b6Var8.L0;
                    if (appCompatTextView3 != null) {
                        appCompatTextView3.setVisibility(4);
                    }
                    componentActivity.a0();
                } else {
                    jm4.Q(ys0.z(g94Var), ye1.Z, new qk4((String) null, componentActivity, (q51) null), 2);
                    b6 b6Var9 = componentActivity.Q0;
                    if (b6Var9 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var9.J0.setVisibility(8);
                    b6 b6Var10 = componentActivity.Q0;
                    if (b6Var10 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var10.y0.setVisibility(8);
                    b6 b6Var11 = componentActivity.Q0;
                    if (b6Var11 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var11.Y.setVisibility(8);
                    b6 b6Var12 = componentActivity.Q0;
                    if (b6Var12 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var12.A0.postDelayed(new vl4(componentActivity, (byte) 1), 300L);
                    b6 b6Var13 = componentActivity.Q0;
                    if (b6Var13 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView4 = b6Var13.L0;
                    if (appCompatTextView4 != null) {
                        appCompatTextView4.setVisibility(componentActivity.G().u() ? 0 : 4);
                    }
                    componentActivity.a0();
                }
                if (ue3.y(componentActivity) && list.isEmpty()) {
                    componentActivity.G();
                    kw4 kw4Var = kw4.a;
                    String strI = kw4.h().i("HAPP_CONFIGS");
                    if (strI == null || fm7.o0(strI)) {
                        length = 0;
                    } else {
                        a aVar = yw2.c;
                        aVar.getClass();
                        length = ((Object[]) aVar.c(strI, new yi8(String[].class))).length;
                    }
                    if (length < 1) {
                        componentActivity.Z();
                    }
                }
                AtomicBoolean atomicBoolean = componentActivity.m1;
                if (HappApplication.P0 && !((Collection) componentActivity.G().H.X.getValue()).isEmpty() && !atomicBoolean.get()) {
                    HappApplication.P0 = false;
                    atomicBoolean.set(true);
                    jm4.Q(ys0.z(g94Var), (u61) null, new wj4(componentActivity, q51Var, b2), 3);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ServerConfig serverConfig = (ServerConfig) this.h0;
                w39.n0(obj);
                b6 b6Var14 = mainActivity.Q0;
                if (b6Var14 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = b6Var14.x0;
                if (linearLayout != null) {
                    rp7.e(linearLayout, serverConfig != null);
                }
                if (serverConfig != null) {
                    HappApplication happApplication = HappApplication.M0;
                    qg5 qg5VarA = ((q72) k32.i().F0.getValue()).a(serverConfig.getRemarks());
                    CharSequence charSequence = (String) qg5VarA.X;
                    int iIntValue = ((Number) qg5VarA.Y).intValue();
                    b6 b6Var15 = mainActivity.Q0;
                    if (b6Var15 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    AppCompatTextView appCompatTextView5 = b6Var15.F0;
                    if (appCompatTextView5 != null) {
                        appCompatTextView5.setText(charSequence);
                    }
                    b6 b6Var16 = mainActivity.Q0;
                    if (b6Var16 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ShapeableImageView shapeableImageView = b6Var16.r0;
                    if (shapeableImageView != null) {
                        shapeableImageView.setImageResource(iIntValue);
                    }
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                qm4 qm4Var = (qm4) this.h0;
                w39.n0(obj);
                int iOrdinal = qm4Var.ordinal();
                if (iOrdinal == 0) {
                    b6 b6Var17 = mainActivity.Q0;
                    if (b6Var17 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    rp7.e(b6Var17.n0, false);
                } else if (iOrdinal == 1) {
                    b6 b6Var18 = mainActivity.Q0;
                    if (b6Var18 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    rp7.e(b6Var18.n0, true);
                    b6 b6Var19 = mainActivity.Q0;
                    if (b6Var19 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var19.n0.setImageResource(q36.ic_remote_message);
                } else {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    b6 b6Var20 = mainActivity.Q0;
                    if (b6Var20 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    rp7.e(b6Var20.n0, true);
                    b6 b6Var21 = mainActivity.Q0;
                    if (b6Var21 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    b6Var21.n0.setImageResource(q36.ic_remote_message_new);
                }
                return dn8Var;
            default:
                Long l = (Long) this.h0;
                w39.n0(obj);
                b6 b6Var22 = mainActivity.Q0;
                if (b6Var22 == null) {
                    dh3.T("binding");
                    throw null;
                }
                AppCompatTextView appCompatTextView6 = b6Var22.k0;
                kc6 kc6Var = zl7.a;
                appCompatTextView6.setText(zl7.a(l != null ? l.longValue() : 0L));
                return dn8Var;
        }
    }
}
