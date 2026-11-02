package defpackage;

import java.util.List;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gh1 gh1Var, q51 q51Var, List list) {
        super(2, q51Var);
        this.g0 = (byte) 20;
        this.i0 = gh1Var;
        this.j0 = list;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                ((q0) n((q51) obj2, (wd3) obj)).q(dn8Var);
                return c71Var;
            case 3:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 5:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case 7:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case 10:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case 11:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case 13:
                return ((q0) n((q51) obj2, (ze2) obj)).q(dn8Var);
            case 14:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                return ((q0) n((q51) obj2, (ra1) obj)).q(dn8Var);
            case 18:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                return ((q0) n((q51) obj2, (mu4) obj)).q(dn8Var);
            case 20:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((q0) n((q51) obj2, (e27) obj)).q(dn8Var);
            case 22:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 23:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 26:
                return ((q0) n((q51) obj2, (dn8) obj)).q(dn8Var);
            case 27:
                return ((q0) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ((q0) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((q0) n((q51) obj2, (qg5) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new q0((xz4) this.i0, (d13) obj2, q51Var, (byte) 0);
            case 1:
                return new q0((xz4) this.i0, (e13) obj2, q51Var, (byte) 1);
            case 2:
                q0 q0Var = new q0(obj2, q51Var, (byte) 2);
                q0Var.i0 = obj;
                return q0Var;
            case 3:
                q0 q0Var2 = new q0(obj2, q51Var, (byte) 3);
                q0Var2.i0 = obj;
                return q0Var2;
            case 4:
                return new q0((kd8) this.i0, (mj0) obj2, q51Var, (byte) 4);
            case 5:
                return new q0((ms) this.i0, (DownloadFilesInfo) obj2, q51Var, (byte) 5);
            case 6:
                q0 q0Var3 = new q0(obj2, q51Var, (byte) 6);
                q0Var3.i0 = obj;
                return q0Var3;
            case 7:
                return new q0((yh2) this.i0, (jc8) obj2, q51Var, (byte) 7);
            case 8:
                return new q0((t80) this.i0, (g00) obj2, q51Var, (byte) 8);
            case 9:
                q0 q0Var4 = new q0(obj2, q51Var, (byte) 9);
                q0Var4.i0 = obj;
                return q0Var4;
            case 10:
                q0 q0Var5 = new q0(obj2, q51Var, (byte) 10);
                q0Var5.i0 = obj;
                return q0Var5;
            case 11:
                q0 q0Var6 = new q0(obj2, q51Var, (byte) 11);
                q0Var6.i0 = obj;
                return q0Var6;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                q0 q0Var7 = new q0(obj2, q51Var, (byte) 12);
                q0Var7.i0 = obj;
                return q0Var7;
            case 13:
                q0 q0Var8 = new q0(obj2, q51Var, (byte) 13);
                q0Var8.i0 = obj;
                return q0Var8;
            case 14:
                return new q0((pz0) this.i0, (Runnable) obj2, q51Var, (byte) 14);
            case 15:
                return new q0((rn2) this.i0, (br5) obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new q0((rn2) this.i0, (ea6) obj2, q51Var, (byte) 16);
            case 17:
                q0 q0Var9 = new q0(obj2, q51Var, (byte) 17);
                q0Var9.i0 = obj;
                return q0Var9;
            case 18:
                return new q0((rn2) this.i0, (v91) obj2, q51Var, (byte) 18);
            case 19:
                q0 q0Var10 = new q0(obj2, q51Var, (byte) 19);
                q0Var10.i0 = obj;
                return q0Var10;
            case 20:
                return new q0((gh1) this.i0, q51Var, (List) obj2);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                q0 q0Var11 = new q0(obj2, q51Var, (byte) 21);
                q0Var11.i0 = obj;
                return q0Var11;
            case 22:
                return new q0((BaseActivity) this.i0, (io1) obj2, q51Var, (byte) 22);
            case 23:
                return new q0((lr) this.i0, (li0) obj2, q51Var, (byte) 23);
            case 24:
                return new q0((tc2) this.i0, (ld6) obj2, q51Var, (byte) 24);
            case 25:
                return new q0((xe2) this.i0, (hv5) obj2, q51Var, (byte) 25);
            case 26:
                return new q0((ea6) this.i0, (ze2) obj2, q51Var, (byte) 26);
            case 27:
                q0 q0Var12 = new q0(obj2, q51Var, (byte) 27);
                q0Var12.i0 = obj;
                return q0Var12;
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new q0((dr2) this.i0, (String) obj2, q51Var, (byte) 28);
            default:
                q0 q0Var13 = new q0(obj2, q51Var, (byte) 29);
                q0Var13.i0 = obj;
                return q0Var13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:369:0x070b  */
    /* JADX WARN: Code duplicated, block: B:371:0x071f  */
    /* JADX WARN: Code duplicated, block: B:373:0x072c  */
    /* JADX WARN: Code duplicated, block: B:377:0x073b  */
    /* JADX WARN: Code duplicated, block: B:379:0x0748  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x072a -> B:374:0x072e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
    }
}
