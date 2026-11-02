package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ip1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public sa2 g;
    public int h;
    public final /* synthetic */ lp1 i;

    public ip1(lp1 lp1Var, String str) {
        this.i = lp1Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.X.f(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.X.f(sb.toString()));
            sb.setLength(length);
        }
    }

    public final jp1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            lp1 lp1Var = this.i;
            if (i >= size) {
                this.h++;
                return new jp1(lp1Var, this);
            }
            if (!lp1Var.s0.exists((oi5) arrayList.get(i))) {
                try {
                    lp1Var.R(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
