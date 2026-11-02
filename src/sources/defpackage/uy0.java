package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final vz7 f;
    public final vz7 g;

    public uy0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = new vz7(new dn2(this) { // from class: sy0
            public final /* synthetic */ uy0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                d02 d02Var = d02.X;
                int i = 0;
                uy0 uy0Var = this.Y;
                switch (b2) {
                    case 0:
                        List list6 = uy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            bw0.d0(arrayList, (List) ((dn2) list6.get(i)).invoke());
                            i++;
                        }
                        uy0Var.d = d02Var;
                        return arrayList;
                    default:
                        List list7 = uy0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            bw0.d0(arrayList2, (List) ((dn2) list7.get(i)).invoke());
                            i++;
                        }
                        uy0Var.e = d02Var;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = new vz7(new dn2(this) { // from class: sy0
            public final /* synthetic */ uy0 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                d02 d02Var = d02.X;
                int i = 0;
                uy0 uy0Var = this.Y;
                switch (b3) {
                    case 0:
                        List list6 = uy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            bw0.d0(arrayList, (List) ((dn2) list6.get(i)).invoke());
                            i++;
                        }
                        uy0Var.d = d02Var;
                        return arrayList;
                    default:
                        List list7 = uy0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            bw0.d0(arrayList2, (List) ((dn2) list7.get(i)).invoke());
                            i++;
                        }
                        uy0Var.e = d02Var;
                        return arrayList2;
                }
            }
        });
    }
}
