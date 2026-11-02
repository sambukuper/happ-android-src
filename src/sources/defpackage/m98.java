package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m98 {
    public static final /* synthetic */ long b = iu.a.objectFieldOffset(m98.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public g42[] a;

    public final void a(g42 g42Var) {
        g42Var.d((h42) this);
        g42[] g42VarArr = this.a;
        if (g42VarArr == null) {
            g42VarArr = new g42[4];
            this.a = g42VarArr;
        } else if (b() >= g42VarArr.length) {
            g42VarArr = (g42[]) Arrays.copyOf(g42VarArr, b() * 2);
            this.a = g42VarArr;
        }
        int iB = b();
        iu.a.putIntVolatile(this, b, iB + 1);
        g42VarArr[iB] = g42Var;
        g42Var.Y = iB;
        d(iB);
    }

    public final int b() {
        return iu.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final g42 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        iu.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                g42 g42Var = objArr2[i];
                g42Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (g42Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        g42 g42Var2 = objArr2[b()];
        g42Var2.getClass();
        g42Var2.d(null);
        g42Var2.Y = -1;
        objArr2[b()] = null;
        return g42Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            g42[] g42VarArr = this.a;
            g42VarArr.getClass();
            int i2 = (i - 1) / 2;
            g42 g42Var = g42VarArr[i2];
            g42Var.getClass();
            g42 g42Var2 = g42VarArr[i];
            g42Var2.getClass();
            if (g42Var.compareTo(g42Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        g42[] g42VarArr = this.a;
        g42VarArr.getClass();
        g42 g42Var = g42VarArr[i2];
        g42Var.getClass();
        g42 g42Var2 = g42VarArr[i];
        g42Var2.getClass();
        g42VarArr[i] = g42Var;
        g42VarArr[i2] = g42Var2;
        g42Var.Y = i;
        g42Var2.Y = i2;
    }
}
