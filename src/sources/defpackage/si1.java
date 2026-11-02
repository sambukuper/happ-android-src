package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class si1 implements mi1 {
    public final k09 d;
    public int f;
    public int g;
    public k09 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public zo1 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public si1(k09 k09Var) {
        this.d = k09Var;
    }

    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        ArrayList<si1> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((si1) it.next()).j) {
                return;
            }
        }
        this.c = true;
        k09 k09Var = this.a;
        if (k09Var != null) {
            k09Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        si1 si1Var = null;
        int i = 0;
        for (si1 si1Var2 : arrayList) {
            if (!(si1Var2 instanceof zo1)) {
                i++;
                si1Var = si1Var2;
            }
        }
        if (si1Var != null && i == 1 && si1Var.j) {
            zo1 zo1Var = this.i;
            if (zo1Var != null) {
                if (!zo1Var.j) {
                    return;
                } else {
                    this.f = this.h * zo1Var.g;
                }
            }
            d(si1Var.g + this.f);
        }
        k09 k09Var2 = this.a;
        if (k09Var2 != null) {
            k09Var2.a(this);
        }
    }

    public final void b(k09 k09Var) {
        this.k.add(k09Var);
        if (this.j) {
            k09Var.a(k09Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (mi1 mi1Var : this.k) {
            mi1Var.a(mi1Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
