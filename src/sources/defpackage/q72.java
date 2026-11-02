package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 {
    public final Context a;
    public final int b = q36.ic_glob;
    public final kc6 c = new kc6("[🇦-🇿]{2}");

    public q72(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    public final qg5 a(String str) {
        String strConcat;
        String str2;
        str.getClass();
        String string = fm7.R0(str).toString();
        int length = string.length();
        int i = this.b;
        if (length >= 4) {
            ss8 ss8Var = ss8.a;
            ArrayList arrayList = new ArrayList();
            for (String str3 : fm7.T0(string, 4, 1, false)) {
                Pattern patternCompile = Pattern.compile("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-\u1f6ff]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)+");
                patternCompile.getClass();
                str3.getClass();
                if (patternCompile.matcher(str3).matches()) {
                    arrayList.add(str3);
                }
            }
            String str4 = (String) wv0.t0(arrayList);
            if (str4 != null && str4.length() == 4 && this.c.d(str4)) {
                kc6 kc6Var = zl7.a;
                if (str4.length() != 4) {
                    strConcat = null;
                } else {
                    int iCodePointAt = Character.codePointAt(str4, 0) - 127397;
                    int iCodePointAt2 = Character.codePointAt(str4, 2) - 127397;
                    if (Character.isValidCodePoint(iCodePointAt) && Character.isValidCodePoint(iCodePointAt2)) {
                        char[] chars = Character.toChars(iCodePointAt);
                        chars.getClass();
                        String str5 = new String(chars);
                        char[] chars2 = Character.toChars(iCodePointAt2);
                        chars2.getClass();
                        strConcat = str5.concat(new String(chars2));
                    } else {
                        strConcat = null;
                    }
                }
                if (strConcat != null) {
                    String[] iSOCountries = Locale.getISOCountries();
                    iSOCountries.getClass();
                    int length2 = iSOCountries.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            str2 = null;
                            break;
                        }
                        str2 = iSOCountries[i2];
                        if (dh3.f(str2, strConcat)) {
                            break;
                        }
                        i2++;
                    }
                    if (dh3.f(str2, strConcat) || strConcat.equals("EU")) {
                        Context context = this.a;
                        Resources resources = context.getResources();
                        String lowerCase = strConcat.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        int identifier = resources.getIdentifier("ic_".concat(lowerCase), "drawable", context.getPackageName());
                        Integer numValueOf = identifier != 0 ? Integer.valueOf(identifier) : null;
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : i;
                        if (iIntValue != i) {
                            string = mm7.W(string, str4, _UrlKt.FRAGMENT_ENCODE_SET, false);
                        }
                        i = iIntValue;
                    }
                }
            }
        }
        return new qg5(string, Integer.valueOf(i));
    }
}
