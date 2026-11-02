.class public final Lem1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;

.field public final Z:Ljava/lang/Object;

.field public final f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lem1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lem1;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lem1;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lem1;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lem1;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lem1;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, Lem1;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, v0, Lem1;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Lf54;

    .line 16
    .line 17
    check-cast v4, Lza6;

    .line 18
    .line 19
    check-cast v3, Lea6;

    .line 20
    .line 21
    iget-object v1, v0, Lf54;->b:Lz47;

    .line 22
    .line 23
    iget-object v1, v1, Lz47;->Y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lc6;

    .line 26
    .line 27
    iget-object v1, v1, Lc6;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lve4;

    .line 30
    .line 31
    new-instance v2, Lc3;

    .line 32
    .line 33
    invoke-direct {v2, v0, v4, v3}, Lc3;-><init>(Lf54;Lza6;Lea6;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lse4;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lse4;-><init>(Lve4;Ldn2;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    check-cast v0, Lev3;

    .line 43
    .line 44
    check-cast v4, Ljava/lang/Class;

    .line 45
    .line 46
    check-cast v3, Lqs0;

    .line 47
    .line 48
    iget-object v1, v0, Lev3;->Y:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_0

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v5}, Leu;->v0(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ltz v4, :cond_1

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    aget-object v2, v0, v4

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const-string v1, "No superclass of "

    .line 92
    .line 93
    const-string v4, " in Java reflection for "

    .line 94
    .line 95
    invoke-static {v1, v0, v4, v3}, Lb61;->p(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-object v2

    .line 99
    :pswitch_1
    check-cast v0, Lvk3;

    .line 100
    .line 101
    iget-object v1, v0, Lvk3;->j0:Lg44;

    .line 102
    .line 103
    check-cast v4, Lov3;

    .line 104
    .line 105
    check-cast v3, Lyu3;

    .line 106
    .line 107
    invoke-virtual {v0}, Lvk3;->X()Ljava/lang/reflect/Method;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_2

    .line 120
    .line 121
    goto/16 :goto_7

    .line 122
    .line 123
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    check-cast v4, Lev3;

    .line 127
    .line 128
    invoke-virtual {v4}, Lev3;->i0()Lyy3;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-eqz v5, :cond_3

    .line 133
    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :cond_3
    sget-object v5, La32;->i:La32;

    .line 137
    .line 138
    invoke-static {v0, v5}, Ly72;->h(Lkb6;Lch3;)Lb32;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v4, v5}, Ly72;->b(Lev3;Lb32;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v3}, Lyu3;->c()Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    const/4 v5, 0x1

    .line 157
    if-ne v3, v5, :cond_4

    .line 158
    .line 159
    goto/16 :goto_7

    .line 160
    .line 161
    :cond_4
    new-instance v3, Lub6;

    .line 162
    .line 163
    sget-object v5, Lkm;->Y:Lkm;

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    invoke-direct {v3, v5, v6}, Lub6;-><init>(Lkm;Z)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Lu1;

    .line 174
    .line 175
    new-instance v7, Ljava/util/ArrayList;

    .line 176
    .line 177
    const/16 v8, 0xa

    .line 178
    .line 179
    invoke-static {v4, v8}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_5

    .line 195
    .line 196
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    check-cast v10, Lnb6;

    .line 201
    .line 202
    invoke-interface {v10}, Lxu3;->j()Lpw3;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    check-cast v10, Lu1;

    .line 210
    .line 211
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    invoke-virtual {v3, v5, v7, v2, v6}, Lw39;->m(Lx14;Ljava/util/List;Lrh8;Z)Ld3;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v1}, Lg44;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lu1;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v3, v6}, Lg33;->q(Lu1;Ld3;I)Lb8;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    iget-object v3, v3, Lb8;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v3, Lu1;

    .line 235
    .line 236
    if-nez v3, :cond_6

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_6
    move-object v1, v3

    .line 240
    :goto_2
    iget-object v0, v0, Lvk3;->i0:Lg44;

    .line 241
    .line 242
    invoke-interface {v0}, Lg44;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Ljava/util/List;

    .line 247
    .line 248
    new-instance v3, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-static {v0, v8}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_a

    .line 266
    .line 267
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    check-cast v5, Lob6;

    .line 272
    .line 273
    new-instance v7, Lub6;

    .line 274
    .line 275
    sget-object v9, Lkm;->Z:Lkm;

    .line 276
    .line 277
    invoke-virtual {v5}, Lob6;->G()Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    invoke-direct {v7, v9, v10}, Lub6;-><init>(Lkm;Z)V

    .line 282
    .line 283
    .line 284
    instance-of v9, v5, Lwk3;

    .line 285
    .line 286
    if-nez v9, :cond_7

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_7
    check-cast v5, Lwk3;

    .line 290
    .line 291
    iget-object v9, v5, Lwk3;->Z:Lpw3;

    .line 292
    .line 293
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    check-cast v9, Lu1;

    .line 297
    .line 298
    new-instance v10, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-static {v4, v8}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    if-eqz v12, :cond_8

    .line 316
    .line 317
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    check-cast v12, Lnb6;

    .line 322
    .line 323
    invoke-interface {v12}, Lxu3;->g()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    iget v13, v5, Lwk3;->f0:I

    .line 328
    .line 329
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    check-cast v12, Lob6;

    .line 334
    .line 335
    invoke-virtual {v12}, Lob6;->B()Lpw3;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    check-cast v12, Lu1;

    .line 343
    .line 344
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_8
    invoke-virtual {v7, v9, v10, v2, v6}, Lw39;->m(Lx14;Ljava/util/List;Lrh8;Z)Ld3;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    new-instance v10, Lwk3;

    .line 353
    .line 354
    iget-object v11, v5, Lwk3;->X:Lmk3;

    .line 355
    .line 356
    iget-object v12, v5, Lwk3;->Y:Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v9, v7, v6}, Lg33;->q(Lu1;Ld3;I)Lb8;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    iget-object v7, v7, Lb8;->c:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v7, Lu1;

    .line 365
    .line 366
    if-nez v7, :cond_9

    .line 367
    .line 368
    move-object v13, v9

    .line 369
    goto :goto_5

    .line 370
    :cond_9
    move-object v13, v7

    .line 371
    :goto_5
    iget v14, v5, Lwk3;->f0:I

    .line 372
    .line 373
    iget-object v15, v5, Lwk3;->g0:Lfw3;

    .line 374
    .line 375
    iget-boolean v5, v5, Lwk3;->h0:Z

    .line 376
    .line 377
    move/from16 v16, v5

    .line 378
    .line 379
    invoke-direct/range {v10 .. v16}, Lwk3;-><init>(Lmk3;Ljava/lang/String;Lpw3;ILfw3;Z)V

    .line 380
    .line 381
    .line 382
    move-object v5, v10

    .line 383
    :goto_6
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_3

    .line 387
    :cond_a
    new-instance v2, Luk3;

    .line 388
    .line 389
    invoke-direct {v2, v3, v1}, Luk3;-><init>(Ljava/util/ArrayList;Lu1;)V

    .line 390
    .line 391
    .line 392
    :goto_7
    return-object v2

    .line 393
    :pswitch_2
    check-cast v0, Lau3;

    .line 394
    .line 395
    check-cast v4, Ljava/io/ByteArrayInputStream;

    .line 396
    .line 397
    check-cast v3, Lgm1;

    .line 398
    .line 399
    iget-object v1, v3, Lgm1;->b:Ljl1;

    .line 400
    .line 401
    iget-object v1, v1, Ljl1;->X:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v1, Lhl1;

    .line 404
    .line 405
    iget-object v1, v1, Lhl1;->p:Lr62;

    .line 406
    .line 407
    invoke-virtual {v0, v4, v1}, Lau3;->a(Ljava/io/ByteArrayInputStream;Lr62;)Ld2;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    return-object v0

    .line 412
    nop

    .line 413
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
