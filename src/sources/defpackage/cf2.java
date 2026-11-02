package defpackage;

import android.content.Context;
import java.io.Serializable;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cf2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = obj;
        this.j0 = obj2;
        this.k0 = obj3;
        this.l0 = obj4;
        this.m0 = obj5;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((cf2) n((q51) obj2, (hv5) obj)).q(dn8Var);
            case 1:
                return ((cf2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 2:
                return ((cf2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 3:
                return ((cf2) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 4:
                ((cf2) n((q51) obj2, (b71) obj)).q(dn8Var);
                return c71.X;
            case 5:
                return ((cf2) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((cf2) n((q51) obj2, (ry6) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.m0;
        Object obj3 = this.l0;
        Object obj4 = this.k0;
        switch (b) {
            case 0:
                cf2 cf2Var = new cf2((g94) this.j0, (o84) obj4, (s61) obj3, (xe2) obj2, q51Var, (byte) 0);
                cf2Var.i0 = obj;
                return cf2Var;
            case 1:
                return new cf2((MainViewModel) this.i0, (String) this.j0, (String) obj4, (Boolean) obj3, (Boolean) obj2, q51Var, (byte) 1);
            case 2:
                return new cf2((v63) this.i0, (v76) this.j0, (ta7) obj4, (oy1) obj3, (d53) obj2, q51Var, (byte) 2);
            case 3:
                cf2 cf2Var2 = new cf2((p86) obj4, (o86) obj3, (ai) obj2, q51Var, (byte) 3);
                cf2Var2.i0 = obj;
                return cf2Var2;
            case 4:
                return new cf2((r77) this.i0, (gn2) this.j0, (gn2) obj4, (ky2) obj3, (Context) obj2, q51Var, (byte) 4);
            case 5:
                cf2 cf2Var3 = new cf2((mq5) this.j0, (gs1) obj4, (v28) obj3, (dt5) obj2, q51Var, (byte) 5);
                cf2Var3.i0 = obj;
                return cf2Var3;
            default:
                cf2 cf2Var4 = new cf2((ad8) obj4, (sy6) obj3, (ea6) obj2, q51Var, (byte) 6);
                cf2Var4.i0 = obj;
                return cf2Var4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f2 A[Catch: all -> 0x02f6, TryCatch #4 {all -> 0x02f6, blocks: (B:109:0x02ee, B:111:0x02f2, B:114:0x02f8, B:116:0x02fe), top: B:191:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02fe A[Catch: all -> 0x02f6, TRY_LEAVE, TryCatch #4 {all -> 0x02f6, blocks: (B:109:0x02ee, B:111:0x02f2, B:114:0x02f8, B:116:0x02fe), top: B:191:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
    /* JADX WARN: Code duplicated, block: B:187:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0298 A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:82:0x0285, B:83:0x028b, B:85:0x0290, B:86:0x0291, B:88:0x0298, B:90:0x02a6, B:92:0x02ac, B:95:0x02b2, B:97:0x02b6, B:98:0x02ba, B:99:0x02bd, B:103:0x02c4, B:123:0x0315, B:124:0x0316, B:84:0x028c), top: B:186:0x0285, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02a6 A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:82:0x0285, B:83:0x028b, B:85:0x0290, B:86:0x0291, B:88:0x0298, B:90:0x02a6, B:92:0x02ac, B:95:0x02b2, B:97:0x02b6, B:98:0x02ba, B:99:0x02bd, B:103:0x02c4, B:123:0x0315, B:124:0x0316, B:84:0x028c), top: B:186:0x0285, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02ac A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:82:0x0285, B:83:0x028b, B:85:0x0290, B:86:0x0291, B:88:0x0298, B:90:0x02a6, B:92:0x02ac, B:95:0x02b2, B:97:0x02b6, B:98:0x02ba, B:99:0x02bd, B:103:0x02c4, B:123:0x0315, B:124:0x0316, B:84:0x028c), top: B:186:0x0285, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r10
    public final java.lang.Object q(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf2.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf2(Object obj, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.k0 = obj;
        this.l0 = obj2;
        this.m0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf2(Object obj, Serializable serializable, Object obj2, Object obj3, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.k0 = serializable;
        this.l0 = obj2;
        this.m0 = obj3;
    }
}
