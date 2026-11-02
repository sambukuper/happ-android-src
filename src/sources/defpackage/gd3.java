package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 {
    public final /* synthetic */ byte a;
    public final w03 b;
    public final w03 c;
    public final w03 d;
    public final w03 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public gd3(gd3[] gd3VarArr) {
        final byte b = 0;
        this.a = (byte) 0;
        this.f = gd3VarArr;
        int length = gd3VarArr.length;
        final w03[] w03VarArr = new w03[length];
        for (int i = 0; i < length; i++) {
            w03VarArr[i] = ((gd3[]) this.f)[i].b();
        }
        final byte b2 = 1;
        this.b = new w03(new rn2() { // from class: jv8
            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                float fK;
                byte b3 = b2;
                w03[] w03VarArr2 = w03VarArr;
                do5 do5Var = (do5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fK = gv3.K(do5Var, false, w03VarArr2, fFloatValue);
                        break;
                    default:
                        fK = gv3.K(do5Var, true, w03VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fK);
            }
        }, (byte) 1);
        int length2 = ((gd3[]) this.f).length;
        final w03[] w03VarArr2 = new w03[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            w03VarArr2[i2] = ((gd3[]) this.f)[i2].d();
        }
        this.c = new w03(new rn2() { // from class: v03
            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                float fK;
                byte b3 = b2;
                w03[] w03VarArr3 = w03VarArr2;
                do5 do5Var = (do5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fK = gv3.K(do5Var, false, w03VarArr3, fFloatValue);
                        break;
                    default:
                        fK = gv3.K(do5Var, true, w03VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fK);
            }
        }, (byte) 0);
        int length3 = ((gd3[]) this.f).length;
        final w03[] w03VarArr3 = new w03[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            w03VarArr3[i3] = ((gd3[]) this.f)[i3].c();
        }
        this.d = new w03(new rn2() { // from class: jv8
            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                float fK;
                byte b3 = b;
                w03[] w03VarArr4 = w03VarArr3;
                do5 do5Var = (do5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fK = gv3.K(do5Var, false, w03VarArr4, fFloatValue);
                        break;
                    default:
                        fK = gv3.K(do5Var, true, w03VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fK);
            }
        }, (byte) 1);
        int length4 = ((gd3[]) this.f).length;
        final w03[] w03VarArr4 = new w03[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            w03VarArr4[i4] = ((gd3[]) this.f)[i4].a();
        }
        this.e = new w03(new rn2() { // from class: v03
            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                float fK;
                byte b3 = b;
                w03[] w03VarArr5 = w03VarArr4;
                do5 do5Var = (do5) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fK = gv3.K(do5Var, false, w03VarArr5, fFloatValue);
                        break;
                    default:
                        fK = gv3.K(do5Var, true, w03VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fK);
            }
        }, (byte) 0);
    }

    public final w03 a() {
        byte b = this.a;
        return this.e;
    }

    public final w03 b() {
        byte b = this.a;
        return this.b;
    }

    public final w03 c() {
        byte b = this.a;
        return this.d;
    }

    public final w03 d() {
        byte b = this.a;
        return this.c;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return eu.x0((gd3[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return pc6.p("RectRulers(", (String) obj, ")");
        }
    }

    public gd3(String str) {
        this.a = (byte) 1;
        this.f = str;
        this.b = new w03(null, (byte) 1);
        this.c = new w03(null, (byte) 0);
        this.d = new w03(null, (byte) 1);
        this.e = new w03(null, (byte) 0);
    }
}
