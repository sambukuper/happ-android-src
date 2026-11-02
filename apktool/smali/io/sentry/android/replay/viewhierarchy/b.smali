.class public abstract Lio/sentry/android/replay/viewhierarchy/b;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lg44;

.field public static b:Z

.field public static c:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lw74;->Y:Lw74;

    .line 2
    .line 3
    sget-object v1, Lio/sentry/android/replay/viewhierarchy/a;->Y:Lio/sentry/android/replay/viewhierarchy/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:Lg44;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Lt07;ZLv3;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    sget-object v1, Lio/sentry/android/replay/f0;->a:Le17;

    .line 5
    .line 6
    iget-object v2, p0, Lt07;->X:Ls05;

    .line 7
    .line 8
    invoke-virtual {v2, v1}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    :cond_1
    const-string v1, "unmask"

    .line 19
    .line 20
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p2}, Lv3;->w()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    const-string v1, "mask"

    .line 32
    .line 33
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p2}, Lv3;->w()V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_3
    if-eqz p1, :cond_4

    .line 45
    .line 46
    const-string p0, "android.widget.ImageView"

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-eqz p0, :cond_6

    .line 50
    .line 51
    iget-object p0, p0, Lt07;->X:Ls05;

    .line 52
    .line 53
    sget-object p1, Lc17;->C:Le17;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ls05;->c(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    sget-object p1, Ls07;->k:Le17;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ls05;->c(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_5

    .line 68
    .line 69
    sget-object p1, Lc17;->G:Le17;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ls05;->c(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    :cond_5
    const-string p0, "android.widget.TextView"

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_6
    const-string p0, "android.view.View"

    .line 81
    .line 82
    :goto_1
    iget-object p1, p2, Lv3;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_7

    .line 91
    .line 92
    return v2

    .line 93
    :cond_7
    iget-object p1, p2, Lv3;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method

.method public static b(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/g;ZLv3;Lio/sentry/ILogger;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v12, p3

    .line 6
    .line 7
    move-object/from16 v13, p4

    .line 8
    .line 9
    sget-object v14, Lio/sentry/android/replay/viewhierarchy/b;->a:Lg44;

    .line 10
    .line 11
    sget-object v1, Lio/sentry/config/a;->a:Ljava/lang/Boolean;

    .line 12
    .line 13
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v15, 0x0

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    move-object v1, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-static {}, Lio/sentry/config/a;->j()Lio/sentry/internal/debugmeta/c;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast v0, Ljava/util/List;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-nez v1, :cond_31

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sput-object v2, Lio/sentry/config/a;->a:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    sput-object v1, Lio/sentry/config/a;->a:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {}, Lio/sentry/config/a;->j()Lio/sentry/internal/debugmeta/c;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v1, v1, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast v0, Ljava/util/List;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    const/4 v6, 0x0

    .line 112
    :goto_2
    if-ge v6, v3, :cond_30

    .line 113
    .line 114
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v7, v0

    .line 119
    check-cast v7, Landroidx/compose/ui/node/LayoutNode;

    .line 120
    .line 121
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->L()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    iget-object v8, v7, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 126
    .line 127
    if-eqz v0, :cond_2e

    .line 128
    .line 129
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->K()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2e

    .line 134
    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    iget-object v9, v8, Lt6;->f0:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v9, Lfd3;

    .line 142
    .line 143
    invoke-static {v9}, Ljm4;->x(Ly24;)Ly24;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-direct {v0, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    .line 151
    .line 152
    :cond_3
    iget-object v0, v8, Lt6;->f0:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lfd3;

    .line 155
    .line 156
    sget-object v8, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    .line 157
    .line 158
    if-eqz v8, :cond_4

    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Ly24;

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_4
    move-object v8, v15

    .line 168
    :goto_3
    if-nez v8, :cond_5

    .line 169
    .line 170
    invoke-static {v0}, Ljm4;->x(Ly24;)Ly24;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    :cond_5
    invoke-interface {v8}, Ly24;->j()J

    .line 175
    .line 176
    .line 177
    move-result-wide v9

    .line 178
    const/16 v11, 0x20

    .line 179
    .line 180
    shr-long/2addr v9, v11

    .line 181
    long-to-int v9, v9

    .line 182
    int-to-float v9, v9

    .line 183
    invoke-interface {v8}, Ly24;->j()J

    .line 184
    .line 185
    .line 186
    move-result-wide v16

    .line 187
    const-wide v18, 0xffffffffL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    move v10, v6

    .line 193
    and-long v5, v16, v18

    .line 194
    .line 195
    long-to-int v5, v5

    .line 196
    int-to-float v5, v5

    .line 197
    const/4 v6, 0x1

    .line 198
    invoke-interface {v8, v0, v6}, Ly24;->H(Ly24;Z)Ls86;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move/from16 v16, v11

    .line 203
    .line 204
    iget v11, v0, Ls86;->a:F

    .line 205
    .line 206
    const/4 v6, 0x0

    .line 207
    cmpg-float v20, v11, v6

    .line 208
    .line 209
    if-gez v20, :cond_6

    .line 210
    .line 211
    move v11, v6

    .line 212
    :cond_6
    cmpl-float v20, v11, v9

    .line 213
    .line 214
    if-lez v20, :cond_7

    .line 215
    .line 216
    move v11, v9

    .line 217
    :cond_7
    iget v15, v0, Ls86;->b:F

    .line 218
    .line 219
    cmpg-float v21, v15, v6

    .line 220
    .line 221
    if-gez v21, :cond_8

    .line 222
    .line 223
    move v15, v6

    .line 224
    :cond_8
    cmpl-float v21, v15, v5

    .line 225
    .line 226
    if-lez v21, :cond_9

    .line 227
    .line 228
    move v15, v5

    .line 229
    :cond_9
    move/from16 v21, v6

    .line 230
    .line 231
    iget v6, v0, Ls86;->c:F

    .line 232
    .line 233
    cmpg-float v22, v6, v21

    .line 234
    .line 235
    if-gez v22, :cond_a

    .line 236
    .line 237
    move/from16 v6, v21

    .line 238
    .line 239
    :cond_a
    cmpl-float v22, v6, v9

    .line 240
    .line 241
    if-lez v22, :cond_b

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_b
    move v9, v6

    .line 245
    :goto_4
    iget v0, v0, Ls86;->d:F

    .line 246
    .line 247
    cmpg-float v6, v0, v21

    .line 248
    .line 249
    if-gez v6, :cond_c

    .line 250
    .line 251
    move/from16 v0, v21

    .line 252
    .line 253
    :cond_c
    cmpl-float v6, v0, v5

    .line 254
    .line 255
    if-lez v6, :cond_d

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_d
    move v5, v0

    .line 259
    :goto_5
    cmpg-float v0, v11, v9

    .line 260
    .line 261
    if-nez v0, :cond_e

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_e
    cmpg-float v0, v15, v5

    .line 265
    .line 266
    if-nez v0, :cond_f

    .line 267
    .line 268
    :goto_6
    new-instance v0, Ls86;

    .line 269
    .line 270
    move/from16 v5, v21

    .line 271
    .line 272
    invoke-direct {v0, v5, v5, v5, v5}, Ls86;-><init>(FFFF)V

    .line 273
    .line 274
    .line 275
    move-object v8, v0

    .line 276
    move-object v6, v2

    .line 277
    move v15, v10

    .line 278
    goto/16 :goto_7

    .line 279
    .line 280
    :cond_f
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    move-object v6, v1

    .line 285
    int-to-long v0, v0

    .line 286
    move-wide/from16 v22, v0

    .line 287
    .line 288
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    int-to-long v0, v0

    .line 293
    shl-long v22, v22, v16

    .line 294
    .line 295
    and-long v0, v0, v18

    .line 296
    .line 297
    or-long v0, v22, v0

    .line 298
    .line 299
    invoke-interface {v8, v0, v1}, Ly24;->b(J)J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    move-wide/from16 v22, v0

    .line 304
    .line 305
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    int-to-long v0, v0

    .line 310
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 311
    .line 312
    .line 313
    move-result v15

    .line 314
    move-wide/from16 v24, v0

    .line 315
    .line 316
    int-to-long v0, v15

    .line 317
    shl-long v24, v24, v16

    .line 318
    .line 319
    and-long v0, v0, v18

    .line 320
    .line 321
    or-long v0, v24, v0

    .line 322
    .line 323
    invoke-interface {v8, v0, v1}, Ly24;->b(J)J

    .line 324
    .line 325
    .line 326
    move-result-wide v0

    .line 327
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    move-wide/from16 v24, v0

    .line 332
    .line 333
    int-to-long v0, v9

    .line 334
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    move-wide/from16 v26, v0

    .line 339
    .line 340
    int-to-long v0, v9

    .line 341
    shl-long v26, v26, v16

    .line 342
    .line 343
    and-long v0, v0, v18

    .line 344
    .line 345
    or-long v0, v26, v0

    .line 346
    .line 347
    invoke-interface {v8, v0, v1}, Ly24;->b(J)J

    .line 348
    .line 349
    .line 350
    move-result-wide v0

    .line 351
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    move-wide/from16 v26, v0

    .line 356
    .line 357
    int-to-long v0, v9

    .line 358
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    move-wide/from16 v28, v0

    .line 363
    .line 364
    int-to-long v0, v5

    .line 365
    shl-long v28, v28, v16

    .line 366
    .line 367
    and-long v0, v0, v18

    .line 368
    .line 369
    or-long v0, v28, v0

    .line 370
    .line 371
    invoke-interface {v8, v0, v1}, Ly24;->b(J)J

    .line 372
    .line 373
    .line 374
    move-result-wide v0

    .line 375
    shr-long v8, v22, v16

    .line 376
    .line 377
    long-to-int v5, v8

    .line 378
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    shr-long v8, v24, v16

    .line 383
    .line 384
    long-to-int v8, v8

    .line 385
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    move-wide/from16 v28, v0

    .line 390
    .line 391
    shr-long v0, v28, v16

    .line 392
    .line 393
    long-to-int v0, v0

    .line 394
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    move-object v9, v2

    .line 399
    shr-long v1, v26, v16

    .line 400
    .line 401
    long-to-int v1, v1

    .line 402
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    invoke-static {v8, v2}, Ljava/lang/Math;->min(FF)F

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-static {v8, v0}, Ljava/lang/Math;->max(FF)F

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    move-object v1, v6

    .line 431
    and-long v5, v22, v18

    .line 432
    .line 433
    long-to-int v5, v5

    .line 434
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 435
    .line 436
    .line 437
    move-result v5

    .line 438
    move-object v6, v9

    .line 439
    and-long v8, v24, v18

    .line 440
    .line 441
    long-to-int v8, v8

    .line 442
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    move v11, v10

    .line 447
    and-long v9, v28, v18

    .line 448
    .line 449
    long-to-int v9, v9

    .line 450
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    move v15, v11

    .line 455
    and-long v10, v26, v18

    .line 456
    .line 457
    long-to-int v10, v10

    .line 458
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    .line 463
    .line 464
    .line 465
    move-result v11

    .line 466
    invoke-static {v8, v11}, Ljava/lang/Math;->min(FF)F

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    invoke-static {v5, v11}, Ljava/lang/Math;->min(FF)F

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    new-instance v8, Ls86;

    .line 487
    .line 488
    invoke-direct {v8, v2, v11, v0, v5}, Ls86;-><init>(FFFF)V

    .line 489
    .line 490
    .line 491
    :goto_7
    :try_start_1
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->y()Lt07;

    .line 492
    .line 493
    .line 494
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 495
    const/4 v2, 0x0

    .line 496
    goto :goto_8

    .line 497
    :catchall_0
    move-exception v0

    .line 498
    :try_start_2
    invoke-interface {v14}, Lg44;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, Ljava/lang/reflect/Method;

    .line 503
    .line 504
    if-eqz v2, :cond_2a

    .line 505
    .line 506
    invoke-interface {v14}, Lg44;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Ljava/lang/reflect/Method;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 513
    .line 514
    .line 515
    const/4 v2, 0x0

    .line 516
    :try_start_3
    invoke-virtual {v0, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Lt07;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 521
    .line 522
    :goto_8
    invoke-static {v7}, Lio/sentry/config/a;->q(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    if-nez v5, :cond_11

    .line 527
    .line 528
    if-eqz v0, :cond_10

    .line 529
    .line 530
    sget-object v5, Lc17;->p:Le17;

    .line 531
    .line 532
    iget-object v9, v0, Lt07;->X:Ls05;

    .line 533
    .line 534
    invoke-virtual {v9, v5}, Ls05;->c(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    if-nez v5, :cond_11

    .line 539
    .line 540
    :cond_10
    iget v5, v8, Ls86;->d:F

    .line 541
    .line 542
    iget v9, v8, Ls86;->b:F

    .line 543
    .line 544
    sub-float/2addr v5, v9

    .line 545
    const/16 v21, 0x0

    .line 546
    .line 547
    cmpl-float v5, v5, v21

    .line 548
    .line 549
    if-lez v5, :cond_11

    .line 550
    .line 551
    iget v5, v8, Ls86;->c:F

    .line 552
    .line 553
    iget v9, v8, Ls86;->a:F

    .line 554
    .line 555
    sub-float/2addr v5, v9

    .line 556
    cmpl-float v5, v5, v21

    .line 557
    .line 558
    if-lez v5, :cond_11

    .line 559
    .line 560
    const/4 v10, 0x1

    .line 561
    goto :goto_9

    .line 562
    :cond_11
    const/4 v10, 0x0

    .line 563
    :goto_9
    if-eqz v0, :cond_12

    .line 564
    .line 565
    sget-object v5, Ls07;->k:Le17;

    .line 566
    .line 567
    iget-object v9, v0, Lt07;->X:Ls05;

    .line 568
    .line 569
    invoke-virtual {v9, v5}, Ls05;->c(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    const/4 v9, 0x1

    .line 574
    if-ne v5, v9, :cond_13

    .line 575
    .line 576
    goto :goto_a

    .line 577
    :cond_12
    const/4 v9, 0x1

    .line 578
    :cond_13
    if-eqz v0, :cond_14

    .line 579
    .line 580
    sget-object v5, Lc17;->G:Le17;

    .line 581
    .line 582
    iget-object v11, v0, Lt07;->X:Ls05;

    .line 583
    .line 584
    invoke-virtual {v11, v5}, Ls05;->c(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    if-ne v5, v9, :cond_14

    .line 589
    .line 590
    :goto_a
    move v5, v9

    .line 591
    goto :goto_b

    .line 592
    :cond_14
    const/4 v5, 0x0

    .line 593
    :goto_b
    if-eqz v0, :cond_15

    .line 594
    .line 595
    sget-object v11, Lc17;->C:Le17;

    .line 596
    .line 597
    iget-object v2, v0, Lt07;->X:Ls05;

    .line 598
    .line 599
    invoke-virtual {v2, v11}, Ls05;->c(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-ne v2, v9, :cond_15

    .line 604
    .line 605
    goto :goto_c

    .line 606
    :cond_15
    if-eqz v5, :cond_23

    .line 607
    .line 608
    :goto_c
    if-eqz v10, :cond_16

    .line 609
    .line 610
    const/4 v2, 0x0

    .line 611
    invoke-static {v0, v2, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Lt07;ZLv3;)Z

    .line 612
    .line 613
    .line 614
    move-result v9

    .line 615
    if-eqz v9, :cond_16

    .line 616
    .line 617
    const/4 v9, 0x1

    .line 618
    goto :goto_d

    .line 619
    :cond_16
    const/4 v9, 0x0

    .line 620
    :goto_d
    new-instance v2, Ljava/util/ArrayList;

    .line 621
    .line 622
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 623
    .line 624
    .line 625
    if-eqz v0, :cond_18

    .line 626
    .line 627
    sget-object v11, Ls07;->a:Le17;

    .line 628
    .line 629
    iget-object v0, v0, Lt07;->X:Ls05;

    .line 630
    .line 631
    invoke-virtual {v0, v11}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    if-nez v0, :cond_17

    .line 636
    .line 637
    const/4 v0, 0x0

    .line 638
    :cond_17
    check-cast v0, Lq3;

    .line 639
    .line 640
    if-eqz v0, :cond_18

    .line 641
    .line 642
    iget-object v0, v0, Lq3;->b:Lon2;

    .line 643
    .line 644
    check-cast v0, Lgn2;

    .line 645
    .line 646
    if-eqz v0, :cond_18

    .line 647
    .line 648
    invoke-interface {v0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    check-cast v0, Ljava/lang/Boolean;

    .line 653
    .line 654
    :cond_18
    invoke-static {v2}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, Lx78;

    .line 659
    .line 660
    if-eqz v0, :cond_19

    .line 661
    .line 662
    iget-object v2, v0, Lx78;->a:Lw78;

    .line 663
    .line 664
    iget-object v2, v2, Lw78;->b:Lo88;

    .line 665
    .line 666
    if-eqz v2, :cond_19

    .line 667
    .line 668
    move-object v11, v1

    .line 669
    invoke-virtual {v2}, Lo88;->b()J

    .line 670
    .line 671
    .line 672
    move-result-wide v1

    .line 673
    move/from16 v16, v3

    .line 674
    .line 675
    new-instance v3, Ldw0;

    .line 676
    .line 677
    invoke-direct {v3, v1, v2}, Ldw0;-><init>(J)V

    .line 678
    .line 679
    .line 680
    goto :goto_e

    .line 681
    :cond_19
    move-object v11, v1

    .line 682
    move/from16 v16, v3

    .line 683
    .line 684
    const/4 v3, 0x0

    .line 685
    :goto_e
    if-eqz v3, :cond_1e

    .line 686
    .line 687
    iget-wide v1, v3, Ldw0;->a:J

    .line 688
    .line 689
    const-wide/16 v18, 0x10

    .line 690
    .line 691
    cmp-long v1, v1, v18

    .line 692
    .line 693
    if-nez v1, :cond_1e

    .line 694
    .line 695
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->u()Ljava/util/List;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    const/4 v3, 0x0

    .line 704
    :goto_f
    if-ge v3, v2, :cond_1d

    .line 705
    .line 706
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v18

    .line 710
    move-object/from16 v19, v1

    .line 711
    .line 712
    move-object/from16 v1, v18

    .line 713
    .line 714
    check-cast v1, Llx4;

    .line 715
    .line 716
    iget-object v1, v1, Llx4;->a:Lkx4;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    move-result-object v18

    .line 722
    move/from16 v21, v2

    .line 723
    .line 724
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    move/from16 v18, v3

    .line 729
    .line 730
    const-string v3, "Text"

    .line 731
    .line 732
    move/from16 v22, v5

    .line 733
    .line 734
    const/4 v5, 0x0

    .line 735
    invoke-static {v2, v3, v5}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    if-eqz v2, :cond_1c

    .line 740
    .line 741
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    const-string v3, "color"

    .line 746
    .line 747
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    const/4 v3, 0x1

    .line 752
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    instance-of v2, v1, Lfw0;

    .line 760
    .line 761
    if-eqz v2, :cond_1a

    .line 762
    .line 763
    check-cast v1, Lfw0;

    .line 764
    .line 765
    goto :goto_10

    .line 766
    :cond_1a
    const/4 v1, 0x0

    .line 767
    :goto_10
    if-eqz v1, :cond_1b

    .line 768
    .line 769
    invoke-interface {v1}, Lfw0;->a()J

    .line 770
    .line 771
    .line 772
    move-result-wide v1

    .line 773
    new-instance v3, Ldw0;

    .line 774
    .line 775
    invoke-direct {v3, v1, v2}, Ldw0;-><init>(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 776
    .line 777
    .line 778
    goto :goto_12

    .line 779
    :catchall_1
    :cond_1b
    :goto_11
    const/4 v3, 0x0

    .line 780
    goto :goto_12

    .line 781
    :cond_1c
    add-int/lit8 v3, v18, 0x1

    .line 782
    .line 783
    move-object/from16 v1, v19

    .line 784
    .line 785
    move/from16 v2, v21

    .line 786
    .line 787
    move/from16 v5, v22

    .line 788
    .line 789
    goto :goto_f

    .line 790
    :cond_1d
    move/from16 v22, v5

    .line 791
    .line 792
    const/4 v5, 0x0

    .line 793
    goto :goto_11

    .line 794
    :cond_1e
    move/from16 v22, v5

    .line 795
    .line 796
    const/4 v5, 0x0

    .line 797
    :goto_12
    if-eqz v0, :cond_1f

    .line 798
    .line 799
    iget-object v1, v0, Lx78;->a:Lw78;

    .line 800
    .line 801
    iget-object v1, v1, Lw78;->b:Lo88;

    .line 802
    .line 803
    if-eqz v1, :cond_1f

    .line 804
    .line 805
    iget-object v1, v1, Lo88;->a:Lqe7;

    .line 806
    .line 807
    iget-wide v1, v1, Lqe7;->b:J

    .line 808
    .line 809
    new-instance v5, Lv88;

    .line 810
    .line 811
    invoke-direct {v5, v1, v2}, Lv88;-><init>(J)V

    .line 812
    .line 813
    .line 814
    goto :goto_13

    .line 815
    :cond_1f
    const/4 v5, 0x0

    .line 816
    :goto_13
    sget-wide v1, Lv88;->c:J

    .line 817
    .line 818
    if-nez v5, :cond_20

    .line 819
    .line 820
    move-object/from16 v18, v6

    .line 821
    .line 822
    const/4 v2, 0x0

    .line 823
    goto :goto_14

    .line 824
    :cond_20
    move-object/from16 v18, v6

    .line 825
    .line 826
    iget-wide v5, v5, Lv88;->a:J

    .line 827
    .line 828
    invoke-static {v5, v6, v1, v2}, Lv88;->a(JJ)Z

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    :goto_14
    new-instance v1, Lio/sentry/android/replay/viewhierarchy/f;

    .line 833
    .line 834
    if-eqz v0, :cond_21

    .line 835
    .line 836
    if-nez v22, :cond_21

    .line 837
    .line 838
    if-nez v2, :cond_21

    .line 839
    .line 840
    new-instance v2, Lio/sentry/d;

    .line 841
    .line 842
    const/4 v5, 0x6

    .line 843
    invoke-direct {v2, v0, v5}, Lio/sentry/d;-><init>(Ljava/lang/Object;B)V

    .line 844
    .line 845
    .line 846
    goto :goto_15

    .line 847
    :cond_21
    const/4 v2, 0x0

    .line 848
    :goto_15
    if-eqz v3, :cond_22

    .line 849
    .line 850
    iget-wide v5, v3, Ldw0;->a:J

    .line 851
    .line 852
    invoke-static {v5, v6}, Lz51;->U(J)I

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    const/high16 v3, -0x1000000

    .line 857
    .line 858
    or-int/2addr v0, v3

    .line 859
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    goto :goto_16

    .line 864
    :cond_22
    const/4 v0, 0x0

    .line 865
    :goto_16
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->z()I

    .line 866
    .line 867
    .line 868
    move-result v5

    .line 869
    invoke-virtual {v7}, Landroidx/compose/ui/node/LayoutNode;->o()I

    .line 870
    .line 871
    .line 872
    move-result v6

    .line 873
    move-object v3, v7

    .line 874
    iget v7, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    .line 875
    .line 876
    move-object/from16 v17, v11

    .line 877
    .line 878
    invoke-static {v8}, Lio/sentry/config/a;->t(Ls86;)Landroid/graphics/Rect;

    .line 879
    .line 880
    .line 881
    move-result-object v11

    .line 882
    move-object v8, v3

    .line 883
    const/4 v3, 0x0

    .line 884
    const/4 v4, 0x0

    .line 885
    move-object/from16 p0, v2

    .line 886
    .line 887
    move-object v2, v0

    .line 888
    move-object v0, v1

    .line 889
    move-object/from16 v1, p0

    .line 890
    .line 891
    move-object/from16 p0, v8

    .line 892
    .line 893
    move/from16 v19, v15

    .line 894
    .line 895
    move-object/from16 v30, v18

    .line 896
    .line 897
    const/4 v15, 0x0

    .line 898
    const/16 v20, 0x0

    .line 899
    .line 900
    move-object/from16 v8, p1

    .line 901
    .line 902
    move/from16 v18, v16

    .line 903
    .line 904
    move-object/from16 v16, v17

    .line 905
    .line 906
    invoke-direct/range {v0 .. v11}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(Lio/sentry/d;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    .line 907
    .line 908
    .line 909
    move-object v2, v0

    .line 910
    move-object v4, v8

    .line 911
    goto/16 :goto_1f

    .line 912
    .line 913
    :cond_23
    move-object/from16 v16, v1

    .line 914
    .line 915
    move/from16 v18, v3

    .line 916
    .line 917
    move-object/from16 v30, v6

    .line 918
    .line 919
    move-object/from16 p0, v7

    .line 920
    .line 921
    move v6, v10

    .line 922
    move/from16 v19, v15

    .line 923
    .line 924
    const/4 v15, 0x0

    .line 925
    const/16 v20, 0x0

    .line 926
    .line 927
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->u()Ljava/util/List;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 932
    .line 933
    .line 934
    move-result v2

    .line 935
    move v5, v15

    .line 936
    :goto_17
    if-ge v5, v2, :cond_24

    .line 937
    .line 938
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    check-cast v3, Llx4;

    .line 943
    .line 944
    iget-object v3, v3, Llx4;->a:Lkx4;

    .line 945
    .line 946
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    move-result-object v7

    .line 950
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v7

    .line 954
    const-string v9, "Painter"

    .line 955
    .line 956
    invoke-static {v7, v9, v15}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 957
    .line 958
    .line 959
    move-result v7

    .line 960
    if-eqz v7, :cond_25

    .line 961
    .line 962
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    const-string v2, "painter"

    .line 967
    .line 968
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    const/4 v9, 0x1

    .line 973
    invoke-virtual {v1, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v1

    .line 980
    instance-of v2, v1, Log5;

    .line 981
    .line 982
    if-eqz v2, :cond_24

    .line 983
    .line 984
    move-object v2, v1

    .line 985
    check-cast v2, Log5;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 986
    .line 987
    goto :goto_18

    .line 988
    :catchall_2
    :cond_24
    move-object/from16 v2, v20

    .line 989
    .line 990
    goto :goto_18

    .line 991
    :cond_25
    add-int/lit8 v5, v5, 0x1

    .line 992
    .line 993
    goto :goto_17

    .line 994
    :goto_18
    if-eqz v2, :cond_28

    .line 995
    .line 996
    if-eqz v6, :cond_26

    .line 997
    .line 998
    const/4 v9, 0x1

    .line 999
    invoke-static {v0, v9, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Lt07;ZLv3;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    if-eqz v0, :cond_26

    .line 1004
    .line 1005
    const/4 v5, 0x1

    .line 1006
    goto :goto_19

    .line 1007
    :cond_26
    move v5, v15

    .line 1008
    :goto_19
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->z()I

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    move-object v0, v2

    .line 1013
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->o()I

    .line 1014
    .line 1015
    .line 1016
    move-result v2

    .line 1017
    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    .line 1018
    .line 1019
    if-eqz v5, :cond_27

    .line 1020
    .line 1021
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    const-string v5, "Vector"

    .line 1030
    .line 1031
    invoke-static {v0, v5, v15}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1032
    .line 1033
    .line 1034
    move-result v5

    .line 1035
    if-nez v5, :cond_27

    .line 1036
    .line 1037
    const-string v5, "Color"

    .line 1038
    .line 1039
    invoke-static {v0, v5, v15}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v5

    .line 1043
    if-nez v5, :cond_27

    .line 1044
    .line 1045
    const-string v5, "Brush"

    .line 1046
    .line 1047
    invoke-static {v0, v5, v15}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-nez v0, :cond_27

    .line 1052
    .line 1053
    const/4 v5, 0x1

    .line 1054
    goto :goto_1a

    .line 1055
    :cond_27
    move v5, v15

    .line 1056
    :goto_1a
    invoke-static {v8}, Lio/sentry/config/a;->t(Ls86;)Landroid/graphics/Rect;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v7

    .line 1060
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    .line 1061
    .line 1062
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    .line 1063
    .line 1064
    .line 1065
    goto/16 :goto_1e

    .line 1066
    .line 1067
    :cond_28
    if-eqz v6, :cond_29

    .line 1068
    .line 1069
    invoke-static {v0, v15, v12}, Lio/sentry/android/replay/viewhierarchy/b;->a(Lt07;ZLv3;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v0

    .line 1073
    if-eqz v0, :cond_29

    .line 1074
    .line 1075
    const/4 v5, 0x1

    .line 1076
    goto :goto_1b

    .line 1077
    :cond_29
    move v5, v15

    .line 1078
    :goto_1b
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    .line 1079
    .line 1080
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->z()I

    .line 1081
    .line 1082
    .line 1083
    move-result v1

    .line 1084
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->o()I

    .line 1085
    .line 1086
    .line 1087
    move-result v2

    .line 1088
    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    .line 1089
    .line 1090
    invoke-static {v8}, Lio/sentry/config/a;->t(Ls86;)Landroid/graphics/Rect;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v7

    .line 1094
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    .line 1095
    .line 1096
    .line 1097
    goto/16 :goto_1e

    .line 1098
    .line 1099
    :catchall_3
    move-exception v0

    .line 1100
    move-object/from16 v16, v1

    .line 1101
    .line 1102
    move-object/from16 v20, v2

    .line 1103
    .line 1104
    move/from16 v18, v3

    .line 1105
    .line 1106
    move-object/from16 v30, v6

    .line 1107
    .line 1108
    move-object/from16 p0, v7

    .line 1109
    .line 1110
    move/from16 v19, v15

    .line 1111
    .line 1112
    const/4 v15, 0x0

    .line 1113
    goto :goto_1c

    .line 1114
    :catchall_4
    move-exception v0

    .line 1115
    move-object/from16 v16, v1

    .line 1116
    .line 1117
    move/from16 v18, v3

    .line 1118
    .line 1119
    move-object/from16 v30, v6

    .line 1120
    .line 1121
    move-object/from16 p0, v7

    .line 1122
    .line 1123
    move/from16 v19, v15

    .line 1124
    .line 1125
    const/4 v15, 0x0

    .line 1126
    const/16 v20, 0x0

    .line 1127
    .line 1128
    goto :goto_1c

    .line 1129
    :cond_2a
    move-object/from16 v16, v1

    .line 1130
    .line 1131
    move/from16 v18, v3

    .line 1132
    .line 1133
    move-object/from16 v30, v6

    .line 1134
    .line 1135
    move-object/from16 p0, v7

    .line 1136
    .line 1137
    move/from16 v19, v15

    .line 1138
    .line 1139
    const/4 v15, 0x0

    .line 1140
    const/16 v20, 0x0

    .line 1141
    .line 1142
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1143
    :catchall_5
    move-exception v0

    .line 1144
    :goto_1c
    sget-boolean v1, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    .line 1145
    .line 1146
    const/16 v17, 0x1

    .line 1147
    .line 1148
    if-nez v1, :cond_2b

    .line 1149
    .line 1150
    sput-boolean v17, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    .line 1151
    .line 1152
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 1153
    .line 1154
    const-string v2, "Error retrieving semantics information from Compose tree. Most likely you\'re using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you\'re using a newer version, please open a github issue with the version\nyou\'re using, so we can add support for it."

    .line 1155
    .line 1156
    new-array v3, v15, [Ljava/lang/Object;

    .line 1157
    .line 1158
    invoke-interface {v13, v1, v0, v2, v3}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_2b
    const-string v1, "io.sentry.replay.compose.fail-fast"

    .line 1162
    .line 1163
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    const-string v2, "true"

    .line 1168
    .line 1169
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v1

    .line 1173
    if-nez v1, :cond_2d

    .line 1174
    .line 1175
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    .line 1176
    .line 1177
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->z()I

    .line 1178
    .line 1179
    .line 1180
    move-result v1

    .line 1181
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/node/LayoutNode;->o()I

    .line 1182
    .line 1183
    .line 1184
    move-result v2

    .line 1185
    iget v3, v4, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    .line 1186
    .line 1187
    invoke-static/range {p0 .. p0}, Lio/sentry/config/a;->q(Landroidx/compose/ui/node/LayoutNode;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v5

    .line 1191
    if-nez v5, :cond_2c

    .line 1192
    .line 1193
    iget v5, v8, Ls86;->d:F

    .line 1194
    .line 1195
    iget v6, v8, Ls86;->b:F

    .line 1196
    .line 1197
    sub-float/2addr v5, v6

    .line 1198
    const/16 v21, 0x0

    .line 1199
    .line 1200
    cmpl-float v5, v5, v21

    .line 1201
    .line 1202
    if-lez v5, :cond_2c

    .line 1203
    .line 1204
    iget v5, v8, Ls86;->c:F

    .line 1205
    .line 1206
    iget v6, v8, Ls86;->a:F

    .line 1207
    .line 1208
    sub-float/2addr v5, v6

    .line 1209
    cmpl-float v5, v5, v21

    .line 1210
    .line 1211
    if-lez v5, :cond_2c

    .line 1212
    .line 1213
    move/from16 v6, v17

    .line 1214
    .line 1215
    goto :goto_1d

    .line 1216
    :cond_2c
    move v6, v15

    .line 1217
    :goto_1d
    invoke-static {v8}, Lio/sentry/config/a;->t(Ls86;)Landroid/graphics/Rect;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v7

    .line 1221
    const/4 v5, 0x1

    .line 1222
    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    .line 1223
    .line 1224
    .line 1225
    :goto_1e
    move-object v2, v0

    .line 1226
    goto :goto_1f

    .line 1227
    :cond_2d
    throw v0

    .line 1228
    :cond_2e
    move-object/from16 v16, v1

    .line 1229
    .line 1230
    move-object/from16 v30, v2

    .line 1231
    .line 1232
    move/from16 v18, v3

    .line 1233
    .line 1234
    move/from16 v19, v6

    .line 1235
    .line 1236
    move-object/from16 p0, v7

    .line 1237
    .line 1238
    move-object/from16 v20, v15

    .line 1239
    .line 1240
    const/4 v15, 0x0

    .line 1241
    move-object/from16 v2, v20

    .line 1242
    .line 1243
    :goto_1f
    move-object/from16 v6, v30

    .line 1244
    .line 1245
    if-eqz v2, :cond_2f

    .line 1246
    .line 1247
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    move-object/from16 v3, p0

    .line 1251
    .line 1252
    invoke-static {v3, v2, v15, v12, v13}, Lio/sentry/android/replay/viewhierarchy/b;->b(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/g;ZLv3;Lio/sentry/ILogger;)V

    .line 1253
    .line 1254
    .line 1255
    :cond_2f
    add-int/lit8 v0, v19, 0x1

    .line 1256
    .line 1257
    move-object v2, v6

    .line 1258
    move-object/from16 v1, v16

    .line 1259
    .line 1260
    move/from16 v3, v18

    .line 1261
    .line 1262
    move-object/from16 v15, v20

    .line 1263
    .line 1264
    move v6, v0

    .line 1265
    goto/16 :goto_2

    .line 1266
    .line 1267
    :cond_30
    move-object v6, v2

    .line 1268
    iput-object v6, v4, Lio/sentry/android/replay/viewhierarchy/g;->g:Ljava/util/ArrayList;

    .line 1269
    .line 1270
    return-void

    .line 1271
    :cond_31
    invoke-static {}, Lb61;->c()V

    .line 1272
    .line 1273
    .line 1274
    return-void
.end method
