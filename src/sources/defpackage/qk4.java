package defpackage;

import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qk4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public Object i0;
    public Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(MainActivity mainActivity, boolean z, String str, gn2 gn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 4;
        this.i0 = mainActivity;
        this.h0 = z;
        this.j0 = str;
        this.k0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return dn8Var;
            case 5:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((qk4) n((q51) obj2, (kv5) obj)).q(dn8Var);
            case 10:
                return ((qk4) n((q51) obj2, (List) obj)).q(dn8Var);
            case 11:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((qk4) n((q51) obj2, (ry6) obj)).q(dn8Var);
            case 17:
                return ((qk4) n((q51) obj2, (xx6) obj)).q(dn8Var);
            case 18:
                ((qk4) n((q51) obj2, (ze2) obj)).q(dn8Var);
                return c71Var;
            case 19:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 20:
                ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 22:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 23:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 24:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((qk4) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 0);
            case 1:
                qk4 qk4Var = new qk4((String) obj2, (MainActivity) this.i0, q51Var);
                qk4Var.j0 = obj;
                return qk4Var;
            case 2:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 2);
            case 3:
                return new qk4((MainActivity) this.i0, (String) obj2, q51Var);
            case 4:
                return new qk4((MainActivity) this.i0, this.h0, (String) this.j0, (gn2) obj2, q51Var);
            case 5:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 5);
            case 6:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 6);
            case 7:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 7);
            case 8:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 8);
            case 9:
                qk4 qk4Var2 = new qk4(this.j0, obj2, q51Var, (byte) 9);
                qk4Var2.i0 = obj;
                return qk4Var2;
            case 10:
                qk4 qk4Var3 = new qk4(this.j0, obj2, q51Var, (byte) 10);
                qk4Var3.i0 = obj;
                return qk4Var3;
            case 11:
                qk4 qk4Var4 = new qk4(obj2, q51Var, (byte) 11);
                qk4Var4.j0 = obj;
                return qk4Var4;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                qk4 qk4Var5 = new qk4(this.j0, obj2, q51Var, (byte) 12);
                qk4Var5.i0 = obj;
                return qk4Var5;
            case 13:
                qk4 qk4Var6 = new qk4(this.j0, obj2, q51Var, (byte) 13);
                qk4Var6.i0 = obj;
                return qk4Var6;
            case 14:
                return new qk4(this.j0, obj2, q51Var, (byte) 14);
            case 15:
                qk4 qk4Var7 = new qk4(this.j0, obj2, q51Var, (byte) 15);
                qk4Var7.i0 = obj;
                return qk4Var7;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                qk4 qk4Var8 = new qk4(this.j0, obj2, q51Var, (byte) 16);
                qk4Var8.i0 = obj;
                return qk4Var8;
            case 17:
                qk4 qk4Var9 = new qk4(this.j0, obj2, q51Var, (byte) 17);
                qk4Var9.i0 = obj;
                return qk4Var9;
            case 18:
                qk4 qk4Var10 = new qk4(this.j0, obj2, q51Var, (byte) 18);
                qk4Var10.i0 = obj;
                return qk4Var10;
            case 19:
                return new qk4(obj2, q51Var, (byte) 19);
            case 20:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 20);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 21);
            case 22:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 22);
            case 23:
                qk4 qk4Var11 = new qk4((r68) this.j0, (mq5) obj2, this.h0, q51Var);
                qk4Var11.i0 = obj;
                return qk4Var11;
            case 24:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 24);
            default:
                return new qk4(this.i0, this.j0, obj2, q51Var, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x03cd A[Catch: CancellationException -> 0x042a, all -> 0x0432, TRY_ENTER, TryCatch #9 {CancellationException -> 0x042a, all -> 0x0432, blocks: (B:170:0x03ab, B:176:0x03cd, B:178:0x03ef, B:179:0x03fb), top: B:434:0x03ab }] */
    /* JADX WARN: Code duplicated, block: B:178:0x03ef A[Catch: CancellationException -> 0x042a, all -> 0x0432, TryCatch #9 {CancellationException -> 0x042a, all -> 0x0432, blocks: (B:170:0x03ab, B:176:0x03cd, B:178:0x03ef, B:179:0x03fb), top: B:434:0x03ab }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0407  */
    /* JADX WARN: Code duplicated, block: B:184:0x040f  */
    /* JADX WARN: Code duplicated, block: B:398:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:399:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:401:0x08da  */
    /* JADX WARN: Code duplicated, block: B:403:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:407:0x090a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0405 -> B:182:0x0409). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk4.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk4(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk4(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk4(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
        this.k0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(String str, MainActivity mainActivity, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 1;
        this.k0 = str;
        this.i0 = mainActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(MainActivity mainActivity, String str, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 3;
        this.i0 = mainActivity;
        this.k0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(r68 r68Var, mq5 mq5Var, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 23;
        this.j0 = r68Var;
        this.k0 = mq5Var;
        this.h0 = z;
    }
}
