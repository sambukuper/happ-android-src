.class public final synthetic Lux2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lux2;->X:B

    .line 2
    .line 3
    iput-object p3, p0, Lux2;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lux2;->Y:I

    .line 6
    .line 7
    iput-object p4, p0, Lux2;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lux2;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, Lux2;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    iget v6, v0, Lux2;->Y:I

    .line 11
    .line 12
    iget-object v0, v0, Lux2;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object v7, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, Lvx6;

    .line 20
    .line 21
    check-cast v5, Leo5;

    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, Ldo5;

    .line 26
    .line 27
    iget-object v2, v0, Lvx6;->q0:Lay6;

    .line 28
    .line 29
    iget-object v2, v2, Lay6;->X:Loh5;

    .line 30
    .line 31
    invoke-virtual {v2}, Loh5;->l()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-gez v2, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :cond_0
    if-le v2, v6, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v6, v2

    .line 42
    :goto_0
    neg-int v2, v6

    .line 43
    iget-boolean v0, v0, Lvx6;->r0:Z

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move v6, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v6, v2

    .line 50
    :goto_1
    if-eqz v0, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v2, v4

    .line 54
    :goto_2
    iput-boolean v3, v1, Ldo5;->X:Z

    .line 55
    .line 56
    invoke-static {v1, v5, v6, v2}, Ldo5;->j(Ldo5;Leo5;II)V

    .line 57
    .line 58
    .line 59
    iput-boolean v4, v1, Ldo5;->X:Z

    .line 60
    .line 61
    return-object v7

    .line 62
    :pswitch_0
    check-cast v0, Lj86;

    .line 63
    .line 64
    check-cast v5, Lf05;

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    check-cast v1, Ll01;

    .line 69
    .line 70
    iget v2, v0, Lj86;->e:I

    .line 71
    .line 72
    if-ne v2, v6, :cond_c

    .line 73
    .line 74
    iget-object v2, v0, Lj86;->f:Lf05;

    .line 75
    .line 76
    invoke-static {v5, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_c

    .line 81
    .line 82
    instance-of v2, v1, Lr01;

    .line 83
    .line 84
    if-eqz v2, :cond_c

    .line 85
    .line 86
    iget-object v2, v5, Lf05;->a:[J

    .line 87
    .line 88
    array-length v8, v2

    .line 89
    add-int/lit8 v8, v8, -0x2

    .line 90
    .line 91
    if-ltz v8, :cond_c

    .line 92
    .line 93
    move v9, v4

    .line 94
    :goto_3
    aget-wide v10, v2, v9

    .line 95
    .line 96
    not-long v12, v10

    .line 97
    const/4 v14, 0x7

    .line 98
    shl-long/2addr v12, v14

    .line 99
    and-long/2addr v12, v10

    .line 100
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v12, v14

    .line 106
    cmp-long v12, v12, v14

    .line 107
    .line 108
    if-eqz v12, :cond_b

    .line 109
    .line 110
    sub-int v12, v9, v8

    .line 111
    .line 112
    not-int v12, v12

    .line 113
    ushr-int/lit8 v12, v12, 0x1f

    .line 114
    .line 115
    const/16 v13, 0x8

    .line 116
    .line 117
    rsub-int/lit8 v12, v12, 0x8

    .line 118
    .line 119
    move v14, v4

    .line 120
    :goto_4
    if-ge v14, v12, :cond_a

    .line 121
    .line 122
    const-wide/16 v15, 0xff

    .line 123
    .line 124
    and-long/2addr v15, v10

    .line 125
    const-wide/16 v17, 0x80

    .line 126
    .line 127
    cmp-long v15, v15, v17

    .line 128
    .line 129
    if-gez v15, :cond_8

    .line 130
    .line 131
    shl-int/lit8 v15, v9, 0x3

    .line 132
    .line 133
    add-int/2addr v15, v14

    .line 134
    move/from16 v16, v3

    .line 135
    .line 136
    iget-object v3, v5, Lf05;->b:[Ljava/lang/Object;

    .line 137
    .line 138
    aget-object v3, v3, v15

    .line 139
    .line 140
    iget-object v4, v5, Lf05;->c:[I

    .line 141
    .line 142
    aget v4, v4, v15

    .line 143
    .line 144
    if-eq v4, v6, :cond_4

    .line 145
    .line 146
    move/from16 v4, v16

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_4
    const/4 v4, 0x0

    .line 150
    :goto_5
    if-eqz v4, :cond_6

    .line 151
    .line 152
    move/from16 p0, v13

    .line 153
    .line 154
    move-object v13, v1

    .line 155
    check-cast v13, Lr01;

    .line 156
    .line 157
    move-object/from16 p1, v1

    .line 158
    .line 159
    iget-object v1, v13, Lr01;->i0:Ls05;

    .line 160
    .line 161
    invoke-static {v1, v3, v0}, Lw39;->i0(Ls05;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-object/from16 v18, v2

    .line 165
    .line 166
    instance-of v2, v3, Lzi1;

    .line 167
    .line 168
    if-eqz v2, :cond_7

    .line 169
    .line 170
    move-object v2, v3

    .line 171
    check-cast v2, Lzi1;

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ls05;->c(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_5

    .line 178
    .line 179
    iget-object v1, v13, Lr01;->l0:Ls05;

    .line 180
    .line 181
    invoke-static {v1, v2}, Lw39;->j0(Ls05;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    iget-object v1, v0, Lj86;->g:Ls05;

    .line 185
    .line 186
    if-eqz v1, :cond_7

    .line 187
    .line 188
    invoke-virtual {v1, v3}, Ls05;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_6
    move-object/from16 p1, v1

    .line 193
    .line 194
    move-object/from16 v18, v2

    .line 195
    .line 196
    move/from16 p0, v13

    .line 197
    .line 198
    :cond_7
    :goto_6
    if-eqz v4, :cond_9

    .line 199
    .line 200
    invoke-virtual {v5, v15}, Lf05;->f(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_8
    move-object/from16 p1, v1

    .line 205
    .line 206
    move-object/from16 v18, v2

    .line 207
    .line 208
    move/from16 v16, v3

    .line 209
    .line 210
    move/from16 p0, v13

    .line 211
    .line 212
    :cond_9
    :goto_7
    shr-long v10, v10, p0

    .line 213
    .line 214
    add-int/lit8 v14, v14, 0x1

    .line 215
    .line 216
    move/from16 v13, p0

    .line 217
    .line 218
    move-object/from16 v1, p1

    .line 219
    .line 220
    move/from16 v3, v16

    .line 221
    .line 222
    move-object/from16 v2, v18

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    goto :goto_4

    .line 226
    :cond_a
    move-object/from16 p1, v1

    .line 227
    .line 228
    move-object/from16 v18, v2

    .line 229
    .line 230
    move/from16 v16, v3

    .line 231
    .line 232
    move v1, v13

    .line 233
    if-ne v12, v1, :cond_c

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_b
    move-object/from16 p1, v1

    .line 237
    .line 238
    move-object/from16 v18, v2

    .line 239
    .line 240
    move/from16 v16, v3

    .line 241
    .line 242
    :goto_8
    if-eq v9, v8, :cond_c

    .line 243
    .line 244
    add-int/lit8 v9, v9, 0x1

    .line 245
    .line 246
    move-object/from16 v1, p1

    .line 247
    .line 248
    move/from16 v3, v16

    .line 249
    .line 250
    move-object/from16 v2, v18

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    goto/16 :goto_3

    .line 254
    .line 255
    :cond_c
    return-object v7

    .line 256
    :pswitch_1
    check-cast v0, Lea6;

    .line 257
    .line 258
    check-cast v5, Lpr;

    .line 259
    .line 260
    move-object/from16 v1, p1

    .line 261
    .line 262
    check-cast v1, Ljava/io/PrintWriter;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    const-string v3, "========================="

    .line 268
    .line 269
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 275
    .line 276
    if-eqz v0, :cond_d

    .line 277
    .line 278
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    const-string v3, "*** Subscription "

    .line 285
    .line 286
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v2, " with "

    .line 293
    .line 294
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v2, " servers: ***"

    .line 301
    .line 302
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    new-instance v0, Ljava/util/Date;

    .line 313
    .line 314
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 315
    .line 316
    .line 317
    iget-object v2, v5, Lpr;->c:Ljava/lang/Integer;

    .line 318
    .line 319
    iget-object v3, v5, Lpr;->a:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    new-instance v4, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    const-string v0, " Server response: "

    .line 334
    .line 335
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v0, " "

    .line 342
    .line 343
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    const-string v0, " symbols"

    .line 350
    .line 351
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return-object v7

    .line 362
    :pswitch_2
    move/from16 v16, v3

    .line 363
    .line 364
    check-cast v0, Ljava/util/ArrayList;

    .line 365
    .line 366
    check-cast v5, Ljava/util/List;

    .line 367
    .line 368
    move-object/from16 v1, p1

    .line 369
    .line 370
    check-cast v1, Ldo5;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const/4 v3, 0x0

    .line 380
    const/4 v4, 0x0

    .line 381
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eqz v8, :cond_10

    .line 386
    .line 387
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    add-int/lit8 v9, v3, 0x1

    .line 392
    .line 393
    if-ltz v3, :cond_f

    .line 394
    .line 395
    check-cast v8, Leo5;

    .line 396
    .line 397
    const/4 v10, 0x0

    .line 398
    invoke-static {v1, v8, v10, v4}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 399
    .line 400
    .line 401
    iget v8, v8, Leo5;->Y:I

    .line 402
    .line 403
    add-int/2addr v4, v8

    .line 404
    add-int/lit8 v8, v6, -0x1

    .line 405
    .line 406
    if-ge v3, v8, :cond_e

    .line 407
    .line 408
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    check-cast v3, Leo5;

    .line 413
    .line 414
    invoke-static {v1, v3, v10, v4}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 415
    .line 416
    .line 417
    iget v3, v3, Leo5;->Y:I

    .line 418
    .line 419
    add-int/2addr v4, v3

    .line 420
    :cond_e
    move v3, v9

    .line 421
    goto :goto_9

    .line 422
    :cond_f
    invoke-static {}, Li21;->X()V

    .line 423
    .line 424
    .line 425
    throw v2

    .line 426
    :cond_10
    return-object v7

    .line 427
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
