package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements e {
    public final TemporalField a;
    public final w b;
    public final a c;
    public volatile h d;

    public n(TemporalField temporalField, w wVar, a aVar) {
        this.a = temporalField;
        this.b = wVar;
        this.c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean t(q qVar, StringBuilder sb) {
        String strA;
        Long lA = qVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = qVar.b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) qVar.a.d(j$.time.temporal.p.b);
        if (kVar == null || kVar == j$.time.chrono.r.c) {
            a aVar = this.c;
            long jLongValue = lA.longValue();
            w wVar = this.b;
            Locale locale = dateTimeFormatter.b;
            strA = aVar.a.a(jLongValue, wVar);
        } else {
            a aVar2 = this.c;
            long jLongValue2 = lA.longValue();
            w wVar2 = this.b;
            Locale locale2 = dateTimeFormatter.b;
            strA = aVar2.a.a(jLongValue2, wVar2);
        }
        if (strA != null) {
            sb.append(strA);
            return true;
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.t(qVar, sb);
    }

    public final String toString() {
        w wVar = w.FULL;
        w wVar2 = this.b;
        TemporalField temporalField = this.a;
        if (wVar2 == wVar) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + wVar2 + ")";
    }

    @Override // j$.time.format.e
    public final int x(o oVar, CharSequence charSequence, int i) {
        a aVar = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = oVar.c;
        DateTimeFormatter dateTimeFormatter = oVar.a;
        Iterator it = null;
        w wVar = z ? this.b : null;
        j$.time.chrono.k kVar = oVar.c().c;
        if (kVar == null && (kVar = oVar.a.d) == null) {
            kVar = j$.time.chrono.r.c;
        }
        if (kVar == null || kVar == j$.time.chrono.r.c) {
            Locale locale = dateTimeFormatter.b;
            List list = (List) ((HashMap) aVar.a.b).get(wVar);
            if (list != null) {
                it = list.iterator();
            }
        } else {
            List list2 = (List) ((HashMap) aVar.a.b).get(wVar);
            if (list2 != null) {
                it = list2.iterator();
            }
        }
        Iterator it2 = it;
        if (it2 != null) {
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str = (String) entry.getKey();
                if (oVar.g(str, 0, charSequence, i, str.length())) {
                    return oVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (temporalField == ChronoField.ERA && !oVar.c) {
                for (j$.time.chrono.l lVar : kVar.w()) {
                    String string = lVar.toString();
                    if (oVar.g(string, 0, charSequence, i, string.length())) {
                        return oVar.f(this.a, lVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (oVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new h(this.a, 1, 19, SignStyle.NORMAL);
        }
        return this.d.x(oVar, charSequence, i);
    }
}
