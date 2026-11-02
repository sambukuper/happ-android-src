package defpackage;

import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public Object i0;
    public Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(gh1 gh1Var, q51 q51Var, Object obj, Object obj2, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = gh1Var;
        this.j0 = obj;
        this.k0 = obj2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((r0) n((q51) obj2, (lp4) obj)).q(dn8Var);
            case 2:
                return ((r0) n((q51) obj2, (ke1) obj)).q(dn8Var);
            case 3:
                return ((r0) n((q51) obj2, (qg5) obj)).q(dn8Var);
            case 4:
                return ((r0) n((q51) obj2, (qg5) obj)).q(dn8Var);
            case 5:
                return ((r0) n((q51) obj2, (hv5) obj)).q(dn8Var);
            case 6:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 11:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((r0) n((q51) obj2, (xx6) obj)).q(dn8Var);
            case 14:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 17:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 18:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 19:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 20:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 22:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 23:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 25:
                return ((r0) n((q51) obj2, (DownloadFilesInfo) obj)).q(dn8Var);
            case 26:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 27:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((r0) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 0);
            case 1:
                r0 r0Var = new r0((sn2) this.j0, (t5) obj2, q51Var, (byte) 1);
                r0Var.i0 = obj;
                return r0Var;
            case 2:
                r0 r0Var2 = new r0((sn2) this.j0, (la) obj2, q51Var, (byte) 2);
                r0Var2.i0 = obj;
                return r0Var2;
            case 3:
                r0 r0Var3 = new r0((tn2) this.j0, (t5) obj2, q51Var, (byte) 3);
                r0Var3.i0 = obj;
                return r0Var3;
            case 4:
                r0 r0Var4 = new r0((tn2) this.j0, (la) obj2, q51Var, (byte) 4);
                r0Var4.i0 = obj;
                return r0Var4;
            case 5:
                r0 r0Var5 = new r0((ce8) this.j0, (y05) obj2, q51Var, (byte) 5);
                r0Var5.i0 = obj;
                return r0Var5;
            case 6:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 6);
            case 7:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 7);
            case 8:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 8);
            case 9:
                r0 r0Var6 = new r0((ze2) this.j0, (kp0) obj2, q51Var, (byte) 9);
                r0Var6.i0 = obj;
                return r0Var6;
            case 10:
                r0 r0Var7 = new r0((n17) this.j0, obj2, q51Var, (byte) 10);
                r0Var7.i0 = obj;
                return r0Var7;
            case 11:
                return new r0((ea6) this.j0, (sq5) obj2, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                r0 r0Var8 = new r0((ib1) this.j0, (rn2) obj2, q51Var, (byte) 12);
                r0Var8.i0 = obj;
                return r0Var8;
            case 13:
                r0 r0Var9 = new r0((fu6) this.j0, (rn2) obj2, q51Var, (byte) 13);
                r0Var9.i0 = obj;
                return r0Var9;
            case 14:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 14);
            case 15:
                return new r0((gh1) this.i0, q51Var, this.j0, obj2, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new r0((gh1) this.i0, q51Var, this.j0, obj2, (byte) 16);
            case 17:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 17);
            case 18:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 18);
            case 19:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 19);
            case 20:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                r0 r0Var10 = new r0((if2) this.j0, (ze2) obj2, q51Var, (byte) 21);
                r0Var10.i0 = obj;
                return r0Var10;
            case 22:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 22);
            case 23:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 23);
            case 24:
                return new r0((x90) obj2, q51Var);
            case 25:
                r0 r0Var11 = new r0((za3) this.j0, (zo8) obj2, q51Var, (byte) 25);
                r0Var11.i0 = obj;
                return r0Var11;
            case 26:
                return new r0(this.i0, this.j0, this.k0, q51Var, (byte) 26);
            case 27:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 27);
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                return new r0(this.i0, this.j0, obj2, q51Var, (byte) 28);
            default:
                r0 r0Var12 = new r0((rn2) this.j0, (qd0) obj2, q51Var, (byte) 29);
                r0Var12.i0 = obj;
                return r0Var12;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0170 */
    /* JADX WARN: Code duplicated, block: B:101:0x01bc A[Catch: all -> 0x0170, TryCatch #1 {, blocks: (B:79:0x016a, B:89:0x0194, B:91:0x019c, B:92:0x01a9, B:99:0x01b9, B:86:0x0186, B:101:0x01bc, B:103:0x01c1, B:104:0x01c2, B:85:0x0181, B:93:0x01aa, B:95:0x01b0), top: B:543:0x015e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x032a  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:209:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x0404  */
    /* JADX WARN: Code duplicated, block: B:212:0x0406  */
    /* JADX WARN: Code duplicated, block: B:219:0x043b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0441  */
    /* JADX WARN: Code duplicated, block: B:223:0x044c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0479  */
    /* JADX WARN: Code duplicated, block: B:226:0x047b  */
    /* JADX WARN: Code duplicated, block: B:284:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:286:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:474:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:541:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x019c A[Catch: all -> 0x0170, TryCatch #1 {, blocks: (B:79:0x016a, B:89:0x0194, B:91:0x019c, B:92:0x01a9, B:99:0x01b9, B:86:0x0186, B:101:0x01bc, B:103:0x01c1, B:104:0x01c2, B:85:0x0181, B:93:0x01aa, B:95:0x01b0), top: B:543:0x015e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0 A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:93:0x01aa, B:95:0x01b0), top: B:541:0x01aa, outer: #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:95:0x01b0, B:98:0x01b8], limit reached: 623 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.hardware.camera2.CameraDevice$StateCallback, db] */
    /* JADX WARN: Type inference failed for: r1v40, types: [db] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v90, types: [jp0] */
    /* JADX WARN: Type inference failed for: r2v92, types: [x90] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v94, types: [jp0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [dq] */
    /* JADX WARN: Type inference failed for: r3v30, types: [e1, jp0, kv5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0190 -> B:89:0x0194). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x90 x90Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 24;
        this.k0 = x90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
        this.k0 = obj3;
    }
}
