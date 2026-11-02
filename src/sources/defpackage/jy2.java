package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.textclassifier.TextClassifier;
import androidx.compose.material.ripple.RippleNode;
import com.google.gson.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ImportResult;
import su.happ.proxyutility.dto.ProfileRoutingSettings;
import su.happ.proxyutility.dto.ServerAffiliationInfo;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SocketServerInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.ui.ScScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jy2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(boolean z, px2 px2Var, y05 y05Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 1;
        this.h0 = z;
        this.i0 = px2Var;
        this.j0 = y05Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 2:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 6:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 13:
                return ((jy2) n((q51) obj2, (w35) obj)).q(dn8Var);
            case 14:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                return ((jy2) n((q51) obj2, (j2) obj)).q(dn8Var);
            case 18:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 20:
                ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 22:
                return ((jy2) n((q51) obj2, (kk0) obj)).q(dn8Var);
            case 23:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 26:
                ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 27:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((jy2) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                jy2 jy2Var = new jy2(obj2, q51Var, (byte) 0);
                jy2Var.i0 = obj;
                return jy2Var;
            case 1:
                return new jy2(this.h0, (px2) this.i0, (y05) obj2, q51Var);
            case 2:
                return new jy2(this.i0, obj2, q51Var, (byte) 2);
            case 3:
                return new jy2(this.i0, obj2, q51Var, (byte) 3);
            case 4:
                return new jy2(this.i0, obj2, q51Var, (byte) 4);
            case 5:
                return new jy2(this.i0, obj2, q51Var, (byte) 5);
            case 6:
                return new jy2(obj2, q51Var, (byte) 6);
            case 7:
                return new jy2(this.i0, obj2, q51Var, (byte) 7);
            case 8:
                return new jy2(this.i0, obj2, q51Var, (byte) 8);
            case 9:
                return new jy2(this.i0, obj2, q51Var, (byte) 9);
            case 10:
                return new jy2(this.i0, obj2, q51Var, (byte) 10);
            case 11:
                return new jy2(obj2, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return new jy2(this.i0, obj2, q51Var, (byte) 12);
            case 13:
                jy2 jy2Var2 = new jy2(obj2, q51Var, (byte) 13);
                jy2Var2.i0 = obj;
                return jy2Var2;
            case 14:
                return new jy2(this.i0, obj2, q51Var, (byte) 14);
            case 15:
                return new jy2(this.i0, obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                jy2 jy2Var3 = new jy2(obj2, q51Var, (byte) 16);
                jy2Var3.i0 = obj;
                return jy2Var3;
            case 17:
                jy2 jy2Var4 = new jy2(obj2, q51Var, (byte) 17);
                jy2Var4.i0 = obj;
                return jy2Var4;
            case 18:
                return new jy2(this.i0, obj2, q51Var, (byte) 18);
            case 19:
                return new jy2(this.i0, obj2, q51Var, (byte) 19);
            case 20:
                return new jy2(this.i0, obj2, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new jy2(this.i0, obj2, q51Var, (byte) 21);
            case 22:
                jy2 jy2Var5 = new jy2(obj2, q51Var, (byte) 22);
                jy2Var5.i0 = obj;
                return jy2Var5;
            case 23:
                return new jy2((fu6) obj2, this.i0, q51Var);
            case 24:
                jy2 jy2Var6 = new jy2(obj2, q51Var, (byte) 24);
                jy2Var6.i0 = obj;
                return jy2Var6;
            case 25:
                return new jy2(this.i0, obj2, q51Var, (byte) 25);
            case 26:
                return new jy2(this.i0, obj2, q51Var, (byte) 26);
            case 27:
                return new jy2(this.i0, obj2, q51Var, (byte) 27);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new jy2(this.i0, obj2, q51Var, (byte) 28);
            default:
                return new jy2(this.i0, obj2, q51Var, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:324:0x067c  */
    /* JADX WARN: Code duplicated, block: B:335:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, s61] */
    /* JADX WARN: Type inference failed for: r1v52, types: [bm3] */
    /* JADX WARN: Type inference failed for: r1v55, types: [bm3] */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hv2] */
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
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Object objX;
        oh2 oh2Var;
        Object objQ;
        ServerCache serverCache;
        long jLongValue;
        long jLongValue2;
        Long lB;
        Long lB2;
        Long lB3;
        Object objQ2;
        Object rj6Var;
        MainViewModel mainViewModelG;
        Object objR;
        Object objH;
        Object objR2;
        Object objW;
        Object value;
        Object objE;
        Object objE2;
        byte b = this.g0;
        ?? r1 = this.Y;
        byte b2 = 7;
        byte b3 = 6;
        byte b4 = 2;
        byte b5 = 10;
        byte b6 = 3;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        Object obj2 = this.j0;
        byte b7 = 1;
        q51 q51Var = null;
        switch (b) {
            case 0:
                b71 b71Var = (b71) this.i0;
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                j31 j31VarL = w51.L(new tb2((ky2) obj2, b2));
                q0 q0Var = new q0((Object) b71Var, q51Var, (byte) 29);
                this.i0 = null;
                this.h0 = true;
                return z91.n(j31VarL, q0Var, this) == c71Var ? c71Var : dn8Var;
            case 1:
                w39.n0(obj);
                boolean z2 = this.h0;
                px2 px2Var = (px2) this.i0;
                if (z2) {
                    y24 y24Var = (y24) ((y05) obj2).getValue();
                    y24 y24Var2 = (y24) px2Var.c.getValue();
                    if (y24Var2 != null && y24Var != null && y24Var2.g() && y24Var.g()) {
                        px2Var.b.setValue(y24Var2.H(y24Var, true));
                    }
                    px2Var.a.setValue(Boolean.TRUE);
                } else {
                    px2Var.a.setValue(Boolean.FALSE);
                    px2Var.b.setValue(null);
                }
                return dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    return ((za3) this.i0).e().e((zo8) obj2, this) == c71Var ? c71Var : dn8Var;
                }
                if (!z3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                Object obj3 = ((sj6) obj).X;
                return dn8Var;
            case 3:
                uh3 uh3Var = (uh3) obj2;
                ml2 ml2Var = (ml2) this.i0;
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                qk2 qk2VarE = ml2Var.E("InvalidSystemTimeDialogFragment");
                if (!(qk2VarE instanceof vh3)) {
                    vh3 vh3Var = new vh3();
                    d8.Z(ml2Var, vh3Var, "InvalidSystemTimeDialogFragment");
                    uh3Var.B(vh3Var);
                    return dn8Var;
                }
                vh3 vh3Var2 = (vh3) qk2VarE;
                g94 g94Var = vh3Var2.S0;
                g94Var.getClass();
                nf1 nf1Var = tp1.a;
                ?? r4 = dm4.a.h0;
                r1.getClass();
                boolean zB1 = r4.b1(r1);
                if (!zB1) {
                    o84 o84Var = g94Var.i;
                    if (o84Var == o84.X) {
                        throw new v84(null);
                    }
                    if (o84Var.compareTo(o84.g0) >= 0) {
                        uh3Var.B(qk2VarE);
                        return dn8Var;
                    }
                }
                c3 c3Var = new c3((Object) uh3Var, (Object) vh3Var2, (byte) 15);
                this.h0 = true;
                return s08.h(g94Var, zB1, r4, c3Var, this) == c71Var ? c71Var : dn8Var;
            case 4:
                ak3 ak3Var = (ak3) this.i0;
                ThreadLocal threadLocal = ak3Var.b;
                boolean z5 = this.h0;
                try {
                    if (z5) {
                        if (!z5) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                        objX = obj;
                        o05 o05Var = (o05) objX;
                        threadLocal.set(Boolean.FALSE);
                        return o05Var;
                    }
                    w39.n0(obj);
                    Object obj4 = threadLocal.get();
                    Boolean bool = Boolean.TRUE;
                    if (dh3.f(obj4, bool)) {
                        bt.i("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool);
                    na1 na1Var = ak3Var.c;
                    w81 w81Var = new w81((gn2) obj2, q51Var, b4);
                    this.h0 = true;
                    objX = wl7.x(na1Var, w81Var, this);
                    if (objX == c71Var) {
                        return c71Var;
                    }
                    o05 o05Var2 = (o05) objX;
                    threadLocal.set(Boolean.FALSE);
                    return o05Var2;
                } catch (Throwable th) {
                    threadLocal.set(Boolean.FALSE);
                    throw th;
                }
            case 5:
                boolean z6 = this.h0;
                if (z6) {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                r77 r77Var = (r77) this.i0;
                k kVar = new k((Activity) obj2, q51Var, (byte) 18);
                r77Var.getClass();
                this.h0 = true;
                if (z91.n(r77Var, kVar, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 6:
                y05 y05Var = (y05) obj2;
                boolean z7 = this.h0;
                if (!z7) {
                    w39.n0(obj);
                    oh2Var = (oh2) y05Var.getValue();
                    if (oh2Var != null) {
                        uh3 uh3Var2 = new uh3((byte) 16);
                        this.i0 = oh2Var;
                        this.h0 = true;
                        r1.getClass();
                        if (z68.H(r1).a(uh3Var2, this) == c71Var) {
                            return c71Var;
                        }
                    }
                    y05Var.setValue(null);
                    return dn8Var;
                }
                if (!z7) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oh2Var = (oh2) this.i0;
                w39.n0(obj);
                oh2.a(oh2Var);
                y05Var.setValue(null);
                return dn8Var;
            case 7:
                boolean z8 = this.h0;
                if (z8) {
                    if (z8) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                th4 th4Var = (th4) this.i0;
                lf4 lf4Var = (lf4) obj2;
                lf4Var.getClass();
                vf4 vf4Var = new vf4(lf4Var);
                this.h0 = true;
                Object objL = th4Var.f.l(vf4Var, this);
                if (objL != c71Var) {
                    objL = dn8Var;
                }
                return objL == c71Var ? c71Var : dn8Var;
            case 8:
                boolean z9 = this.h0;
                if (z9) {
                    if (z9) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ci4 ci4Var = (ci4) this.i0;
                this.h0 = true;
                Object objL2 = ci4Var.e.l((tg4) obj2, this);
                if (objL2 != c71Var) {
                    objL2 = dn8Var;
                }
                return objL2 == c71Var ? c71Var : dn8Var;
            case 9:
                MainActivity mainActivity = (MainActivity) this.i0;
                boolean z10 = this.h0;
                if (z10) {
                    if (z10) {
                        w39.n0(obj);
                        objQ = obj;
                    } else {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                w39.n0(obj);
                MainViewModel mainViewModelG2 = mainActivity.G();
                this.h0 = true;
                objQ = gv3.q(new j31(new o(mainViewModelG2.H, (byte) 14), b3), this);
                if (objQ == c71Var) {
                    return c71Var;
                }
                ConfigGroupCache configGroupCache = (ConfigGroupCache) objQ;
                if (configGroupCache == null) {
                    return dn8Var;
                }
                int i = ek4.a[((SubscriptionAutoConnectType) obj2).ordinal()];
                if (i == 1) {
                    bt.i("Last used is unreachable");
                } else if (i == 2) {
                    Iterator it = configGroupCache.getConfigs().iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            MainViewModel mainViewModelG3 = mainActivity.G();
                            String strD = ((ServerCache) next).getGuid();
                            strD.getClass();
                            ServerAffiliationInfo serverAffiliationInfoC = mainViewModelG3.o().c(strD);
                            if (serverAffiliationInfoC == null || (lB2 = serverAffiliationInfoC.getTestDelayMillis()) == null) {
                                jLongValue = Long.MAX_VALUE;
                            } else {
                                if (lB2.longValue() == -1) {
                                    lB2 = null;
                                }
                                if (lB2 != null) {
                                    jLongValue = lB2.longValue();
                                } else {
                                    jLongValue = Long.MAX_VALUE;
                                }
                            }
                            do {
                                Object next2 = it.next();
                                MainViewModel mainViewModelG4 = mainActivity.G();
                                String strD2 = ((ServerCache) next2).getGuid();
                                strD2.getClass();
                                ServerAffiliationInfo serverAffiliationInfoC2 = mainViewModelG4.o().c(strD2);
                                if (serverAffiliationInfoC2 == null || (lB = serverAffiliationInfoC2.getTestDelayMillis()) == null) {
                                    jLongValue2 = Long.MAX_VALUE;
                                } else {
                                    if (lB.longValue() == -1) {
                                        lB = null;
                                    }
                                    if (lB != null) {
                                        jLongValue2 = lB.longValue();
                                    } else {
                                        jLongValue2 = Long.MAX_VALUE;
                                    }
                                }
                                if (jLongValue > jLongValue2) {
                                    next = next2;
                                    jLongValue = jLongValue2;
                                }
                            } while (it.hasNext());
                        }
                        serverCache = (ServerCache) next;
                        int i2 = MainActivity.y1;
                        mainActivity.B(serverCache);
                        return dn8Var;
                    }
                    bt.n();
                } else {
                    if (i == 3) {
                        List listB = configGroupCache.getConfigs();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : listB) {
                            MainViewModel mainViewModelG5 = mainActivity.G();
                            String strD3 = ((ServerCache) obj5).getGuid();
                            strD3.getClass();
                            ServerAffiliationInfo serverAffiliationInfoC3 = mainViewModelG5.o().c(strD3);
                            if (serverAffiliationInfoC3 == null || (lB3 = serverAffiliationInfoC3.getTestDelayMillis()) == null || lB3.longValue() == -1) {
                                lB3 = null;
                            }
                            if (lB3 != null) {
                                arrayList.add(obj5);
                            }
                        }
                        List listA1 = wv0.a1(arrayList);
                        Collections.shuffle(listA1);
                        serverCache = (ServerCache) wv0.t0(listA1);
                        if (serverCache == null) {
                            serverCache = (ServerCache) wv0.r0(configGroupCache.getConfigs());
                        }
                        int i3 = MainActivity.y1;
                        mainActivity.B(serverCache);
                        return dn8Var;
                    }
                    b61.c();
                }
                return null;
            case 10:
                MainActivity mainActivity2 = (MainActivity) this.i0;
                boolean z11 = this.h0;
                if (!z11) {
                    w39.n0(obj);
                    xe2 xe2Var = mainActivity2.G().I;
                    this.h0 = true;
                    objQ2 = gv3.q(xe2Var, this);
                    if (objQ2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z11) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objQ2 = obj;
                }
                if (!((Boolean) objQ2).booleanValue()) {
                    be.m(mainActivity2, mainActivity2.getString(y46.toast_failure), mainActivity2.getString(y46.send_to_tv_err_no_subs), null, mainActivity2.getString(R.string.ok), null, new Integer(t46.dialog_alert_warning), null, null, 1874);
                    return dn8Var;
                }
                ml2 ml2VarN = mainActivity2.n();
                String str = ((k83) obj2).a;
                Iterable iterable = (List) mainActivity2.G().H.X.getValue();
                if (iterable == null) {
                    iterable = d02.X;
                }
                Iterable iterable2 = iterable;
                Integer num = new Integer(e46.fragment_container_view);
                try {
                    rj6Var = (SocketServerInfo) new a().c(str, new yi8(SocketServerInfo.class));
                    break;
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var = new rj6(th2);
                }
                boolean z12 = rj6Var instanceof rj6;
                Object obj6 = rj6Var;
                if (z12) {
                    obj6 = null;
                }
                if (obj6 == null) {
                    return dn8Var;
                }
                eo1 eo1Var = new eo1();
                Bundle bundle = new Bundle();
                a aVar = yw2.b;
                ArrayList arrayList2 = new ArrayList(xv0.Z(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(aVar.h(it2.next()));
                }
                bundle.putStringArray("config_list", (String[]) arrayList2.toArray(new String[0]));
                bundle.putString("socket_server_info", str);
                eo1Var.Q(bundle);
                eo1Var.V();
                r00 r00Var = new r00(ml2VarN);
                r00Var.o = true;
                r00Var.g(num.intValue(), eo1Var, null, 1);
                r00Var.e();
                return dn8Var;
            case 11:
                MainActivity mainActivity3 = (MainActivity) obj2;
                boolean z13 = this.h0;
                if (!z13) {
                    w39.n0(obj);
                    mainViewModelG = mainActivity3.G();
                    x90 x90Var = mainActivity3.Z0;
                    this.i0 = mainViewModelG;
                    this.h0 = true;
                    objR = x90Var.r(this);
                    if (objR == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z13) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainViewModelG = (MainViewModel) this.i0;
                    w39.n0(obj);
                    objR = obj;
                }
                String str2 = (String) objR;
                str2.getClass();
                mainViewModelG.S(str2);
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                boolean z14 = this.h0;
                if (z14) {
                    if (!z14) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                mh7 mh7Var = (mh7) this.i0;
                mh mhVar = new mh((fy4) obj2, (byte) 5);
                this.h0 = true;
                if (mh7Var.a(mhVar, this) == c71Var) {
                    return c71Var;
                }
                b61.n();
                return null;
            case 13:
                o35 o35Var = (o35) obj2;
                w35 w35Var = (w35) this.i0;
                boolean z15 = this.h0;
                if (z15) {
                    if (!z15) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objH = obj;
                    return new le7((d73) objH, o35.d(o35Var.a, w35Var.d.a()), ma1.f0);
                }
                w39.n0(obj);
                pe7 pe7Var = w35Var.e;
                if (pe7Var == null) {
                    bt.i("body == null");
                    return null;
                }
                this.i0 = w35Var;
                this.h0 = true;
                objH = o35Var.h(pe7Var, this);
                if (objH == c71Var) {
                    return c71Var;
                }
                return new le7((d73) objH, o35.d(o35Var.a, w35Var.d.a()), ma1.f0);
            case 14:
                boolean z16 = this.h0;
                if (!z16) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (u70.F(1000L, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z16) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                lh4 lh4VarP0 = lh4.P0();
                int i4 = k39.a;
                lh4VarP0.getClass();
                ((kv5) obj2).b(new w31(7));
                return dn8Var;
            case 15:
                boolean z17 = this.h0;
                if (!z17) {
                    w39.n0(obj);
                    this.h0 = true;
                    return ((w55) this.i0).a.g(f15.Y, (rn2) obj2, this) == c71Var ? c71Var : dn8Var;
                }
                if (z17) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                boolean z18 = this.h0;
                try {
                    if (!z18) {
                        w39.n0(obj);
                        og7 og7VarG = w51.G((b71) this.i0, null, null, new r5(b4, q51Var), 3);
                        this.i0 = og7VarG;
                        this.h0 = true;
                        objR2 = ((x90) obj2).r(this);
                        r1 = og7VarG;
                        if (objR2 == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z18) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bm3 bm3Var = (bm3) this.i0;
                        w39.n0(obj);
                        objR2 = obj;
                        r1 = bm3Var;
                    }
                    r1.m(null);
                    return objR2;
                } catch (Throwable th3) {
                    r1.m(null);
                    throw th3;
                }
            case 17:
                j2 j2Var = (j2) this.i0;
                boolean z19 = this.h0;
                if (z19) {
                    if (z19) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                nf1 nf1Var2 = tp1.a;
                hv2 hv2Var = dm4.a;
                k kVar2 = new k((PerAppProxyActivity) obj2, j2Var, q51Var, (byte) 22);
                this.i0 = null;
                this.h0 = true;
                return w51.W(hv2Var, kVar2, this) == c71Var ? c71Var : dn8Var;
            case 18:
                cl5 cl5Var = (cl5) obj2;
                boolean z20 = this.h0;
                if (!z20) {
                    w39.n0(obj);
                    vz7 vz7Var = x06.a;
                    PerAppProxyActivity perAppProxyActivity = (PerAppProxyActivity) this.i0;
                    this.h0 = true;
                    nf1 nf1Var3 = tp1.a;
                    objW = w51.W(ye1.Z, new l40(perAppProxyActivity, q51Var, b5), this);
                    if (objW == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z20) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objW = obj;
                }
                qm5 qm5VarC = ec7.Y.c();
                for (AppInfo appInfo : (Iterable) objW) {
                    qm5VarC.add(AppInfo.a(appInfo, ((lk5) cl5Var.g.X.getValue()).d.Z.containsKey(appInfo.getPackageName()) ? 1 : 0));
                }
                j2 j2VarC = qm5VarC.c();
                oh7 oh7Var = cl5Var.f;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, lk5.a((lk5) value, null, null, j2VarC, null, null, false, 59)));
                return dn8Var;
            case 19:
                boolean z21 = this.h0;
                if (z21) {
                    if (z21) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                TextClassifier textClassifier = (TextClassifier) this.i0;
                if (textClassifier == null) {
                    return null;
                }
                this.h0 = true;
                Object objK = ((rn2) obj2).K(textClassifier, this);
                return objK == c71Var ? c71Var : objK;
            case 20:
                boolean z22 = this.h0;
                if (z22) {
                    if (!z22) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                r77 r77Var2 = (r77) this.i0;
                pg3 pg3Var = new pg3((dn2) obj2, q51Var, b7);
                r77Var2.getClass();
                this.h0 = true;
                if (z91.n(r77Var2, pg3Var, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                gw5 gw5Var = (gw5) this.i0;
                boolean z23 = this.h0;
                if (z23) {
                    if (z23) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                vz7 vz7Var2 = gw5Var.b;
                h76 h76Var = gw5Var.e;
                String str3 = ((cw5) h76Var.X.getValue()).b;
                fn6[] fn6VarArr = (fn6[]) i21.M(gw5Var.c).toArray(new fn6[0]);
                fn6[] fn6VarArr2 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                boolean z24 = ((cw5) h76Var.X.getValue()).d;
                this.h0 = true;
                return ((mn6) vz7Var2.getValue()).s((ProfileRoutingSettings) obj2, str3, fn6VarArr2, true, z24, this) == c71Var ? c71Var : dn8Var;
            case 22:
                boolean z25 = this.h0;
                if (!z25) {
                    w39.n0(obj);
                    kk0 kk0Var = (kk0) this.i0;
                    s16 s16Var = (s16) obj2;
                    this.h0 = true;
                    if (kk0Var instanceof ve6) {
                        objE = s16Var.g((ve6) kk0Var, this);
                        if (objE != c71Var) {
                            objE = dn8Var;
                        }
                    } else if (kk0Var instanceof oe6) {
                        objE = s16Var.d((oe6) kk0Var, this);
                        if (objE != c71Var) {
                            objE = dn8Var;
                        }
                    } else if (kk0Var instanceof qe6) {
                        objE = s16Var.f((qe6) kk0Var, this);
                        if (objE != c71Var) {
                            objE = dn8Var;
                        }
                    } else if (kk0Var instanceof pe6) {
                        objE = s16Var.e((pe6) kk0Var, this);
                        if (objE != c71Var) {
                            objE = dn8Var;
                        }
                    } else {
                        b61.c();
                    }
                    return objE == c71Var ? c71Var : dn8Var;
                }
                if (z25) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                Object obj7 = this.i0;
                boolean z26 = this.h0;
                if (z26) {
                    if (z26) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                Objects.toString(obj7);
                jy2 jy2Var = (jy2) ((fu6) obj2).f0;
                this.h0 = true;
                return jy2Var.K(obj7, this) == c71Var ? c71Var : dn8Var;
            case 24:
                boolean z27 = this.h0;
                if (z27) {
                    if (z27) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                b71 b71Var2 = (b71) this.i0;
                RippleNode rippleNode = (RippleNode) obj2;
                u77 u77Var = rippleNode.q0.a;
                te0 te0Var = new te0(rippleNode, b71Var2, b5);
                this.h0 = true;
                u77Var.a(te0Var, this);
                return c71Var;
            case 25:
                boolean z28 = this.h0;
                if (z28) {
                    if (z28) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ep6 ep6Var = (ep6) this.i0;
                String str4 = (String) obj2;
                str4.getClass();
                ao6 ao6Var = new ao6(str4);
                this.h0 = true;
                return ep6Var.k(ao6Var, this) == c71Var ? c71Var : dn8Var;
            case 26:
                boolean z29 = this.h0;
                if (z29) {
                    if (!z29) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                r77 r77Var3 = (r77) this.i0;
                w81 w81Var2 = new w81((gn2) obj2, q51Var, b6);
                r77Var3.getClass();
                this.h0 = true;
                if (z91.n(r77Var3, w81Var2, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            case 27:
                sq6 sq6Var = (sq6) this.i0;
                boolean z30 = this.h0;
                if (!z30) {
                    w39.n0(obj);
                    String str5 = (String) obj2;
                    str5.getClass();
                    lq6 lq6Var = new lq6(str5);
                    this.h0 = true;
                    Object objL3 = sq6Var.d.l(lq6Var, this);
                    if (objL3 != c71Var) {
                        objL3 = dn8Var;
                    }
                    if (objL3 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z30) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                sq6Var.e();
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ScScannerActivity scScannerActivity = (ScScannerActivity) obj2;
                boolean z31 = this.h0;
                if (!z31) {
                    w39.n0(obj);
                    kw2 kw2Var = kw2.a;
                    Intent intent = ((i6) this.i0).Y;
                    String stringExtra = intent != null ? intent.getStringExtra("SCAN_RESULT") : null;
                    this.h0 = true;
                    objE2 = kw2.e(stringExtra, null, this, 6);
                    if (objE2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z31) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objE2 = obj;
                }
                if (((ImportResult) objE2).getCount() > 0) {
                    x79.h(scScannerActivity, y46.toast_success);
                } else {
                    x79.h(scScannerActivity, y46.toast_failure);
                }
                scScannerActivity.startActivity(new Intent(scScannerActivity, (Class<?>) MainActivity.class));
                return dn8Var;
            default:
                boolean z32 = this.h0;
                if (z32) {
                    if (z32) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                hu1 hu1Var = (hu1) this.i0;
                float f = hu1Var.b ? -1.0f : 1.0f;
                sy6 sy6Var = ((my6) obj2).T0;
                long jF = tu8.f(f, hu1Var.a);
                this.h0 = true;
                return sy6Var.c(jF, false, this) == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy2(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy2(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(fu6 fu6Var, Object obj, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 23;
        this.j0 = fu6Var;
        this.i0 = obj;
    }
}
