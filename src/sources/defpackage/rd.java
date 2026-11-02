package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rd extends qj6 implements rn2 {
    public final /* synthetic */ byte Z;
    public byte f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd(Object obj, q51 q51Var, byte b) {
        super(2, q51Var);
        this.Z = b;
        this.h0 = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.Z;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((rd) n((q51) obj2, (bz7) obj)).q(dn8Var);
            case 1:
                return ((rd) n((q51) obj2, (bz7) obj)).q(dn8Var);
            default:
                return ((rd) n((q51) obj2, (v27) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.Z;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                rd rdVar = new rd((td) obj2, q51Var, (byte) 0);
                rdVar.g0 = obj;
                return rdVar;
            case 1:
                rd rdVar2 = new rd((gn2) obj2, q51Var, (byte) 1);
                rdVar2.g0 = obj;
                return rdVar2;
            default:
                rd rdVar3 = new rd((View) obj2, q51Var, (byte) 2);
                rdVar3.g0 = obj;
                return rdVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[LOOP:1: B:60:0x012c->B:64:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ff -> B:53:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd.q(java.lang.Object):java.lang.Object");
    }
}
