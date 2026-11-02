package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.about_settings.AboutSettingsActivity;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.feature.report.ReportActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = obj;
        this.i0 = obj2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Exception {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((k) n((q51) obj2, (String) obj)).q(dn8Var);
                return dn8Var;
            case 1:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 2:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 3:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 4:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((k) n((q51) obj2, (hh7) obj)).q(dn8Var);
            case 8:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 9:
                ((k) n((q51) obj2, (List) obj)).q(dn8Var);
                return dn8Var;
            case 10:
                ((k) n((q51) obj2, (Set) obj)).q(dn8Var);
                return dn8Var;
            case 11:
                ((k) n((q51) obj2, (o05) obj)).q(dn8Var);
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((k) n((q51) obj2, (j2) obj)).q(dn8Var);
                return dn8Var;
            case 13:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 14:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 15:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 17:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 18:
                ((k) n((q51) obj2, (xf4) obj)).q(dn8Var);
                return dn8Var;
            case 19:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 20:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 22:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 23:
                ((k) n((q51) obj2, (j2) obj)).q(dn8Var);
                return dn8Var;
            case 24:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 26:
                ((k) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 27:
                ((k) n((q51) obj2, obj)).q(dn8Var);
                return dn8Var;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                ((k) n((q51) obj2, (ke6) obj)).q(dn8Var);
                return dn8Var;
            default:
                ((k) n((q51) obj2, (cm5) obj)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                k kVar = new k((AboutSettingsActivity) obj2, q51Var, (byte) 0);
                kVar.h0 = obj;
                return kVar;
            case 1:
                return new k((za) this.h0, (qw) obj2, q51Var, (byte) 1);
            case 2:
                return new k((pw) this.h0, (qw) obj2, q51Var, (byte) 2);
            case 3:
                return new k((sn0) this.h0, (sy8) obj2, q51Var, (byte) 3);
            case 4:
                return new k((String) this.h0, (zf0) obj2, q51Var, (byte) 4);
            case 5:
                return new k((hg0) this.h0, (String) obj2, q51Var, (byte) 5);
            case 6:
                k kVar2 = new k((o8) obj2, q51Var, (byte) 6);
                kVar2.h0 = obj;
                return kVar2;
            case 7:
                k kVar3 = new k((hh7) obj2, q51Var, (byte) 7);
                kVar3.h0 = obj;
                return kVar3;
            case 8:
                return new k((r27) this.h0, (eo1) obj2, q51Var, (byte) 8);
            case 9:
                k kVar4 = new k((ExcludedRoutesActivity) obj2, q51Var, (byte) 9);
                kVar4.h0 = obj;
                return kVar4;
            case 10:
                k kVar5 = new k((m52) obj2, q51Var, (byte) 10);
                kVar5.h0 = obj;
                return kVar5;
            case 11:
                k kVar6 = new k((ux0) obj2, q51Var, (byte) 11);
                kVar6.h0 = obj;
                return kVar6;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                k kVar7 = new k((dr2) obj2, q51Var, (byte) 12);
                kVar7.h0 = obj;
                return kVar7;
            case 13:
                return new k((by2) this.h0, (y05) obj2, q51Var, (byte) 13);
            case 14:
                return new k((la) this.h0, (ke1) obj2, q51Var, (byte) 14);
            case 15:
                return new k((gn2) this.h0, (la) obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                k kVar8 = new k((u84) obj2, q51Var, (byte) 16);
                kVar8.h0 = obj;
                return kVar8;
            case 17:
                return new k((pf4) this.h0, (String) obj2, q51Var, (byte) 17);
            case 18:
                k kVar9 = new k((Activity) obj2, q51Var, (byte) 18);
                kVar9.h0 = obj;
                return kVar9;
            case 19:
                return new k((dj4) this.h0, (List) obj2, q51Var, (byte) 19);
            case 20:
                return new k((MainActivity) this.h0, (q23) obj2, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new k((String) this.h0, (MainViewModel) obj2, q51Var, (byte) 21);
            case 22:
                return new k((PerAppProxyActivity) this.h0, (j2) obj2, q51Var, (byte) 22);
            case 23:
                k kVar10 = new k((cl5) obj2, q51Var, (byte) 23);
                kVar10.h0 = obj;
                return kVar10;
            case 24:
                k kVar11 = new k((String) obj2, q51Var, (byte) 24);
                kVar11.h0 = obj;
                return kVar11;
            case 25:
                return new k((un5) this.h0, (String) obj2, q51Var, (byte) 25);
            case 26:
                return new k((bo5) this.h0, (qd0) obj2, q51Var, (byte) 26);
            case 27:
                k kVar12 = new k((fu6) obj2, q51Var, (byte) 27);
                kVar12.h0 = obj;
                return kVar12;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                k kVar13 = new k((ReportActivity) obj2, q51Var, (byte) 28);
                kVar13.h0 = obj;
                return kVar13;
            default:
                k kVar14 = new k((ep6) obj2, q51Var, (byte) 29);
                kVar14.h0 = obj;
                return kVar14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026b  */
    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0270  */
    /* JADX WARN: Code duplicated, block: B:111:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x035b  */
    /* JADX WARN: Code duplicated, block: B:135:0x037c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0384  */
    /* JADX WARN: Code duplicated, block: B:138:0x0387  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:390:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0231  */
    /* JADX WARN: Code duplicated, block: B:96:0x023b A[LOOP:7: B:94:0x0235->B:96:0x023b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0263  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v48 java.lang.Object, still in use, count: 2, list:
          (r5v48 java.lang.Object) from 0x01fc: PHI (r5 I:??) = (r5v17 java.lang.Object), (r5v48 java.lang.Object) binds: [B:82:0x01fb, B:377:0x01fc] A[DONT_GENERATE, DONT_INLINE]
          (r5v48 java.lang.Object) from 0x01ee: CHECK_CAST (su.happ.proxyutility.dto.ConfigGroupCache) (r5v48 java.lang.Object)
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
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }
}
