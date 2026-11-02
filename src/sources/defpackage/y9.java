package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.log_report.LogWorker;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(Object obj, Object obj2, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 2:
                ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71Var;
            case 3:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 5:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 6:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 7:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 8:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 9:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 10:
                return ((y9) n((q51) obj2, (rg8) obj)).q(dn8Var);
            case 11:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 13:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 14:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 15:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((y9) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new y9((z9) this.i0, (hu1) obj2, q51Var, (byte) 0);
            case 1:
                return new y9((w05) this.i0, (mj0) obj2, q51Var, (byte) 1);
            case 2:
                return new y9((bm3) this.i0, (o8) obj2, q51Var, (byte) 2);
            case 3:
                return new y9((ib1) this.i0, (mu4) obj2, q51Var, (byte) 3);
            case 4:
                return new y9((kn1) this.i0, (RouteProfile) obj2, q51Var, (byte) 4);
            case 5:
                return new y9((ea6) this.i0, (String) obj2, q51Var, (byte) 5);
            case 6:
                return new y9((ja3) this.i0, (za3) obj2, q51Var, (byte) 6);
            case 7:
                return new y9((LogWorker) this.i0, (String) obj2, q51Var, (byte) 7);
            case 8:
                return new y9((EDeeplinkType) this.i0, (MainActivity) obj2, q51Var, (byte) 8);
            case 9:
                return new y9((MainActivity) obj2, q51Var, (byte) 9);
            case 10:
                y9 y9Var = new y9((MainActivity) obj2, q51Var, (byte) 10);
                y9Var.i0 = obj;
                return y9Var;
            case 11:
                return new y9((MainViewModel) this.i0, (String) obj2, q51Var, (byte) 11);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                y9 y9Var2 = new y9((uy4) obj2, q51Var, (byte) 12);
                y9Var2.i0 = obj;
                return y9Var2;
            case 13:
                return new y9((cl5) this.i0, (PerAppProxyActivity) obj2, q51Var, (byte) 13);
            case 14:
                return new y9((vv5) this.i0, (String) obj2, q51Var, (byte) 14);
            case 15:
                return new y9((xb4) this.i0, (bd6) obj2, q51Var, (byte) 15);
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                return new y9((yr6) obj2, q51Var, (byte) 16);
            default:
                return new y9((bm3) this.i0, (dt5) obj2, q51Var, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:443:0x0793  */
    /* JADX WARN: Code duplicated, block: B:553:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0229 -> B:107:0x01ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0301 -> B:132:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:34:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:445:0x07a2 -> B:447:0x07a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:418:0x073e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
    }
}
