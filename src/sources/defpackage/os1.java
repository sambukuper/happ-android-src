package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os1 {
    public static final Pattern d = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");
    public final Set a;
    public final ns1 b = new ns1();
    public final HashSet c = new HashSet();

    public os1(Set set, Set set2) {
        this.a = set2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String lowerCase = fm7.R0((String) it.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            List<String> listM0 = wv0.M0(fm7.E0(lowerCase, new char[]{'.'}));
            ns1 ns1Var = this.b;
            for (String str : listM0) {
                Map map = ns1Var.a;
                Object ns1Var2 = map.get(str);
                if (ns1Var2 == null) {
                    ns1Var2 = new ns1();
                    map.put(str, ns1Var2);
                }
                ns1Var = (ns1) ns1Var2;
            }
            ns1Var.b = true;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = fm7.R0((String) it2.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            lowerCase2 = d.matcher(lowerCase2).matches() ? lowerCase2 : null;
            if (lowerCase2 != null) {
                this.c.add(lowerCase2);
            }
        }
    }
}
