package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ol implements Appendable {
    public final StringBuilder X;
    public final ArrayList Y;
    public final ArrayList Z;

    public ol() {
        this.X = new StringBuilder(16);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        new ArrayList();
    }

    public final void a(ql qlVar) {
        StringBuilder sb = this.X;
        int length = sb.length();
        sb.append(qlVar.Y);
        List list = qlVar.X;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                pl plVar = (pl) list.get(i);
                Object obj = plVar.a;
                this.Z.add(new nl(plVar.d, plVar.b + length, plVar.c + length, obj));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof ql;
        StringBuilder sb = this.X;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        ql qlVar = (ql) charSequence;
        int length = sb.length();
        sb.append((CharSequence) qlVar.Y, i, i2);
        List listA = rl.a(qlVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                pl plVar = (pl) listA.get(i3);
                Object obj = plVar.a;
                this.Z.add(new nl(plVar.d, plVar.b + length, plVar.c + length, obj));
            }
        }
        return this;
    }

    public final void b(String str) {
        this.X.append(str);
    }

    public final void c(int i) {
        ArrayList arrayList = this.Y;
        if (i >= arrayList.size()) {
            xc3.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                xc3.b("Nothing to pop.");
            }
            ((nl) arrayList.remove(arrayList.size() - 1)).c = this.X.length();
        }
    }

    public final int d(qe7 qe7Var) {
        nl nlVar = new nl(_UrlKt.FRAGMENT_ENCODE_SET, this.X.length(), Integer.MIN_VALUE, qe7Var);
        ArrayList arrayList = this.Y;
        arrayList.add(nlVar);
        this.Z.add(nlVar);
        return arrayList.size() - 1;
    }

    public final ql e() {
        StringBuilder sb = this.X;
        String string = sb.toString();
        ArrayList arrayList = this.Z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((nl) arrayList.get(i)).a(sb.length()));
        }
        return new ql(string, arrayList2);
    }

    public ol(ql qlVar) {
        this();
        a(qlVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof ql) {
            a((ql) charSequence);
            return this;
        }
        this.X.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.X.append(c);
        return this;
    }
}
