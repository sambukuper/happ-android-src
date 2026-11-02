.class public final Lp42;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lry1;

.field public final b:Lj7;

.field public final c:Lm76;

.field public d:Lb8;

.field public e:Ld7;

.field public f:I

.field public g:I

.field public h:I

.field public i:Lmm6;


# direct methods
.method public constructor <init>(Lry1;Lj7;Lm76;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp42;->a:Lry1;

    .line 5
    .line 6
    iput-object p2, p0, Lp42;->b:Lj7;

    .line 7
    .line 8
    iput-object p3, p0, Lp42;->c:Lm76;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(IIIZ)Lp76;
    .locals 12

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 2
    .line 3
    iget-boolean v0, v0, Lm76;->o0:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_25

    .line 7
    .line 8
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 9
    .line 10
    iget-object v2, v0, Lm76;->j0:Lp76;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-boolean v0, v2, Lp76;->j:Z

    .line 18
    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    iget-object v0, v2, Lp76;->b:Lmm6;

    .line 22
    .line 23
    iget-object v0, v0, Lmm6;->a:Lj7;

    .line 24
    .line 25
    iget-object v0, v0, Lj7;->h:Lu23;

    .line 26
    .line 27
    iget-object v5, p0, Lp42;->b:Lj7;

    .line 28
    .line 29
    iget-object v5, v5, Lj7;->h:Lu23;

    .line 30
    .line 31
    iget v6, v0, Lu23;->e:I

    .line 32
    .line 33
    iget v7, v5, Lu23;->e:I

    .line 34
    .line 35
    if-ne v6, v7, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lu23;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v5, v5, Lu23;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    move v0, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v0, v3

    .line 50
    :goto_1
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v0, v1

    .line 54
    goto :goto_3

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto :goto_5

    .line 58
    :cond_3
    :goto_2
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 59
    .line 60
    invoke-virtual {v0}, Lm76;->g()Ljava/net/Socket;

    .line 61
    .line 62
    .line 63
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :goto_3
    monitor-exit v2

    .line 65
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 66
    .line 67
    iget-object v5, v5, Lm76;->j0:Lp76;

    .line 68
    .line 69
    if-eqz v5, :cond_5

    .line 70
    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    :goto_4
    move/from16 v0, p4

    .line 74
    .line 75
    goto/16 :goto_11

    .line 76
    .line 77
    :cond_4
    const-string p0, "Check failed."

    .line 78
    .line 79
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_5
    if-eqz v0, :cond_6

    .line 84
    .line 85
    invoke-static {v0}, Lks8;->d(Ljava/net/Socket;)V

    .line 86
    .line 87
    .line 88
    :cond_6
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :goto_5
    monitor-exit v2

    .line 92
    throw p0

    .line 93
    :cond_7
    :goto_6
    iput v3, p0, Lp42;->f:I

    .line 94
    .line 95
    iput v3, p0, Lp42;->g:I

    .line 96
    .line 97
    iput v3, p0, Lp42;->h:I

    .line 98
    .line 99
    iget-object v2, p0, Lp42;->a:Lry1;

    .line 100
    .line 101
    iget-object v5, p0, Lp42;->b:Lj7;

    .line 102
    .line 103
    invoke-virtual {v2, v5, v0, v1, v3}, Lry1;->a(Lj7;Lm76;Ljava/util/ArrayList;Z)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 110
    .line 111
    iget-object v2, v0, Lm76;->j0:Lp76;

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    iget-object v0, p0, Lp42;->i:Lmm6;

    .line 118
    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    iput-object v1, p0, Lp42;->i:Lmm6;

    .line 122
    .line 123
    :goto_7
    move-object v2, v1

    .line 124
    goto/16 :goto_10

    .line 125
    .line 126
    :cond_9
    iget-object v0, p0, Lp42;->d:Lb8;

    .line 127
    .line 128
    if-eqz v0, :cond_b

    .line 129
    .line 130
    invoke-virtual {v0}, Lb8;->h()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    iget-object v0, p0, Lp42;->d:Lb8;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lb8;->h()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_a

    .line 146
    .line 147
    iget-object v2, v0, Lb8;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Ljava/util/ArrayList;

    .line 150
    .line 151
    iget v3, v0, Lb8;->b:I

    .line 152
    .line 153
    add-int/lit8 v5, v3, 0x1

    .line 154
    .line 155
    iput v5, v0, Lb8;->b:I

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Lmm6;

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_a
    invoke-static {}, Lbt;->n()V

    .line 165
    .line 166
    .line 167
    return-object v1

    .line 168
    :cond_b
    iget-object v0, p0, Lp42;->e:Ld7;

    .line 169
    .line 170
    if-nez v0, :cond_c

    .line 171
    .line 172
    new-instance v0, Ld7;

    .line 173
    .line 174
    iget-object v2, p0, Lp42;->b:Lj7;

    .line 175
    .line 176
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 177
    .line 178
    iget-object v6, v5, Lm76;->X:Ll95;

    .line 179
    .line 180
    iget-object v6, v6, Ll95;->u0:Ljf6;

    .line 181
    .line 182
    invoke-direct {v0, v2, v6, v5}, Ld7;-><init>(Lj7;Ljf6;Lm76;)V

    .line 183
    .line 184
    .line 185
    iput-object v0, p0, Lp42;->e:Ld7;

    .line 186
    .line 187
    :cond_c
    invoke-virtual {v0}, Ld7;->x()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_24

    .line 192
    .line 193
    new-instance v2, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    :cond_d
    iget v5, v0, Ld7;->b:I

    .line 199
    .line 200
    iget-object v6, v0, Ld7;->f:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v6, Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-ge v5, v6, :cond_1a

    .line 209
    .line 210
    iget-object v5, v0, Ld7;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v5, Lj7;

    .line 213
    .line 214
    const-string v6, "No route to "

    .line 215
    .line 216
    iget v7, v0, Ld7;->b:I

    .line 217
    .line 218
    iget-object v8, v0, Ld7;->f:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v8, Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-ge v7, v8, :cond_19

    .line 227
    .line 228
    iget-object v7, v0, Ld7;->f:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v7, Ljava/util/List;

    .line 231
    .line 232
    iget v8, v0, Ld7;->b:I

    .line 233
    .line 234
    add-int/lit8 v9, v8, 0x1

    .line 235
    .line 236
    iput v9, v0, Ld7;->b:I

    .line 237
    .line 238
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Ljava/net/Proxy;

    .line 243
    .line 244
    new-instance v8, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object v8, v0, Ld7;->g:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    sget-object v10, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 256
    .line 257
    if-eq v9, v10, :cond_11

    .line 258
    .line 259
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 264
    .line 265
    if-ne v9, v10, :cond_e

    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_e
    invoke-virtual {v7}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    instance-of v10, v9, Ljava/net/InetSocketAddress;

    .line 273
    .line 274
    if-eqz v10, :cond_10

    .line 275
    .line 276
    check-cast v9, Ljava/net/InetSocketAddress;

    .line 277
    .line 278
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    if-nez v10, :cond_f

    .line 283
    .line 284
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_f
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    :goto_8
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    .line 300
    .line 301
    .line 302
    move-result v9

    .line 303
    goto :goto_a

    .line 304
    :cond_10
    const-string p0, "Proxy.address() is not an InetSocketAddress: "

    .line 305
    .line 306
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {p1, p0}, Lxw3;->z(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v1

    .line 314
    :cond_11
    :goto_9
    iget-object v9, v5, Lj7;->h:Lu23;

    .line 315
    .line 316
    iget-object v10, v9, Lu23;->d:Ljava/lang/String;

    .line 317
    .line 318
    iget v9, v9, Lu23;->e:I

    .line 319
    .line 320
    :goto_a
    if-gt v4, v9, :cond_18

    .line 321
    .line 322
    const/high16 v11, 0x10000

    .line 323
    .line 324
    if-ge v9, v11, :cond_18

    .line 325
    .line 326
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 331
    .line 332
    if-ne v6, v11, :cond_12

    .line 333
    .line 334
    invoke-static {v10, v9}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto :goto_d

    .line 342
    :cond_12
    sget-object v6, Lks8;->a:[B

    .line 343
    .line 344
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    sget-object v6, Lks8;->e:Lkc6;

    .line 348
    .line 349
    invoke-virtual {v6, v10}, Lkc6;->d(Ljava/lang/CharSequence;)Z

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    if-eqz v6, :cond_13

    .line 354
    .line 355
    invoke-static {v10}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-static {v5}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    goto :goto_b

    .line 364
    :cond_13
    iget-object v6, v5, Lj7;->a:Loq1;

    .line 365
    .line 366
    invoke-interface {v6, v10}, Loq1;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    if-nez v11, :cond_17

    .line 375
    .line 376
    move-object v5, v6

    .line 377
    :goto_b
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_14

    .line 386
    .line 387
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    check-cast v6, Ljava/net/InetAddress;

    .line 392
    .line 393
    new-instance v10, Ljava/net/InetSocketAddress;

    .line 394
    .line 395
    invoke-direct {v10, v6, v9}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    goto :goto_c

    .line 402
    :cond_14
    :goto_d
    iget-object v5, v0, Ld7;->g:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v5, Ljava/util/List;

    .line 405
    .line 406
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    if-eqz v6, :cond_16

    .line 415
    .line 416
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 421
    .line 422
    new-instance v8, Lmm6;

    .line 423
    .line 424
    iget-object v9, v0, Ld7;->c:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v9, Lj7;

    .line 427
    .line 428
    invoke-direct {v8, v9, v7, v6}, Lmm6;-><init>(Lj7;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 429
    .line 430
    .line 431
    iget-object v6, v0, Ld7;->e:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v6, Ljf6;

    .line 434
    .line 435
    monitor-enter v6

    .line 436
    :try_start_1
    iget-object v9, v6, Ljf6;->b:Ljava/util/LinkedHashSet;

    .line 437
    .line 438
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 442
    monitor-exit v6

    .line 443
    if-eqz v9, :cond_15

    .line 444
    .line 445
    iget-object v6, v0, Ld7;->d:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v6, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_15
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    goto :goto_e

    .line 457
    :catchall_1
    move-exception v0

    .line 458
    move-object p0, v0

    .line 459
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 460
    throw p0

    .line 461
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    if-nez v5, :cond_d

    .line 466
    .line 467
    goto :goto_f

    .line 468
    :cond_17
    new-instance p0, Ljava/net/UnknownHostException;

    .line 469
    .line 470
    iget-object p1, v5, Lj7;->a:Loq1;

    .line 471
    .line 472
    new-instance p2, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    const-string p1, " returned no addresses for "

    .line 481
    .line 482
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    invoke-direct {p0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    throw p0

    .line 496
    :cond_18
    new-instance p0, Ljava/net/SocketException;

    .line 497
    .line 498
    new-instance p1, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const/16 p2, 0x3a

    .line 507
    .line 508
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string p2, "; port is out of range"

    .line 515
    .line 516
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-direct {p0, p1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    throw p0

    .line 527
    :cond_19
    new-instance p0, Ljava/net/SocketException;

    .line 528
    .line 529
    iget-object p1, v5, Lj7;->h:Lu23;

    .line 530
    .line 531
    iget-object p1, p1, Lu23;->d:Ljava/lang/String;

    .line 532
    .line 533
    const-string p2, "; exhausted proxy configurations: "

    .line 534
    .line 535
    iget-object v0, v0, Ld7;->f:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v0, Ljava/util/List;

    .line 538
    .line 539
    new-instance v1, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    invoke-direct {p0, p1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    throw p0

    .line 561
    :cond_1a
    :goto_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    if-eqz v5, :cond_1b

    .line 566
    .line 567
    iget-object v5, v0, Ld7;->d:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v5, Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-static {v2, v5}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 572
    .line 573
    .line 574
    iget-object v0, v0, Ld7;->d:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v0, Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 579
    .line 580
    .line 581
    :cond_1b
    new-instance v0, Lb8;

    .line 582
    .line 583
    invoke-direct {v0, v2}, Lb8;-><init>(Ljava/util/ArrayList;)V

    .line 584
    .line 585
    .line 586
    iput-object v0, p0, Lp42;->d:Lb8;

    .line 587
    .line 588
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 589
    .line 590
    iget-boolean v5, v5, Lm76;->o0:Z

    .line 591
    .line 592
    if-nez v5, :cond_23

    .line 593
    .line 594
    iget-object v5, p0, Lp42;->a:Lry1;

    .line 595
    .line 596
    iget-object v6, p0, Lp42;->b:Lj7;

    .line 597
    .line 598
    iget-object v7, p0, Lp42;->c:Lm76;

    .line 599
    .line 600
    invoke-virtual {v5, v6, v7, v2, v3}, Lry1;->a(Lj7;Lm76;Ljava/util/ArrayList;Z)Z

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    if-eqz v3, :cond_1c

    .line 605
    .line 606
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 607
    .line 608
    iget-object v2, v0, Lm76;->j0:Lp76;

    .line 609
    .line 610
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    goto/16 :goto_4

    .line 614
    .line 615
    :cond_1c
    invoke-virtual {v0}, Lb8;->h()Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_22

    .line 620
    .line 621
    iget v3, v0, Lb8;->b:I

    .line 622
    .line 623
    add-int/lit8 v5, v3, 0x1

    .line 624
    .line 625
    iput v5, v0, Lb8;->b:I

    .line 626
    .line 627
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    check-cast v0, Lmm6;

    .line 632
    .line 633
    :goto_10
    new-instance v3, Lp76;

    .line 634
    .line 635
    iget-object v5, p0, Lp42;->a:Lry1;

    .line 636
    .line 637
    invoke-direct {v3, v5, v0}, Lp76;-><init>(Lry1;Lmm6;)V

    .line 638
    .line 639
    .line 640
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 641
    .line 642
    iput-object v3, v5, Lm76;->q0:Lp76;

    .line 643
    .line 644
    :try_start_3
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 645
    .line 646
    invoke-virtual {v3, p1, p2, p3, v5}, Lp76;->c(IIILm76;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 647
    .line 648
    .line 649
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 650
    .line 651
    iput-object v1, v5, Lm76;->q0:Lp76;

    .line 652
    .line 653
    iget-object v5, p0, Lp42;->c:Lm76;

    .line 654
    .line 655
    iget-object v5, v5, Lm76;->X:Ll95;

    .line 656
    .line 657
    iget-object v5, v5, Ll95;->u0:Ljf6;

    .line 658
    .line 659
    monitor-enter v5

    .line 660
    :try_start_4
    iget-object v7, v5, Ljf6;->b:Ljava/util/LinkedHashSet;

    .line 661
    .line 662
    invoke-interface {v7, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 663
    .line 664
    .line 665
    monitor-exit v5

    .line 666
    iget-object v5, p0, Lp42;->a:Lry1;

    .line 667
    .line 668
    iget-object v7, p0, Lp42;->b:Lj7;

    .line 669
    .line 670
    iget-object v8, p0, Lp42;->c:Lm76;

    .line 671
    .line 672
    invoke-virtual {v5, v7, v8, v2, v4}, Lry1;->a(Lj7;Lm76;Ljava/util/ArrayList;Z)Z

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-eqz v2, :cond_1d

    .line 677
    .line 678
    iget-object v2, p0, Lp42;->c:Lm76;

    .line 679
    .line 680
    iget-object v2, v2, Lm76;->j0:Lp76;

    .line 681
    .line 682
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    iput-object v0, p0, Lp42;->i:Lmm6;

    .line 686
    .line 687
    iget-object v0, v3, Lp76;->d:Ljava/net/Socket;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-static {v0}, Lks8;->d(Ljava/net/Socket;)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_4

    .line 696
    .line 697
    :cond_1d
    monitor-enter v3

    .line 698
    :try_start_5
    iget-object v0, p0, Lp42;->a:Lry1;

    .line 699
    .line 700
    sget-object v2, Lks8;->a:[B

    .line 701
    .line 702
    iget-object v2, v0, Lry1;->d:Ljava/io/Serializable;

    .line 703
    .line 704
    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 705
    .line 706
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    iget-object v2, v0, Lry1;->b:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast v2, Le28;

    .line 712
    .line 713
    iget-object v0, v0, Lry1;->c:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, Lf23;

    .line 716
    .line 717
    const-wide/16 v7, 0x0

    .line 718
    .line 719
    invoke-virtual {v2, v0, v7, v8}, Le28;->c(Lw18;J)V

    .line 720
    .line 721
    .line 722
    iget-object v0, p0, Lp42;->c:Lm76;

    .line 723
    .line 724
    invoke-virtual {v0, v3}, Lm76;->a(Lp76;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 725
    .line 726
    .line 727
    monitor-exit v3

    .line 728
    move/from16 v0, p4

    .line 729
    .line 730
    move-object v2, v3

    .line 731
    :goto_11
    invoke-virtual {v2, v0}, Lp76;->i(Z)Z

    .line 732
    .line 733
    .line 734
    move-result v3

    .line 735
    if-eqz v3, :cond_1e

    .line 736
    .line 737
    return-object v2

    .line 738
    :cond_1e
    invoke-virtual {v2}, Lp76;->k()V

    .line 739
    .line 740
    .line 741
    iget-object v2, p0, Lp42;->i:Lmm6;

    .line 742
    .line 743
    if-nez v2, :cond_0

    .line 744
    .line 745
    iget-object v2, p0, Lp42;->d:Lb8;

    .line 746
    .line 747
    if-eqz v2, :cond_1f

    .line 748
    .line 749
    invoke-virtual {v2}, Lb8;->h()Z

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    goto :goto_12

    .line 754
    :cond_1f
    move v2, v4

    .line 755
    :goto_12
    if-nez v2, :cond_0

    .line 756
    .line 757
    iget-object v2, p0, Lp42;->e:Ld7;

    .line 758
    .line 759
    if-eqz v2, :cond_20

    .line 760
    .line 761
    invoke-virtual {v2}, Ld7;->x()Z

    .line 762
    .line 763
    .line 764
    move-result v4

    .line 765
    :cond_20
    if-eqz v4, :cond_21

    .line 766
    .line 767
    goto/16 :goto_0

    .line 768
    .line 769
    :cond_21
    const-string p0, "exhausted all routes"

    .line 770
    .line 771
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    return-object v1

    .line 775
    :catchall_2
    move-exception v0

    .line 776
    move-object p0, v0

    .line 777
    monitor-exit v3

    .line 778
    throw p0

    .line 779
    :catchall_3
    move-exception v0

    .line 780
    move-object p0, v0

    .line 781
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 782
    throw p0

    .line 783
    :catchall_4
    move-exception v0

    .line 784
    move-object p1, v0

    .line 785
    iget-object p0, p0, Lp42;->c:Lm76;

    .line 786
    .line 787
    iput-object v1, p0, Lm76;->q0:Lp76;

    .line 788
    .line 789
    throw p1

    .line 790
    :cond_22
    invoke-static {}, Lbt;->n()V

    .line 791
    .line 792
    .line 793
    return-object v1

    .line 794
    :cond_23
    const-string p0, "Canceled"

    .line 795
    .line 796
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    return-object v1

    .line 800
    :cond_24
    invoke-static {}, Lbt;->n()V

    .line 801
    .line 802
    .line 803
    return-object v1

    .line 804
    :cond_25
    const-string p0, "Canceled"

    .line 805
    .line 806
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    return-object v1
.end method

.method public final b(Ljava/io/IOException;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lp42;->i:Lmm6;

    .line 6
    .line 7
    instance-of v0, p1, Lel7;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lel7;

    .line 13
    .line 14
    iget v0, v0, Lel7;->X:I

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget p1, p0, Lp42;->f:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    iput p1, p0, Lp42;->f:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    instance-of p1, p1, Ly11;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget p1, p0, Lp42;->g:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    iput p1, p0, Lp42;->g:I

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget p1, p0, Lp42;->h:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    iput p1, p0, Lp42;->h:I

    .line 43
    .line 44
    return-void
.end method
