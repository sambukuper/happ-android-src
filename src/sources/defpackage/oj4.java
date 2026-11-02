package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.ComponentActivity;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class oj4 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ oj4(MainActivity mainActivity, byte b) {
        this.X = b;
        this.Y = mainActivity;
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
        String string;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ComponentActivity componentActivity = this.Y;
        switch (b) {
            case 0:
                int i = MainActivity.y1;
                if (!((Boolean) obj).booleanValue()) {
                    String string2 = componentActivity.getString(y46.toast_permission_denied, componentActivity.getString(y46.permission_notifications));
                    string2.getClass();
                    String string3 = componentActivity.getString(y46.toast_permission_denied_open_settings);
                    string3.getClass();
                    pu.N(componentActivity, string2, i21.K(new ay2(string3, componentActivity.getDrawable(q36.ic_settings_12dp), new mj4(componentActivity, (byte) 5))), 4);
                }
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                l69 l69Var = (l69) obj;
                int i2 = MainActivity.y1;
                if (l69Var instanceof j69) {
                    ss8 ss8Var = ss8.a;
                    string = ((j69) l69Var).X;
                    if (mm7.Z(fm7.S0(string).toString(), false, "net/http: TLS handshake")) {
                        string = componentActivity.getString(y46.connection_test_error_tls_handshake);
                        string.getClass();
                    } else if (mm7.Z(fm7.S0(string).toString(), false, "io: read/write on closed pipe")) {
                        string = componentActivity.getString(y46.connection_test_error_eof);
                        string.getClass();
                    }
                } else {
                    if (!(l69Var instanceof k69)) {
                        b61.c();
                        return null;
                    }
                    string = componentActivity.getString(y46.connection_test_available, Long.valueOf(((k69) l69Var).X));
                    string.getClass();
                }
                og7 og7Var = componentActivity.c1;
                if (og7Var != null) {
                    og7Var.m((CancellationException) null);
                }
                u84 u84VarZ = ys0.z(componentActivity.X);
                nf1 nf1Var = tp1.a;
                componentActivity.c1 = jm4.Q(u84VarZ, dm4.a, new fk4(componentActivity, string, null, (byte) 6), 2);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                om4 om4Var = (om4) obj;
                int i3 = MainActivity.y1;
                int i4 = om4Var == null ? -1 : tj4.a[om4Var.ordinal()];
                if (i4 == 1) {
                    ss8 ss8Var2 = ss8.a;
                    qe4.L0(componentActivity, "su.happ.proxyutility.action.service", 42, "");
                } else if (i4 != 2 && i4 != 3 && i4 != 4 && i4 != 5) {
                    b61.c();
                    return null;
                }
                return dn8Var;
            default:
                int i5 = MainActivity.y1;
                if (((Boolean) obj).booleanValue()) {
                    componentActivity.x1.h0(new Intent((Context) componentActivity, (Class<?>) ScannerActivity.class));
                } else {
                    String string4 = componentActivity.getString(y46.toast_permission_denied, componentActivity.getString(y46.permission_camera));
                    string4.getClass();
                    String string5 = componentActivity.getString(y46.toast_permission_denied_open_settings);
                    string5.getClass();
                    pu.N(componentActivity, string4, i21.K(new ay2(string5, componentActivity.getDrawable(q36.ic_settings_12dp), new mj4(componentActivity, (byte) 11))), 4);
                }
                return dn8Var;
        }
    }
}
