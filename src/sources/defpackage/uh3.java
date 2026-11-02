package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.LogFileInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh3 implements gn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ uh3(int i, e74 e74Var) {
        this.X = (byte) 7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        w03 w03Var;
        byte b = this.X;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 5;
        byte b5 = 2;
        boolean z = false;
        Context context = null;
        boolean z2 = true;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((vh3) obj).getClass();
                return dn8Var;
            case 1:
                ((j71) obj).getClass();
                yb6.a.b(ak3.class).E();
                Process.myPid();
                return new o05(z2);
            case 2:
                dt0 dt0Var = (dt0) obj;
                dt0Var.getClass();
                dt0Var.a("JsonPrimitive", new fo3(new ei3(b5)));
                dt0Var.a("JsonNull", new fo3(new ei3(b3)));
                dt0Var.a("JsonLiteral", new fo3(new ei3(b2)));
                dt0Var.a("JsonObject", new fo3(new ei3(b4)));
                dt0Var.a("JsonArray", new fo3(new ei3((byte) 6)));
                return dn8Var;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                ao3 ao3Var = (ao3) entry.getValue();
                StringBuilder sb = new StringBuilder();
                xl7.a(sb, str);
                sb.append(':');
                sb.append(ao3Var);
                return sb.toString();
            case 4:
                ((Integer) obj).getClass();
                return null;
            case 5:
                return dn8Var;
            case 6:
                List list = (List) obj;
                return new j74(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 7:
                return dn8Var;
            case 8:
                kl5 kl5Var = (kl5) obj;
                ox1 ox1Var = pc.b;
                kl5Var.getClass();
                for (Context baseContext = (Context) x97.S(kl5Var, ox1Var); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 9:
                md4 md4Var = (md4) obj;
                md4Var.getClass();
                z68.t(md4Var, 't');
                return dn8Var;
            case 10:
                md4 md4Var2 = (md4) obj;
                md4Var2.getClass();
                z68.t(md4Var2, 'T');
                return dn8Var;
            case 11:
                ((ac1) obj).getClass();
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ac1 ac1Var = (ac1) obj;
                ac1Var.getClass();
                z68.t(ac1Var, ':');
                ac1Var.c(dg5.Y);
                z68.v0(ac1Var, _UrlKt.FRAGMENT_ENCODE_SET, new uh3((byte) 13));
                return dn8Var;
            case 13:
                ac1 ac1Var2 = (ac1) obj;
                ac1Var2.getClass();
                z68.t(ac1Var2, '.');
                ((o3) ac1Var2).k(new c30(new ik2(1, 9)));
                return dn8Var;
            case 14:
                LogFileInfo logFileInfo = (LogFileInfo) obj;
                logFileInfo.getClass();
                return new qg5(logFileInfo, new File(logFileInfo.getPath()));
            case 15:
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                return Boolean.valueOf(((File) qg5Var.Y).exists());
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((Long) obj).getClass();
                return dn8Var;
            case 17:
                String str2 = (String) obj;
                str2.getClass();
                return str2.length() == 0 ? new hu(_UrlKt.FRAGMENT_ENCODE_SET, (byte) 5) : new hu(fm7.T0(str2, 4096, 4096, true), (byte) 1);
            case 18:
                go5 go5Var = (go5) obj;
                if (go5Var.t()) {
                    vi4 vi4Var = go5Var.Y;
                    if (!vi4Var.q0) {
                        gn2 gn2VarG = go5Var.X.g();
                        if (go5Var.X.f() != null) {
                            vi4Var.I0();
                        } else if (gn2VarG == null) {
                            vi4Var.j0 = null;
                            vi4Var.k0 = null;
                            vi4Var.i0 = null;
                            vi4Var.I0();
                        } else {
                            vi4Var.j0 = null;
                            vi4Var.k0 = null;
                            vi4Var.i0(go5Var, 9223372034707292159L, 0L);
                            vi4Var.i0 = gn2VarG;
                        }
                    }
                }
                return dn8Var;
            case 19:
                go5 go5Var2 = (go5) obj;
                if (go5Var2.t() && (w03Var = go5Var2.Z) != null) {
                    vi4 vi4Var2 = go5Var2.Y;
                    s05 s05Var = vi4Var2.t0;
                    t05 t05Var = s05Var != null ? (t05) s05Var.g(w03Var) : null;
                    if (t05Var != null) {
                        d7 d7Var = vi4Var2.s0;
                        if (d7Var != null) {
                            d7Var.K(w03Var);
                        }
                        vi4Var2.B0(t05Var);
                        t05Var.b();
                    }
                }
                return dn8Var;
            case 20:
                ((Long) obj).getClass();
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                qg5 qg5Var2 = (qg5) obj;
                int i = MainActivity.y1;
                qg5Var2.getClass();
                return Boolean.valueOf(((qs7) qg5Var2.X).c);
            case 22:
                qg5 qg5Var3 = (qg5) obj;
                int i2 = MainActivity.y1;
                qg5Var3.getClass();
                List listB = ((ConfigGroupCache) qg5Var3.Y).getConfigs();
                ArrayList arrayList = new ArrayList(xv0.Z(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new GuId(((ServerCache) it.next()).getGuid()));
                }
                return arrayList;
            case 23:
                PrintWriter printWriter = (PrintWriter) obj;
                int i3 = MainActivity.y1;
                printWriter.getClass();
                printWriter.println("Connection error from anti-filter");
                return dn8Var;
            case 24:
                p87 p87Var = (p87) obj;
                p87Var.getClass();
                int iOrdinal = p87Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                om4 om4Var = (om4) obj;
                int i4 = om4Var == null ? -1 : ln4.a[om4Var.ordinal()];
                if (i4 == 1) {
                    z = true;
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        z = true;
                    } else if (i4 != 4 && i4 != 5) {
                        b61.c();
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                yf8 yf8Var = (yf8) obj;
                yf8Var.getClass();
                SubscriptionItem subscriptionItem = (SubscriptionItem) yf8Var.Y;
                qs7 qs7Var = (qs7) yf8Var.Z;
                if (!dh3.f(subscriptionItem.getImport(), Boolean.FALSE) && (qs7Var == null || !qs7Var.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                kn3 kn3Var = (kn3) obj;
                kn3Var.getClass();
                kn3Var.b = true;
                kn3Var.a = true;
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return Boolean.TRUE;
            default:
                d17.f((f17) obj);
                return dn8Var;
        }
    }

    public /* synthetic */ uh3(byte b) {
        this.X = b;
    }

    public /* synthetic */ uh3(ak3 ak3Var) {
        this.X = (byte) 1;
    }
}
