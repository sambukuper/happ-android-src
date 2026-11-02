package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public ec0(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(String str, int i, String str2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(new qb0(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList<qb0> arrayList = this.c;
        if (arrayList != null) {
            for (qb0 qb0Var : arrayList) {
                sb.append('[');
                String str2 = qb0Var.a;
                String str3 = qb0Var.c;
                sb.append(str2);
                int iB = p61.B(qb0Var.b);
                if (iB == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iB == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iB == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList<ub0> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (ub0 ub0Var : arrayList2) {
                sb.append(':');
                sb.append(ub0Var);
            }
        }
        return sb.toString();
    }
}
