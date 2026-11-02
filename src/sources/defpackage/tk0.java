package defpackage;

import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tk0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk0(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                long j = ((z85) obj).a;
                return new tk0((r68) this.i0, (q51) obj2, (byte) 1).q(dn8Var);
            case 2:
                return ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71.X;
            case 5:
                return ((tk0) n((q51) obj2, Long.valueOf(((Number) obj).longValue()))).q(dn8Var);
            case 6:
                return ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((tk0) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.i0;
        switch (b) {
            case 0:
                return new tk0((d6) obj2, q51Var, (byte) 0);
            case 1:
                return new tk0((r68) obj2, q51Var, (byte) 1);
            case 2:
                return new tk0((at2) obj2, q51Var, (byte) 2);
            case 3:
                return new tk0((za3) obj2, q51Var, (byte) 3);
            case 4:
                return new tk0((kj4) obj2, q51Var, (byte) 4);
            case 5:
                return new tk0((MainActivity) obj2, q51Var, (byte) 5);
            case 6:
                return new tk0((an7) obj2, q51Var, (byte) 6);
            default:
                return new tk0((cz7) obj2, q51Var, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0110 -> B:61:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x012d -> B:71:0x0130). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:63:0x0105
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk0.q(java.lang.Object):java.lang.Object");
    }
}
