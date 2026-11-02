.class public Lcom/google/firebase/FirebaseCommonRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/16 v1, 0x5f

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 15

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v1, v0, [Ljava/lang/Class;

    .line 8
    .line 9
    new-instance v2, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v3, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v11, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v12, Lrg1;

    .line 25
    .line 26
    invoke-static {v12}, Le26;->a(Ljava/lang/Class;)Le26;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    array-length v4, v1

    .line 34
    const/4 v8, 0x0

    .line 35
    move v5, v8

    .line 36
    :goto_0
    if-ge v5, v4, :cond_0

    .line 37
    .line 38
    aget-object v6, v1, v5

    .line 39
    .line 40
    const-string v7, "Null interface"

    .line 41
    .line 42
    invoke-static {v6, v7}, Ljb5;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v6}, Le26;->a(Ljava/lang/Class;)Le26;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v1, Lli1;

    .line 56
    .line 57
    const/4 v13, 0x2

    .line 58
    const-class v4, Lry;

    .line 59
    .line 60
    invoke-direct {v1, v13, v0, v4}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 61
    .line 62
    .line 63
    iget-object v4, v1, Lli1;->a:Le26;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v14, 0x0

    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance v10, Lb61;

    .line 76
    .line 77
    const/4 v1, 0x5

    .line 78
    invoke-direct {v10, v1}, Lb61;-><init>(B)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Lcy0;

    .line 82
    .line 83
    new-instance v6, Ljava/util/HashSet;

    .line 84
    .line 85
    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    new-instance v7, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    move v9, v8

    .line 95
    invoke-direct/range {v4 .. v11}, Lcy0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILry0;Ljava/util/Set;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    new-instance v2, Le26;

    .line 102
    .line 103
    const-class v3, Lu00;

    .line 104
    .line 105
    const-class v4, Ljava/util/concurrent/Executor;

    .line 106
    .line 107
    invoke-direct {v2, v3, v4}, Le26;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    const-class v3, Lqz2;

    .line 111
    .line 112
    const-class v4, Lrz2;

    .line 113
    .line 114
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, Lby0;

    .line 119
    .line 120
    const-class v5, Lue1;

    .line 121
    .line 122
    invoke-direct {v4, v5, v3}, Lby0;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 123
    .line 124
    .line 125
    const-class v3, Landroid/content/Context;

    .line 126
    .line 127
    invoke-static {v3}, Lli1;->a(Ljava/lang/Class;)Lli1;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v4, v3}, Lby0;->a(Lli1;)V

    .line 132
    .line 133
    .line 134
    const-class v3, Lxa2;

    .line 135
    .line 136
    invoke-static {v3}, Lli1;->a(Ljava/lang/Class;)Lli1;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v4, v3}, Lby0;->a(Lli1;)V

    .line 141
    .line 142
    .line 143
    new-instance v3, Lli1;

    .line 144
    .line 145
    const-class v5, Lpz2;

    .line 146
    .line 147
    invoke-direct {v3, v13, v0, v5}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v3}, Lby0;->a(Lli1;)V

    .line 151
    .line 152
    .line 153
    new-instance v3, Lli1;

    .line 154
    .line 155
    const/4 v5, 0x1

    .line 156
    invoke-direct {v3, v5, v5, v12}, Lli1;-><init>(IILjava/lang/Class;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v3}, Lby0;->a(Lli1;)V

    .line 160
    .line 161
    .line 162
    new-instance v3, Lli1;

    .line 163
    .line 164
    invoke-direct {v3, v2, v5, v0}, Lli1;-><init>(Le26;II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v3}, Lby0;->a(Lli1;)V

    .line 168
    .line 169
    .line 170
    new-instance v3, Lse1;

    .line 171
    .line 172
    invoke-direct {v3, v2, v0}, Lse1;-><init>(Le26;B)V

    .line 173
    .line 174
    .line 175
    iput-object v3, v4, Lby0;->g:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v4}, Lby0;->b()Lcy0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    const-string v2, "fire-android"

    .line 191
    .line 192
    invoke-static {v2, v0}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    const-string v0, "fire-core"

    .line 200
    .line 201
    const-string v2, "22.2.1"

    .line 202
    .line 203
    invoke-static {v0, v2}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    const-string v2, "device-name"

    .line 217
    .line 218
    invoke-static {v2, v0}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v2, "device-model"

    .line 232
    .line 233
    invoke-static {v2, v0}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const-string v2, "device-brand"

    .line 247
    .line 248
    invoke-static {v2, v0}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    new-instance v0, Lu52;

    .line 256
    .line 257
    invoke-direct {v0, v1}, Lu52;-><init>(B)V

    .line 258
    .line 259
    .line 260
    const-string v1, "android-target-sdk"

    .line 261
    .line 262
    invoke-static {v1, v0}, Lu70;->K(Ljava/lang/String;Lu52;)Lcy0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    new-instance v0, Lu52;

    .line 270
    .line 271
    const/4 v1, 0x6

    .line 272
    invoke-direct {v0, v1}, Lu52;-><init>(B)V

    .line 273
    .line 274
    .line 275
    const-string v1, "android-min-sdk"

    .line 276
    .line 277
    invoke-static {v1, v0}, Lu70;->K(Ljava/lang/String;Lu52;)Lcy0;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    new-instance v0, Lu52;

    .line 285
    .line 286
    const/4 v1, 0x7

    .line 287
    invoke-direct {v0, v1}, Lu52;-><init>(B)V

    .line 288
    .line 289
    .line 290
    const-string v1, "android-platform"

    .line 291
    .line 292
    invoke-static {v1, v0}, Lu70;->K(Ljava/lang/String;Lu52;)Lcy0;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    new-instance v0, Lu52;

    .line 300
    .line 301
    const/16 v1, 0x8

    .line 302
    .line 303
    invoke-direct {v0, v1}, Lu52;-><init>(B)V

    .line 304
    .line 305
    .line 306
    const-string v1, "android-installer"

    .line 307
    .line 308
    invoke-static {v1, v0}, Lu70;->K(Ljava/lang/String;Lu52;)Lcy0;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    :try_start_0
    sget-object v0, Lb24;->g0:Lb24;

    .line 316
    .line 317
    invoke-virtual {v0}, Lb24;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v14
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    :catch_0
    if-eqz v14, :cond_1

    .line 322
    .line 323
    const-string v0, "kotlin"

    .line 324
    .line 325
    invoke-static {v0, v14}, Lu70;->C(Ljava/lang/String;Ljava/lang/String;)Lcy0;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    :cond_1
    return-object p0

    .line 333
    :cond_2
    const-string p0, "Components are not allowed to depend on interfaces they themselves provide."

    .line 334
    .line 335
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-object v14
.end method
