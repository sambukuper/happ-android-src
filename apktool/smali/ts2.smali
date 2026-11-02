.class public final Lts2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lwo5;
.implements Lwp5;


# static fields
.field public static X:Lts2;

.field public static final Y:Lts2;

.field public static final Z:Lts2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lts2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lts2;->Y:Lts2;

    .line 7
    .line 8
    new-instance v0, Lts2;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lts2;->Z:Lts2;

    .line 14
    .line 15
    return-void
.end method

.method public static c(Ljava/lang/String;Ldj2;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Ldj2;->g0:Ldj2;

    .line 4
    .line 5
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    if-nez p2, :cond_3

    .line 23
    .line 24
    sget-object v0, Ldj2;->i0:Ldj2;

    .line 25
    .line 26
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    :cond_2
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    const/4 v0, 0x0

    .line 44
    if-nez p0, :cond_4

    .line 45
    .line 46
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-static {p0, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    iget p1, p1, Ldj2;->X:I

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    if-ne p2, v1, :cond_5

    .line 57
    .line 58
    move v0, v1

    .line 59
    :cond_5
    invoke-static {p0, p1, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static e(Li51;Landroid/content/Context;Lu38;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget v0, p2, Lu38;->c:I

    .line 5
    .line 6
    iget-object v1, p2, Lu38;->b:Landroid/view/textclassifier/TextClassification;

    .line 7
    .line 8
    iget-object p2, p2, Lu38;->d:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-gez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lb1;

    .line 16
    .line 17
    const/16 v5, 0x1a

    .line 18
    .line 19
    invoke-direct {v0, v1, v5}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    new-instance v3, Lm38;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v3, p2, v5}, Lm38;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 28
    .line 29
    .line 30
    new-instance p2, Lzy0;

    .line 31
    .line 32
    const v5, -0x42f30a7b

    .line 33
    .line 34
    .line 35
    invoke-direct {p2, v5, v4, v3}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v3, p2

    .line 39
    :cond_1
    new-instance p2, La23;

    .line 40
    .line 41
    const/16 v4, 0x19

    .line 42
    .line 43
    invoke-direct {p2, p1, v1, v4}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v0, v3, p2, v2}, Li51;->b(Li51;Lrn2;Lzy0;Ldn2;I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-virtual {v1}, Landroid/view/textclassifier/TextClassification;->getActions()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Landroid/app/RemoteAction;

    .line 59
    .line 60
    new-instance v0, Lb1;

    .line 61
    .line 62
    const/16 v1, 0x1b

    .line 63
    .line 64
    invoke-direct {v0, p1, v1}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    new-instance v1, Lm38;

    .line 70
    .line 71
    invoke-direct {v1, p2, v4}, Lm38;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Lzy0;

    .line 75
    .line 76
    const p2, 0x41eeb29c

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, p2, v4, v1}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    new-instance p2, Lhr5;

    .line 83
    .line 84
    const/16 v1, 0x1d

    .line 85
    .line 86
    invoke-direct {p2, p1, v1}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v0, v3, p2, v2}, Li51;->b(Li51;Lrn2;Lzy0;Ldn2;I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static final f(Landroid/view/textclassifier/TextClassification;Llp2;)Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x38a0c7d5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->W(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Llp2;->p(Z)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final g(Landroid/app/RemoteAction;Llp2;)Ljava/lang/String;
    .locals 1

    .line 1
    const v0, -0x520d2714

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->W(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/RemoteAction;->getTitle()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Llp2;->p(Z)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final h(Landroid/app/RemoteAction;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/RemoteAction;->getActionIntent()Landroid/app/PendingIntent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x22

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lu3;->B(Landroid/app/PendingIntent;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/app/PendingIntent;->send()V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-void
.end method

.method public static final i(Landroid/content/pm/PackageInfo;)Z
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_d

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "com.android.vending"

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "com.google.android.gms"

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v1, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_1
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 31
    .line 32
    if-nez v1, :cond_4

    .line 33
    .line 34
    :cond_3
    move v1, v0

    .line 35
    goto :goto_2

    .line 36
    :cond_4
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 37
    .line 38
    and-int/lit16 v1, v1, 0x81

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_2
    if-eqz v1, :cond_5

    .line 44
    .line 45
    :try_start_0
    sget-object v3, Lta9;->c:Lv99;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    sget-object v3, Lta9;->b:Lv99;

    .line 49
    .line 50
    :goto_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v5, 0x1c

    .line 53
    .line 54
    if-ge v4, v5, :cond_8

    .line 55
    .line 56
    iget-object v4, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    array-length v6, v4

    .line 62
    if-ne v6, v2, :cond_6

    .line 63
    .line 64
    aget-object v4, v4, v0

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :cond_6
    if-eqz v5, :cond_7

    .line 71
    .line 72
    sget-object v4, Lt99;->Y:Lp99;

    .line 73
    .line 74
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v2, v4}, Lp38;->g(I[Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v5, Lv99;

    .line 82
    .line 83
    invoke-direct {v5, v2, v4}, Lv99;-><init>(I[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_9

    .line 87
    .line 88
    :cond_7
    sget-object v4, Lt99;->Y:Lp99;

    .line 89
    .line 90
    sget-object v5, Lv99;->g0:Lv99;

    .line 91
    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_8
    if-lt v4, v5, :cond_15

    .line 95
    .line 96
    iget-object v4, p0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    .line 97
    .line 98
    if-eqz v4, :cond_11

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/content/pm/SigningInfo;->hasMultipleSigners()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-nez v5, :cond_11

    .line 105
    .line 106
    invoke-virtual {v4}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-nez v5, :cond_9

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_9
    sget-object v5, Lt99;->Y:Lp99;

    .line 114
    .line 115
    const/4 v5, 0x4

    .line 116
    new-array v5, v5, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v4}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    array-length v6, v4

    .line 123
    move v7, v0

    .line 124
    move v8, v7

    .line 125
    :goto_4
    if-ge v7, v6, :cond_f

    .line 126
    .line 127
    aget-object v9, v4, v7

    .line 128
    .line 129
    invoke-virtual {v9}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    array-length v10, v5

    .line 137
    add-int/lit8 v11, v8, 0x1

    .line 138
    .line 139
    if-ltz v11, :cond_e

    .line 140
    .line 141
    if-gt v11, v10, :cond_a

    .line 142
    .line 143
    move v12, v10

    .line 144
    goto :goto_5

    .line 145
    :cond_a
    shr-int/lit8 v12, v10, 0x1

    .line 146
    .line 147
    add-int/2addr v12, v10

    .line 148
    add-int/2addr v12, v2

    .line 149
    if-ge v12, v11, :cond_b

    .line 150
    .line 151
    invoke-static {v8}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    add-int/2addr v12, v12

    .line 156
    :cond_b
    if-gez v12, :cond_c

    .line 157
    .line 158
    const v12, 0x7fffffff

    .line 159
    .line 160
    .line 161
    :cond_c
    :goto_5
    if-gt v12, v10, :cond_d

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_d
    invoke-static {v5, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    :goto_6
    aput-object v9, v5, v8

    .line 169
    .line 170
    add-int/lit8 v7, v7, 0x1

    .line 171
    .line 172
    move v8, v11

    .line 173
    goto :goto_4

    .line 174
    :cond_e
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 175
    .line 176
    const-string v4, "cannot store more than Integer.MAX_VALUE elements"

    .line 177
    .line 178
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw v3

    .line 182
    :cond_f
    if-nez v8, :cond_10

    .line 183
    .line 184
    sget-object v4, Lv99;->g0:Lv99;

    .line 185
    .line 186
    :goto_7
    move-object v5, v4

    .line 187
    goto :goto_9

    .line 188
    :cond_10
    new-instance v4, Lv99;

    .line 189
    .line 190
    invoke-direct {v4, v8, v5}, Lv99;-><init>(I[Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_11
    :goto_8
    sget-object v4, Lt99;->Y:Lp99;

    .line 195
    .line 196
    sget-object v5, Lv99;->g0:Lv99;

    .line 197
    .line 198
    :goto_9
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-nez v4, :cond_14

    .line 203
    .line 204
    invoke-virtual {v5}, Lt99;->e()Lt99;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    move v6, v0

    .line 213
    :goto_a
    if-ge v6, v5, :cond_17

    .line 214
    .line 215
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    check-cast v7, [B

    .line 220
    .line 221
    invoke-virtual {v3, v0}, Lt99;->h(I)Lp99;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    :cond_12
    invoke-virtual {v8}, Lp99;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    add-int/lit8 v10, v6, 0x1

    .line 230
    .line 231
    if-eqz v9, :cond_13

    .line 232
    .line 233
    invoke-virtual {v8}, Lp99;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    check-cast v9, [B

    .line 238
    .line 239
    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    if-eqz v9, :cond_12

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_13
    move v6, v10

    .line 247
    goto :goto_a

    .line 248
    :cond_14
    const-string v3, "Unable to obtain package certificate history."

    .line 249
    .line 250
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 251
    .line 252
    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v4

    .line 256
    :cond_15
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    .line 259
    .line 260
    .line 261
    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    :catch_0
    if-eqz v1, :cond_16

    .line 263
    .line 264
    sget-object v1, Lta9;->a:[Lpa9;

    .line 265
    .line 266
    invoke-static {p0, v1}, Lts2;->j(Landroid/content/pm/PackageInfo;[Lpa9;)Lpa9;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    goto :goto_b

    .line 271
    :cond_16
    sget-object v1, Lta9;->a:[Lpa9;

    .line 272
    .line 273
    aget-object v1, v1, v0

    .line 274
    .line 275
    filled-new-array {v1}, [Lpa9;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {p0, v1}, Lts2;->j(Landroid/content/pm/PackageInfo;[Lpa9;)Lpa9;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    :goto_b
    if-eqz p0, :cond_17

    .line 284
    .line 285
    :goto_c
    return v2

    .line 286
    :cond_17
    :goto_d
    return v0
.end method

.method public static varargs j(Landroid/content/pm/PackageInfo;[Lpa9;)Lpa9;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    array-length v0, v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    new-instance v0, Lsa9;

    .line 12
    .line 13
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    aget-object p0, p0, v1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Lsa9;-><init>([B)V

    .line 23
    .line 24
    .line 25
    :goto_0
    array-length p0, p1

    .line 26
    if-ge v1, p0, :cond_3

    .line 27
    .line 28
    aget-object p0, p1, v1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lpa9;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    aget-object p0, p1, v1

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;ZJFFZLfi1;F)Lvo5;
    .locals 0

    .line 1
    new-instance p0, Lxo5;

    .line 2
    .line 3
    new-instance p2, Landroid/widget/Magnifier;

    .line 4
    .line 5
    invoke-direct {p2, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2}, Lxo5;-><init>(Landroid/widget/Magnifier;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public b(Landroid/graphics/drawable/Drawable;Llp2;I)V
    .locals 6

    .line 1
    const v0, 0xf5caf94

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    const/4 v2, 0x2

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    and-int/lit8 v3, v0, 0x3

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v3, v2, :cond_1

    .line 24
    .line 25
    move v3, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, v4

    .line 28
    :goto_1
    and-int/2addr v0, v5

    .line 29
    invoke-virtual {p2, v0, v3}, Llp2;->N(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    sget-object v0, Lhx4;->X:Lhx4;

    .line 36
    .line 37
    sget v3, Lj51;->e:F

    .line 38
    .line 39
    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/b;->g(Lkx4;F)Lkx4;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p2, p1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {p2}, Llp2;->K()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    sget-object v3, Lzz0;->a:Lbe;

    .line 54
    .line 55
    if-ne v5, v3, :cond_3

    .line 56
    .line 57
    :cond_2
    new-instance v5, Lpy7;

    .line 58
    .line 59
    invoke-direct {v5, p1, v2}, Lpy7;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v5}, Llp2;->g0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    check-cast v5, Lgn2;

    .line 66
    .line 67
    invoke-static {v0, v5}, Lw79;->r(Lkx4;Lgn2;)Lkx4;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0, p2, v4}, Lg80;->a(Lkx4;Llp2;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {p2}, Llp2;->Q()V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {p2}, Llp2;->r()Lj86;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-eqz p2, :cond_5

    .line 83
    .line 84
    new-instance v0, Ld67;

    .line 85
    .line 86
    invoke-direct {v0, v1, p3, p0, p1}, Ld67;-><init>(BILjava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p2, Lj86;->d:Lrn2;

    .line 90
    .line 91
    :cond_5
    return-void
.end method

.method public d(Ldj2;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0, p1, p2}, Lts2;->c(Ljava/lang/String;Ldj2;I)Landroid/graphics/Typeface;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public k(Liq2;Ldj2;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p1, Liq2;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, p2, p3}, Lts2;->c(Ljava/lang/String;Ldj2;I)Landroid/graphics/Typeface;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
