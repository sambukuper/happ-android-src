.class public final Lokhttp3/internal/idn/Punycode;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J)\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u00a8\u00060"
    }
    d2 = {
        "Lokhttp3/internal/idn/Punycode;",
        "",
        "<init>",
        "()V",
        "",
        "string",
        "",
        "pos",
        "limit",
        "Li90;",
        "result",
        "",
        "encodeLabel",
        "(Ljava/lang/String;IILi90;)Z",
        "decodeLabel",
        "delta",
        "numpoints",
        "first",
        "adapt",
        "(IIZ)I",
        "requiresEncode",
        "(Ljava/lang/String;II)Z",
        "",
        "codePoints",
        "(Ljava/lang/String;II)Ljava/util/List;",
        "encode",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "decode",
        "PREFIX_STRING",
        "Ljava/lang/String;",
        "getPREFIX_STRING",
        "()Ljava/lang/String;",
        "Lkb0;",
        "PREFIX",
        "Lkb0;",
        "getPREFIX",
        "()Lkb0;",
        "BASE",
        "I",
        "TMIN",
        "TMAX",
        "SKEW",
        "DAMP",
        "INITIAL_BIAS",
        "INITIAL_N",
        "getPunycodeDigit",
        "(I)I",
        "punycodeDigit",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BASE:I = 0x24

.field private static final DAMP:I = 0x2bc

.field private static final INITIAL_BIAS:I = 0x48

.field private static final INITIAL_N:I = 0x80

.field public static final INSTANCE:Lokhttp3/internal/idn/Punycode;

.field private static final PREFIX:Lkb0;

.field private static final PREFIX_STRING:Ljava/lang/String;

.field private static final SKEW:I = 0x26

.field private static final TMAX:I = 0x1a

.field private static final TMIN:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/idn/Punycode;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/internal/idn/Punycode;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lokhttp3/internal/idn/Punycode;->INSTANCE:Lokhttp3/internal/idn/Punycode;

    .line 7
    .line 8
    const-string v0, "xn--"

    .line 9
    .line 10
    sput-object v0, Lokhttp3/internal/idn/Punycode;->PREFIX_STRING:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Lkb0;->f0:Lkb0;

    .line 13
    .line 14
    invoke-static {v0}, Lra;->g(Ljava/lang/String;)Lkb0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lokhttp3/internal/idn/Punycode;->PREFIX:Lkb0;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final adapt(IIZ)I
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    div-int/lit16 p1, p1, 0x2bc

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    div-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    :goto_0
    div-int p0, p1, p2

    .line 9
    .line 10
    add-int/2addr p0, p1

    .line 11
    const/4 p1, 0x0

    .line 12
    :goto_1
    const/16 p2, 0x1c7

    .line 13
    .line 14
    if-le p0, p2, :cond_1

    .line 15
    .line 16
    div-int/lit8 p0, p0, 0x23

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x24

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    mul-int/lit8 p2, p0, 0x24

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x26

    .line 24
    .line 25
    div-int/2addr p2, p0

    .line 26
    add-int/2addr p2, p1

    .line 27
    return p2
.end method

.method private final codePoints(Ljava/lang/String;II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p2, p3, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xd800

    .line 13
    .line 14
    .line 15
    if-gt v1, v0, :cond_3

    .line 16
    .line 17
    const v1, 0xe000

    .line 18
    .line 19
    .line 20
    if-ge v0, v1, :cond_3

    .line 21
    .line 22
    add-int/lit8 v1, p2, 0x1

    .line 23
    .line 24
    if-ge v1, p3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_1
    invoke-static {v0}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    and-int/lit16 p2, v0, 0x3ff

    .line 46
    .line 47
    shl-int/lit8 p2, p2, 0xa

    .line 48
    .line 49
    and-int/lit16 v0, v2, 0x3ff

    .line 50
    .line 51
    or-int/2addr p2, v0

    .line 52
    const/high16 v0, 0x10000

    .line 53
    .line 54
    add-int/2addr v0, p2

    .line 55
    move p2, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    :goto_2
    const/16 v0, 0x3f

    .line 58
    .line 59
    :cond_3
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 p2, p2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    return-object p0
.end method

.method private final decodeLabel(Ljava/lang/String;IILi90;)Z
    .locals 21

    .line 1
    move/from16 v6, p3

    .line 2
    .line 3
    move-object/from16 v7, p4

    .line 4
    .line 5
    sget-object v4, Lokhttp3/internal/idn/Punycode;->PREFIX_STRING:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    move/from16 v0, p2

    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lmm7;->U(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v7, v0, v6, v3}, Li90;->c1(IILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    const/4 v1, 0x4

    .line 26
    add-int/2addr v0, v1

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    const/16 v5, 0x2d

    .line 33
    .line 34
    invoke-static {v3, v5, v6, v1}, Lfm7;->q0(Ljava/lang/CharSequence;CII)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/16 v8, 0x3a

    .line 39
    .line 40
    const/16 v9, 0x30

    .line 41
    .line 42
    const/16 v10, 0x5b

    .line 43
    .line 44
    const/16 v11, 0x7b

    .line 45
    .line 46
    const/16 v12, 0x41

    .line 47
    .line 48
    const/16 v13, 0x61

    .line 49
    .line 50
    if-lt v1, v0, :cond_6

    .line 51
    .line 52
    :goto_0
    if-ge v0, v1, :cond_5

    .line 53
    .line 54
    add-int/lit8 v15, v0, 0x1

    .line 55
    .line 56
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-gt v13, v0, :cond_1

    .line 61
    .line 62
    if-ge v0, v11, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-gt v12, v0, :cond_2

    .line 66
    .line 67
    if-ge v0, v10, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    if-gt v9, v0, :cond_3

    .line 71
    .line 72
    if-ge v0, v8, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    if-ne v0, v5, :cond_4

    .line 76
    .line 77
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move v0, v15

    .line 85
    goto :goto_0

    .line 86
    :cond_4
    const/16 p2, 0x0

    .line 87
    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :cond_5
    add-int/2addr v0, v2

    .line 91
    :cond_6
    const/16 v1, 0x80

    .line 92
    .line 93
    const/16 v5, 0x48

    .line 94
    .line 95
    const/4 v15, 0x0

    .line 96
    :goto_2
    if-ge v0, v6, :cond_16

    .line 97
    .line 98
    move/from16 v16, v2

    .line 99
    .line 100
    const/16 v2, 0x24

    .line 101
    .line 102
    const/16 p2, 0x0

    .line 103
    .line 104
    const v14, 0x7fffffff

    .line 105
    .line 106
    .line 107
    invoke-static {v2, v14}, Lx97;->a0(II)Lkf3;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-static {v8, v2}, Lx97;->W(Lkf3;I)Lif3;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget v8, v2, Lif3;->X:I

    .line 116
    .line 117
    move/from16 v17, v14

    .line 118
    .line 119
    iget v14, v2, Lif3;->Y:I

    .line 120
    .line 121
    iget v2, v2, Lif3;->Z:I

    .line 122
    .line 123
    if-lez v2, :cond_7

    .line 124
    .line 125
    if-le v8, v14, :cond_8

    .line 126
    .line 127
    :cond_7
    if-gez v2, :cond_11

    .line 128
    .line 129
    if-gt v14, v8, :cond_11

    .line 130
    .line 131
    :cond_8
    move/from16 v18, v15

    .line 132
    .line 133
    move/from16 v19, v16

    .line 134
    .line 135
    :goto_3
    if-ne v0, v6, :cond_9

    .line 136
    .line 137
    goto/16 :goto_a

    .line 138
    .line 139
    :cond_9
    add-int/lit8 v20, v0, 0x1

    .line 140
    .line 141
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-gt v13, v0, :cond_a

    .line 146
    .line 147
    if-ge v0, v11, :cond_a

    .line 148
    .line 149
    add-int/lit8 v0, v0, -0x61

    .line 150
    .line 151
    :goto_4
    move/from16 v9, v19

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_a
    if-gt v12, v0, :cond_b

    .line 155
    .line 156
    if-ge v0, v10, :cond_b

    .line 157
    .line 158
    add-int/lit8 v0, v0, -0x41

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_b
    if-gt v9, v0, :cond_14

    .line 162
    .line 163
    const/16 v9, 0x3a

    .line 164
    .line 165
    if-ge v0, v9, :cond_14

    .line 166
    .line 167
    add-int/lit8 v0, v0, -0x16

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :goto_5
    mul-int v19, v0, v9

    .line 171
    .line 172
    sub-int v10, v17, v19

    .line 173
    .line 174
    move/from16 v11, v18

    .line 175
    .line 176
    if-le v11, v10, :cond_c

    .line 177
    .line 178
    goto :goto_a

    .line 179
    :cond_c
    add-int v18, v11, v19

    .line 180
    .line 181
    if-gt v8, v5, :cond_d

    .line 182
    .line 183
    move/from16 v10, v16

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_d
    add-int/lit8 v10, v5, 0x1a

    .line 187
    .line 188
    if-lt v8, v10, :cond_e

    .line 189
    .line 190
    const/16 v10, 0x1a

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_e
    sub-int v10, v8, v5

    .line 194
    .line 195
    :goto_6
    if-lt v0, v10, :cond_10

    .line 196
    .line 197
    rsub-int/lit8 v0, v10, 0x24

    .line 198
    .line 199
    div-int v10, v17, v0

    .line 200
    .line 201
    if-le v9, v10, :cond_f

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_f
    mul-int v19, v9, v0

    .line 205
    .line 206
    if-eq v8, v14, :cond_10

    .line 207
    .line 208
    add-int/2addr v8, v2

    .line 209
    move/from16 v0, v20

    .line 210
    .line 211
    const/16 v9, 0x30

    .line 212
    .line 213
    const/16 v10, 0x5b

    .line 214
    .line 215
    const/16 v11, 0x7b

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_10
    move/from16 v0, v20

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_11
    move/from16 v18, v15

    .line 222
    .line 223
    :goto_7
    sub-int v2, v18, v15

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    add-int/lit8 v5, v5, 0x1

    .line 230
    .line 231
    if-nez v15, :cond_12

    .line 232
    .line 233
    move/from16 v9, v16

    .line 234
    .line 235
    :goto_8
    move-object/from16 v8, p0

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_12
    move/from16 v9, p2

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :goto_9
    invoke-direct {v8, v2, v5, v9}, Lokhttp3/internal/idn/Punycode;->adapt(IIZ)I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    add-int/lit8 v2, v2, 0x1

    .line 250
    .line 251
    div-int v2, v18, v2

    .line 252
    .line 253
    sub-int v14, v17, v2

    .line 254
    .line 255
    if-le v1, v14, :cond_13

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_13
    add-int/2addr v1, v2

    .line 259
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    add-int/lit8 v2, v2, 0x1

    .line 264
    .line 265
    rem-int v2, v18, v2

    .line 266
    .line 267
    const v9, 0x10ffff

    .line 268
    .line 269
    .line 270
    if-le v1, v9, :cond_15

    .line 271
    .line 272
    :cond_14
    :goto_a
    return p2

    .line 273
    :cond_15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-virtual {v4, v2, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    add-int/lit8 v15, v2, 0x1

    .line 281
    .line 282
    move/from16 v2, v16

    .line 283
    .line 284
    const/16 v8, 0x3a

    .line 285
    .line 286
    const/16 v9, 0x30

    .line 287
    .line 288
    const/16 v10, 0x5b

    .line 289
    .line 290
    const/16 v11, 0x7b

    .line 291
    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_16
    move/from16 v16, v2

    .line 295
    .line 296
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-eqz v1, :cond_17

    .line 305
    .line 306
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    check-cast v1, Ljava/lang/Number;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v7, v1}, Li90;->e1(I)V

    .line 317
    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_17
    return v16
.end method

.method private final encodeLabel(Ljava/lang/String;IILi90;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-direct/range {p0 .. p3}, Lokhttp3/internal/idn/Punycode;->requiresEncode(Ljava/lang/String;II)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    move/from16 v4, p2

    .line 15
    .line 16
    move/from16 v5, p3

    .line 17
    .line 18
    invoke-virtual {v1, v4, v5, v2}, Li90;->c1(IILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    move-object/from16 v2, p1

    .line 23
    .line 24
    move/from16 v4, p2

    .line 25
    .line 26
    move/from16 v5, p3

    .line 27
    .line 28
    sget-object v6, Lokhttp3/internal/idn/Punycode;->PREFIX:Lkb0;

    .line 29
    .line 30
    invoke-virtual {v1, v6}, Li90;->C0(Lkb0;)V

    .line 31
    .line 32
    .line 33
    invoke-direct/range {p0 .. p3}, Lokhttp3/internal/idn/Punycode;->codePoints(Ljava/lang/String;II)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const/4 v5, 0x0

    .line 42
    move v6, v5

    .line 43
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/16 v8, 0x80

    .line 48
    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-ge v7, v8, :cond_1

    .line 62
    .line 63
    invoke-virtual {v1, v7}, Li90;->H0(I)V

    .line 64
    .line 65
    .line 66
    add-int/lit8 v6, v6, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-lez v6, :cond_3

    .line 70
    .line 71
    const/16 v4, 0x2d

    .line 72
    .line 73
    invoke-virtual {v1, v4}, Li90;->H0(I)V

    .line 74
    .line 75
    .line 76
    :cond_3
    const/16 v4, 0x48

    .line 77
    .line 78
    move v9, v5

    .line 79
    move v7, v6

    .line 80
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-ge v7, v10, :cond_16

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_15

    .line 95
    .line 96
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v12

    .line 104
    const v13, 0x7fffffff

    .line 105
    .line 106
    .line 107
    if-nez v12, :cond_4

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    move-object v12, v11

    .line 111
    check-cast v12, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-lt v12, v8, :cond_5

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    move v12, v13

    .line 121
    :cond_6
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    move-object v15, v14

    .line 126
    check-cast v15, Ljava/lang/Number;

    .line 127
    .line 128
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-lt v15, v8, :cond_7

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    move v15, v13

    .line 136
    :goto_3
    if-le v12, v15, :cond_8

    .line 137
    .line 138
    move-object v11, v14

    .line 139
    move v12, v15

    .line 140
    :cond_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    if-nez v14, :cond_6

    .line 145
    .line 146
    :goto_4
    check-cast v11, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    sub-int v8, v10, v8

    .line 153
    .line 154
    add-int/lit8 v11, v7, 0x1

    .line 155
    .line 156
    mul-int/2addr v11, v8

    .line 157
    sub-int v8, v13, v11

    .line 158
    .line 159
    if-le v9, v8, :cond_9

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_9
    add-int/2addr v9, v11

    .line 163
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    :cond_a
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-eqz v11, :cond_14

    .line 172
    .line 173
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    check-cast v11, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-ge v11, v10, :cond_c

    .line 184
    .line 185
    if-ne v9, v13, :cond_b

    .line 186
    .line 187
    :goto_6
    return v5

    .line 188
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_c
    if-ne v11, v10, :cond_a

    .line 192
    .line 193
    const/16 v11, 0x24

    .line 194
    .line 195
    invoke-static {v11, v13}, Lx97;->a0(II)Lkf3;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-static {v12, v11}, Lx97;->W(Lkf3;I)Lif3;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    iget v12, v11, Lif3;->X:I

    .line 204
    .line 205
    iget v14, v11, Lif3;->Y:I

    .line 206
    .line 207
    iget v11, v11, Lif3;->Z:I

    .line 208
    .line 209
    if-lez v11, :cond_d

    .line 210
    .line 211
    if-le v12, v14, :cond_e

    .line 212
    .line 213
    :cond_d
    if-gez v11, :cond_11

    .line 214
    .line 215
    if-gt v14, v12, :cond_11

    .line 216
    .line 217
    :cond_e
    move v15, v9

    .line 218
    :goto_7
    if-gt v12, v4, :cond_f

    .line 219
    .line 220
    move/from16 v16, v3

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_f
    move/from16 v16, v3

    .line 224
    .line 225
    add-int/lit8 v3, v4, 0x1a

    .line 226
    .line 227
    if-lt v12, v3, :cond_10

    .line 228
    .line 229
    const/16 v3, 0x1a

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_10
    sub-int v3, v12, v4

    .line 233
    .line 234
    :goto_8
    if-lt v15, v3, :cond_12

    .line 235
    .line 236
    sub-int/2addr v15, v3

    .line 237
    rsub-int/lit8 v17, v3, 0x24

    .line 238
    .line 239
    rem-int v18, v15, v17

    .line 240
    .line 241
    add-int v3, v18, v3

    .line 242
    .line 243
    invoke-direct {v0, v3}, Lokhttp3/internal/idn/Punycode;->getPunycodeDigit(I)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    invoke-virtual {v1, v3}, Li90;->H0(I)V

    .line 248
    .line 249
    .line 250
    div-int v15, v15, v17

    .line 251
    .line 252
    if-eq v12, v14, :cond_12

    .line 253
    .line 254
    add-int/2addr v12, v11

    .line 255
    move/from16 v3, v16

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_11
    move/from16 v16, v3

    .line 259
    .line 260
    move v15, v9

    .line 261
    :cond_12
    invoke-direct {v0, v15}, Lokhttp3/internal/idn/Punycode;->getPunycodeDigit(I)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    invoke-virtual {v1, v3}, Li90;->H0(I)V

    .line 266
    .line 267
    .line 268
    add-int/lit8 v3, v7, 0x1

    .line 269
    .line 270
    if-ne v7, v6, :cond_13

    .line 271
    .line 272
    move/from16 v4, v16

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_13
    move v4, v5

    .line 276
    :goto_9
    invoke-direct {v0, v9, v3, v4}, Lokhttp3/internal/idn/Punycode;->adapt(IIZ)I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    move v7, v3

    .line 281
    move v9, v5

    .line 282
    move/from16 v3, v16

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_14
    move/from16 v16, v3

    .line 286
    .line 287
    add-int/lit8 v9, v9, 0x1

    .line 288
    .line 289
    add-int/lit8 v8, v10, 0x1

    .line 290
    .line 291
    goto/16 :goto_1

    .line 292
    .line 293
    :cond_15
    invoke-static {}, Lbt;->n()V

    .line 294
    .line 295
    .line 296
    return v5

    .line 297
    :cond_16
    move/from16 v16, v3

    .line 298
    .line 299
    return v16
.end method

.method private final getPunycodeDigit(I)I
    .locals 0

    .line 1
    const/16 p0, 0x1a

    .line 2
    .line 3
    if-ge p1, p0, :cond_0

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x61

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    const/16 p0, 0x24

    .line 9
    .line 10
    if-ge p1, p0, :cond_1

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x16

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p0, "unexpected digit: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Lkp5;->g(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method private final requiresEncode(Ljava/lang/String;II)Z
    .locals 1

    .line 1
    :goto_0
    if-ge p2, p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x80

    .line 8
    .line 9
    if-lt p0, v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method


# virtual methods
.method public final decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-instance v1, Li90;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    const/16 v4, 0x2e

    .line 18
    .line 19
    invoke-static {p1, v4, v2, v3}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v5, -0x1

    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    move v3, v0

    .line 27
    :cond_0
    invoke-direct {p0, p1, v2, v3, v1}, Lokhttp3/internal/idn/Punycode;->decodeLabel(Ljava/lang/String;IILi90;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    if-ge v3, v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Li90;->H0(I)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v1}, Li90;->Y()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-instance v1, Li90;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    const/16 v4, 0x2e

    .line 18
    .line 19
    invoke-static {p1, v4, v2, v3}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v5, -0x1

    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    move v3, v0

    .line 27
    :cond_0
    invoke-direct {p0, p1, v2, v3, v1}, Lokhttp3/internal/idn/Punycode;->encodeLabel(Ljava/lang/String;IILi90;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_1
    if-ge v3, v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, v4}, Li90;->H0(I)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v1}, Li90;->Y()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final getPREFIX()Lkb0;
    .locals 0

    .line 1
    sget-object p0, Lokhttp3/internal/idn/Punycode;->PREFIX:Lkb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPREFIX_STRING()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lokhttp3/internal/idn/Punycode;->PREFIX_STRING:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
