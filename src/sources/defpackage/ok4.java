package defpackage;

import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ok4 extends no2 implements gn2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ MainActivity Y;
    public final /* synthetic */ SubscriptionItem Z;
    public final /* synthetic */ Boolean f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ g83 l0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok4(boolean z, MainActivity mainActivity, SubscriptionItem subscriptionItem, Boolean bool, boolean z2, String str, boolean z3, String str2, boolean z4, g83 g83Var) {
        super(1, ch3.class, "onConfigTextError", "importConfigViaSub_G_TNPe4$onConfigTextError(ZLsu/happ/proxyutility/feature/main/MainActivity;Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/lang/String;ZLsu/happ/proxyutility/interfaces/ImportConfigViaSubResultListener;Ljava/lang/Throwable;)V", 0);
        this.X = z;
        this.Y = mainActivity;
        this.Z = subscriptionItem;
        this.f0 = bool;
        this.g0 = z2;
        this.h0 = str;
        this.i0 = z3;
        this.j0 = str2;
        this.k0 = z4;
        this.l0 = g83Var;
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
    public final Object B(Object obj) {
        Boolean boolValueOf;
        qr7 qr7Var = (Throwable) obj;
        qr7Var.getClass();
        int i = MainActivity.y1;
        boolean z = qr7Var instanceof qr7;
        boolean z2 = this.X;
        FragmentActivity fragmentActivity = this.Y;
        SubscriptionItem subscriptionItem = this.Z;
        if (z) {
            if (!z2) {
                m51 m51Var = ko1.B1;
                km4.x(fragmentActivity.n());
            }
            MetaParams metaParams = subscriptionItem.getMetaParams();
            if (metaParams != null) {
                Map fragmentBean = metaParams.getFragmentBean();
                boolValueOf = Boolean.valueOf(!eu.q0(new Object[]{fragmentBean != null ? new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean) : null, metaParams.getResolveAddress(), metaParams.getHost(), metaParams.getInsecure()}).isEmpty());
            } else {
                boolValueOf = null;
            }
            q23 q23Var = (dh3.f(boolValueOf, Boolean.TRUE) && subscriptionItem.b0()) ? q23.f0 : qr7Var.X;
            u84 u84VarZ = ys0.z(((ComponentActivity) fragmentActivity).X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, dm4.a, new k(fragmentActivity, q23Var, (q51) null, (byte) 20), 2);
        } else {
            boolean z3 = qr7Var instanceof SSLHandshakeException;
            boolean z4 = this.g0;
            if (z3) {
                if (dh3.f(this.f0, Boolean.TRUE)) {
                    if (!z2) {
                        m51 m51Var2 = ko1.B1;
                        km4.l0(fragmentActivity.n(), jo1.h0, (String) null);
                    }
                } else if (!z2) {
                    u84 u84VarH = i21.H(fragmentActivity);
                    nf1 nf1Var2 = tp1.a;
                    jm4.Q(u84VarH, dm4.a, new mk4(fragmentActivity, this.h0, subscriptionItem, this.i0, z4, this.j0, z2, this.k0, this.l0, null), 2);
                }
            } else if ((qr7Var instanceof SocketTimeoutException) || (qr7Var instanceof ConnectException) || (qr7Var instanceof InterruptedIOException)) {
                if (!z2) {
                    m51 m51Var3 = ko1.B1;
                    km4.l0(fragmentActivity.n(), jo1.f0, (String) null);
                }
            } else if (qr7Var instanceof IOException) {
                if (!z2) {
                    m51 m51Var4 = ko1.B1;
                    km4.l0(fragmentActivity.n(), jo1.g0, ((IOException) qr7Var).getLocalizedMessage());
                }
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new n72(qr7Var, (byte) 1));
            } else if (!z2) {
                m51 m51Var5 = ko1.B1;
                km4.x(fragmentActivity.n());
                fragmentActivity.W(new ImportResult(0, r83.a, null, 5), z4, true);
            }
        }
        ss8 ss8Var = ss8.a;
        fragmentActivity.getClass();
        qe4.L0(fragmentActivity, "su.happ.proxyutility.action.service", 42, "");
        return dn8.a;
    }
}
