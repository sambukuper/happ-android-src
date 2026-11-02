package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zs0 {
    public static final String a;
    public static final LinkedHashMap b;

    static {
        String str;
        String strY0 = wv0.y0(i21.L('k', 'o', 't', 'l', 'i', 'n'), _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62);
        a = strY0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listL = i21.L("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = z51.B(0, listL.size() - 1, 2);
        if (iB >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listL.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listL.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(oi0.p(sb2, (String) listL.get(i), "Array"), "[" + ((String) listL.get(i2)));
                if (i == iB) {
                    break;
                } else {
                    i += 2;
                }
            }
            strY0 = str;
        }
        linkedHashMap.put(strY0 + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : i21.L("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : i21.L("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, oi0.l("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strJ = pc6.j(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strJ, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : i21.L("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, pc6.o(str5, ".Companion"), oi0.q(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(';');
        return sb.toString();
    }
}
