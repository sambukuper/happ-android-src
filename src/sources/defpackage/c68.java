package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c68 implements rn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ c68(byte b) {
        this.X = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return Integer.valueOf(((tr4) obj).a(((Integer) obj2).intValue()));
            case 1:
                q61 q61Var = (q61) obj2;
                if (!(q61Var instanceof i98)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? q61Var : Integer.valueOf(iIntValue + 1);
            case 2:
                i98 i98Var = (i98) obj;
                q61 q61Var2 = (q61) obj2;
                if (i98Var != null) {
                    return i98Var;
                }
                if (q61Var2 instanceof i98) {
                    return (i98) q61Var2;
                }
                return null;
            case 3:
                n98 n98Var = (n98) obj;
                q61 q61Var3 = (q61) obj2;
                if (q61Var3 instanceof i98) {
                    i98 i98Var2 = (i98) q61Var3;
                    s61 s61Var = n98Var.a;
                    Object objB = i98Var2.b();
                    Object[] objArr = n98Var.b;
                    int i = n98Var.d;
                    objArr[i] = objB;
                    i98[] i98VarArr = n98Var.c;
                    n98Var.d = i + 1;
                    i98VarArr[i] = i98Var2;
                }
                return n98Var;
            case 4:
                pz2.D0.B(obj);
                return dn8Var;
            case 5:
                ((String) obj).getClass();
                return dn8Var;
            case 6:
                ((String) obj).getClass();
                return dn8Var;
            default:
                ((String) obj).getClass();
                return dn8Var;
        }
    }
}
