package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class c75 extends lj7 {
    public static final c75 f0 = new c75((byte) 0);
    public static final c75 g0 = new c75((byte) 1);
    public final /* synthetic */ byte Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c75(byte b) {
        super(Object.class);
        this.Z = b;
        switch (b) {
            case 1:
                super(uq3.class);
                break;
            case 2:
                super(byte[].class);
                break;
            case 3:
                super(Object.class);
                break;
            case 4:
            case 5:
            default:
                break;
            case 6:
                super(char[].class);
                break;
            case 7:
                super(0, String.class);
                break;
        }
    }

    @Override // defpackage.ar3
    public boolean c(t37 t37Var, Object obj) {
        switch (this.Z) {
            case 1:
                return false;
            case 2:
                return ((byte[]) obj).length == 0;
            case 6:
                return ((char[]) obj).length == 0;
            case 8:
                return true;
            default:
                return super.c(t37Var, obj);
        }
    }

    @Override // defpackage.ar3
    public void e(Object obj, ro3 ro3Var, t37 t37Var) throws pp3, xk7 {
        switch (this.Z) {
            case 0:
                ro3Var.X();
                return;
            case 1:
                ro3Var.c1(((dh8) ((uq3) obj)).w0());
                return;
            case 2:
                byte[] bArr = (byte[]) obj;
                ro3Var.u(t37Var.X.Y.i0, bArr, 0, bArr.length);
                return;
            case 3:
                t37Var.getClass();
                throw new pp3(((qf1) t37Var).q0, "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)", null);
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                ro3Var.a1(entry);
                t37Var.g("key", entry.getKey(), ro3Var);
                t37Var.g("value", entry.getValue(), ro3Var);
                ro3Var.J();
                return;
            case 5:
                String string = obj.toString();
                eq2 eq2Var = (eq2) ro3Var;
                eq2Var.h1("write raw value");
                eq2Var.C0(string);
                return;
            case 6:
                char[] cArr = (char[]) obj;
                if (!t37Var.X.j(n37.p0)) {
                    ro3Var.d1(cArr, 0, cArr.length);
                    return;
                }
                int length = cArr.length;
                ro3Var.V0(cArr);
                int length2 = cArr.length;
                for (int i = 0; i < length2; i++) {
                    ro3Var.d1(cArr, i, 1);
                }
                ro3Var.D();
                return;
            case 7:
                ro3Var.U((String) obj);
                return;
            default:
                ((r59) ro3Var).a1(obj);
                ro3Var.J();
                return;
        }
    }

    @Override // defpackage.ar3
    public void f(Object obj, ro3 ro3Var, t37 t37Var, ri8 ri8Var) throws pp3, xk7 {
        z76 z76VarE;
        switch (this.Z) {
            case 0:
                ro3Var.X();
                break;
            case 1:
                dh8 dh8Var = (dh8) ((uq3) obj);
                dh8Var.getClass();
                z76 z76Var = new z76(dh8Var, gr3.VALUE_STRING);
                ri8Var.e(ro3Var, z76Var);
                ro3Var.c1(dh8Var.w0());
                ri8Var.f(ro3Var, z76Var);
                break;
            case 2:
                byte[] bArr = (byte[]) obj;
                z76 z76VarE2 = ri8Var.e(ro3Var, ri8Var.d(bArr, gr3.VALUE_EMBEDDED_OBJECT));
                ro3Var.u(t37Var.X.Y.i0, bArr, 0, bArr.length);
                ri8Var.f(ro3Var, z76VarE2);
                break;
            case 3:
            case 4:
            case 7:
            default:
                super.f(obj, ro3Var, t37Var, ri8Var);
                break;
            case 5:
                z76 z76VarE3 = ri8Var.e(ro3Var, ri8Var.d(obj, gr3.VALUE_EMBEDDED_OBJECT));
                e(obj, ro3Var, t37Var);
                ri8Var.f(ro3Var, z76VarE3);
                break;
            case 6:
                char[] cArr = (char[]) obj;
                if (t37Var.X.j(n37.p0)) {
                    z76VarE = ri8Var.e(ro3Var, ri8Var.d(cArr, gr3.START_ARRAY));
                    int length = cArr.length;
                    for (int i = 0; i < length; i++) {
                        ro3Var.d1(cArr, i, 1);
                    }
                } else {
                    z76VarE = ri8Var.e(ro3Var, ri8Var.d(cArr, gr3.VALUE_STRING));
                    ro3Var.d1(cArr, 0, cArr.length);
                }
                ri8Var.f(ro3Var, z76VarE);
                break;
            case 8:
                ri8Var.f(ro3Var, ri8Var.e(ro3Var, ri8Var.d(obj, gr3.START_OBJECT)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c75(Class cls, int i, byte b) {
        super(i, cls);
        this.Z = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c75(dh8 dh8Var, byte b) {
        super(dh8Var);
        this.Z = b;
    }
}
