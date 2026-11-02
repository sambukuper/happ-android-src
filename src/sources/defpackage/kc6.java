package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kc6 implements Serializable {
    public final Pattern X;

    public kc6() {
        Pattern patternCompile = Pattern.compile(".*#.+serverDescription=([^&,#]+)&?", 66);
        patternCompile.getClass();
        this.X = patternCompile;
    }

    public static fq4 a(kc6 kc6Var, CharSequence charSequence) {
        kc6Var.getClass();
        Matcher matcher = kc6Var.X.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new fq4(matcher, charSequence);
        }
        return null;
    }

    public final fq4 b(int i, String str) {
        Matcher matcherRegion = this.X.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new fq4(matcherRegion, str);
        }
        return null;
    }

    public final fq4 c(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.X.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new fq4(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.X.matcher(charSequence).matches();
    }

    public final String e(String str, gn2 gn2Var) {
        str.getClass();
        fq4 fq4VarA = a(this, str);
        if (fq4VarA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, fq4VarA.b().X);
            sb.append((CharSequence) gn2Var.B(fq4VarA));
            i = fq4VarA.b().Y + 1;
            CharSequence charSequence = fq4VarA.b;
            Matcher matcher = fq4VarA.a;
            int iEnd = matcher.end() + (matcher.end() != matcher.start() ? 0 : 1);
            fq4 fq4Var = null;
            if (iEnd <= charSequence.length()) {
                Matcher matcher2 = matcher.pattern().matcher(charSequence);
                matcher2.getClass();
                if (matcher2.find(iEnd)) {
                    fq4Var = new fq4(matcher2, charSequence);
                }
            }
            fq4VarA = fq4Var;
            if (i >= length) {
                break;
            }
        } while (fq4VarA != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String string = this.X.toString();
        string.getClass();
        return string;
    }

    public kc6(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.X = patternCompile;
    }
}
