.class public final Lul1;
.super Ln0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic Z:B

.field public final f0:Lte4;

.field public final synthetic g0:Lm0;


# direct methods
.method public constructor <init>(Lp44;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lul1;->Z:B

    .line 3
    .line 4
    iput-object p1, p0, Lul1;->g0:Lm0;

    .line 5
    .line 6
    iget-object v0, p1, Lp44;->l0:Lz47;

    .line 7
    .line 8
    iget-object v1, v0, Lz47;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lc6;

    .line 11
    .line 12
    iget-object v1, v1, Lc6;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lve4;

    .line 15
    .line 16
    invoke-direct {p0, v1}, Li3;-><init>(Lve4;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lc6;

    .line 22
    .line 23
    iget-object v0, v0, Lc6;->f0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lve4;

    .line 26
    .line 27
    new-instance v1, Lo44;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v1, p1, v2}, Lo44;-><init>(Lp44;B)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lte4;

    .line 34
    .line 35
    invoke-direct {p1, v0, v1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lul1;->f0:Lte4;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lvl1;)V
    .locals 3

    const/4 v0, 0x0

    iput-byte v0, p0, Lul1;->Z:B

    .line 41
    iput-object p1, p0, Lul1;->g0:Lm0;

    .line 42
    iget-object v0, p1, Lvl1;->n0:Ljl1;

    .line 43
    iget-object v1, v0, Ljl1;->X:Ljava/lang/Object;

    check-cast v1, Lhl1;

    .line 44
    iget-object v1, v1, Lhl1;->a:Lve4;

    .line 45
    invoke-direct {p0, v1}, Ln0;-><init>(Lve4;)V

    .line 46
    iget-object v0, v0, Ljl1;->X:Ljava/lang/Object;

    check-cast v0, Lhl1;

    .line 47
    iget-object v0, v0, Lhl1;->a:Lve4;

    .line 48
    new-instance v1, Lol1;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lol1;-><init>(Lvl1;B)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    new-instance p1, Lte4;

    .line 50
    invoke-direct {p1, v0, v1}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 51
    iput-object p1, p0, Lul1;->f0:Lte4;

    return-void
.end method


# virtual methods
.method public final B()Z
    .locals 0

    .line 1
    iget-byte p0, p0, Lul1;->Z:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :pswitch_0
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final a()Ljava/util/Collection;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lul1;->Z:B

    .line 4
    .line 5
    iget-object v0, v0, Lul1;->g0:Lm0;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Lp44;

    .line 13
    .line 14
    iget-object v7, v0, Lp44;->l0:Lz47;

    .line 15
    .line 16
    iget-object v1, v0, Lp44;->j0:Lta6;

    .line 17
    .line 18
    iget-object v1, v1, Lta6;->a:Ljava/lang/Class;

    .line 19
    .line 20
    const-class v4, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x2

    .line 27
    sget-object v10, Ld02;->X:Ld02;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    move-object v4, v10

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    new-instance v5, Lps;

    .line 34
    .line 35
    invoke-direct {v5, v6}, Lps;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    if-nez v8, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v4, v8

    .line 46
    :goto_0
    invoke-virtual {v5, v4}, Lps;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v5, v1}, Lps;->c(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v5, Lps;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    new-array v4, v4, [Ljava/lang/reflect/Type;

    .line 63
    .line 64
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v4, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v1, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Ljava/lang/reflect/Type;

    .line 96
    .line 97
    new-instance v8, Lva6;

    .line 98
    .line 99
    invoke-direct {v8, v5}, Lva6;-><init>(Ljava/lang/reflect/Type;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    :goto_2
    new-instance v1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    new-instance v11, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/4 v12, 0x0

    .line 118
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v0, Lp44;->w0:Ln44;

    .line 122
    .line 123
    sget-object v8, Lks3;->p:Lfk2;

    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v8}, Ln44;->p(Lfk2;)Lgm;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    const/4 v8, 0x1

    .line 133
    if-nez v5, :cond_4

    .line 134
    .line 135
    :cond_3
    :goto_3
    const/4 v3, 0x0

    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :cond_4
    invoke-interface {v5}, Lgm;->e()Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Ljava/lang/Iterable;

    .line 147
    .line 148
    invoke-static {v5}, Lwv0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    instance-of v9, v5, Lbm7;

    .line 153
    .line 154
    if-eqz v9, :cond_5

    .line 155
    .line 156
    check-cast v5, Lbm7;

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    const/4 v5, 0x0

    .line 160
    :goto_4
    if-eqz v5, :cond_3

    .line 161
    .line 162
    iget-object v5, v5, Ls21;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, Ljava/lang/String;

    .line 165
    .line 166
    if-nez v5, :cond_6

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    sget-object v13, Lih7;->X:Lih7;

    .line 174
    .line 175
    move v14, v12

    .line 176
    :goto_5
    sget-object v15, Lih7;->Z:Lih7;

    .line 177
    .line 178
    if-ge v14, v9, :cond_d

    .line 179
    .line 180
    invoke-virtual {v5, v14}, Ljava/lang/String;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    if-eqz v12, :cond_a

    .line 189
    .line 190
    if-eq v12, v8, :cond_8

    .line 191
    .line 192
    if-ne v12, v6, :cond_7

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 196
    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    goto/16 :goto_14

    .line 200
    .line 201
    :cond_8
    const/16 v12, 0x2e

    .line 202
    .line 203
    if-ne v3, v12, :cond_9

    .line 204
    .line 205
    move-object v13, v15

    .line 206
    goto :goto_7

    .line 207
    :cond_9
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-nez v3, :cond_c

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_a
    :goto_6
    invoke-static {v3}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_b

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_b
    sget-object v3, Lih7;->Y:Lih7;

    .line 222
    .line 223
    move-object v13, v3

    .line 224
    :cond_c
    :goto_7
    add-int/lit8 v14, v14, 0x1

    .line 225
    .line 226
    const/4 v12, 0x0

    .line 227
    goto :goto_5

    .line 228
    :cond_d
    if-eq v13, v15, :cond_3

    .line 229
    .line 230
    new-instance v3, Lfk2;

    .line 231
    .line 232
    invoke-direct {v3, v5}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_8
    if-eqz v3, :cond_e

    .line 236
    .line 237
    iget-object v5, v3, Lfk2;->a:Lgk2;

    .line 238
    .line 239
    invoke-virtual {v5}, Lgk2;->c()Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-nez v6, :cond_e

    .line 244
    .line 245
    sget-object v6, Lug7;->j:Lv15;

    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v5, v6}, Lgk2;->h(Lv15;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_e

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_e
    const/4 v3, 0x0

    .line 258
    :goto_9
    sget-object v12, Lrt8;->Z:Lrt8;

    .line 259
    .line 260
    if-nez v3, :cond_10

    .line 261
    .line 262
    sget-object v5, Lz72;->a:Ljava/util/LinkedHashMap;

    .line 263
    .line 264
    invoke-static {v0}, Lel1;->g(Led1;)Lfk2;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    sget-object v6, Lz72;->b:Ljava/util/Map;

    .line 269
    .line 270
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    check-cast v5, Lfk2;

    .line 275
    .line 276
    if-nez v5, :cond_11

    .line 277
    .line 278
    :cond_f
    :goto_a
    const/4 v3, 0x0

    .line 279
    goto/16 :goto_e

    .line 280
    .line 281
    :cond_10
    move-object v5, v3

    .line 282
    :cond_11
    iget-object v6, v7, Lz47;->Y:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v6, Lc6;

    .line 285
    .line 286
    iget-object v6, v6, Lc6;->n0:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v6, Lwx4;

    .line 289
    .line 290
    sget v9, Lel1;->a:I

    .line 291
    .line 292
    iget-object v9, v5, Lfk2;->a:Lgk2;

    .line 293
    .line 294
    invoke-virtual {v9}, Lgk2;->c()Z

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5}, Lfk2;->b()Lfk2;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-virtual {v6, v5}, Lwx4;->b0(Lfk2;)Ln74;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    iget-object v5, v5, Ln74;->k0:Lp74;

    .line 306
    .line 307
    invoke-virtual {v9}, Lgk2;->g()Lv15;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    sget-object v9, Lx45;->j0:Lx45;

    .line 312
    .line 313
    invoke-virtual {v5, v6, v9}, Lp74;->e(Lv15;Lx45;)Lot0;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    instance-of v6, v5, Lsx4;

    .line 318
    .line 319
    if-eqz v6, :cond_12

    .line 320
    .line 321
    check-cast v5, Lsx4;

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_12
    const/4 v5, 0x0

    .line 325
    :goto_b
    if-nez v5, :cond_13

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_13
    invoke-interface {v5}, Lot0;->l()Llh8;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    invoke-interface {v6}, Llh8;->g()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    iget-object v9, v0, Lp44;->r0:Lul1;

    .line 341
    .line 342
    invoke-virtual {v9}, Lul1;->g()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 350
    .line 351
    .line 352
    move-result v13

    .line 353
    if-ne v13, v6, :cond_14

    .line 354
    .line 355
    new-instance v3, Ljava/util/ArrayList;

    .line 356
    .line 357
    invoke-static {v9, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 362
    .line 363
    .line 364
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    if-eqz v8, :cond_16

    .line 373
    .line 374
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    check-cast v8, Lhi8;

    .line 379
    .line 380
    new-instance v9, Lwg7;

    .line 381
    .line 382
    invoke-interface {v8}, Lot0;->X()Laa7;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    invoke-direct {v9, v8, v12}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_c

    .line 393
    :cond_14
    if-ne v13, v8, :cond_f

    .line 394
    .line 395
    if-le v6, v8, :cond_f

    .line 396
    .line 397
    if-nez v3, :cond_f

    .line 398
    .line 399
    new-instance v3, Lwg7;

    .line 400
    .line 401
    invoke-static {v9}, Lwv0;->O0(Ljava/util/List;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    check-cast v9, Lhi8;

    .line 406
    .line 407
    invoke-interface {v9}, Lot0;->X()Laa7;

    .line 408
    .line 409
    .line 410
    move-result-object v9

    .line 411
    invoke-direct {v3, v9, v12}, Lwg7;-><init>(Lt14;Lrt8;)V

    .line 412
    .line 413
    .line 414
    new-instance v9, Lkf3;

    .line 415
    .line 416
    invoke-direct {v9, v8, v6, v8}, Lif3;-><init>(III)V

    .line 417
    .line 418
    .line 419
    new-instance v6, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-static {v9, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9}, Lif3;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    :goto_d
    move-object v9, v8

    .line 433
    check-cast v9, Ljf3;

    .line 434
    .line 435
    iget-boolean v13, v9, Ljf3;->Z:Z

    .line 436
    .line 437
    if-eqz v13, :cond_15

    .line 438
    .line 439
    invoke-virtual {v9}, Ljf3;->nextInt()I

    .line 440
    .line 441
    .line 442
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_d

    .line 446
    :cond_15
    move-object v3, v6

    .line 447
    :cond_16
    sget-object v6, Lch8;->Y:Lxd6;

    .line 448
    .line 449
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    sget-object v6, Lch8;->Z:Lch8;

    .line 453
    .line 454
    invoke-static {v6, v5, v3}, Ldh3;->M(Lch8;Lsx4;Ljava/util/List;)Laa7;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    :goto_e
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    :goto_f
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_1c

    .line 467
    .line 468
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    move-object v14, v4

    .line 473
    check-cast v14, Lva6;

    .line 474
    .line 475
    iget-object v4, v7, Lz47;->g0:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v4, Lf63;

    .line 478
    .line 479
    sget-object v5, Lzi8;->X:Lzi8;

    .line 480
    .line 481
    const/4 v6, 0x7

    .line 482
    const/4 v8, 0x0

    .line 483
    const/4 v15, 0x0

    .line 484
    invoke-static {v5, v8, v15, v6}, Lpu;->U(Lzi8;ZLj54;I)Lnl3;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    invoke-virtual {v4, v14, v5}, Lf63;->C(Lgb6;Lnl3;)Lt14;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    iget-object v5, v7, Lz47;->Y:Ljava/lang/Object;

    .line 493
    .line 494
    move-object v5, v4

    .line 495
    new-instance v4, Lg97;

    .line 496
    .line 497
    move-object v6, v5

    .line 498
    const/4 v5, 0x0

    .line 499
    move-object v9, v6

    .line 500
    const/4 v6, 0x0

    .line 501
    move/from16 v16, v8

    .line 502
    .line 503
    sget-object v8, Lkm;->g0:Lkm;

    .line 504
    .line 505
    move-object/from16 v17, v9

    .line 506
    .line 507
    const/4 v9, 0x1

    .line 508
    move/from16 v2, v16

    .line 509
    .line 510
    move-object/from16 v16, v13

    .line 511
    .line 512
    move v13, v2

    .line 513
    move-object/from16 v2, v17

    .line 514
    .line 515
    invoke-direct/range {v4 .. v9}, Lg97;-><init>(Lzk;ZLz47;Lkm;Z)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4, v2, v10, v15, v13}, Lw39;->m(Lx14;Ljava/util/List;Lrh8;Z)Ld3;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-virtual {v2}, Lt14;->q0()Lmo8;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    invoke-static {v5, v4, v13, v9}, Lk32;->e(Lmo8;Ld3;IZ)Lb8;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    iget-object v4, v4, Lb8;->c:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v4, Lt14;

    .line 533
    .line 534
    if-nez v4, :cond_17

    .line 535
    .line 536
    move-object v4, v2

    .line 537
    :cond_17
    invoke-virtual {v4}, Lt14;->n0()Llh8;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-interface {v2}, Llh8;->x()Lot0;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    instance-of v2, v2, Le65;

    .line 546
    .line 547
    if-eqz v2, :cond_18

    .line 548
    .line 549
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    :cond_18
    invoke-virtual {v4}, Lt14;->n0()Llh8;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    if-eqz v3, :cond_19

    .line 557
    .line 558
    invoke-virtual {v3}, Lt14;->n0()Llh8;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    goto :goto_10

    .line 563
    :cond_19
    move-object v5, v15

    .line 564
    :goto_10
    invoke-static {v2, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-eqz v2, :cond_1b

    .line 569
    .line 570
    :cond_1a
    :goto_11
    move-object/from16 v13, v16

    .line 571
    .line 572
    const/16 v2, 0xa

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_1b
    invoke-static {v4}, Lzz3;->y(Lt14;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-nez v2, :cond_1a

    .line 580
    .line 581
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    goto :goto_11

    .line 585
    :cond_1c
    const/4 v15, 0x0

    .line 586
    iget-object v2, v0, Lp44;->k0:Lsx4;

    .line 587
    .line 588
    if-eqz v2, :cond_1d

    .line 589
    .line 590
    invoke-static {v2, v0}, Lw79;->q(Lsx4;Lsx4;)Lxg7;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    new-instance v5, Lwi8;

    .line 595
    .line 596
    invoke-direct {v5, v4}, Lwi8;-><init>(Lui8;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Lsx4;->X()Laa7;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-virtual {v5, v2, v12}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    goto :goto_12

    .line 608
    :cond_1d
    move-object v2, v15

    .line 609
    :goto_12
    if-eqz v2, :cond_1e

    .line 610
    .line 611
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    :cond_1e
    if-eqz v3, :cond_1f

    .line 615
    .line 616
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    :cond_1f
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-nez v2, :cond_21

    .line 624
    .line 625
    iget-object v1, v7, Lz47;->Y:Ljava/lang/Object;

    .line 626
    .line 627
    new-instance v1, Ljava/util/ArrayList;

    .line 628
    .line 629
    const/16 v2, 0xa

    .line 630
    .line 631
    invoke-static {v11, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-eqz v3, :cond_20

    .line 647
    .line 648
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    check-cast v3, Lgb6;

    .line 653
    .line 654
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    check-cast v3, Lva6;

    .line 658
    .line 659
    iget-object v3, v3, Lva6;->a:Ljava/lang/reflect/Type;

    .line 660
    .line 661
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    goto :goto_13

    .line 669
    :cond_20
    invoke-interface {v0}, Led1;->getName()Lv15;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    const-string v2, ", unresolved classes "

    .line 674
    .line 675
    const-string v3, "Incomplete hierarchy for class "

    .line 676
    .line 677
    invoke-static {v3, v0, v2, v1}, Lkp5;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    move-object v3, v15

    .line 681
    goto :goto_14

    .line 682
    :cond_21
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-nez v0, :cond_22

    .line 687
    .line 688
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    goto :goto_14

    .line 693
    :cond_22
    iget-object v0, v7, Lz47;->Y:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, Lc6;

    .line 696
    .line 697
    iget-object v0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v0, Lwx4;

    .line 700
    .line 701
    iget-object v0, v0, Lwx4;->h0:Lzz3;

    .line 702
    .line 703
    invoke-virtual {v0}, Lzz3;->e()Laa7;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    :goto_14
    return-object v3

    .line 712
    :pswitch_0
    const/4 v15, 0x0

    .line 713
    check-cast v0, Lvl1;

    .line 714
    .line 715
    iget-object v1, v0, Lvl1;->g0:Lfy5;

    .line 716
    .line 717
    iget-object v2, v0, Lvl1;->n0:Ljl1;

    .line 718
    .line 719
    iget-object v3, v2, Ljl1;->f0:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v3, Lux4;

    .line 722
    .line 723
    invoke-static {v1, v3}, Lvr3;->a0(Lfy5;Lux4;)Ljava/util/List;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    new-instance v3, Ljava/util/ArrayList;

    .line 728
    .line 729
    const/16 v4, 0xa

    .line 730
    .line 731
    invoke-static {v1, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 732
    .line 733
    .line 734
    move-result v5

    .line 735
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v4

    .line 746
    if-eqz v4, :cond_23

    .line 747
    .line 748
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    check-cast v4, Lnz5;

    .line 753
    .line 754
    iget-object v5, v2, Ljl1;->j0:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v5, Lfc8;

    .line 757
    .line 758
    invoke-virtual {v5, v4}, Lfc8;->i(Lnz5;)Lt14;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto :goto_15

    .line 766
    :cond_23
    iget-object v1, v2, Ljl1;->X:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v1, Lhl1;

    .line 769
    .line 770
    iget-object v1, v1, Lhl1;->n:Li7;

    .line 771
    .line 772
    invoke-interface {v1, v0}, Li7;->k(Lsx4;)Ljava/util/Collection;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    check-cast v1, Ljava/lang/Iterable;

    .line 777
    .line 778
    invoke-static {v3, v1}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    new-instance v3, Ljava/util/ArrayList;

    .line 783
    .line 784
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 788
    .line 789
    .line 790
    move-result-object v4

    .line 791
    :cond_24
    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 792
    .line 793
    .line 794
    move-result v5

    .line 795
    if-eqz v5, :cond_26

    .line 796
    .line 797
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v5

    .line 801
    check-cast v5, Lt14;

    .line 802
    .line 803
    invoke-virtual {v5}, Lt14;->n0()Llh8;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    invoke-interface {v5}, Llh8;->x()Lot0;

    .line 808
    .line 809
    .line 810
    move-result-object v5

    .line 811
    instance-of v6, v5, Le65;

    .line 812
    .line 813
    if-eqz v6, :cond_25

    .line 814
    .line 815
    check-cast v5, Le65;

    .line 816
    .line 817
    goto :goto_17

    .line 818
    :cond_25
    move-object v5, v15

    .line 819
    :goto_17
    if-eqz v5, :cond_24

    .line 820
    .line 821
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    goto :goto_16

    .line 825
    :cond_26
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 826
    .line 827
    .line 828
    move-result v4

    .line 829
    if-nez v4, :cond_2a

    .line 830
    .line 831
    iget-object v2, v2, Ljl1;->X:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v2, Lhl1;

    .line 834
    .line 835
    iget-object v2, v2, Lhl1;->h:Ll32;

    .line 836
    .line 837
    new-instance v4, Ljava/util/ArrayList;

    .line 838
    .line 839
    const/16 v5, 0xa

    .line 840
    .line 841
    invoke-static {v3, v5}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 842
    .line 843
    .line 844
    move-result v5

    .line 845
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    if-eqz v5, :cond_29

    .line 857
    .line 858
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v5

    .line 862
    check-cast v5, Le65;

    .line 863
    .line 864
    invoke-static {v5}, Lel1;->f(Lot0;)Lqs0;

    .line 865
    .line 866
    .line 867
    move-result-object v6

    .line 868
    if-eqz v6, :cond_27

    .line 869
    .line 870
    invoke-virtual {v6}, Lqs0;->a()Lfk2;

    .line 871
    .line 872
    .line 873
    move-result-object v6

    .line 874
    if-eqz v6, :cond_27

    .line 875
    .line 876
    iget-object v6, v6, Lfk2;->a:Lgk2;

    .line 877
    .line 878
    iget-object v6, v6, Lgk2;->a:Ljava/lang/String;

    .line 879
    .line 880
    if-nez v6, :cond_28

    .line 881
    .line 882
    :cond_27
    invoke-virtual {v5}, Lm0;->getName()Lv15;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    invoke-virtual {v5}, Lv15;->b()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    :cond_28
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    goto :goto_18

    .line 897
    :cond_29
    invoke-interface {v2, v0, v4}, Ll32;->t(Lsx4;Ljava/util/ArrayList;)V

    .line 898
    .line 899
    .line 900
    :cond_2a
    invoke-static {v1}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    return-object v0

    .line 905
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Llh4;
    .locals 1

    .line 1
    iget-byte v0, p0, Lul1;->Z:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lul1;->g0:Lm0;

    .line 7
    .line 8
    check-cast p0, Lp44;

    .line 9
    .line 10
    iget-object p0, p0, Lp44;->l0:Lz47;

    .line 11
    .line 12
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p0, Llh4;->G0:Llh4;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object p0, Llh4;->G0:Llh4;

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-byte v0, p0, Lul1;->Z:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lul1;->f0:Lte4;

    .line 7
    .line 8
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lul1;->f0:Lte4;

    .line 16
    .line 17
    invoke-virtual {p0}, Lte4;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Lsx4;
    .locals 1

    .line 1
    iget-byte v0, p0, Lul1;->Z:B

    .line 2
    .line 3
    iget-object p0, p0, Lul1;->g0:Lm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lp44;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lvl1;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, Lul1;->Z:B

    .line 2
    .line 3
    iget-object p0, p0, Lul1;->g0:Lm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lp44;

    .line 9
    .line 10
    invoke-virtual {p0}, Lm0;->getName()Lv15;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lv15;->b()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p0, Lvl1;

    .line 23
    .line 24
    invoke-virtual {p0}, Lm0;->getName()Lv15;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p0, p0, Lv15;->X:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x()Lot0;
    .locals 1

    .line 1
    iget-byte v0, p0, Lul1;->Z:B

    .line 2
    .line 3
    iget-object p0, p0, Lul1;->g0:Lm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lp44;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lvl1;

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
