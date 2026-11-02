.class public abstract Lvr3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final b:Ljw0;

.field public static final c:Ljw0;

.field public static final d:Ljw0;

.field public static final e:Ljw0;

.field public static final f:Ljw0;

.field public static final g:Ljw0;

.field public static final h:Lzy0;

.field public static final i:Lk82;

.field public static final j:[Lk82;

.field public static k:Lg73;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 11

    .line 1
    sget-object v0, Ljw0;->o0:Ljw0;

    .line 2
    .line 3
    sput-object v0, Lvr3;->b:Ljw0;

    .line 4
    .line 5
    sget-object v0, Ljw0;->h0:Ljw0;

    .line 6
    .line 7
    sput-object v0, Lvr3;->c:Ljw0;

    .line 8
    .line 9
    sget-object v1, Ljw0;->p0:Ljw0;

    .line 10
    .line 11
    sput-object v1, Lvr3;->d:Ljw0;

    .line 12
    .line 13
    sget-object v1, Ljw0;->i0:Ljw0;

    .line 14
    .line 15
    sput-object v1, Lvr3;->e:Ljw0;

    .line 16
    .line 17
    sput-object v0, Lvr3;->f:Ljw0;

    .line 18
    .line 19
    sput-object v1, Lvr3;->g:Ljw0;

    .line 20
    .line 21
    new-instance v0, Ll4;

    .line 22
    .line 23
    const/16 v1, 0xe

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ll4;-><init>(B)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lzy0;

    .line 29
    .line 30
    const v2, 0x72ce8b5f

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, v2, v3, v0}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lvr3;->h:Lzy0;

    .line 38
    .line 39
    new-instance v4, Lk82;

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    const/4 v9, -0x1

    .line 43
    const-wide/16 v5, 0x1

    .line 44
    .line 45
    const-string v7, "register"

    .line 46
    .line 47
    invoke-direct/range {v4 .. v9}, Lk82;-><init>(JLjava/lang/String;ZI)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Lvr3;->i:Lk82;

    .line 51
    .line 52
    new-instance v5, Lk82;

    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    const/4 v10, -0x1

    .line 56
    const-wide/16 v6, 0x1

    .line 57
    .line 58
    const-string v8, "unregister"

    .line 59
    .line 60
    invoke-direct/range {v5 .. v10}, Lk82;-><init>(JLjava/lang/String;ZI)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v4, v5}, [Lk82;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lvr3;->j:[Lk82;

    .line 68
    .line 69
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    iput-byte v0, p0, Lvr3;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final A(Ly07;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ly07;->d:Lt07;

    .line 2
    .line 3
    sget-object v1, Lc17;->L:Le17;

    .line 4
    .line 5
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    check-cast v0, Lib8;

    .line 16
    .line 17
    iget-object p0, p0, Ly07;->d:Lt07;

    .line 18
    .line 19
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 20
    .line 21
    sget-object v2, Lc17;->z:Le17;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    :cond_1
    check-cast v2, Lkl6;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    move v0, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    :goto_0
    sget-object v4, Lc17;->K:Le17;

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move-object v1, p0

    .line 48
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz v1, :cond_6

    .line 51
    .line 52
    if-nez v2, :cond_4

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    iget-byte p0, v2, Lkl6;->a:B

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    if-ne p0, v1, :cond_5

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_5
    :goto_2
    return v3

    .line 62
    :cond_6
    :goto_3
    return v0
.end method

.method public static final B(Ly07;Landroid/content/res/Resources;)Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Ly07;->d:Lt07;

    .line 2
    .line 3
    iget-object v1, p0, Ly07;->d:Lt07;

    .line 4
    .line 5
    sget-object v2, Lc17;->b:Le17;

    .line 6
    .line 7
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move-object v0, v2

    .line 17
    :cond_0
    iget-object v3, v1, Lt07;->X:Ls05;

    .line 18
    .line 19
    sget-object v4, Lc17;->L:Le17;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    move-object v4, v2

    .line 28
    :cond_1
    check-cast v4, Lib8;

    .line 29
    .line 30
    sget-object v5, Lc17;->z:Le17;

    .line 31
    .line 32
    invoke-virtual {v3, v5}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    move-object v5, v2

    .line 39
    :cond_2
    check-cast v5, Lkl6;

    .line 40
    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v4, :cond_8

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v7, 0x2

    .line 49
    if-eqz v4, :cond_6

    .line 50
    .line 51
    if-eq v4, v6, :cond_4

    .line 52
    .line 53
    if-ne v4, v7, :cond_3

    .line 54
    .line 55
    if-nez v0, :cond_8

    .line 56
    .line 57
    sget v0, Lb56;->indeterminate:I

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static {}, Lb61;->c()V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :cond_4
    if-nez v5, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    iget-byte v4, v5, Lkl6;->a:B

    .line 72
    .line 73
    if-ne v4, v7, :cond_8

    .line 74
    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    sget v0, Lb56;->state_off:I

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_0

    .line 84
    :cond_6
    if-nez v5, :cond_7

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_7
    iget-byte v4, v5, Lkl6;->a:B

    .line 88
    .line 89
    if-ne v4, v7, :cond_8

    .line 90
    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    sget v0, Lb56;->state_on:I

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_8
    :goto_0
    sget-object v4, Lc17;->K:Le17;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-nez v4, :cond_9

    .line 106
    .line 107
    move-object v4, v2

    .line 108
    :cond_9
    check-cast v4, Ljava/lang/Boolean;

    .line 109
    .line 110
    if-eqz v4, :cond_d

    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v5, :cond_a

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_a
    iget-byte v5, v5, Lkl6;->a:B

    .line 120
    .line 121
    const/4 v7, 0x4

    .line 122
    if-ne v5, v7, :cond_b

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_b
    :goto_1
    if-nez v0, :cond_d

    .line 126
    .line 127
    if-eqz v4, :cond_c

    .line 128
    .line 129
    sget v0, Lb56;->selected:I

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    goto :goto_2

    .line 136
    :cond_c
    sget v0, Lb56;->not_selected:I

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :cond_d
    :goto_2
    sget-object v4, Lc17;->c:Le17;

    .line 143
    .line 144
    invoke-virtual {v3, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-nez v4, :cond_e

    .line 149
    .line 150
    move-object v4, v2

    .line 151
    :cond_e
    check-cast v4, Lqw5;

    .line 152
    .line 153
    if-eqz v4, :cond_15

    .line 154
    .line 155
    sget-object v5, Lqw5;->d:Lqw5;

    .line 156
    .line 157
    if-eq v4, v5, :cond_14

    .line 158
    .line 159
    if-nez v0, :cond_15

    .line 160
    .line 161
    iget-object v0, v4, Lqw5;->b:Luu0;

    .line 162
    .line 163
    iget v5, v0, Luu0;->Y:F

    .line 164
    .line 165
    iget v7, v0, Luu0;->X:F

    .line 166
    .line 167
    sub-float/2addr v5, v7

    .line 168
    const/4 v8, 0x0

    .line 169
    cmpg-float v5, v5, v8

    .line 170
    .line 171
    if-nez v5, :cond_f

    .line 172
    .line 173
    move v4, v8

    .line 174
    goto :goto_3

    .line 175
    :cond_f
    iget v4, v4, Lqw5;->a:F

    .line 176
    .line 177
    sub-float/2addr v4, v7

    .line 178
    iget v0, v0, Luu0;->Y:F

    .line 179
    .line 180
    sub-float/2addr v0, v7

    .line 181
    div-float/2addr v4, v0

    .line 182
    :goto_3
    cmpg-float v0, v4, v8

    .line 183
    .line 184
    if-gez v0, :cond_10

    .line 185
    .line 186
    move v4, v8

    .line 187
    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 188
    .line 189
    cmpl-float v5, v4, v0

    .line 190
    .line 191
    if-lez v5, :cond_11

    .line 192
    .line 193
    move v4, v0

    .line 194
    :cond_11
    cmpg-float v5, v4, v8

    .line 195
    .line 196
    if-nez v5, :cond_12

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    goto :goto_4

    .line 200
    :cond_12
    cmpg-float v0, v4, v0

    .line 201
    .line 202
    if-nez v0, :cond_13

    .line 203
    .line 204
    const/16 v0, 0x64

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_13
    const/high16 v0, 0x42c80000    # 100.0f

    .line 208
    .line 209
    mul-float/2addr v4, v0

    .line 210
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    const/16 v4, 0x63

    .line 215
    .line 216
    invoke-static {v0, v6, v4}, Lx97;->n(III)I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    :goto_4
    sget v4, Lb56;->template_percent:I

    .line 221
    .line 222
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {p1, v4, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    goto :goto_5

    .line 235
    :cond_14
    if-nez v0, :cond_15

    .line 236
    .line 237
    sget v0, Lb56;->in_progress:I

    .line 238
    .line 239
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    :cond_15
    :goto_5
    sget-object v4, Lc17;->G:Le17;

    .line 244
    .line 245
    invoke-virtual {v3, v4}, Ls05;->c(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_1d

    .line 250
    .line 251
    new-instance v0, Ly07;

    .line 252
    .line 253
    iget-object v3, p0, Ly07;->a:Ljx4;

    .line 254
    .line 255
    iget-object p0, p0, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 256
    .line 257
    invoke-direct {v0, v3, v6, p0, v1}, Ly07;-><init>(Ljx4;ZLandroidx/compose/ui/node/LayoutNode;Lt07;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ly07;->k()Lt07;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 265
    .line 266
    sget-object v0, Lc17;->a:Le17;

    .line 267
    .line 268
    invoke-virtual {p0, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-nez v0, :cond_16

    .line 273
    .line 274
    move-object v0, v2

    .line 275
    :cond_16
    check-cast v0, Ljava/util/Collection;

    .line 276
    .line 277
    if-eqz v0, :cond_17

    .line 278
    .line 279
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_1c

    .line 284
    .line 285
    :cond_17
    sget-object v0, Lc17;->C:Le17;

    .line 286
    .line 287
    invoke-virtual {p0, v0}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-nez v0, :cond_18

    .line 292
    .line 293
    move-object v0, v2

    .line 294
    :cond_18
    check-cast v0, Ljava/util/Collection;

    .line 295
    .line 296
    if-eqz v0, :cond_19

    .line 297
    .line 298
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_1c

    .line 303
    .line 304
    :cond_19
    invoke-virtual {p0, v4}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    if-nez p0, :cond_1a

    .line 309
    .line 310
    move-object p0, v2

    .line 311
    :cond_1a
    check-cast p0, Ljava/lang/CharSequence;

    .line 312
    .line 313
    if-eqz p0, :cond_1b

    .line 314
    .line 315
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 316
    .line 317
    .line 318
    move-result p0

    .line 319
    if-nez p0, :cond_1c

    .line 320
    .line 321
    :cond_1b
    sget p0, Lb56;->state_empty:I

    .line 322
    .line 323
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    :cond_1c
    move-object v0, v2

    .line 328
    :cond_1d
    check-cast v0, Ljava/lang/String;

    .line 329
    .line 330
    return-object v0
.end method

.method public static final C(Ly07;)Lql;
    .locals 3

    .line 1
    iget-object v0, p0, Ly07;->d:Lt07;

    .line 2
    .line 3
    sget-object v1, Lc17;->G:Le17;

    .line 4
    .line 5
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    check-cast v0, Lql;

    .line 16
    .line 17
    iget-object p0, p0, Ly07;->d:Lt07;

    .line 18
    .line 19
    sget-object v2, Lc17;->C:Le17;

    .line 20
    .line 21
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    move-object p0, v1

    .line 30
    :cond_1
    check-cast p0, Ljava/util/List;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    move-object v1, p0

    .line 39
    check-cast v1, Lql;

    .line 40
    .line 41
    :cond_2
    if-nez v0, :cond_3

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_3
    return-object v0
.end method

.method public static final D(Led1;)Lot0;
    .locals 1

    .line 1
    invoke-interface {p0}, Led1;->p()Led1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    instance-of p0, p0, Ltf5;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0}, Led1;->p()Led1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    instance-of p0, p0, Ltf5;

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    invoke-static {v0}, Lvr3;->D(Led1;)Lot0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of p0, v0, Lot0;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    check-cast v0, Lot0;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static E(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 24
    .line 25
    .line 26
    :cond_1
    throw p0

    .line 27
    :catch_0
    const/4 v0, 0x1

    .line 28
    goto :goto_0
.end method

.method public static final F(Ls61;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lmp1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lmp1;

    .line 6
    .line 7
    iget-object p1, p1, Lmp1;->X:Ljava/lang/Throwable;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    sget-object v0, Loy1;->p0:Loy1;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Ls61;->H0(Lr61;)Lq61;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lv61;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0, p1}, Lv61;->J(Ls61;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p0, p1}, Ldh3;->y(Ls61;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 35
    .line 36
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p1}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v1

    .line 43
    :goto_1
    invoke-static {p0, p1}, Ldh3;->y(Ls61;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final G(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p0, v0, v1, p1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eq p1, p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static H(Ljava/lang/Object;)Lu73;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lu73;->Z:Lu73;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lu73;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lu73;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final I(Ly07;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly07;->k()Lt07;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lc17;->B:Le17;

    .line 6
    .line 7
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ls05;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final J(Lt14;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt14;->q0()Lmo8;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Lq32;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    instance-of v0, p0, Lce2;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p0, Lce2;

    .line 17
    .line 18
    invoke-virtual {p0}, Lce2;->u0()Laa7;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of p0, p0, Lq32;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public static final K(Lhq5;JJ)Z
    .locals 10

    .line 1
    iget v0, p0, Lhq5;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-wide v3, p0, Lhq5;->c:J

    .line 11
    .line 12
    const/16 p0, 0x20

    .line 13
    .line 14
    shr-long v5, v3, p0

    .line 15
    .line 16
    long-to-int v5, v5

    .line 17
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const-wide v6, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v3, v6

    .line 27
    long-to-int v3, v3

    .line 28
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shr-long v8, p3, p0

    .line 33
    .line 34
    long-to-int v4, v8

    .line 35
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    int-to-float v0, v0

    .line 40
    mul-float/2addr v4, v0

    .line 41
    shr-long v8, p1, p0

    .line 42
    .line 43
    long-to-int p0, v8

    .line 44
    int-to-float p0, p0

    .line 45
    add-float/2addr p0, v4

    .line 46
    and-long/2addr p3, v6

    .line 47
    long-to-int p3, p3

    .line 48
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    mul-float/2addr p3, v0

    .line 53
    and-long/2addr p1, v6

    .line 54
    long-to-int p1, p1

    .line 55
    int-to-float p1, p1

    .line 56
    add-float/2addr p1, p3

    .line 57
    neg-float p2, v4

    .line 58
    cmpg-float p2, v5, p2

    .line 59
    .line 60
    if-gez p2, :cond_1

    .line 61
    .line 62
    move p2, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move p2, v1

    .line 65
    :goto_1
    cmpl-float p0, v5, p0

    .line 66
    .line 67
    if-lez p0, :cond_2

    .line 68
    .line 69
    move p0, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move p0, v1

    .line 72
    :goto_2
    or-int/2addr p0, p2

    .line 73
    neg-float p2, p3

    .line 74
    cmpg-float p2, v3, p2

    .line 75
    .line 76
    if-gez p2, :cond_3

    .line 77
    .line 78
    move p2, v2

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    move p2, v1

    .line 81
    :goto_3
    or-int/2addr p0, p2

    .line 82
    cmpl-float p1, v3, p1

    .line 83
    .line 84
    if-lez p1, :cond_4

    .line 85
    .line 86
    move v1, v2

    .line 87
    :cond_4
    or-int/2addr p0, v1

    .line 88
    return p0
.end method

.method public static final L(Ly07;Landroid/content/res/Resources;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Ljm4;->L(Ly07;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Ly07;->d:Lt07;

    .line 9
    .line 10
    iget-boolean v1, v0, Lt07;->Z:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object v1, Lc17;->a:Le17;

    .line 16
    .line 17
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-static {v0}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    :cond_3
    if-nez v1, :cond_4

    .line 39
    .line 40
    invoke-static {p0}, Lvr3;->C(Ly07;)Lql;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    invoke-static {p0, p1}, Lvr3;->B(Ly07;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    invoke-static {p0}, Lvr3;->A(Ly07;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    :cond_4
    invoke-static {p0}, Lvr3;->M(Ly07;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_5

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static final M(Ly07;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ly07;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x4

    .line 10
    invoke-static {v0, p0}, Ly07;->j(ILy07;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    move v3, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ly07;

    .line 26
    .line 27
    invoke-static {v4}, Lvr3;->I(Ly07;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    :goto_1
    return v1

    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object p0, p0, Ly07;->c:Landroidx/compose/ui/node/LayoutNode;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_2
    const/4 v0, 0x1

    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-boolean v2, v2, Lt07;->Z:Z

    .line 53
    .line 54
    if-ne v2, v0, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->w()Landroidx/compose/ui/node/LayoutNode;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/4 p0, 0x0

    .line 63
    :goto_3
    if-eqz p0, :cond_5

    .line 64
    .line 65
    move v1, v0

    .line 66
    :cond_5
    xor-int/lit8 p0, v1, 0x1

    .line 67
    .line 68
    return p0
.end method

.method public static N(Ls61;Lrn2;)Lud0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmf1;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    sget-object v2, Le71;->X:Le71;

    .line 8
    .line 9
    invoke-direct {v0, p0, v2, p1, v1}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lu15;->u(Lsd0;)Lud0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static O(Ltq6;IIIIILzr4;Ljava/util/List;[Leo5;I)Lyr4;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    move/from16 v5, p9

    .line 12
    .line 13
    int-to-long v6, v3

    .line 14
    new-array v8, v5, [I

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    :goto_0
    if-ge v11, v5, :cond_5

    .line 25
    .line 26
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v17

    .line 30
    move-object/from16 v9, v17

    .line 31
    .line 32
    check-cast v9, Ltr4;

    .line 33
    .line 34
    invoke-static {v9}, Ldh3;->w(Ltr4;)Luq6;

    .line 35
    .line 36
    .line 37
    move-result-object v17

    .line 38
    invoke-static/range {v17 .. v17}, Ldh3;->x(Luq6;)F

    .line 39
    .line 40
    .line 41
    move-result v17

    .line 42
    cmpl-float v18, v17, v16

    .line 43
    .line 44
    if-lez v18, :cond_0

    .line 45
    .line 46
    add-float v15, v15, v17

    .line 47
    .line 48
    add-int/lit8 v12, v12, 0x1

    .line 49
    .line 50
    move-wide/from16 v18, v6

    .line 51
    .line 52
    move/from16 v20, v11

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_0
    sub-int v14, v1, v13

    .line 56
    .line 57
    aget-object v17, p8, v11

    .line 58
    .line 59
    move-wide/from16 v18, v6

    .line 60
    .line 61
    if-nez v17, :cond_3

    .line 62
    .line 63
    const v6, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v1, v6, :cond_1

    .line 67
    .line 68
    move/from16 v20, v11

    .line 69
    .line 70
    move/from16 v21, v12

    .line 71
    .line 72
    const v6, 0x7fffffff

    .line 73
    .line 74
    .line 75
    :goto_1
    const/4 v7, 0x0

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move/from16 v20, v11

    .line 78
    .line 79
    move/from16 v21, v12

    .line 80
    .line 81
    if-gez v14, :cond_2

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move v6, v14

    .line 86
    goto :goto_1

    .line 87
    :goto_2
    invoke-interface {v0, v7, v6, v2, v7}, Ltq6;->b(IIIZ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    invoke-interface {v9, v11, v12}, Ltr4;->o(J)Leo5;

    .line 92
    .line 93
    .line 94
    move-result-object v17

    .line 95
    :goto_3
    move-object/from16 v6, v17

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_3
    move/from16 v20, v11

    .line 99
    .line 100
    move/from16 v21, v12

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_4
    invoke-interface {v0, v6}, Ltq6;->j(Leo5;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-interface {v0, v6}, Ltq6;->h(Leo5;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    aput v7, v8, v20

    .line 112
    .line 113
    sub-int v11, v14, v7

    .line 114
    .line 115
    if-gez v11, :cond_4

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    :cond_4
    invoke-static {v3, v11}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    add-int/2addr v7, v14

    .line 123
    add-int/2addr v13, v7

    .line 124
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    aput-object v6, p8, v20

    .line 129
    .line 130
    move/from16 v12, v21

    .line 131
    .line 132
    :goto_5
    add-int/lit8 v11, v20, 0x1

    .line 133
    .line 134
    move-wide/from16 v6, v18

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    move-wide/from16 v18, v6

    .line 138
    .line 139
    move/from16 v21, v12

    .line 140
    .line 141
    if-nez v21, :cond_6

    .line 142
    .line 143
    sub-int/2addr v13, v14

    .line 144
    const/4 v7, 0x0

    .line 145
    goto/16 :goto_f

    .line 146
    .line 147
    :cond_6
    const v6, 0x7fffffff

    .line 148
    .line 149
    .line 150
    if-eq v1, v6, :cond_7

    .line 151
    .line 152
    move v3, v1

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    move/from16 v3, p1

    .line 155
    .line 156
    :goto_6
    const/4 v6, 0x1

    .line 157
    add-int/lit8 v12, v21, -0x1

    .line 158
    .line 159
    int-to-long v11, v12

    .line 160
    mul-long v11, v11, v18

    .line 161
    .line 162
    sub-int/2addr v3, v13

    .line 163
    int-to-long v6, v3

    .line 164
    sub-long/2addr v6, v11

    .line 165
    const-wide/16 v18, 0x0

    .line 166
    .line 167
    cmp-long v3, v6, v18

    .line 168
    .line 169
    if-gez v3, :cond_8

    .line 170
    .line 171
    move-wide/from16 v6, v18

    .line 172
    .line 173
    :cond_8
    long-to-float v3, v6

    .line 174
    div-float/2addr v3, v15

    .line 175
    const/4 v9, 0x0

    .line 176
    :goto_7
    if-ge v9, v5, :cond_9

    .line 177
    .line 178
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    check-cast v14, Ltr4;

    .line 183
    .line 184
    invoke-static {v14}, Ldh3;->w(Ltr4;)Luq6;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    invoke-static {v14}, Ldh3;->x(Luq6;)F

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    mul-float/2addr v14, v3

    .line 193
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    int-to-long v14, v14

    .line 198
    sub-long/2addr v6, v14

    .line 199
    add-int/lit8 v9, v9, 0x1

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_9
    move v14, v10

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    :goto_8
    if-ge v9, v5, :cond_f

    .line 206
    .line 207
    aget-object v15, p8, v9

    .line 208
    .line 209
    if-nez v15, :cond_e

    .line 210
    .line 211
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v15

    .line 215
    check-cast v15, Ltr4;

    .line 216
    .line 217
    invoke-static {v15}, Ldh3;->w(Ltr4;)Luq6;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1}, Ldh3;->x(Luq6;)F

    .line 222
    .line 223
    .line 224
    move-result v17

    .line 225
    cmpl-float v18, v17, v16

    .line 226
    .line 227
    if-lez v18, :cond_a

    .line 228
    .line 229
    :goto_9
    move/from16 v18, v3

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_a
    const-string v18, "All weights <= 0 should have placeables"

    .line 233
    .line 234
    invoke-static/range {v18 .. v18}, Luc3;->b(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :goto_a
    invoke-static {v6, v7}, Ljava/lang/Long;->signum(J)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    move-wide/from16 v19, v6

    .line 243
    .line 244
    int-to-long v6, v3

    .line 245
    sub-long v6, v19, v6

    .line 246
    .line 247
    mul-float v17, v17, v18

    .line 248
    .line 249
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->round(F)I

    .line 250
    .line 251
    .line 252
    move-result v17

    .line 253
    add-int v3, v17, v3

    .line 254
    .line 255
    const/4 v4, 0x0

    .line 256
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v1, :cond_b

    .line 261
    .line 262
    iget-boolean v1, v1, Luq6;->b:Z

    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_b
    const/4 v1, 0x1

    .line 266
    :goto_b
    if-eqz v1, :cond_c

    .line 267
    .line 268
    const v1, 0x7fffffff

    .line 269
    .line 270
    .line 271
    if-eq v3, v1, :cond_d

    .line 272
    .line 273
    move v4, v3

    .line 274
    :goto_c
    const/4 v1, 0x1

    .line 275
    goto :goto_d

    .line 276
    :cond_c
    const v1, 0x7fffffff

    .line 277
    .line 278
    .line 279
    :cond_d
    const/4 v4, 0x0

    .line 280
    goto :goto_c

    .line 281
    :goto_d
    invoke-interface {v0, v4, v3, v2, v1}, Ltq6;->b(IIIZ)J

    .line 282
    .line 283
    .line 284
    move-result-wide v3

    .line 285
    invoke-interface {v15, v3, v4}, Ltr4;->o(J)Leo5;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v0, v3}, Ltq6;->j(Leo5;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-interface {v0, v3}, Ltq6;->h(Leo5;)I

    .line 294
    .line 295
    .line 296
    move-result v15

    .line 297
    aput v4, v8, v9

    .line 298
    .line 299
    add-int/2addr v10, v4

    .line 300
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    aput-object v3, p8, v9

    .line 305
    .line 306
    move v14, v4

    .line 307
    goto :goto_e

    .line 308
    :cond_e
    move/from16 v18, v3

    .line 309
    .line 310
    move-wide/from16 v19, v6

    .line 311
    .line 312
    const/4 v1, 0x1

    .line 313
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 314
    .line 315
    move/from16 v1, p3

    .line 316
    .line 317
    move-object/from16 v4, p7

    .line 318
    .line 319
    move/from16 v3, v18

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_f
    int-to-long v1, v10

    .line 323
    add-long/2addr v1, v11

    .line 324
    long-to-int v7, v1

    .line 325
    sub-int v1, p3, v13

    .line 326
    .line 327
    if-gez v7, :cond_10

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    :cond_10
    if-le v7, v1, :cond_11

    .line 331
    .line 332
    move v7, v1

    .line 333
    :cond_11
    move v10, v14

    .line 334
    :goto_f
    add-int/2addr v7, v13

    .line 335
    if-gez v7, :cond_12

    .line 336
    .line 337
    const/4 v7, 0x0

    .line 338
    :cond_12
    move/from16 v1, p1

    .line 339
    .line 340
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 341
    .line 342
    .line 343
    move-result v4

    .line 344
    move/from16 v1, p2

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    new-array v3, v5, [I

    .line 356
    .line 357
    move-object/from16 v2, p6

    .line 358
    .line 359
    invoke-interface {v0, v4, v2, v8, v3}, Ltq6;->a(ILzr4;[I[I)V

    .line 360
    .line 361
    .line 362
    move v5, v1

    .line 363
    move-object/from16 v1, p8

    .line 364
    .line 365
    invoke-interface/range {v0 .. v5}, Ltq6;->e([Leo5;Lzr4;[III)Lyr4;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0
.end method

.method public static P(Lxb4;)Lxb4;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lqd0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lif6;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lqd0;->c:Lif6;

    .line 22
    .line 23
    new-instance v1, Lud0;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lud0;-><init>(Lqd0;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lqd0;->b:Lud0;

    .line 29
    .line 30
    const-class v2, Lp61;

    .line 31
    .line 32
    iput-object v2, v0, Lqd0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    :try_start_0
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v3, p0, v0, v2}, Lvr3;->T(ZLxb4;Lqd0;Ldp1;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v3, "nonCancellationPropagating["

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, "]"

    .line 53
    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iput-object p0, v0, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception p0

    .line 65
    invoke-virtual {v1, p0}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 66
    .line 67
    .line 68
    :goto_0
    return-object v1
.end method

.method public static final Q(Lkx4;Lgn2;)Lkx4;
    .locals 1

    .line 1
    new-instance v0, Loa5;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Loa5;-><init>(Lgn2;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final R(Lnz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lnz5;->Z:I

    .line 8
    .line 9
    and-int/lit16 v1, v0, 0x100

    .line 10
    .line 11
    const/16 v2, 0x100

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lnz5;->o0:Lnz5;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/16 v1, 0x200

    .line 19
    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget p0, p0, Lnz5;->p0:I

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final S(Lhq5;Z)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lhq5;->g:J

    .line 2
    .line 3
    iget-wide v2, p0, Lhq5;->c:J

    .line 4
    .line 5
    invoke-static {v2, v3, v0, v1}, Lz85;->e(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lhq5;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const-wide/16 p0, 0x0

    .line 18
    .line 19
    return-wide p0

    .line 20
    :cond_0
    return-wide v0
.end method

.method public static T(ZLxb4;Lqd0;Ldp1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lq02;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {v0, p2, v1}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lzo2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p1, v0, v2}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v1, p3}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 23
    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    new-instance p0, Lxb;

    .line 28
    .line 29
    const/16 p3, 0xb

    .line 30
    .line 31
    invoke-direct {p0, p1, p3}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2, p0, p1}, Lqd0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public static final U(Lvy5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lvy5;->Z:I

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x20

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lvy5;->l0:Lnz5;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/16 v1, 0x40

    .line 19
    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget p0, p0, Lvy5;->m0:I

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final V(Lcz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lcz5;->Z:I

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x20

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcz5;->l0:Lnz5;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/16 v1, 0x40

    .line 19
    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget p0, p0, Lcz5;->m0:I

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public static final W(Lvx4;Lfk2;)Lsx4;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Lfk2;->a:Lgk2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lgk2;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    invoke-virtual {p1}, Lfk2;->b()Lfk2;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {p0, v1}, Lvx4;->b0(Lfk2;)Ln74;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, Ln74;->k0:Lp74;

    .line 26
    .line 27
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Lx45;->X:Lx45;

    .line 32
    .line 33
    invoke-virtual {v1, v3, v4}, Lp74;->e(Lv15;Lx45;)Lot0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    instance-of v3, v1, Lsx4;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v1, Lsx4;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v1, v2

    .line 45
    :goto_0
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    invoke-virtual {p1}, Lfk2;->b()Lfk2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p0, p1}, Lvr3;->W(Lvx4;Lfk2;)Lsx4;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Lsx4;->q0()Let4;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Lgk2;->g()Lv15;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p0, p1, v4}, Let4;->e(Lv15;Lx45;)Lot0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object p0, v2

    .line 74
    :goto_1
    instance-of p1, p0, Lsx4;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    check-cast p0, Lsx4;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    :goto_2
    return-object v2
.end method

.method public static final X(Lvy5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lvy5;->Z:I

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x8

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lvy5;->i0:Lnz5;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/16 v1, 0x10

    .line 22
    .line 23
    and-int/2addr v0, v1

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget p0, p0, Lvy5;->j0:I

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const-string p0, "No returnType in ProtoBuf.Function"

    .line 34
    .line 35
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final Y(Lcz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lcz5;->Z:I

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x8

    .line 10
    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcz5;->i0:Lnz5;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const/16 v1, 0x10

    .line 22
    .line 23
    and-int/2addr v0, v1

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    iget p0, p0, Lcz5;->j0:I

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const-string p0, "No returnType in ProtoBuf.Property"

    .line 34
    .line 35
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final Z(Lkx4;Lj74;Lsd5;Ltd;ZLhe2;Lxz4;Lpj7;)Lkx4;
    .locals 9

    .line 1
    sget-object v0, Lsd5;->X:Lsd5;

    .line 2
    .line 3
    sget-object v1, Lhx4;->X:Lhx4;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lx03;->c:Lx03;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lw39;->k(Lkx4;Lx67;)Lkx4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lx03;->b:Lx03;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lw39;->k(Lkx4;Lx67;)Lkx4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Lby6;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v6, p1

    .line 28
    move-object v5, p2

    .line 29
    move-object v1, p3

    .line 30
    move v7, p4

    .line 31
    move-object v3, p5

    .line 32
    move-object v4, p6

    .line 33
    move-object/from16 v2, p7

    .line 34
    .line 35
    invoke-direct/range {v0 .. v8}, Lby6;-><init>(Ltd;Lw80;Lhe2;Lxz4;Lsd5;Lny6;ZZ)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final a(Ljava/lang/Object;)Lux0;
    .locals 1

    .line 1
    new-instance v0, Lux0;

    .line 2
    .line 3
    invoke-direct {v0}, Lux0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final a0(Lfy5;Lux4;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lfy5;->j0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lfy5;->k0:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1, v1}, Lux4;->a(I)Lnz5;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v0
.end method

.method public static final b(Ldn2;ZZLzy0;Llp2;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const v2, 0x39676ccd

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, Llp2;->X(I)Llp2;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v5, 0x6

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Llp2;->h(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int/2addr v2, v5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v5

    .line 29
    :goto_1
    and-int/lit8 v3, v5, 0x30

    .line 30
    .line 31
    if-nez v3, :cond_3

    .line 32
    .line 33
    sget-object v3, Lhx4;->X:Lhx4;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Llp2;->f(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    const/16 v3, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v3, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v2, v3

    .line 47
    :cond_3
    and-int/lit16 v3, v5, 0x180

    .line 48
    .line 49
    move/from16 v10, p1

    .line 50
    .line 51
    if-nez v3, :cond_5

    .line 52
    .line 53
    invoke-virtual {v0, v10}, Llp2;->g(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    const/16 v3, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v3, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v2, v3

    .line 65
    :cond_5
    and-int/lit16 v3, v5, 0xc00

    .line 66
    .line 67
    move/from16 v12, p2

    .line 68
    .line 69
    if-nez v3, :cond_7

    .line 70
    .line 71
    invoke-virtual {v0, v12}, Llp2;->g(Z)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_6

    .line 76
    .line 77
    const/16 v3, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v3, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v2, v3

    .line 83
    :cond_7
    and-int/lit16 v3, v5, 0x6000

    .line 84
    .line 85
    move-object/from16 v13, p3

    .line 86
    .line 87
    if-nez v3, :cond_9

    .line 88
    .line 89
    invoke-virtual {v0, v13}, Llp2;->h(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_8

    .line 94
    .line 95
    const/16 v3, 0x4000

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    const/16 v3, 0x2000

    .line 99
    .line 100
    :goto_5
    or-int/2addr v2, v3

    .line 101
    :cond_9
    and-int/lit16 v3, v2, 0x2493

    .line 102
    .line 103
    const/16 v4, 0x2492

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    if-eq v3, v4, :cond_a

    .line 107
    .line 108
    move v3, v6

    .line 109
    goto :goto_6

    .line 110
    :cond_a
    const/4 v3, 0x0

    .line 111
    :goto_6
    and-int/2addr v2, v6

    .line 112
    invoke-virtual {v0, v2, v3}, Llp2;->N(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_e

    .line 117
    .line 118
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v3, Lzz0;->a:Lbe;

    .line 123
    .line 124
    if-ne v2, v3, :cond_b

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-static {v2}, Lz51;->b(F)Loi;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v0, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_b
    check-cast v2, Loi;

    .line 135
    .line 136
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    if-ne v4, v3, :cond_c

    .line 141
    .line 142
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {v4}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v0, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_c
    check-cast v4, Ly05;

    .line 152
    .line 153
    invoke-static {v1, v0}, Lz51;->P(Ljava/lang/Object;Llp2;)Ly05;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v0}, Llp2;->K()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-ne v6, v3, :cond_d

    .line 162
    .line 163
    new-instance v6, Leh;

    .line 164
    .line 165
    const/4 v3, 0x3

    .line 166
    invoke-direct {v6, v4, v3}, Leh;-><init>(Ly05;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v6}, Llp2;->g0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_d
    move-object v3, v6

    .line 173
    check-cast v3, Ldn2;

    .line 174
    .line 175
    new-instance v6, Lvn1;

    .line 176
    .line 177
    const/4 v10, 0x0

    .line 178
    const/16 v11, 0xe4

    .line 179
    .line 180
    const/4 v9, 0x0

    .line 181
    move/from16 v8, p1

    .line 182
    .line 183
    move/from16 v7, p1

    .line 184
    .line 185
    invoke-direct/range {v6 .. v11}, Lvn1;-><init>(ZZZZI)V

    .line 186
    .line 187
    .line 188
    move-object v15, v6

    .line 189
    new-instance v6, Lbw2;

    .line 190
    .line 191
    move/from16 v10, p1

    .line 192
    .line 193
    move-object v7, v2

    .line 194
    move-object v11, v3

    .line 195
    move-object v9, v4

    .line 196
    move-object v8, v14

    .line 197
    invoke-direct/range {v6 .. v13}, Lbw2;-><init>(Loi;Ly05;Ly05;ZLdn2;ZLzy0;)V

    .line 198
    .line 199
    .line 200
    const v2, 0x18e12ba4

    .line 201
    .line 202
    .line 203
    invoke-static {v2, v6, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/16 v3, 0x186

    .line 208
    .line 209
    invoke-static {v11, v15, v2, v0, v3}, Ljm4;->c(Ldn2;Lvn1;Lzy0;Llp2;I)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_e
    invoke-virtual {v0}, Llp2;->Q()V

    .line 214
    .line 215
    .line 216
    :goto_7
    invoke-virtual {v0}, Llp2;->r()Lj86;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    if-eqz v6, :cond_f

    .line 221
    .line 222
    new-instance v0, Lcw2;

    .line 223
    .line 224
    move/from16 v2, p1

    .line 225
    .line 226
    move/from16 v3, p2

    .line 227
    .line 228
    move-object/from16 v4, p3

    .line 229
    .line 230
    invoke-direct/range {v0 .. v5}, Lcw2;-><init>(Ldn2;ZZLzy0;I)V

    .line 231
    .line 232
    .line 233
    iput-object v0, v6, Lj86;->d:Lrn2;

    .line 234
    .line 235
    :cond_f
    return-void
.end method

.method public static b0(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/Throwable;

    .line 22
    .line 23
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    instance-of v0, p0, Ljava/lang/Error;

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Lu52;->q(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    check-cast p0, Ljava/lang/Error;

    .line 36
    .line 37
    throw p0

    .line 38
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    throw p0

    .line 41
    :cond_2
    new-instance v0, Lg01;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Lg01;-><init>(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_3
    return-void
.end method

.method public static final c(Lkx4;FFLx67;JLlp2;I)V
    .locals 16

    .line 1
    move-object/from16 v9, p6

    .line 2
    .line 3
    const v0, 0x1d01270c

    .line 4
    .line 5
    .line 6
    invoke-virtual {v9, v0}, Llp2;->X(I)Llp2;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p7, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    move-object/from16 v0, p0

    .line 14
    .line 15
    invoke-virtual {v9, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x2

    .line 24
    :goto_0
    or-int v1, p7, v1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object/from16 v0, p0

    .line 28
    .line 29
    move/from16 v1, p7

    .line 30
    .line 31
    :goto_1
    or-int/lit16 v1, v1, 0x25b0

    .line 32
    .line 33
    and-int/lit16 v2, v1, 0x2493

    .line 34
    .line 35
    const/16 v3, 0x2492

    .line 36
    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/4 v2, 0x0

    .line 42
    :goto_2
    and-int/lit8 v3, v1, 0x1

    .line 43
    .line 44
    invoke-virtual {v9, v3, v2}, Llp2;->N(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    invoke-virtual {v9}, Llp2;->S()V

    .line 51
    .line 52
    .line 53
    and-int/lit8 v2, p7, 0x1

    .line 54
    .line 55
    const v3, -0xfc01

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v9}, Llp2;->x()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-virtual {v9}, Llp2;->Q()V

    .line 68
    .line 69
    .line 70
    and-int/2addr v1, v3

    .line 71
    move/from16 v12, p1

    .line 72
    .line 73
    move/from16 v13, p2

    .line 74
    .line 75
    move-wide/from16 v2, p4

    .line 76
    .line 77
    move v4, v1

    .line 78
    move-object/from16 v1, p3

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_3
    const/high16 v2, 0x41c00000    # 24.0f

    .line 82
    .line 83
    invoke-static {v2}, Lkm6;->a(F)Ljm6;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object v4, Lep;->z:Lox1;

    .line 88
    .line 89
    invoke-virtual {v9, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ldp;

    .line 94
    .line 95
    iget-object v4, v4, Ldp;->m:Lbp;

    .line 96
    .line 97
    iget-wide v4, v4, Lbp;->a:J

    .line 98
    .line 99
    and-int/2addr v1, v3

    .line 100
    const/high16 v3, 0x42000000    # 32.0f

    .line 101
    .line 102
    const/high16 v6, 0x40800000    # 4.0f

    .line 103
    .line 104
    move v12, v3

    .line 105
    move v13, v6

    .line 106
    move-wide v14, v4

    .line 107
    move v4, v1

    .line 108
    move-object v1, v2

    .line 109
    move-wide v2, v14

    .line 110
    :goto_4
    invoke-virtual {v9}, Llp2;->q()V

    .line 111
    .line 112
    .line 113
    new-instance v5, Lxv2;

    .line 114
    .line 115
    invoke-direct {v5, v12, v13}, Lxv2;-><init>(FF)V

    .line 116
    .line 117
    .line 118
    const v6, -0xa917659

    .line 119
    .line 120
    .line 121
    invoke-static {v6, v5, v9}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    and-int/lit8 v4, v4, 0xe

    .line 126
    .line 127
    const/high16 v5, 0xc00000

    .line 128
    .line 129
    or-int v10, v4, v5

    .line 130
    .line 131
    const/16 v11, 0x78

    .line 132
    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x0

    .line 137
    invoke-static/range {v0 .. v11}, Lay7;->a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V

    .line 138
    .line 139
    .line 140
    move-object v5, v1

    .line 141
    move-wide v6, v2

    .line 142
    move v3, v12

    .line 143
    move v4, v13

    .line 144
    goto :goto_5

    .line 145
    :cond_5
    invoke-virtual/range {p6 .. p6}, Llp2;->Q()V

    .line 146
    .line 147
    .line 148
    move/from16 v3, p1

    .line 149
    .line 150
    move/from16 v4, p2

    .line 151
    .line 152
    move-object/from16 v5, p3

    .line 153
    .line 154
    move-wide/from16 v6, p4

    .line 155
    .line 156
    :goto_5
    invoke-virtual/range {p6 .. p6}, Llp2;->r()Lj86;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    new-instance v1, Lyv2;

    .line 163
    .line 164
    move-object/from16 v2, p0

    .line 165
    .line 166
    move/from16 v8, p7

    .line 167
    .line 168
    invoke-direct/range {v1 .. v8}, Lyv2;-><init>(Lkx4;FFLx67;JI)V

    .line 169
    .line 170
    .line 171
    iput-object v1, v0, Lj86;->d:Lrn2;

    .line 172
    .line 173
    :cond_6
    return-void
.end method

.method public static c0(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lka5;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    instance-of v0, p0, Lja5;

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    instance-of v0, p0, Lga5;

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    instance-of v0, p0, Ljava/lang/VirtualMachineError;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    instance-of v0, p0, Ljava/lang/ThreadDeath;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    instance-of v0, p0, Ljava/lang/LinkageError;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    check-cast p0, Ljava/lang/LinkageError;

    .line 27
    .line 28
    throw p0

    .line 29
    :cond_1
    check-cast p0, Ljava/lang/ThreadDeath;

    .line 30
    .line 31
    throw p0

    .line 32
    :cond_2
    check-cast p0, Ljava/lang/VirtualMachineError;

    .line 33
    .line 34
    throw p0

    .line 35
    :cond_3
    check-cast p0, Lga5;

    .line 36
    .line 37
    throw p0

    .line 38
    :cond_4
    check-cast p0, Lja5;

    .line 39
    .line 40
    throw p0

    .line 41
    :cond_5
    check-cast p0, Lka5;

    .line 42
    .line 43
    throw p0
.end method

.method public static final d(Ldn2;Lo87;ZZZZLzy0;Llp2;II)V
    .locals 20

    .line 1
    move-object/from16 v15, p7

    .line 2
    .line 3
    move/from16 v6, p8

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v0, 0x36c19c74

    .line 9
    .line 10
    .line 11
    invoke-virtual {v15, v0}, Llp2;->X(I)Llp2;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, v6, 0x6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move-object/from16 v0, p0

    .line 19
    .line 20
    invoke-virtual {v15, v0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v0, p0

    .line 32
    .line 33
    move v1, v6

    .line 34
    :goto_1
    and-int/lit8 v2, v6, 0x30

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    sget-object v2, Lhx4;->X:Lhx4;

    .line 39
    .line 40
    invoke-virtual {v15, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const/16 v2, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v2, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v1, v2

    .line 52
    :cond_3
    and-int/lit16 v2, v6, 0x180

    .line 53
    .line 54
    move-object/from16 v14, p1

    .line 55
    .line 56
    if-nez v2, :cond_5

    .line 57
    .line 58
    invoke-virtual {v15, v14}, Llp2;->f(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    const/16 v2, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v2, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v1, v2

    .line 70
    :cond_5
    and-int/lit16 v2, v6, 0xc00

    .line 71
    .line 72
    if-nez v2, :cond_8

    .line 73
    .line 74
    and-int/lit8 v2, p9, 0x8

    .line 75
    .line 76
    if-nez v2, :cond_6

    .line 77
    .line 78
    move/from16 v2, p2

    .line 79
    .line 80
    invoke-virtual {v15, v2}, Llp2;->g(Z)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    const/16 v3, 0x800

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move/from16 v2, p2

    .line 90
    .line 91
    :cond_7
    const/16 v3, 0x400

    .line 92
    .line 93
    :goto_4
    or-int/2addr v1, v3

    .line 94
    goto :goto_5

    .line 95
    :cond_8
    move/from16 v2, p2

    .line 96
    .line 97
    :goto_5
    and-int/lit8 v3, p9, 0x10

    .line 98
    .line 99
    if-eqz v3, :cond_a

    .line 100
    .line 101
    or-int/lit16 v1, v1, 0x6000

    .line 102
    .line 103
    :cond_9
    move/from16 v4, p3

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_a
    and-int/lit16 v4, v6, 0x6000

    .line 107
    .line 108
    if-nez v4, :cond_9

    .line 109
    .line 110
    move/from16 v4, p3

    .line 111
    .line 112
    invoke-virtual {v15, v4}, Llp2;->g(Z)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_b

    .line 117
    .line 118
    const/16 v5, 0x4000

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_b
    const/16 v5, 0x2000

    .line 122
    .line 123
    :goto_6
    or-int/2addr v1, v5

    .line 124
    :goto_7
    const/high16 v5, 0x30000

    .line 125
    .line 126
    and-int/2addr v5, v6

    .line 127
    if-nez v5, :cond_c

    .line 128
    .line 129
    const/high16 v5, 0x10000

    .line 130
    .line 131
    or-int/2addr v1, v5

    .line 132
    :cond_c
    const/high16 v5, 0x180000

    .line 133
    .line 134
    and-int/2addr v5, v6

    .line 135
    if-nez v5, :cond_d

    .line 136
    .line 137
    const/high16 v5, 0x80000

    .line 138
    .line 139
    or-int/2addr v1, v5

    .line 140
    :cond_d
    const/high16 v5, 0xc00000

    .line 141
    .line 142
    and-int/2addr v5, v6

    .line 143
    move-object/from16 v8, p6

    .line 144
    .line 145
    if-nez v5, :cond_f

    .line 146
    .line 147
    invoke-virtual {v15, v8}, Llp2;->h(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-eqz v5, :cond_e

    .line 152
    .line 153
    const/high16 v5, 0x800000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_e
    const/high16 v5, 0x400000

    .line 157
    .line 158
    :goto_8
    or-int/2addr v1, v5

    .line 159
    :cond_f
    const v5, 0x492493

    .line 160
    .line 161
    .line 162
    and-int/2addr v5, v1

    .line 163
    const v7, 0x492492

    .line 164
    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const/4 v9, 0x1

    .line 168
    if-eq v5, v7, :cond_10

    .line 169
    .line 170
    move v5, v9

    .line 171
    goto :goto_9

    .line 172
    :cond_10
    move v5, v13

    .line 173
    :goto_9
    and-int/lit8 v7, v1, 0x1

    .line 174
    .line 175
    invoke-virtual {v15, v7, v5}, Llp2;->N(IZ)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_18

    .line 180
    .line 181
    invoke-virtual {v15}, Llp2;->S()V

    .line 182
    .line 183
    .line 184
    and-int/lit8 v5, v6, 0x1

    .line 185
    .line 186
    const v7, -0x3f0001

    .line 187
    .line 188
    .line 189
    if-eqz v5, :cond_13

    .line 190
    .line 191
    invoke-virtual {v15}, Llp2;->x()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_11

    .line 196
    .line 197
    goto :goto_b

    .line 198
    :cond_11
    invoke-virtual {v15}, Llp2;->Q()V

    .line 199
    .line 200
    .line 201
    and-int/lit8 v3, p9, 0x8

    .line 202
    .line 203
    if-eqz v3, :cond_12

    .line 204
    .line 205
    and-int/lit16 v1, v1, -0x1c01

    .line 206
    .line 207
    :cond_12
    and-int/2addr v1, v7

    .line 208
    move/from16 v17, p5

    .line 209
    .line 210
    move/from16 v16, v2

    .line 211
    .line 212
    move/from16 v2, p4

    .line 213
    .line 214
    :goto_a
    move v3, v1

    .line 215
    move v1, v4

    .line 216
    goto :goto_c

    .line 217
    :cond_13
    :goto_b
    and-int/lit8 v5, p9, 0x8

    .line 218
    .line 219
    if-eqz v5, :cond_14

    .line 220
    .line 221
    invoke-static {v15}, Loc;->t(Llp2;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    xor-int/2addr v2, v9

    .line 226
    and-int/lit16 v1, v1, -0x1c01

    .line 227
    .line 228
    :cond_14
    if-eqz v3, :cond_15

    .line 229
    .line 230
    move v4, v9

    .line 231
    :cond_15
    invoke-static {v15}, Loc;->t(Llp2;)Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    xor-int/2addr v3, v9

    .line 236
    invoke-static {v15}, Loc;->t(Llp2;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    and-int/2addr v1, v7

    .line 241
    move/from16 v16, v2

    .line 242
    .line 243
    move v2, v3

    .line 244
    move/from16 v17, v5

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :goto_c
    invoke-virtual {v15}, Llp2;->q()V

    .line 248
    .line 249
    .line 250
    sget-object v4, Lpc;->b:Lox1;

    .line 251
    .line 252
    invoke-virtual {v15, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    move-object v10, v4

    .line 257
    check-cast v10, Landroid/content/Context;

    .line 258
    .line 259
    sget-object v4, Lyc4;->a:Lz01;

    .line 260
    .line 261
    invoke-virtual {v15, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    move-object v11, v4

    .line 266
    check-cast v11, Landroid/app/Activity;

    .line 267
    .line 268
    sget-object v4, Lpc;->a:Lox1;

    .line 269
    .line 270
    invoke-virtual {v15, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    move-object v12, v4

    .line 275
    check-cast v12, Landroid/content/res/Configuration;

    .line 276
    .line 277
    invoke-static {v15}, Lyn0;->K(Llp2;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v17, :cond_16

    .line 282
    .line 283
    const v4, 0xccbcc3c    # 3.1400021E-31f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v15, v4}, Llp2;->W(I)V

    .line 287
    .line 288
    .line 289
    new-instance v7, Lmq2;

    .line 290
    .line 291
    move-object v4, v12

    .line 292
    const/4 v12, 0x1

    .line 293
    move-object v9, v10

    .line 294
    move-object v10, v11

    .line 295
    move-object v11, v4

    .line 296
    invoke-direct/range {v7 .. v12}, Lmq2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 297
    .line 298
    .line 299
    const v4, 0x37634eaa

    .line 300
    .line 301
    .line 302
    invoke-static {v4, v7, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    and-int/lit8 v5, v3, 0xe

    .line 307
    .line 308
    or-int/lit16 v5, v5, 0x6000

    .line 309
    .line 310
    and-int/lit8 v7, v3, 0x70

    .line 311
    .line 312
    or-int/2addr v5, v7

    .line 313
    shr-int/lit8 v3, v3, 0x6

    .line 314
    .line 315
    and-int/lit16 v3, v3, 0x380

    .line 316
    .line 317
    or-int/2addr v5, v3

    .line 318
    move-object v3, v4

    .line 319
    move-object v4, v15

    .line 320
    invoke-static/range {v0 .. v5}, Lvr3;->b(Ldn2;ZZLzy0;Llp2;I)V

    .line 321
    .line 322
    .line 323
    move v0, v1

    .line 324
    move/from16 v18, v2

    .line 325
    .line 326
    invoke-virtual {v15, v13}, Llp2;->p(Z)V

    .line 327
    .line 328
    .line 329
    move/from16 v19, v0

    .line 330
    .line 331
    move/from16 v3, v16

    .line 332
    .line 333
    goto :goto_e

    .line 334
    :cond_16
    move v0, v1

    .line 335
    move/from16 v18, v2

    .line 336
    .line 337
    const v1, 0xcd24e3e

    .line 338
    .line 339
    .line 340
    invoke-virtual {v15, v1}, Llp2;->W(I)V

    .line 341
    .line 342
    .line 343
    sget-object v1, Lep;->z:Lox1;

    .line 344
    .line 345
    invoke-virtual {v15, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    check-cast v1, Ldp;

    .line 350
    .line 351
    iget-object v1, v1, Ldp;->b:Luo;

    .line 352
    .line 353
    iget-wide v1, v1, Luo;->b:J

    .line 354
    .line 355
    if-eqz v18, :cond_17

    .line 356
    .line 357
    sget-object v5, Lw79;->a:Lzy0;

    .line 358
    .line 359
    goto :goto_d

    .line 360
    :cond_17
    const/4 v5, 0x0

    .line 361
    :goto_d
    xor-int/2addr v4, v9

    .line 362
    new-instance v7, Lax4;

    .line 363
    .line 364
    invoke-direct {v7, v4, v4, v0, v0}, Lax4;-><init>(ZZZZ)V

    .line 365
    .line 366
    .line 367
    move-object v4, v7

    .line 368
    new-instance v7, Lzv2;

    .line 369
    .line 370
    move v8, v13

    .line 371
    const/4 v13, 0x0

    .line 372
    move-object/from16 v9, p0

    .line 373
    .line 374
    move-object/from16 v8, p6

    .line 375
    .line 376
    invoke-direct/range {v7 .. v13}, Lzv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 377
    .line 378
    .line 379
    const v8, -0x61a96a8a

    .line 380
    .line 381
    .line 382
    invoke-static {v8, v7, v15}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    and-int/lit16 v8, v3, 0x3fe

    .line 387
    .line 388
    const v9, 0xe000

    .line 389
    .line 390
    .line 391
    shl-int/lit8 v3, v3, 0x3

    .line 392
    .line 393
    and-int/2addr v3, v9

    .line 394
    or-int/2addr v3, v8

    .line 395
    move-object v11, v5

    .line 396
    move-wide v5, v1

    .line 397
    const/4 v2, 0x0

    .line 398
    move-object v13, v4

    .line 399
    const/4 v4, 0x0

    .line 400
    move-object v14, v7

    .line 401
    const-wide/16 v7, 0x0

    .line 402
    .line 403
    const-wide/16 v9, 0x0

    .line 404
    .line 405
    const/4 v12, 0x0

    .line 406
    move/from16 v1, v16

    .line 407
    .line 408
    move/from16 v16, v3

    .line 409
    .line 410
    move v3, v1

    .line 411
    move-object/from16 v1, p1

    .line 412
    .line 413
    move/from16 v19, v0

    .line 414
    .line 415
    move-object/from16 v0, p0

    .line 416
    .line 417
    invoke-static/range {v0 .. v16}, Lzw4;->a(Ldn2;Lo87;FZLx67;JJJLrn2;Lrn2;Lax4;Lzy0;Llp2;I)V

    .line 418
    .line 419
    .line 420
    const/4 v8, 0x0

    .line 421
    invoke-virtual {v15, v8}, Llp2;->p(Z)V

    .line 422
    .line 423
    .line 424
    :goto_e
    move/from16 v6, v17

    .line 425
    .line 426
    move/from16 v5, v18

    .line 427
    .line 428
    move/from16 v4, v19

    .line 429
    .line 430
    goto :goto_f

    .line 431
    :cond_18
    invoke-virtual {v15}, Llp2;->Q()V

    .line 432
    .line 433
    .line 434
    move/from16 v5, p4

    .line 435
    .line 436
    move/from16 v6, p5

    .line 437
    .line 438
    move v3, v2

    .line 439
    :goto_f
    invoke-virtual {v15}, Llp2;->r()Lj86;

    .line 440
    .line 441
    .line 442
    move-result-object v10

    .line 443
    if-eqz v10, :cond_19

    .line 444
    .line 445
    new-instance v0, Law2;

    .line 446
    .line 447
    move-object/from16 v1, p0

    .line 448
    .line 449
    move-object/from16 v2, p1

    .line 450
    .line 451
    move-object/from16 v7, p6

    .line 452
    .line 453
    move/from16 v8, p8

    .line 454
    .line 455
    move/from16 v9, p9

    .line 456
    .line 457
    invoke-direct/range {v0 .. v9}, Law2;-><init>(Ldn2;Lo87;ZZZZLzy0;II)V

    .line 458
    .line 459
    .line 460
    iput-object v0, v10, Lj86;->d:Lrn2;

    .line 461
    .line 462
    :cond_19
    return-void
.end method

.method public static d0(Ljava/lang/Throwable;Lu85;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, p0}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final e(Landroid/content/Context;Landroid/app/Activity;Landroid/content/res/Configuration;Lzy0;Llp2;)V
    .locals 1

    .line 1
    sget-object v0, Lpc;->b:Lox1;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lyc4;->a:Lz01;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lq06;->a(Ljava/lang/Object;)Lt06;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Lpc;->a:Lox1;

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    filled-new-array {p0, p1, p2}, [Lt06;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Lh8;

    .line 24
    .line 25
    const/4 p2, 0x6

    .line 26
    invoke-direct {p1, p3, p2}, Lh8;-><init>(Lzy0;B)V

    .line 27
    .line 28
    .line 29
    const p2, -0x41245277

    .line 30
    .line 31
    .line 32
    invoke-static {p2, p1, p4}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/16 p2, 0x30

    .line 37
    .line 38
    invoke-static {p0, p1, p4, p2}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static e0(Ljava/lang/Throwable;Lu85;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lvr3;->c0(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2, p0}, Lma5;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, p0}, Lu85;->onError(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final f(Lj31;Lq5;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcg2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcg2;

    .line 7
    .line 8
    iget v1, v0, Lcg2;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcg2;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcg2;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ls51;-><init>(Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcg2;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lcg2;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lcg2;->g0:Lte0;

    .line 35
    .line 36
    iget-object p1, v0, Lcg2;->f0:Laa6;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lh; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catch_0
    move-exception p2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Laa6;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lte0;

    .line 60
    .line 61
    const/4 v3, 0x5

    .line 62
    invoke-direct {v1, p1, p2, v3}, Lte0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    :try_start_1
    iput-object p2, v0, Lcg2;->f0:Laa6;

    .line 66
    .line 67
    iput-object v1, v0, Lcg2;->g0:Lte0;

    .line 68
    .line 69
    iput v2, v0, Lcg2;->i0:I

    .line 70
    .line 71
    invoke-virtual {p0, v1, v0}, Lj31;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_1
    .catch Lh; {:try_start_1 .. :try_end_1} :catch_1

    .line 75
    sget-object p1, Lc71;->X:Lc71;

    .line 76
    .line 77
    if-ne p0, p1, :cond_3

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    move-object p1, p2

    .line 81
    goto :goto_2

    .line 82
    :catch_1
    move-exception p0

    .line 83
    move-object p1, p2

    .line 84
    move-object p2, p0

    .line 85
    move-object p0, v1

    .line 86
    :goto_1
    iget-object v1, p2, Lh;->X:Ljava/lang/Object;

    .line 87
    .line 88
    if-ne v1, p0, :cond_4

    .line 89
    .line 90
    iget-object p0, v0, Ls51;->Y:Ls61;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Lu70;->I(Ls61;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-boolean p0, p1, Laa6;->X:Z

    .line 99
    .line 100
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_4
    throw p2
.end method

.method public static f0(Leb0;)[B
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x2

    .line 14
    mul-int/2addr v2, v3

    .line 15
    const/16 v4, 0x80

    .line 16
    .line 17
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v4, 0x2000

    .line 22
    .line 23
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    move v4, v1

    .line 28
    :goto_0
    const/4 v5, -0x1

    .line 29
    const v6, 0x7ffffff7

    .line 30
    .line 31
    .line 32
    if-ge v4, v6, :cond_5

    .line 33
    .line 34
    sub-int/2addr v6, v4

    .line 35
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    new-array v7, v6, [B

    .line 40
    .line 41
    invoke-virtual {v0, v7}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move v8, v1

    .line 45
    :goto_1
    if-ge v8, v6, :cond_1

    .line 46
    .line 47
    sub-int v9, v6, v8

    .line 48
    .line 49
    invoke-virtual {p0, v7, v8, v9}, Leb0;->read([BII)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    if-ne v9, v5, :cond_0

    .line 54
    .line 55
    invoke-static {v0, v4}, Lvr3;->n(Ljava/util/ArrayDeque;I)[B

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_0
    add-int/2addr v8, v9

    .line 61
    add-int/2addr v4, v9

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    int-to-long v5, v2

    .line 64
    const/16 v7, 0x1000

    .line 65
    .line 66
    if-ge v2, v7, :cond_2

    .line 67
    .line 68
    const/4 v2, 0x4

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v2, v3

    .line 71
    :goto_2
    int-to-long v7, v2

    .line 72
    mul-long/2addr v5, v7

    .line 73
    const-wide/32 v7, 0x7fffffff

    .line 74
    .line 75
    .line 76
    cmp-long v2, v5, v7

    .line 77
    .line 78
    if-lez v2, :cond_3

    .line 79
    .line 80
    const v2, 0x7fffffff

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const-wide/32 v7, -0x80000000

    .line 85
    .line 86
    .line 87
    cmp-long v2, v5, v7

    .line 88
    .line 89
    if-gez v2, :cond_4

    .line 90
    .line 91
    const/high16 v2, -0x80000000

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    long-to-int v2, v5

    .line 95
    goto :goto_0

    .line 96
    :cond_5
    invoke-virtual {p0}, Leb0;->read()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-ne p0, v5, :cond_6

    .line 101
    .line 102
    invoke-static {v0, v6}, Lvr3;->n(Ljava/util/ArrayDeque;I)[B

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_6
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 108
    .line 109
    const-string v0, "input is too large to fit in a byte array"

    .line 110
    .line 111
    invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0
.end method

.method public static g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;
    .locals 1

    .line 1
    new-instance v0, Lzo0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lzo0;-><init>(Lvu;Lxb4;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0, p2}, Lxb4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final h(Lsa7;)Li76;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Li76;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Li76;-><init>(Lsa7;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final h0(Lvz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lvz5;->Z:I

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x4

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lvz5;->h0:Lnz5;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/16 v1, 0x8

    .line 21
    .line 22
    and-int/2addr v0, v1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    iget p0, p0, Lvz5;->i0:I

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    const-string p0, "No type in ProtoBuf.ValueParameter"

    .line 33
    .line 34
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method public static final i(Lje7;)Lj76;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj76;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lj76;-><init>(Lje7;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final i0(Lpz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lpz5;->Z:I

    .line 5
    .line 6
    and-int/lit8 v1, v0, 0x4

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lpz5;->i0:Lnz5;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/16 v1, 0x8

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    iget p0, p0, Lpz5;->j0:I

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    const-string p0, "No underlyingType in ProtoBuf.TypeAlias"

    .line 30
    .line 31
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static final j(Lhq5;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhq5;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lhq5;->h:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Lhq5;->d:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final j0(Lsz5;Lux4;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lsz5;->j0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lsz5;->k0:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1, v1}, Lux4;->a(I)Lnz5;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v0
.end method

.method public static final k(Lhq5;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhq5;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lhq5;->d:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final k0(II)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    if-nez v2, :cond_1

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "both minLines "

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v3, " and maxLines "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " must be greater than zero"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Lzc3;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    if-gt p0, p1, :cond_2

    .line 43
    .line 44
    move v0, v1

    .line 45
    :cond_2
    if-nez v0, :cond_3

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v1, "minLines "

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, " must be less than or equal to maxLines "

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lzc3;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method public static final l(Lhq5;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhq5;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lhq5;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Lhq5;->d:Z

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final l0(Ls61;Ljava/lang/Object;Ljava/lang/Object;Lrn2;Lq51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Llp0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Llp0;

    .line 7
    .line 8
    iget v1, v0, Llp0;->j0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llp0;->j0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llp0;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Ls51;-><init>(Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Llp0;->i0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Llp0;->j0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Llp0;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p1, v0, Llp0;->g0:Ls61;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object p2, p0

    .line 42
    move-object p0, p1

    .line 43
    goto :goto_3

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    move-object v4, p2

    .line 46
    move-object p2, p0

    .line 47
    move-object p0, p1

    .line 48
    move-object p1, v4

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p2}, Lg98;->c(Ls61;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :try_start_1
    iput-object p1, v0, Llp0;->f0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p0, v0, Llp0;->g0:Ls61;

    .line 67
    .line 68
    iput-object p2, v0, Llp0;->h0:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, v0, Llp0;->j0:I

    .line 71
    .line 72
    new-instance p4, Lfg7;

    .line 73
    .line 74
    invoke-direct {p4, v0, p0}, Lfg7;-><init>(Llp0;Ls61;)V

    .line 75
    .line 76
    .line 77
    if-nez p3, :cond_3

    .line 78
    .line 79
    invoke-static {p3, p1, p4}, Lmb6;->k0(Lrn2;Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    :goto_1
    move-object p4, p1

    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    goto :goto_4

    .line 87
    :cond_3
    const/4 v0, 0x2

    .line 88
    invoke-static {v0, p3}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-interface {p3, p1, p4}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    goto :goto_1

    .line 96
    :goto_2
    sget-object p1, Lc71;->X:Lc71;

    .line 97
    .line 98
    if-ne p4, p1, :cond_4

    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_4
    :goto_3
    invoke-static {p0, p2}, Lg98;->a(Ls61;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object p4

    .line 105
    :goto_4
    invoke-static {p0, p2}, Lg98;->a(Ls61;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method

.method public static final m(Lhq5;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lhq5;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Lhq5;->d:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static n(Ljava/util/ArrayDeque;I)[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [B

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [B

    .line 16
    .line 17
    array-length v2, v0

    .line 18
    if-ne v2, p1, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    array-length v2, v0

    .line 22
    sub-int v2, p1, v2

    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    if-lez v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, [B

    .line 35
    .line 36
    array-length v4, v3

    .line 37
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    sub-int v5, p1, v2

    .line 42
    .line 43
    invoke-static {v3, v1, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sub-int/2addr v2, v4

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-object v0
.end method

.method public static final o(FFFII)I
    .locals 0

    .line 1
    if-ne p3, p4, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    return p0

    .line 5
    :cond_0
    add-int/lit8 p4, p3, -0x2

    .line 6
    .line 7
    if-gez p4, :cond_1

    .line 8
    .line 9
    const/4 p4, 0x0

    .line 10
    :cond_1
    int-to-float p4, p4

    .line 11
    mul-float/2addr p1, p4

    .line 12
    add-float/2addr p1, p0

    .line 13
    const/4 p0, 0x1

    .line 14
    sub-int/2addr p3, p0

    .line 15
    if-le p3, p0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    move p0, p3

    .line 19
    :goto_0
    int-to-float p0, p0

    .line 20
    mul-float/2addr p2, p0

    .line 21
    add-float/2addr p2, p1

    .line 22
    invoke-static {p2}, Lnr4;->O(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method public static final p(Lfy5;Lux4;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lfy5;->o0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lfy5;->p0:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1, v1}, Lux4;->a(I)Lnz5;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v0
.end method

.method public static final q(Lvy5;Lux4;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lvy5;->n0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lvy5;->o0:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1, v1}, Lux4;->a(I)Lnz5;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v0
.end method

.method public static final r(Lcz5;Lux4;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcz5;->n0:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcz5;->o0:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p0, v1}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1, v1}, Lux4;->a(I)Lnz5;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-object v0
.end method

.method public static s(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Lkd3;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 1
    const-string v0, "editorInfo must be non-null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg33;->N(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x19

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance p1, Lid3;

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Lid3;-><init>(Landroid/view/inputmethod/InputConnection;Lkd3;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-static {p1}, Lpy1;->b(Landroid/view/inputmethod/EditorInfo;)[Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length p1, p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance p1, Ljd3;

    .line 27
    .line 28
    invoke-direct {p1, p0, p2}, Ljd3;-><init>(Landroid/view/inputmethod/InputConnection;Lkd3;)V

    .line 29
    .line 30
    .line 31
    return-object p1
.end method

.method public static final t(Ly07;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly07;->k()Lt07;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lc17;->j:Le17;

    .line 6
    .line 7
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ls05;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0
.end method

.method public static final u(Ljava/util/concurrent/Executor;Ljava/lang/String;Ldn2;)Lud0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lmf1;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, p1, p2, v1}, Lmf1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lu15;->u(Lsd0;)Lud0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final v(Lpz5;Lux4;)Lnz5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lpz5;->Z:I

    .line 5
    .line 6
    and-int/lit8 v1, v0, 0x10

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lpz5;->k0:Lnz5;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/16 v1, 0x20

    .line 19
    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget p0, p0, Lpz5;->l0:I

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lux4;->a(I)Lnz5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const-string p0, "No expandedType in ProtoBuf.TypeAlias"

    .line 31
    .line 32
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static final w(Ljava/lang/Iterable;)Ljava/util/HashSet;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Let4;

    .line 21
    .line 22
    invoke-interface {v1}, Let4;->d()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/Iterable;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_0
    invoke-static {v0, v1}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public static x(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "Future was expected to be done, "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, v0}, Lmb6;->s(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lvr3;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final y(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_1

    .line 24
    .line 25
    new-instance v0, Lps;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v0, v2}, Lps;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lps;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lvr3;->z(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Lps;->c(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v0, Lps;->b:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    invoke-static {p0}, Lvr3;->z(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static final z(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v0

    .line 10
    array-length v1, v1

    .line 11
    if-ne v2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    invoke-static {p0, v0}, Leu;->l0(I[Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v0, 0x0

    .line 39
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 40
    .line 41
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    return-object v0
.end method


# virtual methods
.method public abstract g()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, Lvr3;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lvr3;->g()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method
