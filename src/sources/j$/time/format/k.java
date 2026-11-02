package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public class k {
    public String a;
    public String b;
    public final char c;
    public k d;
    public k e;

    public k(String str, String str2, k kVar) {
        this.a = str;
        this.b = str2;
        this.d = kVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public final boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i != this.a.length()) {
            k kVarD = d(this.a.substring(i), this.b, this.d);
            this.a = str.substring(0, i);
            this.d = kVarD;
            if (i >= str.length()) {
                this.b = str2;
                return true;
            }
            this.d.e = d(str.substring(i), str2, null);
            this.b = null;
            return true;
        }
        if (i >= str.length()) {
            this.b = str2;
            return true;
        }
        String strSubstring = str.substring(i);
        for (k kVar = this.d; kVar != null; kVar = kVar.e) {
            if (b(kVar.c, strSubstring.charAt(0))) {
                return kVar.a(strSubstring, str2);
            }
        }
        k kVarD2 = d(strSubstring, str2, null);
        kVarD2.e = this.d;
        this.d = kVarD2;
        return true;
    }

    public boolean b(char c, char c2) {
        return c == c2;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        k kVar = this.d;
        if (kVar != null && length2 != length) {
            while (!b(kVar.c, charSequence.charAt(length2))) {
                kVar = kVar.e;
                if (kVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = kVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    public k d(String str, String str2, k kVar) {
        return new k(str, str2, kVar);
    }

    public boolean e(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof String;
        String str = this.a;
        if (z) {
            return ((String) charSequence).startsWith(str, i);
        }
        int length = str.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
